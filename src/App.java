import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;

public class App {
    public static void main(String[] args) throws Exception {
        //runIntTree();
        //runIntComparativaPesos();
        System.err.println("\nEjercicio 1:");
        int[] numeros = {5,3,7,2,4,6,8};
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.insert(numeros);

        System.out.println("Ejercicio 2:");
        Ejercicio2<Integer> ejercicio2 = new Ejercicio2<Integer>();
        BinaryTree<Integer> tree = new BinaryTree<>();
        BinaryTree<Integer> tree2 = new BinaryTree<>();
        for(int numEjm : numeros){
            tree.insert(numEjm);
            tree2.insert(numEjm);
        }
        ejercicio2.invert(tree2.getRoot());

        Ejercicio3<Integer> levels = new Ejercicio3<>();
        System.out.println("Ejercicio 3:");
        System.out.println("Niveles del arbol:");
        System.out.println(levels.listLevels(tree.getRoot()));

        System.out.println("Ejercicio 4:");
        Ejercicio4<Integer> ejercicio4 = new Ejercicio4<Integer>();
        System.out.println("Profundidad máxima del arbol " + ejercicio4.maxDepth(tree.getRoot()));


    }

    
}
    /*private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        // Node<Integer> node3 = new Node<>(30);
        // Node<Integer> node4 = new Node<>(40);
        // Node<Integer> node5 = new Node<>(50);

        // Node<Integer> root = arbolNumeros.getRoot();

        // root.setLeft(node2);
        // root.setRight(node3);

        // node2.setLeft(node4);
        // node4.setRight(node5);

        //// ERROR GENERA CLICLOS
        // node5.setLeft(root);

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8); /// INORDER 3, 5, 8, 10, 15, 20
        arbolNumeros.insert(20); /// POSTORDER 3 8 5 15 20 10
        arbolNumeros.insert(15); // ANCHURA O NIVELES: 10 5 20 3 8 15

        System.out.println("pre Order");
        arbolNumeros.preOrder();

        System.out.println("\nPos Order");
        arbolNumeros.posOrder();

        System.out.println("\nIn roder");
        arbolNumeros.inOrder();
        
        System.out.println("\nAltura:");
        System.out.println(arbolNumeros.heightBFS());
        
        System.out.println("\nPeso:");
        System.out.println(arbolNumeros.peso());

    }

    private static void runIntComparativaPesos() {
        IntTree tree = new IntTree();
        Random random = new Random();

        final int TOTAL_NODOS = 50_000;
        final int MIN = 1;
        final int MAX = 50_000;

        // Insertar 50 000 números aleatorios entre 1 y 50 000
        for (int i = 0; i < TOTAL_NODOS; i++) {
            int value = random.nextInt(MAX - MIN + 1) + MIN;
            tree.insert(value);
        }

        // Medir peso con variable acumulada
        long inicioPesoVariable = System.nanoTime();

        int pesoVariable = tree.getPeso();

        long finPesoVariable = System.nanoTime();

        double tiempoPesoVariableMs = (finPesoVariable - inicioPesoVariable) / 1_000_000.0;

        // Medir peso recursivo
        long inicioPesoRecursivo = System.nanoTime();

        int pesoRecursivo = tree.peso();

        long finPesoRecursivo = System.nanoTime();

        double tiempoPesoRecursivoMs = (finPesoRecursivo - inicioPesoRecursivo) / 1_000_000.0;

        // Resultados
        System.out.println("Cantidad de nodos insertados: " + TOTAL_NODOS);
        System.out.println("Peso usando variable: " + pesoVariable);
        System.out.println("Peso usando recursion: " + pesoRecursivo);

        System.out.println();

        System.out.println("Tiempo getPeso(): "
                + tiempoPesoVariableMs + " ms");

        System.out.println("Tiempo pesoRecursivo(): "
                + tiempoPesoRecursivoMs + " ms");
    }

    private static void runPersonTree(<T> Person){
        BinaryTree<Person> personTree = new BinaryTree<>();

    }
}*/

