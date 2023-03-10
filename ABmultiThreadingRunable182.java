public class ABmultiThreadingRunable182 implements Runnable {
    public void run(){
        int i= 1;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
    }
    public static void main(String[] args) {
        ABmultiThreadingRunable182 t = new ABmultiThreadingRunable182();
        Thread th = new Thread(t);
        th.start();
        int i=1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
}