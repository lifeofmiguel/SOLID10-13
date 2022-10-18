public class InterfaceSegregationPrinciple {

    public static void main(String[] args) {

    }
}

interface Runner {
    void work();
}

interface Driving {
    void sleep();
}

class Person implements Runner, Driving {

    @Override
    public void work() {}

    @Override
    public void sleep() {}
}

class Robot implements Runner {

    @Override
    public void work() {}
}