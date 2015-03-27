package initalkshow.acombee.util;

/**
 * Created by adrianrestuputranto on 3/27/15.
 */
public class ApiUtil {
    private static String API_KEY = "AIzaSyAvMGI309Ylw4hk6cdORW6USo1gadaQ3VU";

    private String GET_VIDEO_API = "URL: https://www.googleapis.com/youtube/v3/videos?id=7lCDEYXw3mM&key="+API_KEY;

    public static String getApiKey () {
        return API_KEY;
    }
}
