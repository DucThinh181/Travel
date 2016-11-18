/**
 * Created by lequan on 10/20/2016.
 */

app.factory('WebService', function () {
    return null;
});

app.factory('Country', function ($resource) {
    return $resource('/api/countries/:id',
        {
            id: '@uid'
        },
        {
            update: {
                method: 'PUT'
            }
        });
});

app.factory('City', function ($resource) {
    return $resource('/api/cities/:id',
        {
            id: '@uid'
        },
        {
            update: {
                method: 'PUT'
            }
        });
});

