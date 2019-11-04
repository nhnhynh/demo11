package com.example.demo11.com.text.vo;

import lombok.Data;

import java.util.List;

@Data
public class AmapVoOne {

    String status;
    String count;
    String info;
    String infocode;
    Amapsuggestion suggestion;
    List<AmappoisVO> pois;




}
