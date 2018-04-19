package assignment2;

public class TreeHeightVisitor<T> implements TreeVisitor<T, Integer> {

	public Integer visit(Tree<T> t) {
		return t.accept(this);
	}

	public Integer visit(Leaf<T> l) {
		return 0;
	}

	public Integer visit(Node<T> n) {
		Integer result = 0;
		Integer max = result;
		for (Tree<T> child : n.getChildren()) {
			result = visit(child);
			if (result > max)
				max = result;
		}
		return max + 1;
	}

}