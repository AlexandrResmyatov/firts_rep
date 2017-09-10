import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(("Task 1"));
        System.out.println("Hellow World!");
        //--------
        System.out.println("Task 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double massive[] = new double[3];
        for(int i=0; i<3; i++){
            massive[i] = Double.parseDouble(reader.readLine());
        }
        System.out.println(massive[0]*massive[1]*massive[2]);
        System.out.println(massive[0]*massive[1]*massive[2]/3);
        Arrays.sort(massive);
        for(int i=0; i<3; i++){
            System.out.println(massive[i]+" ");
        }
//        System.out.println(Double.parseDouble(reader.readLine()));

    }

}
