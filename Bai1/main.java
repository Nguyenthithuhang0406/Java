package Buoi4.Bai1;

import java.util.*;

public class main {
    public static List<Sach> listSach = new ArrayList<>();


    //khởi tạo trước 5 input
    static {
        listSach.add( new Sach("giáo trình OOP", 1900, "giáo trình", new TacGia("haha", 1992)));
        listSach.add( new Sach("truyện conan", 1900, "truyện tranh", new TacGia("minabusi", 1888)));
        listSach.add( new Sach("anime", 2000, "truyện tranh", new TacGia("hehe", 2003)));
        listSach.add(new Sach("thiên lạc", 2010, "truyện chữ", new TacGia("hihi", 1992)));
        listSach.add(new Sach("đại dương xanh", 1997, "sách kinh tế", new TacGia("huhu", 1988)));

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số lượng sách: ");
        int n = Integer.parseInt(s.nextLine());

        for(int i = 0; i < n; i++){
            System.out.println("==========================");
            Sach sach = new Sach();
            sach.input();
            listSach.add(sach);
        }

//        Sach.inTieuDe();
        System.out.println("---------------------Thong tin ve cac sach la: ");
        for (Sach sach: listSach) {
            sach.output();
        }

        //tìm kiếm sách
        System.out.println("Nhập tên sách cần tìm: ");
        String key = s.nextLine();
        System.out.println("Thông tin sách cần tìm là: ");
        for (Sach sach: listSach) {
            if(sach.getTenSach().contains(key)){
                sach.output();
            }
        }

        //sắp xếp theo tên tác giả
        System.out.println("-----Sách sau khi đã sắp xếp theo tên tác giả --------- ");
        sortByTenTacGia();
        for (Sach sach: listSach) {
            sach.output();
        }

        //thoát chương trình
        s.close();


    }

    //hàm sắp xếp theo tên tác giả
    public static void sortByTenTacGia(){
        Collections.sort(listSach, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getTacGia().getTenTacGia().compareTo(o2.getTacGia().getTenTacGia());
            }
        });
    }
}
