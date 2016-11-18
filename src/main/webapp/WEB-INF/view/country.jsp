<link href="resources/css/icons/fontawesome/styles.min.css" rel="stylesheet" type="text/css">

<div ng-app="app" ng-controller="CountryController">
    <div class="panel panel-flat">
        <div class="panel-heading">
            <h5 class="panel-title">Style combinations</h5>
            <div class="heading-elements">

            </div>
        </div>

        <div class="panel-body">
            The
            <code>DataTables</code> is a highly flexible tool, based upon the foundations of progressive enhancement, and will add advanced interaction controls to any HTML table. DataTables has most features enabled by default, so all you need to do to use it with your own tables is to call the construction function. Searching, ordering, paging etc goodness will be immediately added to the table, as shown in this example.
            <strong>Datatables support all available table styling.</strong>
        </div>

        <div id="DataTables_Table_4_wrapper" class="dataTables_wrapper no-footer">
            <div class="datatable-header">
                <div id="DataTables_Table_4_filter" class="dataTables_filter">
                    <label>
                        <span>Search</span>
                        <input ng-model="searchFilter" type="text" class="form-control" placeholder="filter">
                    </label>
                </div>
                <div class="dataTables_length" id="DataTables_Table_4_length">
                    <button ng-click="openToAdd()" data-toggle="modal" data-target="#modal_editor" class="btn btn-primary">
                        Add new
                    </button>
                </div>
            </div>
            <div class="datatable-scroll">
                <table class="table datatable-basic table-bordered table-striped table-hover">
                    <thead>
                    <tr>
                        <th ng-repeat="item in properties" ng-click="sort(item.key)">
                            {{item.name}}
                            <span ng-show="sortDown(item.key)" class="fa fa-caret-down"></span>
                            <span ng-show="sortUp(item.key)" class="fa fa-caret-up"></span>
                        </th>
                        <th class="text-center">Actions</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr ng-repeat="item in list | orderBy:sortType:sortReverse | filter:searchFilter">
                        <td>
                            {{item.id}}
                        </td>
                        <td>
                            {{item.name}}
                        </td>
                        <td class="text-center">
                            <ul class="icons-list">
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                        <i class="icon-menu9"></i>
                                    </a>

                                    <ul class="dropdown-menu dropdown-menu-right">
                                        <li ng-click="openToUpdate(item)" data-toggle="modal" data-target="#modal_editor">
                                            <a href="#"><i class="icon-file-pdf"></i>Update</a>
                                        </li>
                                        <li ng-click="delete(item)">
                                            <a href="#"><i class="icon-file-excel"></i>Delete</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <!-- Primary modal -->
    <div id="modal_editor" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header bg-primary">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h6 class="modal-title">Primary header</h6>
                </div>

                <div class="modal-body">
                    <h6 class="text-semibold">Country Code</h6>
                    <input ng-model="model.id" ng-show="!isUpdated" type="text" class="form-control maxlength" maxlength="3"/>
                    <input ng-model="model.id" ng-show="isUpdated" readonly type="text" class="form-control maxlength" maxlength="3"/>

                    <h6 class="text-semibold">Country Name</h6>
                    <input ng-model="model.name" type="text" class="form-control"/>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-link" data-dismiss="modal">Close</button>
                    <button ng-click="add()" ng-show="!isUpdated" type="button" class="btn btn-primary">Add new</button>
                    <button ng-click="update()" ng-show="isUpdated" type="button" class="btn btn-primary">Update</button>
                </div>
            </div>
        </div>
    </div>
    <!-- /primary modal -->
</div>


<script src="resources/js/plugins/forms/inputs/maxlength.min.js"></script>
<script src="resources/js/plugins/notifications/pnotify.min.js"></script>
<script src="resources/js/plugins/forms/selects/select2.min.js"></script>

<script src="resources/js/core/app.js"></script>


<script src="resources/angular/lib/angular.min.js"></script>
<script src="resources/angular/lib/angular-resource.min.js"></script>

<script src="resources/angular/app.js"></script>
<script src="resources/angular/factory.js"></script>
<script src="resources/angular/service/validator.js"></script>
<script src="resources/angular/service/notifier.js"></script>
<script src="resources/angular/country.js"></script>