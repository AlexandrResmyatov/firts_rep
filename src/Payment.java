import java.util.Objects;

public class Payment {
    private String fullName = "no name";
    private int year=0;
    private int month=0;
    private int day=0;
    private int sum=0;

    public Payment(String name){
        this.fullName = name;
    }
    public Payment(String name, int year, int month, int day, int sum){
        this.fullName = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.sum = sum;
    }

    public String getFullName() {
        return fullName;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getSum() {
        return sum;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Payment payment = (Payment) o;
        if(this.fullName == payment.getFullName() &&
                this.year == payment.year &&
                this.month == payment.month &&
                this.day == payment.day &&
                this.sum == payment.sum){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode(){
        return Objects.hash(this.fullName, this.year, this.month, this.day, this.sum);
    }

    @Override
    public String toString(){
        return "payment:" + fullName +" " + year + " " + month+ " " + day + " " + sum;
    }
}
