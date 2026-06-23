package structures.trees;

import structures.nodes.Node;

public class Ejercicio2 {
    public Node<Integer> invert(Node<Integer> root){
        invertRecursively(root);

        return root;
    }

    private void invertRecursively(Node<Integer> root) {
        if(root == null){
            return;
        }

        Node<Integer> temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        invertRecursively(root.getLeft());
        invertRecursively(root.getRight());
    }


}
