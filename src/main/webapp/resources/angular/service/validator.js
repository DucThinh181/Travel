/**
 * Created by lequan on 10/31/2016.
 */

app.service('Validator', function ()
{

    var isEmpty = function (properties, obj)
    {
        for (var i=0;i<properties.length;++i)
        {
            var key = properties[i].key;
            if (!obj.hasOwnProperty(key))
                return true;
            if (obj[key].length < 1)
                return true;
        }
        return false;
    };

    var checkDuplicate = function (list, key, id)
    {
        for (var i = 0; i < list.length; ++i)
        {
            if (list[i][key] == id)
                return i;
        }
        return -1;
    };

    var checkUpdateDuplicate = function (list, key, id, uid)
    {
        for (var i = 0; i < list.length; ++i)
        {
            if (list[i][key] == uid)
                continue;
            if (list[i][key] == id)
                return i;
        }
        return -1;
    };

    return {
        isEmpty: isEmpty,
        checkDuplicate: checkDuplicate,
        checkUpdateDuplicate: checkUpdateDuplicate
    };
});
