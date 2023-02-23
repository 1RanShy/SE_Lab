
public class DataCoupling {
    int numberA = 1;
    int numberB = 10;
    int numberC = 20;
    boolean allNumbersSet = true;
    Printer printer = new Printer();
    public void caller() {
        printer.printNumbers(numberA, numberB);
        printer.printNumberBoolean(numberC, allNumbersSet);
    }
    
    public static void main(String[] args) {
        DataCoupling myDataCoupling = new DataCoupling();
        myDataCoupling.caller();
    }   
}