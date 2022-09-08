
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author laboratorio
 */
public class Ordena extends Lista {

    Map<Character, Integer> map = new HashMap<>();

    public void iniciarMap() {
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);
    }

    public boolean letrasiguais(char x, char y) {
        if (x == y) {
            return true;
        }
        return false;
    }

    public void ordenar(ArrayList<Aluno> l) {
        iniciarMap();
        boolean troca;
        int distancia = l.size();
        Aluno tmp;
        int j = 0;
        do {
            troca = false;
            distancia = (int) ((float) distancia / 1.3);
            if (distancia < 1) {
                distancia = 1;
            }
            for (int i = 0; i < l.size() - distancia; i++) {
                
                if (l.get(i).getCurso() != l.get(i + 1).getCurso()) {

                    /*if (map.get(l.get(i).getCurso().toLowerCase().charAt(j))
                            == map.get(l.get(i + 1).getCurso()
                                    .toLowerCase().charAt(j))) {

                        while (letrasiguais(l.get(i).getCurso().toLowerCase()
                                .charAt(j), l.get(i + 1).getCurso()
                                .toLowerCase().charAt(j)) == true) {

                            j++;

                        }

                    }*/
                    if (map.get(l.get(i).getCurso().toLowerCase().charAt(j))
                            > map.get(l.get(i + 1).getCurso().toLowerCase().charAt(j))) {
                        troca = true;
                        tmp = l.get(i);
                        l.set(i, l.get(i + 1));
                        l.set(i + 1, tmp);

                    }
                }

            }

        } while (distancia > 1 || troca);
        mostrarlista(l);
    }

}
