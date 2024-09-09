package com.example.buoi4di;

import com.example.buoi4di.TimHieuDI.Basic;
import com.example.buoi4di.TimHieuDI.GoiDangKi;
import com.example.buoi4di.TimHieuDI.Meo;
import com.example.buoi4di.TimHieuDI.ThanhVien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Buoi4DiApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(Buoi4DiApplication.class, args);
//        GoiDangKi g = new Basic();
//        ThanhVien t = new ThanhVien();
//        t.setGoiDangKi(g);
//        t.thongTinThanhVien();
//    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Buoi4DiApplication.class, args);
        System.out.println("Bat dau chay");
        ThanhVien t = context.getBean(ThanhVien.class);
        t.thongTinThanhVien();

        // Cach 2: Tao bean linh dong
        Meo m = context.getBean(Meo.class);
        m.thongTin();
    }

}
