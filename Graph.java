import java.util.*;
public class Graph {
    private Map<Integer, List<Integer> > adjacencyList;
    public Graph() {
      adjacencyList = new HashMap<>();
    }
    public void addVertex(int vertex)
    {
        adjacencyList.put(vertex, new ArrayList<>());
    }
    public void addEdge(int source, int destination)
    {
        adjacencyList.get(source).add(destination);
    }
    public void removeVertex(int vertex)
    {
        adjacencyList.remove(vertex);
        for (List<Integer> neighbors :
             adjacencyList.values()) {
            neighbors.remove(Integer.valueOf(vertex));
        }
    }
    public void removeEdge(int source, int destination)
    {
        adjacencyList.get(source).remove(
            Integer.valueOf(destination));
    }
    public List<Integer> getNeighbors(int vertex)
    {
        return adjacencyList.get(vertex);
    }
    public void printGraph()
    {
        for (Map.Entry<Integer, List<Integer> > entry :
             adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Integer neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
public class MainAdjacency {
    public static void main(String[] args)
    {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        System.out.println("Graph:");
        graph.printGraph();
        graph.removeEdge(0, 1);
        System.out.println("After removing edge (0, 1):");
        graph.printGraph();
        graph.removeVertex(2);
        System.out.println("After removing vertex 2:");
        graph.printGraph();
    }
}