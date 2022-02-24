package tebak.angka;
import java.util.Scanner;
import java.util.Random;
public class TebakAngka {
public static void main(String[] args) {
    int acak , tebak;
    
    Scanner input=new Scanner(System.in);
    Random rand = new Random();
   
    System.out.println("======= TEBAK ANGKA =======");
    do{
        System.out.print("Angka Tebakan Anda:");
        tebak = input.nextInt();
 
        if(tebak<acak){
            System.out.println("Tebakan Anda Terlalu Tinggi, Silahkan Coba Lagi :p");
        } else if(acak>tebak){
            System.out.println("Tebakan Anda Terlalu Rendah, Silahkan Coba Lagi :P");
        }else {System.out.println("Selamat Tebakan Anda Benar !!!");
        }
      
    }while(acak != tebak);
  }
}
