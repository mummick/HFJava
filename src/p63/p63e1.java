package p63;

/**
 * Created by lab on 12.04.16.
 */
class Books {
    String title;
    String author;
}
public class p63e1 {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        while (x < 3) {
            myBooks[x] = new Books();
            x = x + 1;
        }
        x = 0;

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
