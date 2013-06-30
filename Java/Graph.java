package careercup;
import java.util.ArrayList;
import java.util.List;

public class Graph {
	static class Vertex {
		List<Edge> edges = new ArrayList<Edge>();
	}
	
	static class Edge {
		Vertex dest;
	}
	
	
}
