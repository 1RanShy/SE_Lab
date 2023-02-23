
public class NumbersAndBoolean {
    private int numberA, numberB, numberC;
    private boolean allNumbersSet;
    
    NumbersAndBoolean(int numA, int numB, int numC, boolean allNumsSet) {
    	numberA = numA;
    	numberB = numB;
    	numberC = numC;
    	allNumbersSet = allNumsSet;   	
    } 
    
    public int getFirstNum() {
    	return this.numberA;
    }
    
    public int getSecondNum() {
    	return this.numberB;
    }
    
    public int getThirdNum() {
    	return this.numberC;
    }
    
    public boolean getBool() {
    	return this.allNumbersSet;
    }
    
}
