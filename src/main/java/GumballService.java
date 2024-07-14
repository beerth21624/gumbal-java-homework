//6510405822 Sarawut Inpol

class GumballService {
    private enum MachineState {
        NO_QUARTER, HAS_QUARTER, GUMBALL_SOLD, OUT_OF_GUMBALLS
    }

    private MachineState state;
    private int inventory;

    public GumballService() {
        state = MachineState.NO_QUARTER;
        inventory = 5;
    }

    public int getInventory() {
        return inventory;
    }

    public String getState() {
        switch (state) {
            case NO_QUARTER:
            case HAS_QUARTER:
                return "Machine is waiting for quarter";
            case OUT_OF_GUMBALLS:
                return "Machine is sold out";
            case GUMBALL_SOLD:
                return "Gumball is being sold";
            default:
                return "";
        }
    }

    public void insertQuarter() {
        switch (state) {
            case NO_QUARTER:
                state = MachineState.HAS_QUARTER;
                System.out.println("You inserted a quarter");
                break;
            case HAS_QUARTER:
                System.out.println("You can't insert another quarter");
                break;
            case OUT_OF_GUMBALLS:
                System.out.println("You can't insert a quarter, the machine is sold out");
                break;
            case GUMBALL_SOLD:
                System.out.println("Please wait, we're already giving you a gumball");
                break;
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("Quarter returned");
                state = MachineState.NO_QUARTER;
                break;
            case NO_QUARTER:
                System.out.println("You haven't inserted a quarter");
                break;
            case OUT_OF_GUMBALLS:
            case GUMBALL_SOLD:
                System.out.println("Sorry, you already turned the crank");
                break;
        }
    }

    public void turnCrank() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("You turned...");
                state = MachineState.GUMBALL_SOLD;
                dispenseGumball();
                break;
            case NO_QUARTER:
                System.out.println("You turned but there's no quarter");
                break;
            case OUT_OF_GUMBALLS:
                System.out.println("You turned, but there are no gumballs");
                break;
            case GUMBALL_SOLD:
                System.out.println("Turning twice doesn't get you another gumball!");
                break;
        }
    }

    private void dispenseGumball() {
        if (inventory > 0) {
            System.out.println("A gumball comes rolling out the slot");
            inventory--;
            if (inventory == 0) {
                state = MachineState.OUT_OF_GUMBALLS;
                System.out.println("Oops, out of gumballs!");
            } else {
                state = MachineState.NO_QUARTER;
            }
        } else {
            System.out.println("No gumball dispensed");
            state = MachineState.OUT_OF_GUMBALLS;
        }
    }

}

//6510405822 Sarawut Inpol
