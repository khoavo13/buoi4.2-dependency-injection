package com.example.buoi4di.TimHieuDI;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Data
public class ThanhVien {
    private String ten;
    // Field injection
//    @Autowired
    private final GoiDangKi goiDangKi;

     // Dung tight coupling
//    public ThanhVien() {
//       this.goiDangKi = new Basic();
//        System.out.println("Constructor thanh vien");
//    }

    // Dung loose coupling
    // Constructor injection
//    @Autowired
//    public ThanhVien(GoiDangKi g) {
//        this.goiDangKi = g;
//    }

    // Setter injection
//    @Autowired
//    public void setGoiDangKi(GoiDangKi g) {
//        this.goiDangKi = g;
//    }

    public void thongTinThanhVien() {
        System.out.println("ten = meo");
        this.goiDangKi.thongTin();
    }
}
