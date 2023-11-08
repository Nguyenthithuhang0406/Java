package Buoi3;

import java.util.*;
import java.util.concurrent.Callable;

import static java.lang.System.out;

public class VegetableMain {
    public static List<Vegetable> listVegetable = new ArrayList<>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        out.println("Nhập số lượng rau củ : ");
        int chon =Integer.parseInt(s.nextLine());

        for (int i = 0; i < chon; i++) {
            Vegetable v = new Vegetable();

            out.println("======================");
            if(i==1){
                s.nextLine();
            }
            out.println("Nhập id: ");
            String id = String.valueOf(s.nextLine());
            v.setId(id);
            if (checkTrungID(id)) {
                System.out.println("ID đã tồn tại. Vui lòng nhập lại.");
                i--;
                continue;
            }
            out.println("Nhập tên: ");
            String name = s.nextLine();
            v.setName(name);
            out.println("Nhập đơn vị tính: ");
            String unit = s.nextLine();
            v.setUnit(unit);
            out.println("Nhập số lượng đã bán: ");
            int quantitySold =Integer.parseInt(s.nextLine());
            v.setQuantitySold(quantitySold);
            out.println("Nhập phần trăm giảm giá: ");
            int sale = s.nextInt();
            v.setSale(sale);
            out.println("Nhập giá gốc: ");
            double price = s.nextDouble();
            v.setPrice(price);
            listVegetable.add(v);
        }
        //sortRevenue();
        Vegetable.inTieude();
        for (Vegetable veget : listVegetable) {
            veget.display();
        }

        //tìm kiếm rau củ
        out.println("Nhập tên rau củ cần tìm: ");
        String keyWord = s.nextLine();
        Vegetable.inTieude();
        for (Vegetable vg : listVegetable ) {
            if(vg.getName().contains(keyWord)){
                vg.display();
            }
        }

              //sắp xếp theo thứ tự số tiền thu được tăng dần
//      public static int sortRevenue()
//        Collections.sort(Arrays.asList(listVegetable), new Comparator<Vegetable>(){
//            @Override
//            public int compare(Vegetable o1, Vegetable o2){
//                return (int) (o1.getTotalRevenue() - o2.getTotalRevenue());
//            }
//        });
//
//
//        //nhóm các rau củ cùng đơn vị tính xếp gần nhau, các rau củ có cùng đơn vị tín sẽ được sắp xếp theo giá bán tăng dần
//    public  static int sortUnit()
//        Collections.sort(Arrays.asList(listVegetable), new Comparator<Vegetable>() {
//            @Override
//            public int compare(Vegetable o1, Vegetable o2) {
//                if(o1.getUnit().equals(o2.getUnit()))
//                    return int.compare(o1.getPrice(), o2.getPrice());
//                else
//                    return o1.getUnit().compareTo(o2.getUnit());
//            }
//        });


        //thoát menu
        s.close();

    }

      public static boolean checkTrungID(String id){
          for (Vegetable veget : listVegetable) {
              if(veget.getId().equals(id)){
                  return true;
              }
          }
          return false;
      }
    }

