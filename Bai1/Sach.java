package Buoi4.Bai1;

import java.util.Scanner;

public class Sach {
    // id tự động tăng
    private static  int count = 0;
    private int id;
    private String tenSach;
    private int namXuatBan;

    private String theLoai;
    private  TacGia tacGia;

    public Sach() {
        count++;
        this.id = count;
    }

    public Sach(String tenSach, int namXuatBan, String theLoai, TacGia tacGia) {
        this.id = ++count;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        this.tenSach = s.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        this.namXuatBan = Integer.parseInt(s.nextLine());
        System.out.println("Nhập thể loại: ");
        this.theLoai = s.nextLine();
        System.out.println("Nhập thông tin tác giả: ");
        TacGia tacgia = new TacGia();
        tacgia.input();
        this.tacGia = tacgia;

    }

//    public static void inTieuDe(){
//        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s", "ID", "Tên Sách", "Năm Xuất Bản", "Thể Loại","Tên Tác Giả", "Năm sinh");
//    }

    @Override
    public String toString() {
        return "Sach{" +
                "id=" + id +
                ", tenSach='" + tenSach + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", theLoai='" + theLoai + '\'' +
                ", tacGia=" + tacGia +
                '}';
    }

//    public void output(){
//        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s", this.id, this.tenSach, this.namXuatBan, this.theLoai, tacGia.getTenTacGia(), tacGia.getNamSinh());
//    }
    public void output(){
        System.out.println(toString());
    }
}
