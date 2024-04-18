import java.util.Scanner;

public class PasswortKnacker {

    static String password = "";
    static String crackedPassword = "";

    // Main Methode: Von hier werden alle anderen Methoden aufrufen
    public static void main(String[] args) {
        eingabe();
        algorithmus();
        ausgabe();
    }

    // Eingabe Methode: Scanner liest das eingegebene Passwort und speichert es in
    // die Variable 'password'
    public static void eingabe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib dein Passwort ein (KEIN LEERZEICHEN): ");
        password = scanner.nextLine();
        scanner.close();
    }

    // Algorithmus Methode: Geschachtelte for-Schleife die jeden Buchstaben im
    // Passwort mit dem ASCII-Wert A(65) bis Z(90) ODER !(33) bis ~(126) abgleicht
    // und bei Übereinstimmung den Buchstaben in die Variable 'crackedPassword'
    // speichert und zum nächsten Buchstaben weitergeht
    public static void algorithmus() {
        for (int i = 0; i < password.length(); i++) {
            // for (char c = 65; c <= 90; c++) {
            for (char c = 33; c <= 126; c++) {
                System.out.println(c);
                if (c == password.charAt(i)) {
                    crackedPassword += c;
                    System.out.println();
                    break;
                }
            }
        }

    }

    public static void ausgabe() {
        System.out.println("Passwort geknackt!: " + crackedPassword);
    }
}