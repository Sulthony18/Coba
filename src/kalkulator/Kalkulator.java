package kalkulator;
import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
    double a, b, c, d, e;
    Scanner pilihan = new Scanner (System.in);
    do{
    System.out.println("-------KALKULATOR-------");
        System.out.println("Angka 1 untuk penjumlahan");
        System.out.println("Angka 2 untuk pengurangan");
        System.out.println("Angka 3 untuk perkalian");
        System.out.println("Angka 4 untuk pembagian");
        System.out.println("Angka 5 untuk modulus");
        System.out.print("Pilihan = ");
        d = pilihan.nextDouble();
        
        if (d==1) {
            System.out.print("Masukan angka pertama = ");
            a = pilihan.nextDouble();
            System.out.print("Masukan angka kedua = ");
            b = pilihan.nextDouble();
            c = a + b;
            System.out.println("Hasil = " + c );}
        
        if (d==2){
            System.out.print("Masukan angka pertama = ");
             a = pilihan.nextDouble();
            System.out.print("Masukan angka kedua = ");
            b = pilihan.nextDouble();
            c = a - b;
            System.out.println("Hasil = " + c );}
        if (d==3){
            System.out.print("Masukan angka pertama = ");
             a = pilihan.nextDouble();
            System.out.print("Masukan angka kedua = ");
            b = pilihan.nextDouble();
            c = a * b;
            System.out.println("Hasil = " + c );   }
        if (d==4) {
            System.out.print("Masukan angka pertama = ");
             a = pilihan.nextDouble();
            System.out.print("Masukan angka kedua = ");
            b = pilihan.nextDouble();
            c = a / b;
            System.out.println("Hasil = " + c ); }
        if (d==5){
            System.out.print("Masukan angka pertama = ");
             a = pilihan.nextDouble();
            System.out.print("Masukan angka kedua = ");
            b = pilihan.nextDouble();
            c = a % b;
            System.out.println("Hasil = " + c ); }
    
          
        System.out.println("--------------------------------");
        System.out.println("Apakah ingin mengulang proses ?");
        System.out.println("Jika ya ketik 1 , jika tidak ketik 2 ");
        e = pilihan.nextDouble();
        }while (e==1);
    }
}   
   
            
                
            
 
    
    
    
            
         
         
    




      
    
    

