package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    static List<Subject> listSubject = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số lượng môn học: ");
        int sl = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= sl; i++){
            Subject sb = new Subject();
            System.out.println("==============================");

            sb.nhap();
            listSubject.add(sb);
        }
        Subject.inTieuDe();
        for (Subject sub: listSubject) {
            sub.display();
        }

        //sắp xếp môn học theo thứ tự tg kết thúc tăng dần

        //lựa chọn môn học



        //thoát menu
        s.close();
    }
}
