package mediatheque;

public class CDPrinter implements ItemVisitor {

    public void visit(CD m) {
        System.out.println(m.toString());
    }

    public void visit(Book m) {
    }
}
