var app = angular.module('loanManagementApp',['ui.router','ngStorage']);

app.constant('urls', {
    BASE: 'http://localhost:8080/loanmanagement',
    CUSTOMER_SERVICE_API : 'http://localhost:8080/loanmanagement/api/customers/'
});

app.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {

        $stateProvider
            .state('home', {
                url: '/',
                templateUrl: 'partials/list',
                controller:'CustomerController',
                controllerAs:'ctrl',
                resolve: {
                    customers: function ($q, CustomerService) {
                        console.log('Loading all Customers');
                        var deferred = $q.defer();
                        CustomerService.loadAllCustomers.then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            });
        $urlRouterProvider.otherwise('/');
    }]);

