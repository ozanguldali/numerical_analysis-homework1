package helper;

import java.util.Date;

public class TimeHelper {

    private static Date date = new Date();

    public static Long getDate() {

        return date.getTime();

    }

}
