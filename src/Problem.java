import java.util.Arrays;
import java.util.Random;

public class Problem {
    public static void main(String[] args) {
        Problem problem = new Problem();
        int[] tab = problem.generateArray();
        System.out.println(Arrays.toString(tab));

        int[] uniqueElements = problem.getUniqueElements(tab);
        System.out.println(Arrays.toString(uniqueElements));
    }

    private int[] generateArray() {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i <array.length ; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;
    }

    private int[] getUniqueElements(int[] array) {
        int[] unique = new int[10];
        int emptyIndex = 0;
        int nrZero=0, countZero=0;
        for (int i = 0; i < 10; i++) {
            if(!checkIfContains(array[i], unique)) {
                unique[emptyIndex] = array[i];
                emptyIndex++;
            }
        }
        if(checkIfContains(0, array)) nrZero=1;
        for (int i = 0; i <10 ; i++) {
            if (unique[i]==0) countZero++;
        }
        int size = 10 - countZero+nrZero;
        int[] unique2 = new int[size];
        for (int i = 0; i < unique2.length; i++) {
            unique2[i] = unique[i];
        }
        nrZero=0;
        return unique2;
    }

    private boolean checkIfContains(int number, int[] array) {
        boolean contains = false;
        int i = 0;
        while(!contains && i < array.length) {
            if(array[i] == number) {
                contains = true;
                break;
            }
            i++;
        }
        return contains;
    }
}
