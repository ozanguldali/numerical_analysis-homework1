package helper;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;

public class ReportHelper {

    public static final HashMap<String, HashMap<String, Object>> compareTableQ9 = new HashMap<String, HashMap<String, Object>>();

    public static HashMap<String, Object> globalResultMap = new HashMap<String, Object>();

    public static void setGlobalResultMap(double valueAppx, double rootAppx, int iteration, long CPUTime) {

        globalResultMap.put( "convergence", valueAppx );
        globalResultMap.put( "root", rootAppx );
        globalResultMap.put( "iteration", iteration );
        globalResultMap.put( "cpu", CPUTime );

    }

    public static void setCompareTableQ9(String model) {

        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty( "convergence", ( ( Double ) globalResultMap.get( "convergence" ) ) );
        jsonObject.addProperty( "root", ( ( Double ) globalResultMap.get( "root" ) ) );
        jsonObject.addProperty( "iteration", ( ( Integer ) globalResultMap.get( "iteration" ) ) );
        jsonObject.addProperty( "cpu", ( ( Long ) globalResultMap.get( "cpu" ) ) );

        Gson gson = new Gson();
        String jsonString = jsonObject.toString();

        HashMap<String , Object> clonedMap = gson.fromJson(jsonString, globalResultMap.getClass());

        compareTableQ9.put( model, clonedMap );

    }

    public static void clearGlobalResultMap() {

        globalResultMap.clear();

    }


}
