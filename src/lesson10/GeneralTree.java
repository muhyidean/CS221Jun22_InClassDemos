package lesson10;

import java.util.ArrayList;
import java.util.List;

public class GeneralTree<E> {

    private Node<E> root;
    private int nodeCount;

    private static class Node<E>{
        private E data;
        private Node<E> parent;
        private List<Node> children;

        public Node (E item){
            data = item;
            children = new ArrayList<>();
            parent = null;
        }
    }


    public void addRoot(Node<E> node){
        root = node;
        nodeCount++;
    }

    public void addChild(Node<E> parent, Node<E> child){
        parent.children.add(child);
        child.parent = parent;
        nodeCount++;
    }

    public E getParent(Node<E> node){
        return node.parent.data;
    }

    public boolean areSiblings(Node<E> node1, Node<E> node2){
        return (node1.parent.equals(node2.parent));
    }

    public int size(){
        return nodeCount;
    }

    public void printChildren(Node<E> node) {
        for (int i = 0; i < node.children.size(); i++) {
            System.out.println(node.children.get(i).data);
        }
    }

    public void printPreOrder(Node<E> node){
        System.out.println(node.data);

        for (int i = 0; i < node.children.size(); i++) { // 0<0
            printPreOrder( node.children.get(i) );
        }
    }


    public static void main(String[] args) {

        Node<String> a = new Node<>("A");
        Node<String> b = new Node<>("B");
        Node<String> c = new Node<>("C");
        Node<String> d = new Node<>("D");
        Node<String> e = new Node<>("E");
        Node<String> f = new Node<>("F");
        Node<String> g = new Node<>("G");
        Node<String> h = new Node<>("H");

        GeneralTree<String> tree = new GeneralTree<>();

        tree.addRoot(a);
        tree.addChild(a,b);
        tree.addChild(a,c);
        tree.addChild(b,f);
        tree.addChild(b,g);
        tree.addChild(c,d);
        tree.addChild(c,e);
        tree.addChild(d,h);

        System.out.print("Size of the tree:  ");
        System.out.println(tree.size());

        System.out.print("Parent of Node 'd':  ");
        System.out.println(tree.getParent(d));

        System.out.print("Parent of Node 'b':  ");
        System.out.println(tree.getParent(b));

        System.out.print("Are 'b' and 'c' siblings:  ");
        System.out.println(tree.areSiblings(b,c));

        System.out.print("Are 'b' and 'd' siblings:  ");
        System.out.println(tree.areSiblings(b,d));


        System.out.println("Children of 'a':  ");
        tree.printChildren(a);

        System.out.println("Children of 'b':  ");
        tree.printChildren(b);

        System.out.println("Children of 'c':  ");
        tree.printChildren(c);


        System.out.println("===");
        tree.printPreOrder(a);

    }

}
