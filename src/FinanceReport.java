import java.util.ArrayList;
import java.util.Scanner;

public class FinanceReport {
    private Scanner scanner;
    private ArrayList<Payment> payments;

    public FinanceReport(){
        this.payments = new ArrayList<Payment>();
        this.scanner = new Scanner(System.in);
    }

    public int getSize(){
        return this.payments.size();
    }
    public Payment getPayment(int numberOfPayment){
        if(numberOfPayment > payments.size()-1){
            return null;
        }
        return payments.get(numberOfPayment);
    }
    public void writeStartsOnCharacter(char c){

        for(int i = 0; i<payments.size(); i++) {
            if(this.payments.get(i).getFullName().toLowerCase().charAt(0) == c ||
                    this.payments.get(i).getFullName().toUpperCase().charAt(0) == c){
                    System.out.println(String.format("%s дата:%d.%d.%d сумма:%dруб.%dкоп.",
                            this.payments.get(i).getFullName(),
                            this.payments.get(i).getDay(),
                            this.payments.get(i).getMonth(),
                            this.payments.get(i).getYear(),
                            this.payments.get(i).getSum()/100,
                            this.payments.get(i).getSum()%100));
            }
        }
    }

}
