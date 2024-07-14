//6510405822 Sarawut Inpol


class Main {
    public static void main(String[] args) {
        GumballService machine = new GumballService();

        System.out.println("Sarawut Gumball, Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2024");
        System.out.println("Inventory: " + machine.getInventory() + " gumballs");
        System.out.println(machine.getState());
        System.out.println();

        machine.insertQuarter();
        machine.turnCrank();
        System.out.println();

    }
}

//6510405822 Sarawut Inpol
