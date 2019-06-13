/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistlat;

/**
 *
 * @author Arif
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.addFirst(8);
        link.addFirst(7);
        link.addFirst(9);
        link.addFirst(3);
        link.addFirst(5);
        link.tampilkan();
        link.addLast(1);
        link.tampilkan();
        link.deleteFirst();
        link.tampilkan();
    }
    
}
