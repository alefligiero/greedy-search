package greedy_search;

public class Greedy {

	private Vertex vertex;

	public Greedy(Vertex vertex) {
		this.vertex = vertex;
	}

	public Vertex getVertex() {
		return vertex;
	}

	public void recursiveSearch(Vertex v) {
		System.out.printf("Atual: %s\n\n", v.getLabel());
		v.setVisited(true);

		if (v.getDistance() == 0) {
			System.out.println("|-----Chegou-ao-destino-final-----|");
		} else {
			OrderedArray orderedArray = new OrderedArray(v.getAdjacents().size());
			for (int i = 0; i < orderedArray.getCapacity(); i++) {
				if (!v.getAdjacents().get(i).getVertex().isVisited()) {
					v.getAdjacents().get(i).getVertex().setVisited(true);
					orderedArray.insertVertex(v.getAdjacents().get(i).getVertex());
				}
			}
			orderedArray.listVertices();

			System.out.println("--------");

			if (orderedArray.getPositionZero() != null) {
				this.recursiveSearch(orderedArray.getPositionZero());
			}
		}
	}
}
