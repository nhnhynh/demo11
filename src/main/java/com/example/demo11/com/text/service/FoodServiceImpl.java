package com.example.demo11.com.text.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo11.com.text.dao.FoodDao;
import com.example.demo11.com.text.entivity.Test;
import com.example.demo11.com.text.vo.FoodPois;
import com.example.demo11.com.text.vo.FoodVo;
import com.example.demo11.com.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodDao foodDao;


    @Override
    public void add(String url) throws Exception{
        //获取json字符串
        String s= HttpUtil.doGet(url);
        System.out.println(s);
        //对json进行反序列化
        FoodVo foodVo = JSONObject.parseObject(s, FoodVo.class);
        List<FoodPois> pois = foodVo.getPois();
        pois.forEach(i->{
            Test test = new Test();
            test.setAdname(i.getAdname());
            //test.setCityname(i.getCityname());
            test.setCityname("123");
            foodDao.save(test);
        });

    }
}
