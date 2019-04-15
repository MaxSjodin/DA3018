package RPNcalculator;

public class Stack {
    private int maxLength = 100;
    private int counter = 0;
    private double[] stack = new double[maxLength];


    public boolean isEmpty() {
        return counter == 0;

    }

    public boolean push(double elem) {
        if (counter < stack.length) {
            stack[counter] = elem;
            counter++;
            return true;
        }
        return false;
    }

    public double pop() {
        if (counter > 0) {
            double lastElem = stack[counter-1];
            stack[counter-1] = 0.0;
            counter--;
            return lastElem;
        }
        return stack[counter];
    }

    public int getCounter() {
        return counter;
    }

    public double[] getStack() {
        return stack;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}