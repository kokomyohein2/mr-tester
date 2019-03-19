/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrtester;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author komyo
 */
public class BaseFunction {

    public static Gson gson = new Gson();
    
    public static JsonObject jsonFromStr(String jsonObjectStr) {
        JsonParser parser = new JsonParser();
        JsonObject object = parser.parse(jsonObjectStr).getAsJsonObject();
        return object;
    }

    public static String convertToJsonArray(String param, String dataList) throws JSONException {
        JSONObject objValues = new JSONObject();
        JSONArray jsonArray = new JSONArray(dataList);
        ArrayList<JSONObject> arrayJson = new ArrayList<>();
        int count = jsonArray.length();

        for (int i = 0; i < count; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            arrayJson.add(jsonObject);
        }
        objValues.put(param, arrayJson);
        return objValues.toString();
    }
}
