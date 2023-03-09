public class ABMultithradingByRunable182 implements Runnable {

    public void run(){
        int i =1;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
    }
    public static void main(String[] args) {
        ABMultithradingByRunable182 t= new ABMultithradingByRunable182();
        Thread th = new Thread(t);

        th.start();
        int i=1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
    
}