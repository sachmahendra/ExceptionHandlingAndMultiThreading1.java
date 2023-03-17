public class FinallyDemo173 {
    public static void main(String[] args) {
       // int c = 10/0;
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{    //FINALLY BLOCK KA MTLB HAI KI JO BHI MSG PRINT KRANA HAI HAM SIDHA KRA SKTE HAIN
            System.out.println("Final Msg");
        }
    }
}
