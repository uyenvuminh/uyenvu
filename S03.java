package InsertionSort;

/**
 *
 * @author Vux Mih Uyn
 */
public class S03 {

    public static void main(String[] args) {
        InsertionSort am = new InsertionSort();
        //Enter the number n of array 
        am.input();
        //Random to show a random array from 0 to n-1
        am.rand();
        //Show the Unsorted array
        System.out.println("Unsorted array:" + am);
        //Sort and Show the Unsorted array
        am.insertSort();
        System.out.println("Sorted array: " + am);
        System.out.println("  Thanks for using my services!");
    }
}
