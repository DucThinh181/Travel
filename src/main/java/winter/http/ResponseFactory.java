package winter.http;

/**
 * Created by lequan on 11/15/2016.
 */
public class ResponseFactory
{
    public static final int ADD_SUCCESS = 1;
    public static final int ADD_FAIL = 2;
    public static final int UPDATE_SUCCESS = 3;
    public static final int UPDATE_FAIL = 4;
    public static final int DELETE_SUCCESS = 5;
    public static final int DELETE_FAIL = 6;

    public static Response getResponse(int type)
    {
        switch (type)
        {
            case ADD_SUCCESS:
                return new Response(200, "Success", "New item has been added");
            case ADD_FAIL:
                return new Response(400, "Error", "Cannot add new item due to connection error");

            case UPDATE_SUCCESS:
                return new Response(200, "Success", "New information has been updated");
            case UPDATE_FAIL:
                return new Response(400, "Error", "Cannot update new information due to connection error");

            case DELETE_SUCCESS:
                return new Response(200, "Success", "Item has been removed");
            case DELETE_FAIL:
                return new Response(400, "Database violation", "Cannot delete this item");

            default:
                return new Response(404, "Not found", "Can't receive any response");
        }
    }
}
