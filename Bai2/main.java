package Buoi4.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static List<PhongMay> listPhongMay = new ArrayList<>();

    //khởi tạo trước 5 đối tượng vào mảng
    static {
        listPhongMay.add(new PhongMay("1", "703", new QuanLy("102", "ha"), new May(12, "dell","tot"),1) );
        listPhongMay.add(new PhongMay("2","804", new QuanLy("103","hi" ), new May(39,"mac","binhthuong"), 2));
        listPhongMay.add(new PhongMay("3", "102", new QuanLy("105", "kaka"), new May(32, "asus", "tot"), 3));
        listPhongMay.add(new PhongMay("4", "502", new QuanLy("49", "lan"), new May(13, "As", "tot"), 8));
        listPhongMay.add(new PhongMay("23", "302", new QuanLy("34", "ki"), new May(23, "dell", "khong tot"), 9));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số lượng phòng máy: ");
        int sl = Integer.parseInt(s.nextLine());

        for (int i = 0; i < sl; i++) {
            System.out.println("======================");
            PhongMay phongMay = new PhongMay();
            phongMay.nhap();
            listPhongMay.add(phongMay);
        }

        System.out.println("------Thông tin các phòng máy------------- ");
        for (PhongMay phongMay: listPhongMay) {
            phongMay.xuat();
        }

        //tìm kiếm máy theo kiểu máy
        System.out.println("nhập kiểu máy cần tìm: ");
        String key = s.nextLine();
        System.out.println("-----thông tin máy cần tìm là---------");
        for (PhongMay pm: listPhongMay) {
            if(pm.getMay().getKieuMay().contains(key)){
                pm.xuat();
            }
        }

        //tìm kiếm máy theo mã máy
        System.out.println("--------Nhập mã máy cần tìm------");
        int keyWord = Integer.parseInt(s.nextLine());
        System.out.println("----Thông tin máy cần tìm là----");
        for (PhongMay pm: listPhongMay) {
            if(pm.getMay().getMaMay() == keyWord){
                pm.xuat();
            }
        }

        //thoát chương trình
        s.close();
    }
}
