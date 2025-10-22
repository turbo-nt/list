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
        // ваш код
        int value = 0;
        if (tail != null) {
            value = tail.getValue();
            tail = tail.getPrev();
        }
        return value;
        // возьмите value из последнего узла
        // назначьте предыдущий к последнему узлу последним узлом
    }

    public int getSize() {
        return size;
        // верните размер стека
    }

    public boolean isEmpty() {
        if (size == 0) {return true;}
        return false;
        // верните ответ на вопрос, не пустой ли стек
    }

    public String toString() {

        if (tail == null) {
            return "EMPTY";
        }
        else {
            int i = 0;
            String str = "";
            for (Node node = tail; node != null; node = node.getPrev()) {
                    if(i == 0) {
                        str = str + node.getValue();
                        i++;
                    }else {str = str + " -> " + node.getValue();}
                }
            }
        return str;
        }
}