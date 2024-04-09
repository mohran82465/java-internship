public class Task3 {
    public static void main(String[] args) {
        System.out.println("The even numbers (note i am here using bitwise operation) : ");
        for (int i = 1 ;i <=20;i++)
        {
            if((i&1)==0)
            {
                System.out.print( i +" ");
            }
        }
    }
}
