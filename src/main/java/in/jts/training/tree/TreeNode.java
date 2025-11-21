package in.jts.training.tree;

public class TreeNode {
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public void displayNode(){
        System.out.println(data);
    }
}


