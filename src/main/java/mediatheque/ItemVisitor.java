package mediatheque;

public interface ItemVisitor {
    void visit(CD m);

    void visit(Book m);
}
