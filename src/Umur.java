import java.util.Scanner;
public class Umur {


    Scanner input = new Scanner(System.in);
    public Integer get_umur(){
        System.out.print("Masukan Umur Anda : ");
        return input.nextInt();
    }


    public String cek_umur(Integer umur){
        if (umur >= 60) {
            return "Lanjut Usia";
        } else if (umur > 40 ) {
            return "paruhbaya";
        } else if (umur > 18) {
            return "Dewasa";
        } else if (umur > 12) {
            return "Remaja";
        } else if (umur > 5) {
            return "Anak - Anak";
        } else if (umur >= 0) {
            return "Balita";
        }else {
            return "Input Error";
        }
    }


    public void print_cek_umur(){
        System.out.println("Umur Kamu Adalah : " + cek_umur(get_umur()));
    }
}


/*
* Umur <5 Balita
5 ≤ umur < 12 Anak-anak
12 ≤ umur < 18 Remaja
18 ≤ umur < 40 Dewasa
40 ≤ umur < 60 Paruhbaya
umur ≥ 60 Lanjut usia
*
*
* */
