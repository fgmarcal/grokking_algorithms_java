import Graph.Graph;

public class Main  {

    public static void main(String[] args) {

        Graph<String> graph = new Graph<String>();

        graph.addNode("Felipe");
        graph.addNode("Brenda");
        graph.addNode("Martinez");
        graph.addNode("Martinez");


        var size = graph.size();
        System.out.println(size);

        graph.breadthFirstSearch();

        System.out.println(graph.containsNode("Felipe"));
        System.out.println(graph.isEmpty());
        graph.depthFirstSearch();
    }
}
