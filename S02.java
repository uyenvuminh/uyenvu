package SelectionSort;

/**
 *
 * @author Vux Mih Uyn - Done
 */
public class S02 {

    public static void main(String[] args) {
        SelectionSort am = new SelectionSort();
        //Enter the number n of array 
        am.input();
        //Random to show a random array from 0 to n
        am.rand();
        //Show the Unsorted array
        System.out.println("Unsorted array:" + am);
        //Sort and Show the Unsorted array
        am.selectionSort();
        System.out.println("Sorted array: " + am);
        System.out.println("  Thanks for using my services!  ");
    }
}
