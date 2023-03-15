import java.util.Scanner;
public class Vehicle {

    Scanner input = new Scanner(System.in);

    public Integer get_options(){
        System.out.print("Masukan Pilihan Kendaraan : ");
        return input.nextInt();
    }

    public void print_selection_list(){
        System.out.println("berikut List Kendaaran : ");
        System.out.println("[1]: Naik Pesawat Terbang");

        System.out.println("[2]: Naik Kereta Api");

        System.out.println("[3]: Naik Bus");

        System.out.println("[4]: Naik Taksi");

        System.out.println("[5]: Naik Mobil Pribadi");

        System.out.println("[6]: Naik Motor");
    }

    public String check_option(Integer option){

        switch(option){
            case 1:
                return  "Opsi 1 Dipilih : Pesawat terbang";
            case 2:
                return  "Opsi 2 Dipilih : Kereta Api";
            case 3:
                return  "Opsi 3 Dipilih : Bus";
            case 4:
                return  "Opsi 4 Dipilih : Taksi";
            case 5:
                return  "Opsi 5 Dipilih : Mobil Pribadi";
            case 6:
                return  "Opsi 6 Dipilih : Naik Motor";

            default: return "Opsi Salah : Anda salah Memilih";
        }
    }

    public void pilih_kendaraan(){
        print_selection_list();
        System.out.println(check_option(get_options()));
    }



}

