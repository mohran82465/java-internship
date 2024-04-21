public class FirstOccurrence {

    public static int findTheOccurrence(int arr[], int target)
    {
        int position = -1 ;
        for (int i = 0 ; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                if( i < 5)
                {
                    continue;
                }
                position = i ;
                break;
            }

        }
        return position;
    }
    public static void printTheAnswer(int position)
    {
        if (position == -1)
        {
            System.out.println("the number is not founded or skipped ");
        }
        else
        {
            System.out.println("if we consider we talking the array one base the index pop up here in this position : "+ (position +1) );
        }

    }
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8 ,  10, 2, 12, 14 , 16  , 18 };
        int target = 2;
        int position = findTheOccurrence(arr , target  );
        printTheAnswer(position);

    }
}
