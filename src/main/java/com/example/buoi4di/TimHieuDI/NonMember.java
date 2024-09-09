package com.example.buoi4di.TimHieuDI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NonMember implements GoiDangKi{
    public NonMember() {
        System.out.println( "Constructor non member");
    }
    @Override
    public void thongTin() {
        System.out.println("Day la goi non member");
    }
}
