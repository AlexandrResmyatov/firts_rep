import java.util.ArrayList;
import java.util.Scanner;

public class FinanceReport {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Payment> payments;

    public FinanceReport(){
        this.payments = new ArrayList<Payment>();
    }
    public FinanceReport(FinanceReport financeReport){
        payments = new ArrayList<Payment>(financeReport.getPayments());
    }

    public int getSize() {
        return this.payments.size();
    }

    public Payment getPayment(int numberOfPayment){
        if(numberOfPayment > payments.size()-1){
            return null;
        }
        return payments.get(numberOfPayment);
    }
    public ArrayList<Payment> getPayments(){
        return this.payments;
    }
    public void writeStartsOnCharacter(char c){//вывести у которых фамилия начинается на букву

        for(int i = 0; i < payments.size(); i++) {
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

    public void writeWriteLessSum(int sum){//вывести у которых сумма меньше
        for(int i = 0; i < payments.size(); i++) {
            if(this.payments.get(i).getSum() < sum){
                System.out.println(this.payments.get(i).toString());
            }

        }
    }

    public void totalPaymentOfDate(String date){ //суммарный платеж за дату
        int total = 0;
        String[] massDate = date.split(" ");
        for(int i = 0; i < payments.size(); i++){
            if(payments.get(i).getYear() == Integer.parseInt(massDate[2]) &&
                    payments.get(i).getMonth() == Integer.parseInt(massDate[1]) &&
                    payments.get(i).getDay() == Integer.parseInt(massDate[0])){
                total += payments.get(i).getSum();
            }
        }
    }

    public ArrayList<String> getMonthWithoutPaymentsOfYear(int year){
        int[] iMonths = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 0; i < this.payments.size(); i++){
            if(this.payments.get(i).getSum() != 0){
                iMonths[this.payments.get(i).getMonth()] = 1;
            }
        }
        ArrayList<String> aMonth = new ArrayList<String>();
        if(iMonths[0] == 0) aMonth.add("Январь");
        if(iMonths[1] == 0) aMonth.add("Февраль");
        if(iMonths[2] == 0) aMonth.add("Март");
        if(iMonths[3] == 0) aMonth.add("Апрель");
        if(iMonths[4] == 0) aMonth.add("Май");
        if(iMonths[5] == 0) aMonth.add("Июнь");
        if(iMonths[6] == 0) aMonth.add("Июль");
        if(iMonths[7] == 0) aMonth.add("Август");
        if(iMonths[8] == 0) aMonth.add("Сентябрь");
        if(iMonths[9] == 0) aMonth.add("Октябрь");
        if(iMonths[10] == 0) aMonth.add("Ноябрь");
        if(iMonths[11] == 0) aMonth.add("Декабрь");
        return aMonth;
    }
}
