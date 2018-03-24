package pl.sdacademy.zajęcia3;

public class ListaJednokierunkowa<T> {
    private Node<T> first;
    //TODO dodać zmienna size
    //zaimplementowac metode size() ktora zwraca wielkosci listy
    //zaimplementowac metody removeFirst() i removeLast()
    //zaimplementować metode get(index) która zwróci element o danym indexie
    //z listy
    public void add(T e) {
        if(first == null) {
            first = new Node<>(e);
        } else {
            first.addNext(new Node<>(e));
        }
    }

    @Override
    public String toString() {
        return "[" + first + "]";
    }

    public void remove(int index) {
        //TODO sprawdzenie zakresu (czy index jest prawidlowa wartoscia
        //i nie przekracza wielkosci listy
        //TODO spróbować uprościć to co poniżej
        if(index == 0) {
            Node<T> node = first.getNext();
            first.removeRef();
            first = node;
        }else {
            Node<T> current = first;
            Node<T> prev = null;
            for (int i = 0; i<index; i++) {
                prev = current;
                current = current.getNext();
            }
            Node<T> next = current.getNext();
            current.removeRef();
            prev.setNext(next);
        }
    }

    public T get (int index) {
        Node<T> n = first;
            for (int i = 0; i < index; i++) {
                n = n.getNext();
            }
        return n.getText();
    }
}
