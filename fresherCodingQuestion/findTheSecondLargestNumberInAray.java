package fresherCodingQuestion;

/**
 * findTheSecondLargestNumberInAray
 */
public class findTheSecondLargestNumberInAray {

    public static void main(String[] args) {





        int[] number = {1,2,5,6,8};
        System.out.println("second largest number is " + findTheSecondLargest(number));
    }

public static int findTheSecondLargest(int[] arr1){


    int firstLargest = Integer.MIN_VALUE;

             System.out.println(firstLargest);

    int SecondLargest = Integer.MAX_VALUE;

           System.out.println(SecondLargest);

    for(int num : arr1)
    {
        if( num> firstLargest) 
        {
           SecondLargest = firstLargest;
           firstLargest = num;

        }
        else if(num > SecondLargest && num != firstLargest)
        {
            SecondLargest= num;
        }

    }

return SecondLargest;

}


    
   
}



