enum Status {
    Running, Failed, Pending, Success;
}

public class DemoEnum {
    public static void main(String[] args) {
        // Status s = Status.Success;
        // Status[] s1 = Status.values();
        // for (Status n : s1) {
        //     System.out.println(n + " : " + n.ordinal());
        // }

        Status s = Status.Pending;

        if (s == Status.Running) {
            System.out.println("All Good");
        }
        else if (s == Status.Failed){
            System.out.println("Try Again");
        }
        else if (s == Status.Pending){
            System.out.println("Please wait");
        }
        else
        System.out.println("Done");
    }
}
