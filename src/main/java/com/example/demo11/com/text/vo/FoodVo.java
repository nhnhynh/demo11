package com.example.demo11.com.text.vo;

import lombok.Data;

import java.util.List;

@Data
public class FoodVo {
    String status;
    String count;
    String info;
    FoodSuggestion suggestion;
    List<FoodPois> pois;


}
