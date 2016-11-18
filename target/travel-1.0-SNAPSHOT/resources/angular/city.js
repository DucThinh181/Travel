/**
 * Created by lequan on 11/11/2016.
 */

app.controller('CityController', function ($scope, Validator, Notifier, City)
{
    $scope.sortType = 'id'; // set the default sort type
    $scope.sortReverse = false;  // set the default sort order
    $scope.searchFilter = '';     // set the default search/filter term
    $scope.isUpdated = false;
    $scope.properties = [
        {name: 'City ID'},
        {name: 'City Name'},
        {name: 'Country Name'}
    ];

    $scope.sort = function (key)
    {
        $scope.sortType = key;
        $scope.sortReverse = !$scope.sortReverse
    };

    $scope.sortDown = function (key)
    {
        return $scope.sortType == key && !$scope.sortReverse;
    };

    $scope.sortUp = function (key)
    {
        return $scope.sortType == key && $scope.sortReverse;
    };

    function setProperties(instance)
    {
        var i = 0;
        for (var key in instance)
        {
            if (instance.hasOwnProperty(key))
            {
                $scope.properties[i].key = key;
                i++;
            }
        }
    }

    var reload = function ()
    {
        City.query(function (data)
        {
            if (data.length == 0)
            {
                Notifier.notifyInfo('Empty table', 'This table has no data');
            }
            else
            {
                if (!$scope.properties[0].hasOwnProperty('key'))
                {
                    setProperties(data[0]);
                }
            }
            $scope.list = data;
        });
        $scope.model = new City();
    };

    reload();

    $scope.add = function ()
    {
        if (Validator.isEmpty($scope.properties, $scope.model))
        {
            Notifier.notifyError('Error', 'Data must not be empty');
            return;
        }
        if (Validator.checkDuplicate($scope.list, 'id', $scope.model.id) > -1)
        {
            Notifier.notifyError('Error', 'Duplicate ID');
            return;
        }
        $scope.model.$save(function (data)
        {
            Notifier.notify(data);
            reload();
        });
    };

    $scope.update = function ()
    {
        if (Validator.isEmpty($scope.properties, $scope.model))
        {
            Notifier.notifyError('Error', 'Data must not be empty');
            return;
        }
        if ($scope.model.uid == $scope.model.id)
        {
            $scope.model.$update(function (data)
            {
                Notifier.notify(data);
                reload();
                $('#modal_editor').modal('toggle');
            });
        }
    };

    $scope.delete = function (item)
    {
        item.uid = item.id;
        item.$delete(function (data)
        {
            Notifier.notify(data);
            reload();
        });
    };

    $scope.openToAdd = function ()
    {
        $scope.isUpdated = false;
        $scope.model = new City();
        // $scope.model.id = 1;
    };

    $scope.openToUpdate = function (item)
    {
        $scope.isUpdated = true;
        $scope.model = angular.copy(item);
        $scope.model.uid = $scope.model.id;
    };
});
