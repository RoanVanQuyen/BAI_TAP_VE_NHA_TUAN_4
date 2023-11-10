package Bai_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Ip = new Scanner(System.in) ;
        ArrayList<Sach> saches = new ArrayList<Sach>() ;

        saches.add(new Sach("CSDL" , 2018 , "Giao Trinh"  , new TacGia("DHKBHN" , 1954))) ;
        saches.add(new Sach("HDH" , 2020 , "Giao Trinh"  , new TacGia("DKQGHN" , 1980))) ;
        saches.add(new Sach("OOP" , 2012 , "Giao Trinh"  , new TacGia("DHCNHN" , 1980))) ;

        do {
            System.out.printf("MOI BAN NHAP VAO LUA CHON: ");
            int choose = Ip.nextInt() ;
            if(choose ==  1){
                System.out.printf("NHAP VAO SO LUONG QUYEN SACH: ");
                int n = Ip.nextInt() ;
                for(int i = 0 ; i < n ; i++){
                    System.out.println("NHAP VAO THONG TIN QUYEN SACH THU " + (i+1));
                    Sach one = new Sach() ;
                    one.Input();
                    saches.add(one) ;
                }
            }
            if(choose == 2){
                System.out.println("--------------------------------------THONG TIN VE CAC QUYEN SACH LA----------------------------------------------------");
                for(Sach sach : saches){
                    sach.Out();
                }
            }
            if(choose == 3 ){
                System.out.printf("NHAP VAO THONG TIN QUYEN SACH BAN MUON TIM KIEM: ");
                Ip.nextLine() ;
                String name = Ip.nextLine() ;
                for(int i = 0; i < saches.size() ; i++){
                    if(saches.get(i).getTenSach().equalsIgnoreCase(name)){
                        saches.get(i).Out();
                    }
                }
            }
            if(choose == 4 ){
                System.out.println("--------------------------------------SAP XEP THU TU CAC QUYEN SACH THEO TEN TAC GIA--------------------------------------");
                saches.sort((o1,o2) ->{
                    return o1.getTacGia().getTenTacGia().compareTo(o2.getTacGia().getTenTacGia());
                });
            }
            if(choose == 5) return;
        }while(true) ;
     }
}