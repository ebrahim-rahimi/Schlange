public class Spielfeld {

    // Methode erwartet die aktuelle Position x von der Schlange
    public void zeichnen(int x) {

        // 1. Array mit korrekter Größe initialisieren
        char[][] feld = new char[5][10];

        // 2. Spielfeld mit '.' füllen (Indizes 0 bis 4 und 0 bis 9)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                feld[i][j] = '.';
            }
        }

        // 3. Schlange an Position (2, x) setzen
        if (x >= 0 && x < 10) {
            feld[2][x] = '0';
        }

        // 4. Futter ('X') oder Ziel-Logik
        if (x == 9) {
            feld[2][9] = '0';
        } else {
            feld[2][9] = 'X';
        }

        // 5. Gesamtes Spielfeld zeilenweise auf der Konsole ausgeben
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(feld[i][j] + " ");
            }
            System.out.println(); // Zeilenumbruch nach jeder Zeile
        }

        System.out.println("-------------------------"); // Trennlinie für die Animation
    }
}