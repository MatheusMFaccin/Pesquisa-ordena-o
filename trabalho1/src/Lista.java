
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author facci
 */
public class Lista {
    
    public void mostrarlista(ArrayList<Aluno> l){
        
        for(int i = 0;  i < l.size(); i++){
            System.out.println("aluno: "+l.get(i).getNome()+" "+"curso: "
                    +l.get(i).getCurso()+"\n");
            
        }
        
        
    }
}
