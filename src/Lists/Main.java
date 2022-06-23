package Lists;

import java.util.LinkedList;

public class Main {
    public static void main ( String [] args){
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(60));
    }
}
