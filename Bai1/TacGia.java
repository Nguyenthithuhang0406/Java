package Buoi4.Bai1;

import java.util.Scanner;

public class TacGia {
    private String tenTacGia;
    private  int namSinh;

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public TacGia() {
    }

    public TacGia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public void  input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        this.tenTacGia = s.nextLine();
        System.out.println("Nhập năm sinh: ");
        this.namSinh = Integer.parseInt(s.nextLine());
    }
        @Override
        public String toString () {
            return "TacGia{" +
                    "tenTacGia='" + tenTacGia + '\'' +
                    ", namSinh=" + namSinh +
                    '}';
        }
//    public  void output(){
//        System.out.format("%-20s %-20s", this.tenTacGia, this.namSinh);
//    }
    public void output(){
        System.out.println(toString());
    }

}
