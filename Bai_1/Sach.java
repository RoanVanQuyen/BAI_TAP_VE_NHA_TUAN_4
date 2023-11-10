package Bai_1;

import java.util.Scanner;

public class Sach {
    private String id ;
    private String tenSach ;
    private int namXuatBan ;
    private String theLoai ;
    private TacGia tacGia ;
    static  int ID = 1 ;
    public Sach(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Sach.ID = ID;
    }

    public Scanner getIp() {
        return Ip;
    }

    public void setIp(Scanner ip) {
        Ip = ip;
    }

    public Sach(String id, String tenSach, int namXuatBan, String theLoai, TacGia tacGia) {
        this.id = id;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
    }

    public Sach(String tenSach, int namXuatBan, String theLoai, TacGia tacGia) {
        this.id = ID +"";
        ID++;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        id = ID+ "" ;
        ID++;
        System.out.printf("Nhap vao ten sach: ");
        tenSach = Ip.nextLine();
        System.out.print("Nhap vao nam xuat ban: ");
        namXuatBan = Ip.nextInt() ;
        System.out.printf("Nhap vao the loai: ");
        Ip.nextLine() ;
        theLoai = Ip.nextLine() ;
        TacGia one = new TacGia() ;
        one.Input();
        tacGia = one ;
    }
    @Override
    public String toString() {
        return "Bai_1.Sach{" +
                "id='" + id + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", theLoai='" + theLoai.toString() + '\'' +
                ", tacGia=" + tacGia +
                '}';
    }
    public void Out(){
        System.out.println(toString());
    }
}
