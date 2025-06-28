
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatNumber = number1;
        if(number2>greatNumber){
            greatNumber=number2;
        }
        if(number3>greatNumber){
            greatNumber=number3;
        }
        return greatNumber;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
