public class MainProgram {
    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);
        System.out.println(a); // 10.00e
        System.out.println(b); // 5.00e
        System.out.println(c); // 15.00e

        a = a.plus(c);
        System.out.println(a); // 25.00e
        System.out.println(b); // 5.00e
        System.out.println(c); // 15.00e

        Money x = new Money(10, 0);
        Money y = new Money(3, 0);
        Money z = new Money(5, 0);

        System.out.println(x.lessThan(y)); // false
        System.out.println(y.lessThan(z)); // true

        Money d = x.minus(y);
        System.out.println(x); // 10.00e
        System.out.println(y); // 3.00e
        System.out.println(d); // 7.00e

        d = d.minus(x);
        System.out.println(x); // 10.00e
        System.out.println(d); // 0.00e
    }
}
