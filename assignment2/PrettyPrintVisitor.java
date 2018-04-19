package assignment2;

public class PrettyPrintVisitor<T> implements TreeVisitor<T, String> {
	
	private String result = "";
	private String leaf = "";
	private int height = 0;

	public String visit(Tree<T> t) {
		return t.accept(this);
	}

	public String visit(Leaf<T> l) {
		for(int i = 0; i < height; i++)
			leaf += " ";
		height --;
		leaf += l.getValue() + "\n";
		return "";
	}

	public String visit(Node<T> n) {
		for(Tree<T> child : n.getChildren()) { 
			height++;
			this.visit(child);
		}
		String temp = "";
		for(int i = 0; i < height; i++)
			temp += " ";
		result = leaf + result;
		result = temp + ".\n" + result;
		height = 0;
		leaf = "";
		return result;
	}

}
