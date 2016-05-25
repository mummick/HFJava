package DJChat;

/**
 * Created by lab on 25.05.16.
 */
class ScaryException extends Exception {

}
class TestExceptions {
    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
        return;
    }
}
public class p328e1 {
    public static void main(String[] args) {
        String test = "yes";
        try {
            System.out.println("Start try");
            TestExceptions.doRisky(test);
            System.out.println("End try");
        } catch (ScaryException se) {
            System.out.println("Scary exception");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("end of main");
    }
}
