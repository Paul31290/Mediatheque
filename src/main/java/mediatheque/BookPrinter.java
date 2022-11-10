package mediatheque;

public class BookPrinter implements ItemVisitor {

    public void visit(CD m) {
    }

    public void visit(Book m) {
        System.out.println(m.toString());
    }
}
