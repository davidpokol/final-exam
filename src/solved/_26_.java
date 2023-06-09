package solved;

import javax.crypto.spec.PSource;

public class _26_ {
    public static void main(String[] args) {

        int[] sortedArray = new int[] {1,3,5,7,9,10,40,43};

        System.out.println(binarySearch(sortedArray,9));
    }
    /**
     *
     * @source <a href="https://youtu.be/NFhOrxtXXcM">John code</a>
     */
    private static int binarySearch(int [] array, int numberToFind) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middleIndex = (low + high) / 2;

            if (array[middleIndex] == numberToFind) { // ha a tartomány középső eleme a szám --> megtaláltuk a számot
                return middleIndex;
            }

            if (array[middleIndex] > numberToFind) { // ha a bal szárnyban van a keresendő szám
               high = middleIndex - 1;

            } else { // ha a jobb szárnyban van a kersendő elem
                low = middleIndex + 1;
            }
        }
        return -1;
    }
}
