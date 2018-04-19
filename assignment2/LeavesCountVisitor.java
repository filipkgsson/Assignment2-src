package assignment2;

public class LeavesCountVisitor<T> implements TreeVisitor<T, Integer> {

	public Integer visit(Tree<T> t) {
		return t.accept(this);
	}

	public Integer visit(Leaf<T> l) {
		return 1;
	}

	public Integer visit(Node<T> n) {
		int r = 0;
		for (Tree<T> child : n.getChildren()) {
			r = r + visit(child);
		}
		return r;
	}
}