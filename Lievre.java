

public class Lievre implements Runnable {
    // Attributes :
    private int pas;

    // Constructor :
    public Lievre(int pas) {
        this.pas = pas;
    }

    // Methods :
    public void run() {
        courir();
    }

    public void courir() {
        int i; // pour la boucle et metre
        for (i = 1; i <= 6; i++) {
            // Si la tortue a deja finit
            if (Thread.interrupted()) {
                break;
            }

            // sinon sbaag hh
            else {
                // This just for lisibility
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

                
                if (i == 5) {
                    System.out.println("Lievre se Reveile §§§");
                }
                
                System.out.println("Distance parcourue par le lievre " + pas * i + "m");

                if (i == 4) {
                    System.err.println("Livre DORT zzzz");
                    try{
                        Thread.sleep(4000);
                    }
                    catch (InterruptedException e){
                        Thread.currentThread().interrupt(); // restore interrupted status
                    }
                    
                }
            }
            
        }

    }

}
    


