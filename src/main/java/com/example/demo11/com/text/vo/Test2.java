package com.example.demo11.com.text.vo;

import com.alibaba.fastjson.JSONObject;
import com.example.demo11.com.util.HttpUtil;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        String url="https://restapi.amap.com/v3/place/around?key=60c964d9f4a5004205e74f16f180ec08&location=116.473168,39.993015&keywords=肯德基&types=&radius=1000&offset=20&page=1&extensions=all";
        String s= HttpUtil.doGet(url);
        System.out.println(s);
        FoodVo foodVo = JSONObject.parseObject(s, FoodVo.class);
        String count=foodVo.count;
        System.out.println(count);
        FoodSuggestion suggestion = foodVo.suggestion;
        List<String> cities =suggestion.getCities();
        cities.forEach(i->{
            System.out.println(i);
        });
        List<FoodPois> pois = foodVo.pois;
        pois.forEach(i->{
            System.out.println(i.adname);
            System.out.println(i.cityname);
        });
    }


}
