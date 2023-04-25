package greedy_search;

public class Program {

	public static void main(String[] args) {

		Graph map = new Graph();

		Greedy greedy = new Greedy(map.bucharest);
		greedy.recursiveSearch(map.arad);

	}

}
