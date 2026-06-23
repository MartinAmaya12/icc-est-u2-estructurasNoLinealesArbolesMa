package structures.trees;

import structures.nodes.Node;

public class Ejercicio1{
    
    public void insert(int[] numeros){
        BinaryTree<Integer> tree = new BinaryTree<>();

        for(int numero : numeros){
            tree.insert(numero);
        }
        printTree(tree.getRoot());
    }

    private void printTree(Node<Integer> root) {
        System.out.println("\nImprimiendo el arbol: ");
        printTreeRecursive(root, 0);
    }
    private void printTreeRecursive(Node<Integer> current, int nivel){
        if(current == null){
            return;
        }
        printTreeRecursive(current.getRight(), nivel + 1);
        for( int i = 0; i < nivel; i++){
            System.out.print("\t");
        }
        System.out.println(current.getValue());
        printTreeRecursive(current.getLeft(), nivel + 1);
    }
}