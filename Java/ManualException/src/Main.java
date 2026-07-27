//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class FarhanException extends Exception{
    FarhanException(String str){
        super(str);
    }
}

public class Main {
    public static void main(String[] args) {
        int i = 30;
        int j = 0;

        try {
            j = 18 / i;
            if(j==0){
                throw new FarhanException("Divided by zero exception.");}
        } catch (ArithmeticException e) {
            System.out.println("default arithmetic exception and "+e.getMessage());
        }
        catch (FarhanException e){
            System.out.println("Manual Exception and "+ e.getMessage());
        }

        System.out.println(j);
    }
}