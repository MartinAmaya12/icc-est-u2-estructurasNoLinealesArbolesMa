package structures.trees;

import java.util.Queue;
import structures.nodes.Node;


public class BinaryTree <T extends Comparable<T>> {

    private Node<T> root;
    private int peso;


    public BinaryTree() {
        this.root = null;
        this.peso = 0;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> node) {
        root = node;
    }

    public void setRoot(T value) {
        Node<T> node = new Node<T>(value);
        root = node;
    }

    public void insert(T value) { 
        Node<T> node = new Node<T>(value);
        root = insertRecursivo(root, node);
        peso++; 
    }
    
    public void insert(Node<T> value) { 
        root = insertRecursivo(root, value);
        peso++; 
    }

    public int getPeso() {
        return peso;
    }

    
    private Node<T> insertRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

       if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    public void preOrder() {
        preOrderRecursivo(root);
        System.out.println();
    }

    private void preOrderRecursivo(Node<T> actual) {
        if (actual == null)
            return;
        System.out.print(actual + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void posOrder() {
        posOrderRecursivo(root);
        System.out.println();
    }

    private void posOrderRecursivo(Node<T> actual) {
        if (actual == null)
            return;
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual + " ");
    }

    public void inOrder() {
        inOrderRecursivo(root);
        System.out.println();
    }

    public void inOrderRecursivo(Node<T> actual) {
        if (actual == null) {
            return;
        }
        inOrderRecursivo(actual.getLeft());  
        System.out.print(actual + " ");
        inOrderRecursivo(actual.getRight());
    }

    // Altura
    public int heigth() {
        return heightRecursivo(root);
    }

    private int heightRecursivo(Node<T> actual) {
        if (actual == null) {
            return 0;
        }
        int leftHeight = heightRecursivo(actual.getLeft());
        int rightHeight = heightRecursivo(actual.getRight());
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    // Altura por niveles
    public int heightBFS() {
        if (root == null) {
            return 0;
        }
        Queue<Node<T>> queue = new java.util.LinkedList<>();
        queue.add(root);

        int altura = 0;

        while (!queue.isEmpty()) {
            int nodosEnNivel = queue.size();
            altura++;
            
            for (int i = 0; i < nodosEnNivel; i++) {
                Node<T> actual = queue.poll();
                if (actual.getLeft() != null) {
                    queue.add(actual.getLeft());
                }
                if (actual.getRight() != null) {
                    queue.add(actual.getRight());
                }
            }
        }
        return altura;
    }

    // Peso
    public int peso() {
        return pesoRecursivo();
    }
    public int pesoRecursivo() {
        if (root == null) {
            return 0;
        }

        Queue<Node<T>> cola = new java.util.LinkedList<>();
        cola.add(root);

        int contadorNodos = 0;

        while (!cola.isEmpty()) {
            Node<T> actual = cola.poll();
            contadorNodos++;

            if (actual.getLeft() != null) {
                cola.add(actual.getLeft());
            }
            if (actual.getRight() != null) {
                cola.add(actual.getRight());
            }
        }
        return contadorNodos;
    }
}

