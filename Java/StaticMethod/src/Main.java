//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();
        mobile1.name="Samsung";
        mobile1.price=3400.0;
        mobile2.name="Iphone";
        mobile2.price=1200.0;

        Mobile.show(mobile1);
        Mobile.show(mobile2);

    }
}