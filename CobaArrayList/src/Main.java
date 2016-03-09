
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ryandito
 */
public class Main {

    public static ArrayList<A> a = new ArrayList<>();
    public static A[] b = new A[3];

    public static void main(String[] args) {
        A a1 = new A("satu");
        A a2 = new A("dua");
        A a3 = new A("tiga");
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.remove(1);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getName());
        }
        System.out.println("");
        b[0] = a1;
        b[1] = a2;
        b[2] = a3;
        b[1] = null;
        for (int i = 0; i < b.length; i++) {
            if (b[i] != null) {
                System.out.println(b[i].getName());
            }
        }
    }
}
