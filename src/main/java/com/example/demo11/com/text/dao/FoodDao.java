package com.example.demo11.com.text.dao;

import com.example.demo11.com.text.entivity.Test;
import org.apache.ibatis.annotations.Insert;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface FoodDao extends JpaRepository<Test,Integer>{

}
