package com.example.demo11.com.text.vo;

import lombok.Data;

import java.util.List;

@Data
public class FoodPois {
    String id;
    List<String> parent;
    List<String> childtype;
    String tag;
    String name;
    String type;
    String typecode;
    String biz_type;
    String address;
    String location;
    String tel;
    List<String> postcode;
    List<String> website;
    List<String> email;
    String pcode;
    String pname;
    String citycode;
    String cityname;
    String adcode;
    String adname;
    List<String> importance;
    List<String> shopid;
    String shopinfo;
    List<String> poiweight;
    String gridcode;
    String distance;
    List<String> naci_poild;
    List<String> entr_location;
    List<String> exit_location;
    String match;
    String recommend;
    String timestamp;
    List<String> alias;
    String indoor_map;
    FoodIndoorData indoor_data;
    String groupbuy_num;
    String business_area;
    String discount_num;
    BizExit biz_ext;
    List<String> event;
    List<FoodPhotos> photos;


}
