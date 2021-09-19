/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.util.Scanner;

/**
 *
 * @author nemishappy
 */
public class BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyBoundProperty observer = new MyBoundProperty();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        observer.addPropertyChangeListener(listener1);
        observer.addPropertyChangeListener(listener2);
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Score ");
        String type = inp.nextLine();
        while(!type.isEmpty()){
            observer.setReport(type);
            System.out.print("Enter Score ");
            type = inp.nextLine();
        }
    }
    
}
