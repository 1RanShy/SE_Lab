public class DataCoupling {
    int numberA = 1;
    int numberB = 2;
    int numberC = 3;
    boolean allNumbersSet = true;
    
    NumbersAndBoolean myNumsAndBool = new NumbersAndBoolean(numberA, numberB, numberC, allNumbersSet);
    
    Printer printer = new Printer();
    Sum mySum = new Sum();
    
    public void firstCaller() {
        printer.print(myNumsAndBool);
    }
    
    public void secondCaller() {
        mySum.sum(myNumsAndBool);
    }
    
    public static void main(String[] args) {
        DataCoupling myDataCoupling = new DataCoupling();
        myDataCoupling.firstCaller();
        myDataCoupling.secondCaller(); 
    }        
}