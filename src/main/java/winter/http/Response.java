package winter.http;

/**
 * Created by lequan on 11/15/2016.
 */
public class Response
{
    int code;
    String title, message;

    public int getCode()
    {
        return code;
    }

    public String getTitle()
    {
        return title;
    }

    public String getMessage()
    {
        return message;
    }

    public Response(int code, String title, String message)
    {

        this.code = code;
        this.title = title;
        this.message = message;
    }
}
