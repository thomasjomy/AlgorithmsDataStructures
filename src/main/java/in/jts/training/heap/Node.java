package in.jts.training.heap;

public class Node {
    public int data;

    public Node(int key){
        this.data = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
