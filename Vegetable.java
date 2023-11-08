package Buoi3;

import java.util.Scanner;

import static java.lang.System.out;

public class Vegetable {
    private String id;
    private  String name;
    private  String unit;
    private  int quantitySold;
    private  int sale;
    private  double price;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public int getQuantitySold() {
        return quantitySold;
    }
    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }
    public int getSale() {
        return sale;
    }
    public void setSale(int sale) {
        this.sale = sale;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Vegetable(String id, String name, String unit, int quantitySold, int sale, double price){
            this.id = id;
            this.name = name;
            this.unit = unit;
            this.quantitySold = quantitySold;
            this.sale = sale;
            this.price = price;
    }
    public  Vegetable(){

    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", quantitySold=" + quantitySold +
                ", sale=" + sale +
                ", price=" + price +
                '}';
    }

    public double getTotalRevenue(){
         return (quantitySold * (100 - sale) * 1.0 / 100);
    }


    public static void inTieude(){
        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s%n" , "ID" , "Name" , "Unit" ,"QuantitySold","Sale","Price","Revenue");
    }
    public void display(){
        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s%n",
                getId(), getName(), getUnit(), getQuantitySold(), getSale(), getPrice(), getTotalRevenue());
    }


}
