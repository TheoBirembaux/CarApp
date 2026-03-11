public class Voiture {
    public static final int ACCELERATION_VALUE = 10;
    public static final int MAX_SPEED = 120;
    private final String model;
    private final String color;
    private int speed;

    public Voiture(final String carModel, final String carColor) {
        this.model = carModel;
        this.color = carColor;
        this.speed = 0;
    }

    public int getVitesse() {
        return this.speed;
    }

    public void accelerer() {
        if (this.speed + ACCELERATION_VALUE <= MAX_SPEED) {
            this.speed += ACCELERATION_VALUE;
            // afficher détails
            printDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (speed - ACCELERATION_VALUE >= 0) {
            speed -= ACCELERATION_VALUE;
            // afficher détails
            printDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    private void printDetails() {
        System.out.println("Vitesse : " + this.speed);
        System.out.println("Couleur : " + this.color);
        System.out.println("Vitesse actuelle : " + this.speed);
    }
}

