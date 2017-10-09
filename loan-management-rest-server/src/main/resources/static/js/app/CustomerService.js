'use strict';

angular.module('loanManagementApp').factory('CustomerService',
    ['$localStorage', '$http', '$q', 'urls',
        function ($localStorage, $http, $q, urls) {

            var factory = {
                getAllCustomers: getAllCustomers,
                loadAllCustomers: loadAllCustomers,
                createCustomer: createCustomer,
            };

            return factory;

            function loadAllCustomers() {
                console.log('Retrieving all customers');
                var deferred = $q.defer();
                $http.get(urls.CUSTOMER_SERVICE_API)
                    .then(
                        function (response) {
                            console.log('Retrieved successfully all customers');
                            $localStorage.customers = response.data;
                            deferred.resolve(response);
                        },
                        function (errResponse) {
                            console.error('Error while retrieving customers');
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

            function getAllCustomers(){
                return $localStorage.customers;
            }

            function createCustomer(customer) {
                console.log('Creating Customer');
                var deferred = $q.defer();
                $http.post(urls.CUSTOMER_SERVICE_API, customer)
                    .then(
                        function (response) {
                            loadAllCustomers();
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                           console.error('Error while creating Customer : '+errResponse.data.errorMessage);
                           deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }
        }
    ]);