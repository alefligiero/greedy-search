package greedy_search;

import java.util.ArrayList;

public class Vertex {

	private String label;
	private int distance;
	private boolean visited;
	private ArrayList<Adjacent> adjacents = new ArrayList<Adjacent>();

	public Vertex(String label, int distance) {
		this.label = label;
		this.distance = distance;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public ArrayList<Adjacent> getAdjacents() {
		return adjacents;
	}

	public void setAdjacents(ArrayList<Adjacent> adjacent) {
		this.adjacents = adjacent;
	}

	public void addAdjacent(Adjacent adj) {
		adjacents.add(adj);
	}

	public void listAdjacentVertices() {
		System.out.println("List of Adjascent Vertices:\n");
		for (Adjacent adj : adjacents) {
			System.out.println(adj.getVertex().label);
		}
	}

}
