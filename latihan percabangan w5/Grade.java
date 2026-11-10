import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
       String grade;
        Scanner in = new Scanner(System.in);

        System.out.println("Berapa nilainya = ");
        double total = in.nextDouble();

        if(total >= 92){
            grade = "A";
        } else if(total >=80){
            grade = "B";
        } else if(total >=65){
            grade = "C";
        } else if(total >=43){
            grade = "D";
        } else {
            grade = "E";

        }
          System.out.println("Gradenya adalah " + grade);  
        in.close();
    }
    
}
