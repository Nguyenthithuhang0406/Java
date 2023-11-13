package Buoi4.Bai2;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private QuanLy quanLy;
    private May may;
    private int n;

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public QuanLy getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(QuanLy quanLy) {
        this.quanLy = quanLy;
    }

    public May getMay() {
        return may;
    }

    public void setMay(May may) {
        this.may = may;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public PhongMay() {
    }
    public PhongMay(String maPhong, String tenPhong, QuanLy quanLy, May may, int n){
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.quanLy = quanLy;
        this.may = may;
        this.n = n;
    }

    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập mã phòng: ");
        this.maPhong = s.nextLine();
        System.out.println("Nhập tên phòng: ");
        this.tenPhong = s.nextLine();

        System.out.println("Nhập thông tin quản lý");
        QuanLy quanLy = new QuanLy();
        quanLy.nhap();
        this.quanLy = quanLy;

        System.out.println("Nhập thông tin máy: ");
        May may = new May();
        may.nhap();
        this.may = may;

        System.out.println("Nhập n: ");
        this.n = Integer.parseInt(s.nextLine());
    }

    @Override
    public String toString() {
        return "PhongMay{" +
                "maPhong='" + maPhong + '\'' +
                ", tenPhong='" + tenPhong + '\'' +
                ", quanLy=" + quanLy +
                ", may=" + may +
                ", n=" + n +
                '}';
    }
    public  void  xuat(){
        System.out.println(toString());
    }
    //    public void inTieuDe(){
//        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s", "Mã Phòng", "Tên phòng", "Mã Quản Lý", "Tên quản lý", "mã máy", "kiểu máy", "tình trạng", "n");
//    }
//    public void xuat(){
//        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s", this.maPhong, this.tenPhong,this.quanLy,this.may, this.n);
//    }

}
