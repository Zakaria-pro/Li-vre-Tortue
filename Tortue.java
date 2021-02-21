package Multithreading;

public class Tortue implements Runnable {
    // Attributs :
    private int pas;

    // Constructeur :
    public Tortue(int pas){
        this.pas = pas;
    }


	public void run() {
        courir();
        }

    public void courir(){
        int i; 
        for (i = 1; i <= 12; i++) {
            // si le livere est deja finit
            if (Thread.interrupted()){
                break;
            }
            
            else{
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt(); // restore interrupted status
                }
    
                System.out.println("Distance parcourue par La tortue " + pas * i + "m");
            }
            
           

        }
    }
}

























// Construction des deux threads
        Thread tortue = new Thread(new Tortue(1));
        Thread lievre = new Thread(new Lievre(2));

        // La Course commence dans 3 ..
        System.out.println("The Race Start in 3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1\nGoooo");

        // Gooo
        lievre.start();
        tortue.start();
        
        // li sala lawal khass lakhour yaw9af
        boolean RaceIsDone = false; // il va nous donner une information sur l END d race

        while(RaceIsDone == false){
            if (!tortue.isAlive()) { // si le thread Tortue a finit sa course
                System.out.println("Tortue gagne");
                lievre.interrupt();
                RaceIsDone = true;
                System.out.println("La course est finis");
                System.out.println("Lecon : Da9a da9a la bghiti tawssal, li zarbou na3ssou, a khouya ghi b lamhal");
            }
            else{
                if (!lievre.isAlive()){
                    System.out.println("Lievre Gagne");
                    tortue.interrupt();
                    RaceIsDone = true;
                    System.out.println("La course est finis");
                }
            }
        }
        
        
        // Donner une version plus sophisticée : version de code

        // Interface graphique