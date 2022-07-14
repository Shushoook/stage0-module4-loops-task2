package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorialRaw = 0;
        while (factorialRaw <= printToInclusive) {
            System.out.println(factorial(factorialRaw));
            factorialRaw++;
        }
    }

    public int factorial(int printToInclusive) {
        if (printToInclusive==0){
            return 1;
        }
        return printToInclusive * factorial(printToInclusive - 1);

    }
}
