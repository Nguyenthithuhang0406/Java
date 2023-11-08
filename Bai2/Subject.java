package Bai2;

import java.io.PrintStream;
import java.util.Scanner;

public class Subject {
    private String id;
    private String subjectName;
    private  int studentCount;
    private  String timeStart;
    private  String timeEnd;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    public String getTimeStart() {
        return timeStart;
    }
    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }
    public String getTimeEnd() {
        return timeEnd;
    }
    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
    public Subject(){

    }
    public Subject(String id, String subjectName, int studentCount, String timeStart, String timeEnd ){
        this.id = id;
        this.subjectName = subjectName;
        this.studentCount = studentCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }
    @Override
    public String toString(){
           return "Subject{" +
                   "id='" + id +'\'' +
                   ", subjectName=" + subjectName + '\'' +
                   ", studentCount=" + studentCount + '\'' +
                   ", timeStart=" + timeStart + '\'' +
                   ", timeEnd=" + timeEnd + '\'' +
                   '}';
    }

    public static void inTieuDe(){
        System.out.format("%-20s %-20s %-20s %-30s %n", "Id", "Subject name", "Student count", "Time start-end");
    }
    public void display(){
       System.out.format("%-20s %-20s %-20s %-30s %n", this.id, this.subjectName, this.studentCount, this.timeStart + " - " + this.timeEnd);
    }
     public void nhap(){
         Scanner s = new Scanner(System.in);
         System.out.println("Nhập id: ");
         this.id = s.nextLine();
         System.out.println("Nhập tên môn học: ");
         this.subjectName = s.nextLine();
         System.out.println("Nhập số lượng sinh viên trong lớp: ");
         this.studentCount = s.nextInt();
         s.nextLine();
         System.out.println("Nhập thời gian bắt đầu tiết học: ");
         this.timeStart = s.nextLine();
         System.out.println("Nhập thời gian kết thúc lớp học: ");
         this.timeEnd = s.nextLine();
     }

}
