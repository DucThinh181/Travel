/**
 * Created by lequan on 10/31/2016.
 */

app.service('Notifier', function ()
{
    var notifyError = function (title, message)
    {
        return new PNotify({
            title: title,
            text: message,
            icon: 'icon-blocked',
            type: 'error'
        });
    };

    var notifySuccess = function (title, message)
    {
        return new PNotify({
            title: title,
            text: message,
            icon: 'icon-checkmark3',
            type: 'success'
        });
    };

    var notifyInfo = function (title, message)
    {
        return new PNotify({
            title: title,
            text: message,
            icon: 'icon-info22',
            type: 'info'
        });
    };

    var notify = function (data)
    {
        if (data.code >= 200 && data.code < 300)
            notifySuccess(data.title, data.message);
        if (data.code >= 400 && data.code < 600)
            notifyError(data.title, data.message);
    };

    return {
        notifySuccess: notifySuccess,
        notifyError: notifyError,
        notifyInfo: notifyInfo,
        notify: notify
    };
});
