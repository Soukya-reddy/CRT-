import java.util.ArrayList;
class LambdaExpressionsSingleParameter {

    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Elements of the ArrayList: ");
        al.forEach(n -> System.out.println(n));
        System.out.println(
            "Even elements of the ArrayList: ");
        al.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }
}