enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {
    Macbook(2000), XPS(1500), Surface, ThinkPad(1200);
    private int price;
    private Laptop() {
        price = 500;

    }
    private Laptop(int price) {
        this.price = price;
        System.out.println("In laptop: " + this.name());
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumTest {
    public static void main(String[] args) {
        Status[] ss = Status.values();
        for (Status status : ss) {
            System.out.println(status + " : " + status.ordinal());
        }

        Status s = Status.Pending;
        System.out.println(s.getClass().getSuperclass());

        if (s == Status.Running) {
            System.out.println("All good!");
        }
        else if (s == Status.Pending) {
            System.out.println("Please wait!");
        }
        else if (s == Status.Failed) {
            System.out.println("Try again!");
        }
        else {
            System.out.println("done!");
        }

        switch (s) {
            case Running:
                System.out.println("All good!");
                break;
            case Pending:
                System.out.println("Please wait!");
                break;
            case Failed:
                System.out.println("Try again!");
                break;
            default:
                System.out.println("Done!");
                break;
        }

        for(Laptop lap: Laptop.values()) {
            System.out.println(lap + ": " + lap.getPrice());
        }
    }
}
