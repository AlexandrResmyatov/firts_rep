import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    static FinanceReport finRep= new FinanceReport();

    public static void main(String[] args) throws IOException, StringProcessorException, InterruptedException {
        int task = -1;
        while (task != 0) {
            System.out.println("Input task number");
            System.out.println("21 - Java List 2 Task 1");
            System.out.println("22 - Java List 2 Task 2");
            System.out.println("23 - Java List 2 Task 3");
            System.out.println("24 - Java List 2 Task 4");
            System.out.println("27 - Java List 2 Task 7-9");

            System.out.println("11 - Java List 1 Task 1");
            System.out.println("12 - Java List 1 Task 2");
            System.out.println("13 - Java List 1 Task 3");
            System.out.println("14 - Java List 1 Task 4");
            System.out.println("15 - Java List 1 Task 5");
            System.out.println("16 - Java List 1 Task 6");
            System.out.println("17 - Java List 1 Task 7");

            System.out.println("18 - Java List 1 Task 8-14");

            System.out.println("0 - Exit");
            task = scanner.nextInt();
            if (task == 21) func21();
            if (task == 22) func22();
            if (task == 23) func23();
            if (task == 24) func24();
            if (task == 27) func27();

            if (task == 11) func11();
            if (task == 12) func12();
            if (task == 13) func13();
            if (task == 14) func14();
            if (task == 15) func15();
            if (task == 16) func16();
            if (task == 17) func17();

            if (task == 18) func18();

            if (task == 0) break;
        }
    }
    private static void func21() {
        System.out.println("Java List 2 Task 1");
        System.out.println("Input string:");
        String str = scanner.next();
        System.out.println("Input number:");
        int n = scanner.nextInt();
        try {
            System.out.println("Output: " + StringProcessor.multypliedString(str, n));

        } catch (StringProcessorException e) {
            System.out.println(e.getNumber());
            System.out.println(e.getMessage());
        }
    }

    private static void func22(){
        System.out.println("Java List 2 Task 2");
        System.out.println("Input first string:");
        String str1 = scanner.next();
        System.out.println("Input second string:");
        String str2 = scanner.next();
        System.out.println("Output: " + StringProcessor.numberOfIngoing(str1, str2));
    }

    private static void func23(){
        System.out.println("Java List 2 Task 3");
        System.out.println("Input string:");
        String str = scanner.next();
        System.out.println("Output: " + StringProcessor.replacementOfDigitsByWords(str));
    }

    private static void func24() {
        System.out.println("Java List 2 Task 4");
        System.out.println("Input string:");
        StringBuilder sb = new StringBuilder(scanner.next());
        StringProcessor.deleteEverySecondCgaracter(sb);
        System.out.println("Output: " + sb);
    }

    private static void func27(){
        int task = -1;
        while (task != 0){
            System.out.println("Input task number in FinanceReport");
            System.out.println("1 - Add new payment");
            System.out.println("2 - Get FinanceReport size");
            System.out.println("3 - Get payment on character");
            System.out.println("4 - Get payments less sum");
            System.out.println("5 - Get payments sum on date");
            System.out.println("6 - Get months without payments");
            System.out.println("0 - Back");
            task = scanner.nextInt();

            if (task == 1){
                System.out.println("Input payment name:");
                String name = scanner.next();
                System.out.println("Input payment year:");
                int year = scanner.nextInt();
                System.out.println("Input payment month:");
                int month = scanner.nextInt();
                System.out.println("Input payment day:");
                int day = scanner.nextInt();
                System.out.println("Input payment sum:");
                int sum = scanner.nextInt();
                finRep.addPayment(new Payment(name, year, month, day, sum));
            }

            if(task == 2){
                System.out.println("Finance reporter size:" + finRep.getSize());
            }

            if(task == 3){
                System.out.println("Enter first character:");
                char c = scanner.next().charAt(0);
                finRep.writeStartsOnCharacter(c);
            }

            if(task == 4){
                System.out.println("Enter sum:");
                int sum = scanner.nextInt();
                finRep.writeWriteLessSum(sum);
            }

            if(task == 5){
                System.out.println("Enter date dd.mm.yy");
                String date = scanner.next();
                System.out.println("Payment sum on " + date + ": " + finRep.totalPaymentSumOfDate(date));
            }

            if(task == 6){
                System.out.println("Enter year:");
                ArrayList<String> months = finRep.getMonthWithoutPaymentsOfYear(scanner.nextInt());
                for(int i = 0; i < months.size(); i++){
                    System.out.println(months.get(i));
                }
            }
            if (task == 0) break;
        }
    }

    private static void func11(){
        System.out.println(("Java List 1 Task 1"));
        System.out.println("Hello, World!");
    }

    private static void func12(){
        System.out.println("Java List 1 Task 2");
        double massive_double[] = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + i + "th number");
            massive_double[i] = scanner.nextDouble();
        }
        System.out.println(massive_double[0] * massive_double[1] * massive_double[2]);
        System.out.println((massive_double[0] + massive_double[1] + massive_double[2]) / 3);
        Arrays.sort(massive_double);
        for (int i = 0; i < 3; i++) {
            System.out.println(massive_double[i] + " ");
        }
    }

    private static void func13(){
        System.out.println("Java List 1 Task 3");
        int massive_int[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + i + "th number");
            massive_int[i] = scanner.nextInt();
        }
        System.out.println(massive_int[0] * massive_int[1] * massive_int[2]);
        System.out.println((double) (massive_int[0] + massive_int[1] + massive_int[2]) / 3);
        Arrays.sort(massive_int);
        for (int i = 0; i < 3; i++) {
            System.out.println(massive_int[i] + " ");
        }
    }

    private static void func14(){
        System.out.println("Java List 1 Task 4");

        double a, b, c, D;
        System.out.println("Enter first number");
        a = scanner.nextInt();
        System.out.println("Enter second number");
        b = scanner.nextInt();
        System.out.println("Enter third number");
        c = scanner.nextInt();
        if (a == b && b == c && c == 0) System.out.println("x любое");
        else {
            D = b * b - 4 * a * c;
            if (D > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(D)) / (2 * a);
                x2 = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            } else if (D == 0) {
                double x;
                x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                System.out.println("no roots");
            }
        }
    }

    private static void func15(){
        System.out.println("\nJava List 1 Task 5");
        System.out.println("Enter left border");
        double left = scanner.nextDouble();
        System.out.println("Enter right border");
        double right = scanner.nextDouble();
        System.out.println("Enter delta");
        double delta = scanner.nextDouble();
        for (double i = left; i <= right; i += delta) {
            System.out.println("Sin(" + i + ") = " + Math.sin(i));
        }
    }

    private static void func16(){
        System.out.println("Java List 1 Task 6");
        double a1, b1, c1, a2, b2, c2, x, y;
        System.out.println("Enter a1, b1, c1, a2, b2, c2");
        a1 = scanner.nextDouble();
        b1 = scanner.nextDouble();
        c1 = scanner.nextDouble();
        a2 = scanner.nextDouble();
        b2 = scanner.nextDouble();
        c2 = scanner.nextDouble();
        b2 = b1 + b2 * (-a1 / a2);
        c2 = c1 + c2 * (-a1 / a2);
        y = c2 / b2;
        x = (c1 - b1 * y) / a1;
        System.out.println("y = " + y + " x= " + x);
    }

    private static void func17(){
        System.out.println("Java List 1 Task 7");
        double xx = scanner.nextDouble();
        double accuracy = scanner.nextDouble();
        double sum = 1;
        double factorial_i = 1;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            factorial_i *= i;
            sum += Math.pow(xx, (double) i) / factorial_i;
            if ((Math.pow(xx, (double) i) / factorial_i) < accuracy) {
                i = Integer.MAX_VALUE - 1;
            }
        }
        System.out.println("sum = " + sum + "exp(x) = " + Math.exp(xx));
    }

    private static void func18(){
        System.out.println("Java List 1 Task 8-14");
        ArrayList<Integer> list= new ArrayList<Integer>();
        System.out.println("Enter massive size");
        for(int i = 0; i < scanner.nextInt(); i++){
            System.out.println("Enter " + (i+1) + "th number");
            list.add(scanner.nextInt());
        }
        //ДОДЕЛАТЬ
        //ДОДЕЛАТЬ
        //ДОДЕЛАТЬ
        //ДОДЕЛАТЬ
        //ДОДЕЛАТЬ
        //ДОДЕЛАТЬ
    }
}
