public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
// is slow
        Camry v6 = new Camry();
        v6.slowSpeed();
// is fast
        Charger Srt = new Charger();
        Srt.fast();
    }
}
class Car {
    public void slowSpeed() {
        System.out.println("driving slow...");
    }
}
class fastSpeed {
    public void fast() {
        System.out.println("speeding...");
    }
}
class Charger extends fastSpeed {
}
class Camry extends Car {
}