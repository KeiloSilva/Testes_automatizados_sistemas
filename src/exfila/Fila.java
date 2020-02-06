package exfila;

import java.util.ArrayList;
import java.util.Collections;

public class Fila {
    
    private ArrayList<Paciente> lista = new ArrayList<Paciente>();
    private ArrayList<Paciente> fila = new ArrayList<Paciente>();
    
    public boolean insert(Paciente paciente){
        return lista.add(paciente);
    }
    public ArrayList<Paciente> lista5(){        
        Collections.sort(lista);
        for(int contador=0;contador<5;contador++){
            fila.add(lista.get(contador));
        }
        return fila;
    }    
}
