import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(("Task 1"));
        System.out.println("Hellow World!");
        //--------
        System.out.println("\nTask 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double massive[] = new double[3];
        for(int i=0; i<3; i++){
            massive[i] = Double.parseDouble(reader.readLine());
        }
        System.out.println(massive[0]*massive[1]*massive[2]);
        System.out.println((massive[0]+massive[1]+massive[2])/3);
        Arrays.sort(massive);
        for(int i=0; i<3; i++){
            System.out.println(massive[i]+" ");
        }
        //--------
        System.out.println("\nTask 3");
        int massive_int[] = new int[3];
        for(int i=0; i<3; i++){
            massive_int[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(massive_int[0]*massive_int[1]*massive_int[2]);
        System.out.println((double)(massive_int[0]+massive_int[1]+massive_int[2])/3);
        Arrays.sort(massive);
        for(int i=0; i<3; i++){
            System.out.println(massive_int[i]+" ");
        }
        //--------
        System.out.println("\nTask 4");

        double a, b, c, D;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("корней нет");
        }

        //--------
        System.out.println("\nTask 5");
        double left = Double.parseDouble(reader.readLine());
        double righte = Double.parseDouble(reader.readLine());
        double delta = Double.parseDouble(reader.readLine());
        for(double i = left; i<=righte; i+=delta){
            System.out.println(Math.sin(i));
        }
        //--------
        System.out.println("\nTask 6");
        double a1,b1,c1,a2,b2,c2,x,y;
        a1 = Double.parseDouble(reader.readLine());
        b1 = Double.parseDouble(reader.readLine());
        c1 = Double.parseDouble(reader.readLine());
        a2 = Double.parseDouble(reader.readLine());
        b2 = Double.parseDouble(reader.readLine());
        c2 = Double.parseDouble(reader.readLine());
        b2 = b1 + b2 * ( -a1 / a2 );
        c2 = c1 + c2 * ( -a1 / a2 );
        y = c2 / b2;
        x = ( c1 - b1 * y ) / a1;
        System.out.println("y = " + y + "x= " + x);
    }

}
