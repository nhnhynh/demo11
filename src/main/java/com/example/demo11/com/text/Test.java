package com.example.demo11.com.text;

import com.alibaba.fastjson.JSONObject;
import com.example.demo11.com.text.vo.AmapVoOne;
import com.example.demo11.com.text.vo.AmappoisVO;
import com.example.demo11.com.text.vo.Amapsuggestion;
import com.example.demo11.com.util.HttpUtil;
import jdk.nashorn.internal.scripts.JS;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String url ="https://restapi.amap.com/v3/place/text?key=60c964d9f4a5004205e74f16f180ec08&keywords=北京八维教育";
        String s= HttpUtil.doGet(url);
        System.out.println(s);
        AmapVoOne amapVoOne = JSONObject.parseObject(s, AmapVoOne.class);
        String info = amapVoOne.getInfo();
        System.out.println(info);
        Amapsuggestion suggestion = amapVoOne.getSuggestion();
        List<String> cities = suggestion.getCities();
       cities.forEach(i->{ System.out.println(i);});

        List<AmappoisVO> pois = amapVoOne.getPois();
        pois.forEach(i->{
            System.out.println(i.getName());
            System.out.println(i.getId());
        });



    }

}
