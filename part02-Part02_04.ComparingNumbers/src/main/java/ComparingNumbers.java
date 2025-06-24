
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fnum = scanner.nextInt();
        int snum = scanner.nextInt();
        String condition = "";
        if(fnum>snum){
            condition="greater than";
        }else if(fnum<snum){
            condition = "smaller than";
        }else{
            condition = "equal to";
        }
       
        System.out.println(fnum + " is " + condition + " " + snum + ".");
  
    }
}
