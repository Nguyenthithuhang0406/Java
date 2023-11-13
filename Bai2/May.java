package Buoi4.Bai2;

import java.util.Scanner;

public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public May() {
    }

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập mã máy: ");
        this.maMay = Integer.parseInt(s.nextLine());
        System.out.println("Nhập kiểu máy: ");
        this.kieuMay = s.nextLine();
        System.out.println("Nhập tình trạng máy: ");
        this.tinhTrang = s.nextLine();
    }

    @Override
    public String toString() {
        return "May{" +
                "maMay=" + maMay +
                ", kieuMay='" + kieuMay + '\'' +
                ", tinhTrang='" + tinhTrang + '\'' +
                '}';
    }
    public void xuat(){
        System.out.println(toString());
    }

//    public void xuat(){
//        System.out.format("%-20s %-20s %-20s", this.maMay, this.kieuMay,this.tinhTrang);
//    }
}
