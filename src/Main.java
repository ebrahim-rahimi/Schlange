public class Main {
    public static void main(String[] args) throws InterruptedException {


        Schlange schlange = new Schlange();
        Spielfeld spielfeld = new Spielfeld();

        while (schlange.getX() < 10) {
            int aktuellePosition = schlange.getX();

            // Übergibt die aktuelle Position an das Spielfeld
            spielfeld.zeichnen(aktuellePosition);

            Thread.sleep(500);

            schlange.bewegen();
        }

        System.out.println("Futter gefressen!");



    }


}
