/* 
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
}

public class ABthreadMethodconstractor186 {
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread 1");
        System.out.println("ID "+t.getId());
        System.out.println("name "+t.getName());
        System.out.println("priority "+t.getPriority());
        System.out.println("stste "+t.getState());
        System.out.println("Alive "+t.isAlive());
    }
}
*/


class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);  //HEAR IF WE USE MIN AT THE PLACE OF MAX THEN IT GIVE MIN PRIORITY
    }
}

public class ABthreadMethodConstractor186 {
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread 1");
        System.out.println("ID "+t.getId());
        System.out.println("name "+t.getName());
        System.out.println("priority "+t.getPriority());
        t.start();
        System.out.println("stste "+t.getState());
        System.out.println("Alive "+t.isAlive());
    }
}
