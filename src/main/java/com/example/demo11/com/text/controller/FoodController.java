package com.example.demo11.com.text.controller;


import com.example.demo11.com.text.service.FoodService;
import com.example.demo11.com.text.vo.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("insert")
    public CommonResponse insert(){

        String url="https://restapi.amap.com/v3/place/around?key=60c964d9f4a5004205e74f16f180ec08&location=116.473168,39.993015&keywords=肯德基&types=&radius=1000&offset=20&page=1&extensions=all";

        try {
            foodService.add(url);
            return new CommonResponse(0,"你好");
        } catch (Exception e) {
            e.printStackTrace();
            return new CommonResponse(0,"成功");
        }
    }
}
