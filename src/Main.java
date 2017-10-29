//import jdk.internal.jline.console.ConsoleReader;

//import jdk.internal.jline.console.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    static StringProcessor sp = new StringProcessor();
    //    static BufferedReader reader;
//    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, StringProcessorException, InterruptedException {
//        Scanner scanner = new Scanner(System.in);
//        StringProcessor sp = new StringProcessor();
        int task = -1;

//        int task = scanner.nextInt();
        while (task != 0) {
            System.out.println("Input task number");
            System.out.println("1 - Java List 2 Task 1");
            System.out.println("2 - Java List 2 Task 2");
            System.out.println("3 - Java List 2 Task 3");
            System.out.println("0 - Exit");
            task = scanner.nextInt();
            if (task == 1) func1();
            if (task == 2) func2();
            if (task == 3) func3();
//            if (task == 4) func4();
//            if (task == 5) func5();
//            if (task == 6) func6();
//            if (task == 7) func7();
            if (task == 0) break;
//            Runtime runtime = Runtime.getRuntime();
//            Process process = runtime.exec("cls");
//            System.out.println("Введите номер задания");
//            task = scanner.nextInt();

        }
    }
        //1111
    private static void func1(/*StringProcessor sp, Scanner scanner*/) {
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

    private static void func2(){
        System.out.println("Java List 2 Task 2");
        System.out.println("Input first string:");
        String str1 = scanner.next();
        System.out.println("Input second string:");
        String str2 = scanner.next();
        System.out.println("Output: " + StringProcessor.numberOfIngoing(str1, str2));
    }

    private static void func3(){
        System.out.println("Java List 2 Task 3");
        System.out.println("Input string:");
        String str = scanner.next();
        System.out.println("Output:" + StringProcessor.replacementOfDigitsByWords(str));
    }

//        System.out.println(b);
    //1111

//        //2222
//        //2222
//        //4444
//        StringBuilder sb = new StringBuilder("0123456789");
//        StringProcessor.deleteEverySecondCgaracter(sb);
//        System.out.println(sb.toString() + " -> " + sb.toString());
//        sb = new StringBuilder("01234567890");
//        StringProcessor.deleteEverySecondCgaracter(sb);
//        System.out.println(sb.toString() + " -> " + sb.toString());
//        //4444
//
//        Payment p = new Payment("asd#@fsd$F#te54twvvtdf");
//        String aaa = new String();
//        aaa = p.getFullName();
//        aaa = "123123213";
//
//        System.out.println(p.getFullName());
//        Payment pp = new Payment("asd#@fsd$F#te54twvvtdf");
//        System.out.println(p.hashCode());

    //-------------
    //-------------
    //-------------
    //-------------
    //-------------
    //-------------
    //-------------



/*



        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер задания");
        int task = Integer.parseInt(reader.readLine());
        while (task != 0) {
            if (task == 1) func1();
            if (task == 2) func2();
            if (task == 3) func3();
            if (task == 4) func4();
            if (task == 5) func5();
            if (task == 6) func6();
            if (task == 7) func7();
            if (task == 0) break;
            System.out.println("Введите номер задания");
            task = Integer.parseInt(reader.readLine());

        }
    }
    static void func1()
    {
        System.out.println(("Task 1"));
        System.out.println("Hello, World!");
    }
        //--------
        static void func2() throws IOException {

         System.out.println("\nTask 2");

         double massive[] = new double[3];
         for (int i = 0; i < 3; i++) {
             massive[i] = Double.parseDouble(reader.readLine());
         }
         System.out.println(massive[0] * massive[1] * massive[2]);
         System.out.println((massive[0] + massive[1] + massive[2]) / 3);
         Arrays.sort(massive);
         for (int i = 0; i < 3; i++) {
             System.out.println(massive[i] + " ");
         }
     }
        //--------
        static void func3() throws IOException {

         System.out.println("\nTask 3");
         int massive_int[] = new int[3];
         for (int i = 0; i < 3; i++) {
             massive_int[i] = Integer.parseInt(reader.readLine());
         }
         System.out.println(massive_int[0] * massive_int[1] * massive_int[2]);
         System.out.println((double) (massive_int[0] + massive_int[1] + massive_int[2]) / 3);
         Arrays.sort(massive_int);
         for (int i = 0; i < 3; i++) {
             System.out.println(massive_int[i] + " ");
         }
     }
        //--------
        static void func4() throws IOException {

            System.out.println("\nTask 4");

            double a, b, c, D;
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            c = Integer.parseInt(reader.readLine());
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
                    System.out.println("корней нет");
                }
            }
     }
        //--------
        static void func5() throws IOException {
            System.out.println("\nTask 5");
            double left = Double.parseDouble(reader.readLine());
            double righte = Double.parseDouble(reader.readLine());
            double delta = Double.parseDouble(reader.readLine());
            for (double i = left; i <= righte; i += delta) {
                System.out.println(Math.sin(i));
            }
        }
        //--------
        static void func6() throws IOException {
            System.out.println("\nTask 6");
            double a1, b1, c1, a2, b2, c2, x, y;
            a1 = Double.parseDouble(reader.readLine());
            b1 = Double.parseDouble(reader.readLine());
            c1 = Double.parseDouble(reader.readLine());
            a2 = Double.parseDouble(reader.readLine());
            b2 = Double.parseDouble(reader.readLine());
            c2 = Double.parseDouble(reader.readLine());
            b2 = b1 + b2 * (-a1 / a2);
            c2 = c1 + c2 * (-a1 / a2);
            y = c2 / b2;
            x = (c1 - b1 * y) / a1;
            System.out.println("y = " + y + " x= " + x);
        }
        //--------
        static void func7() throws IOException {
            System.out.println("\nTask 7");
            double xx = Double.parseDouble(reader.readLine());
            double accuracy = Double.parseDouble(reader.readLine());
            double sum = 1;
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                sum += Math.pow(xx, (double) i) / ((double) factorial(i));
                if ((Math.pow(xx, (double) i) / (double) factorial(i)) < accuracy) {
                    i = Integer.MAX_VALUE - 1;
                }
            }
            System.out.println("summ = " + sum + "exp(x) = " + Math.exp(xx));
            */
//        }

//    static int factorial(int n){
//        int res=1;
//        for(int i=1;i<=n;i++){
//            res*=i;
//        }
//        return res;
//    }
}
