package com.imooc.campus.service;

import com.imooc.campus.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void getAreaList() throws Exception {
        List<Area> areaList=areaService.getAreaList();
        assertEquals("east",areaList.get(0).getAreaName());
    }

}