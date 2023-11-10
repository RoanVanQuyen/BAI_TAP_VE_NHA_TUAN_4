package Bai_1;

import java.util.Scanner;

public class TacGia {
    private String tenTacGia ;
    private int namSinh ;
    public TacGia(){}

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

    public Scanner getIp() {
        return Ip;
    }

    public void setIp(Scanner ip) {
        Ip = ip;
    }

    public TacGia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "Bai_1.TacGia{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.printf("Nhap vao ten tac gia: ");
        tenTacGia = Ip.nextLine() ;
        System.out.printf("Nhap vao nam sinh cua tac gia: ");
        namSinh = Ip.nextInt() ;
    }
    public void Out(){
        System.out.println(toString());
    }
}

