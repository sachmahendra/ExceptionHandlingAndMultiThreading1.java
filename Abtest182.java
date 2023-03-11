public class Abtest182 extends Thread {
    public void run(){
        int i= 1;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
    }
    public static void main(String[] args) {
        Abtest182 t = new  Abtest182();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
}