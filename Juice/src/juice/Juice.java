/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juice;

import java.util.Comparator;

class Comp implements Comparator<String> {

    @Override
    public int compare(String j1, String j2) {
        return j1.compareTo(j2);
    }
}

public class Juice {

    public static void main(String[] args) {

        Juicer j = new Juicer();
        j.combinationsOfTheComponents("juice.in");
        j.kindsOfJuices(j.arr);
        j.filing(j.set, "juice1.out");
    }
    Thread th = new Thread((Runnable) new Juice()){
        public void run(){
            System.out.println("сортируем в отдельном потоке");
        }
    };
}
