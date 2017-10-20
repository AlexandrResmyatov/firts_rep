public class StringProcessor {

    public static String multypliedString(String str, int n) throws StringProcessorException {
        if(n<0) throw new StringProcessorException("Number is less than one",n);
        String outputString = "";

        for(int i = 0; i<n; i++){
            outputString+=str;
        }
        return outputString;

    }
    public static int numberOfIngoing(String firstString, String secondString){
        int i = 0;  // Числовая переменная, контролирующая итерации цикла
        int x = -1; // Так как метод IndexOf() возвращает "-1" если первое вхождение подстроки не найдено, то приходится использовать вспомагательную, вместо і, что б начать цикл
        int count = -1; // Записываем количество вхождений (итераций цикла)
        while(i != -1)
        {
            i = firstString.indexOf(secondString,x+1); // получаем индекс первого вхождения  х+1 говорит, что начинать нужно с 0-го индекса, тоесть с буквы "П"
            x = i; // соответственно присваиваем номер индекса первого значения, что б потом (х+1) начать со следующего
            count++;  // Увеличиваем на единицу наше количество
        }
        return  count;
    }
}

class StringProcessorException extends Exception{
    private int number;
    private String message;
    public int getNumber(){
        return number;
    }
    public String getMessage(){
        return message;
    }
    public StringProcessorException(String message, int n){
        super(message);
        number = n;
        this.message=message;
    }
}