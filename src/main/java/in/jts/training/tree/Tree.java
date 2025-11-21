package in.jts.training.tree;

public class Tree {
    private TreeNode root;

    public TreeNode find(int key) {
        TreeNode currentNode = root;

        while (currentNode.data != key) {
            if (key < currentNode.data) {
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
            }

            if (currentNode == null) {
                return null;
            }
        }

        return currentNode;
    }

    public void insert(int data) {

        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode currentNode = root;
            TreeNode parent;
            while (true) {
                parent = currentNode;
                if (data < currentNode.data) {
                    currentNode = currentNode.leftChild;
                    if (currentNode == null) {
                        parent.leftChild = currentNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    public void delete(int data) {

    }

    public void traverse(TraversalType traversalType) {
        switch (traversalType) {
            case InOrder -> inOrder(root);
            case PreOrder -> preOrder(root);
            case PostOrder -> postOrder(root);
        }
    }

    private void preOrder(TreeNode root) {
        if (root != null) {
            root.displayNode();
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.leftChild);
            root.displayNode();
            inOrder(root.rightChild);
        }
    }

    private void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            root.displayNode();
        }
    }

}
