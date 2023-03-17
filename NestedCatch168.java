public class NestedCatch168 {
    public static void main(String[] args) {
        int A[]={30,20,10,40,0};
        try{
           int c =A[0]/A[4];
           System.out.println("Devision is: "+ c);
           try{
            System.out.println(A[3]);
           } 
           catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index number");
           }
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }
        System.out.println("Bye");
    }
}

