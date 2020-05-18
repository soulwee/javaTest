package test.exception;

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

public class Human {
    public static void main(String[] args) throws Exception {
        try {
            try {
                throw new Sneeze();
            } catch (Annoyance a) {
                System.out.println("CaughtAnnoyance");
                throw a;
            }
        } catch (Sneeze s) {
            System.out.println("CaughtSneeze");
            return;
        } finally {
            System.out.println("HelloWorld!");
        }

    }
}