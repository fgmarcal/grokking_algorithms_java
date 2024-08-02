package Graph;

import java.util.*;

public class Graph <T>{

    private class Node<T>{
        private T data;
        private Node<T> next;
        private List<Node<T>> neighbors;
        private boolean visited;

        public Node(T data) {
            this.data = data;
            this.visited = false;
            neighbors = new ArrayList<>();
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
            neighbors = new ArrayList<>();
        }
        public T getData() {
            return data;
        }
        public void setData(T data) {
            this.data = data;
        }
        public Node<T> getNext() {
            return next;
        }
        public void setNext(Node<T> next) {
            this.next = next;
        }

        public List<Node<T>> getNeighbors() {
            return neighbors;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public void addNeighbor(Node<T> neighbor) {
            neighbors.add(neighbor);
        }

    }
    private Node<T> root;

    public Graph() {
        root = null;
    }
    public Graph(Node<T> root) {
        this.root = root;
    }
    public Node<T> getRoot() {
        return root;
    }
    public void setRoot(Node<T> root) {
        this.root = root;
    }
    private void visit(Node<T> node) {
        System.out.println(node.getData());
    }

    public void addNode(T data) {
        if(root == null) {
            root = new Node<>(data);
            return;
        }
        Node<T> current = root;
        while(current.getNext() != null) {
            if(data.equals(current.getData())) {
                return;
            }
            current = current.getNext();

        }
        if(!data.equals(current.getData())) {
            current.setNext(new Node<>(data));
        }
    }
    public void removeNode(T data) {
        if (root == null) {
            return;
        }
        if (data.equals(root.getData())) {
            root = root.getNext();
            return;
        }

        Node<T> current = root;
        Node<T> previous = null;

        while (current != null) {
            if (data.equals(current.getData())) {
                if (previous != null) {
                    previous.setNext(current.getNext());
                }
                return;
            }
            previous = current;
            current = current.getNext();
        }
    }
    public boolean containsNode(T data) {
        Node<T> current = root;
        while (current != null) {
            if (data.equals(current.getData())) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void breadthFirstSearch() {
        Node<T> current = root;
        while (current != null) {
            if (!current.isVisited()) {
                breadthFirstSearch(current);
            }
            current = current.getNext();
        }
        resetVisited();
    }

    private void breadthFirstSearch(Node<T> startNode) {
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(startNode);
        startNode.setVisited(true);
        while (!queue.isEmpty()) {
            Node<T> node = queue.poll();
            visit(node);
            for (Node<T> neighbor : node.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    public void depthFirstSearch() {
        Node<T> current = root;
        while (current != null) {
            if (!current.isVisited()) {
                depthFirstSearch(current);
            }
            current = current.getNext();
        }
        resetVisited();
    }

    private void depthFirstSearch(Node<T> node) {
        Stack<Node<T>> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node<T> current = stack.pop();
            if (!current.isVisited()) {
                visit(current);
                current.setVisited(true);
                for (Node<T> neighbor : current.getNeighbors()) {
                    if (!neighbor.isVisited()) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public int size() {
        Node<T> current = root;
        int size = 0;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    private void resetVisited() {
        Node<T> current = root;
        while (current != null) {
            resetVisitedHelper(current);
            current = current.getNext();
        }
    }

    private void resetVisitedHelper(Node<T> node) {
        if (node == null || !node.isVisited()) {
            return;
        }
        node.setVisited(false);
        for (Node<T> neighbor : node.getNeighbors()) {
            resetVisitedHelper(neighbor);
        }
    }

}
