
public abstract class Compartment {
    public abstract String notice();
}
// File: FirstClass.java
public class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "This is a First Class compartment.";
    }
}

// File: Ladies.java
public class Ladies extends Compartment {
    @Override
    public String notice() {
        return "This is a Ladies compartment.";
    }
}

// File: General.java
public class General extends Compartment {
    @Override
    public String notice() {
        return "This is a General compartment.";
    }
}

// File: Luggage.java
public class Luggage extends Compartment {
    @Override
    public String notice() {
        return "This is a Luggage compartment.";
    }
}
// File: TestCompartment.java
import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int choice = rand.nextInt(4) + 1; // random number 1–4
            switch (choice) {
                case 1: compartments[i] = new FirstClass(); break;
                case 2: compartments[i] = new Ladies(); break;
                case 3: compartments[i] = new General(); break;
                case 4: compartments[i] = new Luggage(); break;
            }
        }

        // Polymorphic behavior
        for (Compartment c : compartments) {
            System.out.println(c.notice());
        }
    }
}
