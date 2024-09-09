package com.example.buoi4di.TimHieuDI;

import org.springframework.stereotype.Component;

@Component("basic")
public class Basic implements GoiDangKi{
    public Basic() {
        System.out.println( "Constructor Basic");
    }
    @Override
    public void thongTin() {
        System.out.println("Day la goi Basic");
    }
}
