public class LinkedList<T> {
    public Node<T> head;

    public LinkedList() {
    }

    public boolean is_empty() {
        return head == null;
    }

    public void set_first(T value) {
        if (is_empty()) head = new Node<>(value, null);
        else {
            Node<T> new_head = new Node<>(value, head);
            head = new_head;
        }
    }

    public void remove_first() {
        if (is_empty()) return;
        head = head.next;
    }

    public void insert_after(Node<T> node, T value) {
        if (node == null) return;
        node.next = new Node<>(value, node.next);
    }

    public void remove_after(Node<T> node) {
        node.next = node.next.next;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
}
