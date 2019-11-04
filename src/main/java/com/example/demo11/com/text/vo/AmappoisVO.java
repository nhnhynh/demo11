package com.example.demo11.com.text.vo;

import lombok.Data;

import java.util.List;

@Data
public class AmappoisVO {
    String id;
    List<String> parent;
    List<String> childtype;
    String name;
    String type;
    String typecode;
    List<String> biz_type;
    String address;
    String location;
    List<String> tel;
    List<String> distance;
    AmapPoisBizExtVo biz_exit;
    String pname;
    String cityname;
    String adname;
    List<String> importance;
    List<String> shopid;
    String shopinfo;
    String poiweight;
    List<AmapPhotosVo> photos;

}
