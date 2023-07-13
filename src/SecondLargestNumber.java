import java.util.Scanner;

class Solution {
    public int findSecondLargest(int[] array)
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = largest;
        if(array.length < 2)
        {
            return -1;
        }
        for(int i=0;i< array.length;i++)
        {
            if(array[i]>largest)
            {
                secondLargest = largest;
                largest =array[i];
            }
            if(array[i]>secondLargest && array[i]!=largest)
            {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
}

public class SecondLargestNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Solution answer = new Solution();
        System.out.println(answer.findSecondLargest(array));
    }
}
