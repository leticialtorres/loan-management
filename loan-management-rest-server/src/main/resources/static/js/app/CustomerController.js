'use strict';

angular.module('loanManagementApp').controller('CustomerController',
    ['CustomerService', '$scope',  function( CustomerService, $scope) {

        var self = this;
        self.customer = {};
        self.customers=[];

        self.submit = submit;
        self.getAllCustomers = getAllCustomers;
        self.createCustomer = createCustomer;
        self.reset = reset;

        self.successMessage = '';
        self.errorMessage = '';
        self.done = false;

        self.onlyIntegers = /^\d+$/;
        self.onlyNumbers = /^\d+([,.]\d+)?$/;

        function submit() {
            console.log('Submitting a new Customer', self.customer);
            createCustomer(self.customer);
        }

        function createCustomer(customer) {
            console.log('Creating Customer');
            CustomerService.createCustomer(customer)
                .then(
                    function (response) {
                        console.log('Customer created successfully');
                        self.successMessage = 'Customer created successfully';
                        Nself.errorMessage='';
                        self.done = true;
                        self.customer={};
                        $scope.myForm.$setPristine();
                    },
                    function (errResponse) {
                        console.error('Error while creating Customer');
                        self.errorMessage = 'Error while creating Customer: ' + errResponse.data.errorMessage;
                        self.successMessage='';
                    }
                );
        }

        function getAllCustomers(){
            return CustomerService.getAllCustomers();
        }


        function reset(){
            self.successMessage='';
            self.errorMessage='';
            self.customer={};
            $scope.myForm.$setPristine();
        }
    }

    ]);