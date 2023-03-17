
class StackOverFlow extends Exception{
    public String toString(){
        return "Stack is full";
    }
}
class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}
class Stack{
    private int size;
    private int top = -1;
    private int S[];

    public Stack(int sz){
        size = sz;
        S= new int [sz];
    }

    public void push (int x) throws StackOverFlow{
        if(top == size-1)
        throw new StackOverFlow();
        top++;
        S[top] = x;
        }

        public int pop() throws StackUnderFlow{
            int x =-1;

            if(top ==-1)
                throw new StackUnderFlow();
                top--;
                x=S[top];
                top--;
                return x;
            }
        }

public class StackExceptionExample176 {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        try
        {
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        }
        catch(StackOverFlow s)
        {
            System.out.println(s);
        }
    }
}
