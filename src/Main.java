public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);// 1-1=0
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);// деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА: деление на 0!");
        }
    }
}