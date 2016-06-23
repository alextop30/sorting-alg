/**
 * Created by alex on 6/20/16.
 */
public class sorting
{
    public static void selection_sort(Comparable[] cont)
    {
        //helper initializations
        Comparable temp;
        int min;

        //step through 1st loop from begin to end
        for (int i = 0; i < cont.length; i++)
        {
            //set the minimum value at i since it is the slowest moving
            min = i;

            //second loop compare to find the smallest element
            for (int j = i+1; j < cont.length; j++)
            {
                 if(less(cont[j], cont[i]))
                    min = j;
            }

            //set the temporary storage
            temp = cont[i];

            //swap the elements - i is the element that is at the beginning of the
            //array. min will be the element that is further away
            cont[i] = cont[min];

            //complete the swap at the min
            cont[min] = temp;

        }
    }

    public static void insertion_sort(Comparable[] cont)
    {
        /*
        2 loops
        1st loop runs from element 2 to last element
        2nd loop runs only if second indexer is larger than 0 and left hand
        of the array is smaller than the right hand of the array
        2nd loop indexer is decremented going backwards
         */

        for (int i = 1; i < cont.length; i++)
        {

            for(int j = i; j > 0 && less(cont[j], cont[j-1]); j--)
            {
                //call to the swap function
                exch(cont, j, j-1);
            }

        }
    }

    private static boolean less(Comparable v, Comparable w)
    { return v.compareTo(w) < 0; }

    private static void exch(Comparable[] a, int i, int j)
    { Comparable t = a[i]; a[i] = a[j]; a[j] = t; }

    private static void show(Comparable[] a)
    { // Print the array, on a single line.
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a)
    { // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    //public wrapper for show
    public static void print_array(Comparable [] cont)
    {
        show(cont);
    }

}
