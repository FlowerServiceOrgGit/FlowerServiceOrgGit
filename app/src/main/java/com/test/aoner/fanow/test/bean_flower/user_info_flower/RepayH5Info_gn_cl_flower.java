package com.test.aoner.fanow.test.bean_flower.user_info_flower;

import com.test.aoner.fanow.test.util_flower.StringUtil_flower;
import com.google.gson.Gson;

import org.json.JSONObject;

public class RepayH5Info_gn_cl_flower {

    private static class Inner {
        private static RepayH5Info_gn_cl_flower instance = new RepayH5Info_gn_cl_flower();
    }

    private RepayH5Info_gn_cl_flower(){}

    public static RepayH5Info_gn_cl_flower getInstance(){
        return Inner.instance;
    }

    private String url;

    public static void parse(JSONObject objJson){
        Inner.instance = new Gson().fromJson(objJson.toString(), RepayH5Info_gn_cl_flower.class);
    }

    public String getUrl() {
        return StringUtil_flower.getSafeString(url);
    }

}
