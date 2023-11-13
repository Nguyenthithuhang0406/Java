package Buoi4.TrenLop;

public class Sinhvien {
    //cach tao id tu dong tang
    private static int count = 0;
    private int id;
    private String name;
    public Sinhvien(){
        count ++;
        this.id = count;
    }

    public Sinhvien(String name){
        this.id = ++count;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Sinh vien: Id = " + this.id + ", Name = " + this.name;
    }


}
