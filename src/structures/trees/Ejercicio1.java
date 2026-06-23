package structures.trees;

import structures.nodes.Node;

public class Ejercicio1{
    private Node<Integer> root;
    public void insert(int[] numeros){
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int num : numeros) {
            tree.insert(num);
        }
        printTree(tree.getRoot());
    }


    public void printTree(Node<Integer> root){
        System.out.println("\nImpriendo el arbol: ");
        printRecursivo(root,0);
    }


    private void printRecursivo(Node<Integer> root2, int i) {
        if(root2 != null){
            printRecursivo(root2.getRight(), i + 1);
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            System.out.println(root2.getValue());
            printRecursivo(root2.getLeft(), i + 1);
        }
    }
}