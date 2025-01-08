package JavaPractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class AarraysSorting {

    public static void main(String[] args) {
        //approach 1
        int a[]={30,20,10,50,60};
        System.out.print("before sorting"+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.print("after sorting"+ Arrays.toString(a));

        //approach 2
        int b[]={30,20,10,50,60};
        System.out.print("before sorting"+ Arrays.toString(b));
        Arrays.sort(b);
        System.out.print("after sorting"+ Arrays.toString(b));

        //approach 3 in decending oredr premetyive data types not supported so made integer
        Integer c[]={30,20,10,50,60};
        System.out.print("before sorting"+ Arrays.toString(c));
        Arrays.sort(c, Collections.reverseOrder());
        System.out.print("after sorting"+ Arrays.toString(c));


    }
}
