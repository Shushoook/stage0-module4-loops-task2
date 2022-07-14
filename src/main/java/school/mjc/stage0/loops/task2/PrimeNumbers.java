package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.print("");
        } else {
            System.out.println(2);
            int count = 2;
            boolean check = false;
            while (count <= printToInclusive) {
                int devider = 2;
                while (devider <= count) {
                    if (count % devider == 0) {
                        devider++;
                        break;
                    }
                    if (++devider == count) {
                        System.out.println(count);
                        break;
                    }
                    //    break;
                }
                count++;
            }
        }
    }
}
