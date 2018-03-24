package pl.sdacademy.zajęcia3;

import java.util.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        ListaJednokierunkowa<Integer> lista = new ListaJednokierunkowa();

        lista.add(10);
        lista.add(2);
        lista.add(5);
        lista.add(4678);

        System.out.println(lista);
        System.out.println(lista.get(3));

        lista.remove(2);
        System.out.println(lista);


        System.out.println("--------------");

//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("Jan");
//        linkedList.add("Adam");
//        linkedList.add("Aleksander");
//        linkedList.add("Kuba");
//        System.out.println(linkedList);
//        linkedList.remove(1);
//        System.out.println(linkedList);
//        System.out.println(linkedList.get(3));
    }
}
