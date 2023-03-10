class MyData{
    public void display(String str){  //WE CAN USE SYNCHRINIZED IN THIS LINE INSTED OF LINE 4 AS GLOBALLY

        synchronized(this){  //IF WE DONT USE THIS LINE THEN O/P WILL NOT COME PROPERLY (BECAUSE MORE THEN ONE THREAD PASS AT A TIME)
             for(int i =0;i<str.length();i++){  // THIS IS KNOWN AS CRITICAL SECTION
                System.out.print(str.charAt(i));
                try{Thread.sleep(1000);}catch(Exception e){}
                //NO ANY EFFECT OF SLEEP SEEMS ON SYNCHRONISATION
        }
    }
    }
}
class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData d){
        this.d =d;
    }
    public void run(){
        d.display("Hello World");
    }
}

class MyThread2 extends Thread{
    MyData d;
    public MyThread2(MyData d){
        this.d =d;
    }
    public void run(){
        d.display("Welcome");
    }
}

public class ABsynchronisationDemo191 {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();
    }
}

