import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    public Integer get_options(){
        System.out.print("Masukan Pilihan Menu : ");
        return input.nextInt();
    }

    public void print_selection_list(){
        System.out.println("Menu Goreng Enjoyers 2203: ");

        System.out.println("[1]: Mie Goreng");

        System.out.println("[2]: Nasi Goreng");

        System.out.println("[3]: Ayam Geprek Goreng");

        System.out.println("[4]: Mie Yang beneran di goreng");

        System.out.println("[5]: Es Krim Goreng");

    }

    public String check_option(Integer option){
        switch(option){
            case 1:
                return  "Opsi 1 Dipilih : Mie Goreng";
            case 2:
                return  "Opsi 2 Dipilih : Nasi Goreng";
            case 3:
                return  "Opsi 3 Dipilih : Ayam Geprek Goreng";
            case 4:
                return  "Opsi 4 Dipilih : Mie yang Beneran di Goreng";
            case 5:
                return  "Opsi 5 Dipilih : Es Krim Goreng";

            default: return "Opsi Salah : Anda salah Memilih Menu";
        }
    }

    public void pilih_menu(){
        print_selection_list();
        System.out.println(check_option(get_options()));
    }
}
