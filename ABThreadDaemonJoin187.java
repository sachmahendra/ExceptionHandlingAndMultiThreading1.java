/*

class MyThread extends Thread{
    public void run(){
        int count =1;
        while(true){
            System.out.println(count++);
        }
    }
}

public class ABThreadDaemonJoin187 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true);  // BY USING THIS MAIN METHOD GO IN TERMINATING STAGE AND NO OUTPUT COOMES
        t.start();

      // try{Thread.sleep(100);}catch(Exception e){};  //BY USING THIS LINE, PROGRAM RUN TILL 100 SECOND THEN TERMINATE THIS
      Thread mainThread = Thread.currentThread();
      mainThread.join();
    }
}

*/



//IT IS USE TO PRINT TWO INFINTE LOOP CONDITION TOGETHER LINE 33 AND LINE 46

 
class MyThread extends Thread{
    public void run(){
        int count =1;
        while(true){
            System.out.println(count++ +"hello world");
        }
    }
}

public class ABThreadDaemonJoin187 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true);  // BY USING THIS MAIN METHOD GO IN TERMINATING STAGE AND NO OUTPUT COOMES
        t.start();

        int count =1;
        while(true){
            System.out.println(count++ +"mahendra");
            Thread.yield();  // BY USING THIS WE GIVE MORE TIME (CHANCE) TO LINE 33 THEN 46
        }
      
    }
}



