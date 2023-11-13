package Buoi4.Bai2;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private  String tenQL;

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getTenQL() {
        return tenQL;
    }

    public void setTenQL(String tenQL) {
        this.tenQL = tenQL;
    }

    public QuanLy() {
    }
    public QuanLy(String maQL, String tenQL){
        this.maQL = maQL;
        this.tenQL = tenQL;
    }
    public  void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập mã quản lý: ");
        this.maQL = s.nextLine();
        System.out.println("Nhập tên quản lý: ");
        this.tenQL = s.nextLine();
    }

    @Override
    public String toString() {
        return "QuanLy{" +
                "maQL='" + maQL + '\'' +
                ", tenQL='" + tenQL + '\'' +
                '}';
    }
    public  void xuat(){
        System.out.println(toString());
    }
//    public  void xuat(){
//        System.out.format("%-20s %-20s", this.maQL, this.tenQL);
//    }
}
