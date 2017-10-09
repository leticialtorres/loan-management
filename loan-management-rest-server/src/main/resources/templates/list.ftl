<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Cliente </span></div>
		<div class="panel-body">
	        <div class="formcontainer">
	            <div class="alert alert-success" role="alert" ng-if="ctrl.successMessage">{{ctrl.successMessage}}</div>
	            <div class="alert alert-danger" role="alert" ng-if="ctrl.errorMessage">{{ctrl.errorMessage}}</div>
	            <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-label" for="uname">Nome do Cliente</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.customer.name" id="uname" class="customername form-control input-sm" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>

	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-label" for="limit">Limite de Crédito</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.customer.limit" id="salary" class="form-control input-sm" required ng-pattern="ctrl.onlyNumbers"/>
	                        </div>
	                    </div>
	                </div>

                    <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-label" for="riskType">Risco</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.customer.riskType" id="riskType" class="form-control input-sm" required ng-minlength="3""/>
	                        </div>
	                    </div>
	                </div>

	                <div class="row">
	                    <div class="form-actions floatRight">
	                        <input type="submit"  value="Update" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid || myForm.$pristine">
	                        <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
	                    </div>
	                </div>
	            </form>
    	    </div>
		</div>	
    </div>
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Clientes</span></div>
		<div class="panel-body">
			<div class="table-responsive">
		        <table class="table table-hover">
		            <thead>
		            <tr>
		                <th>ID</th>
		                <th>Nome</th>
		                <th>Limite</th>
		                <th>Risco</th>
                        <th>Taxa de Juros</th>
                        <th width="100"></th>
		                <th width="100"></th>
		            </tr>
		            </thead>se
		            <tbody>
		            <tr ng-repeat="c in ctrl.getAllCustomers()">
		                <td>{{c.id}}</td>
		                <td>{{c.name}}</td>
		                <td>{{c.limit}}</td>
		                <td>{{c.riskType}}</td>
		                <td>{{c.interestRate}}</td>
		            </tr>
		            </tbody>
		        </table>		
			</div>
		</div>
    </div>
</div>