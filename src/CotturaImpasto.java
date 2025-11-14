//thread che simula la cottura dell'impasto delle piastrelle
public class CotturaImpasto extends Thread{
    public void run(){
        try{
            System.out.println("Aspetto che il fuoco si accendi e si scaldi");
            Thread.sleep(1000);//simula il tempo di cottura
            System.out.println("inizio a cuocere l'impasto delle piastrelle");
            Thread.sleep(500);//simula il tempo di cottura
            System.out.println("cottura dell'impasto delle piastrelle completata");
        }catch (InterruptedException e ){
            System.out.println("la cottura è stata interrotta");
        }
    }
}
