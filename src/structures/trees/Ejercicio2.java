package structures.trees;

import structures.nodes.Node;

public class Ejercicio2 {
    public Node<Integer> invert(Node<Integer> root){
     
        invertRecursively(root);

        printTree(root);

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

    private void printTree(Node<Integer> root) {
        System.out.println("Imprimiendo el arbol: ");
        printTreeRecursive(root, 0);
    }

    private void printTreeRecursive(Node<Integer> current, int nivel) {
        if(current == null){
            return;
        }
        printTreeRecursive(current.getRight(), nivel + 1);

        for(int i = 0; i < nivel; i++){
            System.out.print("\t");
        }
        System.out.println(current.getValue());
        printTreeRecursive(current.getLeft(), nivel + 1);
    }
}