
package structures.trees;

import java.util.Queue;

import structures.nodes.Node;

// Clase que representa un árbol binario de enteros
public class IntTree {
    private Node<Integer> root;
    private int peso;

    /// Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)
    public IntTree() {
        this.root = null;
        this.peso = 0;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> node) {
        root = node;
    }

    public void setRoot(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        root = node;
    }

    public void insert(Integer value) { // 10
        Node<Integer> node = new Node<Integer>(value);
        root = insertRecursivo(root, node);
        peso ++;
    }
    
    public int getPeso(){
        return peso;
    }

    public void insert(Node<Integer> value) { // 10
        root = insertRecursivo(root, value);
    }

    // recursivo para insertar valores ARBOL BINARIO
    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        // validar si es mayoy o nenor y decidir si lo ingerso a la der o izq
        if (actual.getValue() > nodeInsertar.getValue()) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    public void preOrder() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        System.out.print(actual + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void posOrder() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual + " ");

    }


    // inorder

    public void inOrder(){
        inOrderRecursivo(root);
    }

    public void inOrderRecursivo(Node<Integer> actual){
        if (actual == null) {
            return;
        }
        
        inOrderRecursivo(actual.getLeft());  
        System.out.print(actual + " ");
        inOrderRecursivo(actual.getRight());
    }

    // altura 
    public int heigth(){
        return heightRecursivo(root);
    }
    private int heightRecursivo(Node <Integer> actual){
        if(actual == null){
            return 0;
        }
        int leftHeight = heightRecursivo(actual.getLeft());
        int righttHeight = heightRecursivo(actual.getLeft());
        return Math.max(leftHeight, righttHeight) + 1;
    }
    
    // niveles
    public int heightBFS(){
        if(root == null){
            return 0;
        }
        Queue<Node<Integer>> queue = new java.util.LinkedList<>();
        queue.add(root);

        int altura = 0;

        while (!queue.isEmpty()){
            int nodosEnNivel = queue.size();
            
            altura++;
            for (int i = 0; i < nodosEnNivel; i++) {
                Node<Integer> actual = queue.poll();
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
    //peso
    public int peso(){
        return pesoRecursivo();
    }
    public int pesoRecursivo() {
        if (root == null) {
            return 0;
        }

        // 1. Creamos la cola igual que en los métodos anteriores
        java.util.Queue<Node<Integer>> cola = new java.util.LinkedList<>();
        cola.add(root);

        int contadorNodos = 0;

        while (!cola.isEmpty()) {
            // Sacamos el nodo actual
            Node<Integer> actual = cola.poll();
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
