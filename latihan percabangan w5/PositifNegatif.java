import java.util.Scanner;
public class PositifNegatif {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan angka = ");
        int angka = in.nextInt();

        if(angka > 0) {
            System.out.println("Bilangan Positif");
        }else if (angka < 0){
            System.out.println("Bilangan Negatif");
        }else{
            System.out.println("Bilangan Nol");
        }
        in.close();
    }
    
}
