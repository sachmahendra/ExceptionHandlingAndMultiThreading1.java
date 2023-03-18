/* public class ThrowThrowsDemo172 {
    static int area(int l, int b) throws Exception{
        if(l<0 || b<0){
            throw new Exception();
        }
        return l*b;
    }
    static void meth1() throws Exception{
        System.out.println("Arae is: "+area(-10,5));
    }
    public static void main(String[] args) throws Exception {
        try
    {
        meth1();
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}

*/

// IF WE CREATE A CLASS IN STARTING FOR NEGATIVE DIMENSION  THEN SAME PROGRAM LIKE THIS


class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimension of a ractangle should not be negative";
    }
}
public class ThrowThrowsDemo172 {
static int area(int l, int b) throws NegativeDimensionException{
    if(l<0 || b<0){
        throw new NegativeDimensionException();
    }
    return l*b;
}
static void meth1() throws NegativeDimensionException{
    System.out.println("Arae is: "+area(-10,5));
}
public static void main(String[] args){
    try
{
    meth1();
}
catch(NegativeDimensionException e){
    System.out.println(e);
}
}
}

