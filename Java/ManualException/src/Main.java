//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class FarhanException extends Exception{
    FarhanException(String str){

    }
}

public class Main {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if(i>j){
            throw new FarhanException("Divided by zero exception.");}
        } catch (ArithmeticException  | FarhanException e) {
            System.out.println(e);
            //System.out.println("Arithmetic exception.");
        }

        System.out.println(j);
    }
}