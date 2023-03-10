class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);   //IF WE USE THIS COMMENT PART THEN OUTPUT WILL COMES WITH DILAY OF 100 SEC.
          /*   try{
               Thread.sleep(100);
            }
         catch(InterruptedException e){
                System.out.println(e);
            }
            */
        }
    }
}

public class ABsleepMethod186 {
    public static void main(String[] args) {
        MyThread t  = new MyThread("My Thread 1");
        t.start();

        t.interrupt();  // IF YOU WANT TO GIVE SOME INTERRUPT IN MIDDLE OF THE OUT PUT THEN WE SHOULD USE THIS LINE
    }
}

