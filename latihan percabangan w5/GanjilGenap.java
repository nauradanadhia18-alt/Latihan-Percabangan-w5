import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Angka Pertama = ");
        int Angka = in.nextInt();

        if( Angka % 2 == 0){
            System.out.println("Angka Genap");
        } else {
            System.out.println("Angka Ganjil");
        }
        in.close();
    }
    

}
