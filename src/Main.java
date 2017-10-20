import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

    static BufferedReader reader;
    public static void main(String[] args) throws IOException, StringProcessorException {
        StringProcessor sp = new StringProcessor();
        //1111
        String a = "sdf";
        String b = "111";
        try{
            b = sp.multypliedString(a,-7);
        }
        catch (StringProcessorException e){
            System.out.println(e.getNumber());
            System.out.println(e.getMessage());
        }


        System.out.println(b);
        //1111

        //2222
        System.out.println(StringProcessor.numberOfIngoing("nananana","na")+"!!!!!!!");
        //2222

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
        }

    static int factorial(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
}
