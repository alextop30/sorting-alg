/**
 * Created by alex on 6/20/16.
 */
public class main {

    public static void main(String [] args)
    {

        //containers to be sorted
        String[] a = {"hello", "how" , "are" , "you"};
        Double [] d = {2.13,37.3,45.01,21.3,3.0,1.223,21.213,42.112,5.2};
        Date [] col = new Date[6];

        //insertion counter
        int c = 0;
        

        //initialize years in descending order
        for (int i = 5; i >= 0; i--)
        {
            //construct date object
            Date whenever = new Date (1,1, Integer.parseInt("201" + i));

            //add date to array
            col[c] = whenever;

            //increment insertion counter
            c++;
        }

        System.out.println("Sorting using selection sort!\n\n");

        System.out.println("Sorting an array of strings!");
        sorting.selection_sort(a);
        assert sorting.isSorted(a);
        sorting.print_array(a);
        System.out.println();

        System.out.println("Sorting an array of doubles!");
        sorting.selection_sort(d);
        assert sorting.isSorted(d);
        sorting.print_array(d);
        System.out.println();

        System.out.println("Sorting an array of Dates!");
        sorting.selection_sort(col);
        assert sorting.isSorted(col);
        sorting.print_array(col);

        System.out.println("\n\nSorting using insertion sort!\n\n");


        System.out.println("Sorting an array of strings!");
        sorting.insertion_sort(a);
        assert sorting.isSorted(a);
        sorting.print_array(a);
        System.out.println();

        System.out.println("Sorting an array of doubles!");
        sorting.insertion_sort(d);
        assert sorting.isSorted(d);
        sorting.print_array(d);
        System.out.println();

        System.out.println("Sorting an array of Dates!");
        sorting.insertion_sort(col);
        assert sorting.isSorted(col);
        sorting.print_array(col);

    }
}