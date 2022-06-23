package lesson4_5;

public class SingleLinkedList<E> {

    private Node<E> head = null;
    private int size = 0;

        private static class Node<E>{

            private E data;
            private Node<E> next;

            public Node (E item){
                this.data = item;
                this.next = null;
            }

            public Node (E item, Node<E> nodeRef){
                this.data = item;
                this.next = nodeRef;
            }

        }

        // helper methods
    private void addFirst(E item){
            Node<E> temp = new Node<>(item, head);
            head = temp;
            size++;
    }

    private void addAfter(E item, Node<E> node){
            Node<E> temp = new Node<>(item, node.next);
            node.next = temp;
            size++;
    }

    private E removeAfter(Node<E> node){      //removeAfter(A)   A -> B -> C
        Node<E> toRemove = node.next; // B

        if(toRemove != null){
            node.next = toRemove.next;  // A -> C
            size--;
            return toRemove.data;
        }
        else
            return null;
    }

    private E removeFirst(){
            Node<E> toRemove = head;
            if(head != null){
                head = head.next;
                size--;
                return toRemove.data;
            }
            else
                return null;
    }

    private Node<E> getNode(int index){
            Node<E> node = head;
        for (int i = 0; i < index && node != null ; i++) {
            node = node.next;
        }
        return node;
    }

    public void add(int index , E item){
            if(index<0 || index > size)
                throw new ArrayIndexOutOfBoundsException();

            if(index == 0)
                addFirst(item);
            else{
                Node<E> node = getNode(index -1);
                addAfter(item,node);
            }
    }

    public void add(E item){
            add(size, item);
    }

    public int size(){
            return this.size;
    }



    public String toString() {
        Node<E> current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }


    public static void main(String[] args) {

        SingleLinkedList<String> list = new SingleLinkedList<>();



        list.addFirst("A");
        list.addAfter("B", list.getNode(list.size-1));
        list.addAfter("C", list.getNode(list.size-1));
        list.addAfter("D", list.getNode(list.size-1));


        System.out.println(list);
        System.out.println(list.getNode(1).data);
        System.out.println(list.size);


    }
}
