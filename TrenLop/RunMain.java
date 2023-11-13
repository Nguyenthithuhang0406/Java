package Buoi4.TrenLop;

public class RunMain {
    private static Sinhvien[] list = new Sinhvien[2];

    static {
        list[0] = new Sinhvien("Hang");
        list[1] = new Sinhvien("hihi");
    }
    public static void main(String[] args) {
        Sinhvien a = new Sinhvien("Kien");
        Sinhvien b = new Sinhvien("Haha");
        System.out.println(a);
        System.out.println(b);
    }
}
