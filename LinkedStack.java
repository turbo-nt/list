public class LinkedStack {
    private Node tail; // ссылка на последний добавленный узел (обёртку)
    private int size; // размер стека, т.е. количество элементов в нём

    public void push(int value) {
        Node node = new Node(value); // создаём новый узел
        if (tail != null) { // если в стеке уже есть элементы
            node.setPrev(tail); // связываем новый узел с последним
        }
        tail = node; // назначаем новый узел последним узлом
        size++; // увеличиваем счётчик элементов
    }

    public int pop() {
        int value = 0;
        if (tail != null) {
            value = tail.getValue();
            tail = tail.getPrev();
        }
        return value;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        if (tail == null) {
            return "EMPTY";
        } else {
            for (Node node = tail; node != null; node = node.getPrev()) {
                if (i == 0) {
                    sb.append(node.getValue());
                    i++;
                } else {
                    sb.append(" -> " + node.getValue());
                }
            }
        }
        return sb.toString();
    }
}