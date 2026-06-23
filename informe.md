# Practica en Clases 2.2

## Datos del Estudiante
- **Nombre:** Martin Amaya
- **Curso:** Grupo 3
- **Fecha:** 22/06/2026

---

# Ejercicio 1

```
public void insert(int[] numeros){
        BinaryTree<Integer> tree = new BinaryTree<>();

        for(int numero : numeros){
            tree.insert(numero);
        }
        printTree(tree.getRoot());
    }
```
El metodo insert recibe un arreglo de numeros enteros, crea un objeto BinaryTree y se usa un bucle for-each para insertar cada numero del arreglo dentro del arbol. despues llama al printTree para que imprima el arbol ya con los numeros insertados.

```
private void printTree(Node<Integer> root) {
        System.out.println("\nImprimiendo el arbol: ");
        printTreeRecursive(root, 0);
    }

```
Este metodo lo que hace es iniciar la impresion del arbol, primero indica que esta imprimiendo el arbol y seguido llama a otro metodo el cual se encarga de mostrar el arbol con la raiz y el nivel como parametros

```
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

```
Y por ultimo, este metodo se encarga de imprimir un arbol binario usando el nivel para que se vea como el formato indicado y lo hace de manera recursiva. Lo que hace es recorrer el subarbol derecho, luego muestra el nodo actual y para que se vea como un arbol se usa tabulacion de aceurdo al nivel y para finalizar recorre el subarbol izquierdo.

### Salida en consola

![alt text](assets/cap5.png)


# Ejercicio 2

```
public Node<Integer> invert(Node<Integer> root){
     
        invertRecursively(root);

        printTree(root);

        return root;
    }

```
Este metodo convierte un arbol binario al reves, es decir lo invierte, lo hace llamando a un metodo recursivo que cambia la rama izquierda y derecha. procede a imprimir el arbol invertido y finaliza devolviendo la raiz de este arbol al reves.

```
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

```
Este metodo invierte el arbol binario ya que cambia a los subarboles izquierdo y derecho de cada nodo. si es null hace un return y acaba, pero si es diferente de null guarda al izquierdo en una variable temporal, luego se asigna al derecho en el izquierdo y al ultimo se pone al temporal en el derecho y asi se realiza el cambio de izquiera a derecha y viceversa.

```
private void printTree(Node<Integer> root) {
        System.out.println("Imprimiendo el arbol: ");
        printTreeRecursive(root, 0);
    }

```
Este metodo como en el anterior ejercicio lo que hace es iniciar la impresion del arbol. Imprime un mensaje dando a entender que esta yendo a mostrar el arbol y seguido llama al metodo que imprime recursivamente, y envia la raiz y el nivel

```
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

```

Este ejercicio acaba con este metodo que hace la impresion del arbol como antes de manera recursiva usando el nivel para que cumpla con el formato que se asigno en clases, recorre el el suarbol derecho, imprime el nodo actual con las respectivas tabulaciones dependiendo el nivel y por ultimo recorre el subarbol izquierdo


### Salida en consola

![alt text](assets/cap6.png)



