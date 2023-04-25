package greedy_search;

public class OrderedArray {

	private int capacity;
	private Vertex[] vertices;
	
	public OrderedArray(int capacity) {
		this.capacity = capacity;
		this.vertices = new Vertex[capacity];
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Vertex[] getVertices() {
		return vertices;
	}

	public void setVertices(Vertex[] vertices) {
		this.vertices = vertices;
	}
	
	public Vertex getPositionZero() {
		return vertices[0];
	}
	
	public void insertVertex(Vertex v) {
		
		for (int i = 0; i < vertices.length; i++) {
			if (vertices[i] == null) {
				vertices[i] = v;
				break;
			}
		}
		for (int i = 0; i < vertices.length; i++) {
		    for (int j = 0; j < vertices.length; j++) {
		        if (vertices[i] != null && vertices[j] != null) {
			    	if (vertices[i].getDistance() < vertices[j].getDistance()) {
			            Vertex temp = vertices[i];
			            vertices[i] = vertices[j];
			            vertices[j] = temp;
			        }
		        }
		    }
		}
	}
	
	public void listVertices() {
		int i = 0;
		for (Vertex v : vertices) {
			if (v != null) {
				System.out.printf("%d - %s - %d\n", i, v.getLabel(), v.getDistance());
				i++;
			} else {
				break;
			}
		}
	}
	
}
