import java.util.ArrayList;
import java.util.HashMap;

public class GraphImp {
	
	public class Vertex {
		//neighbours
		HashMap<String, Integer> ngbrs = new HashMap<>();
	}
	
	HashMap<String, Vertex> vertices = new HashMap<>();
	
	
	public void addVertex(String vname) {
		Vertex vtx = new Vertex();
		vertices.put(vname, vtx);
	}
	
	public void addEdge(String vname1, String vname2, int cost) {
		Vertex vtx1 = vertices.get(vname1);
		Vertex vtx2 = vertices.get(vname2);
		
		if(vtx1 == null || vtx2 == null || vtx1.ngbrs.containsKey(vname2)) return;
		
		vtx1.ngbrs.put(vname2, cost);
		vtx2.ngbrs.put(vname1, cost);
	}
	
	public int numOfVertices() {
		return vertices.size();
	}
	
	
	public void display() {
		System.out.println("========================================");
		ArrayList<String> keys = new ArrayList<>(vertices.keySet());
		
		for(String key : keys) {
			Vertex vtx = vertices.get(key);
			
			System.out.println(key+" -> "+ vtx.ngbrs);
		}
		
		System.out.println("========================================");

	}
	public static void main(String[] args) {
		GraphImp graph = new GraphImp();
		
		
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("D");
		graph.addVertex("S");
		graph.addVertex("C");
		graph.addVertex("M");
		graph.addVertex("T");
		graph.addVertex("Y");
		graph.addVertex("L");
		
		graph.addEdge("A", "B", 0);
		graph.addEdge("A", "D", 10);
		graph.addEdge("A", "L", 20);
		graph.addEdge("B", "D", 01);
		graph.addEdge("D", "T", 03);
		graph.addEdge("D", "M", 05);
		graph.addEdge("S", "M", 12);
		graph.addEdge("C", "D", 07);
		graph.addEdge("Y", "L", 11);
		graph.addEdge("T", "A", 0);
		
		graph.display();
		
		
		
		
		
		
		
		
		
	}

}
