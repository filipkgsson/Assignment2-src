package assignment2;

public interface TreeVisitor<T, R> {
	R visit(Tree<T> t);

	R visit(Leaf<T> l);

	R visit(Node<T> n);
}