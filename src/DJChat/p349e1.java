package DJChat;

/**
 * Created by lab on 26.05.16.
 */
class MyEx extends Exception { }
class ExTestDrive {
    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.print("r");
        System.out.print("o");
    }
}

public class p349e1 {
    public static void main(String[] args) {
        String test = args[0];
        System.out.print("t");
        try {
            ExTestDrive.doRisky(test);
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
            System.out.print("s");
        }
    }
}
