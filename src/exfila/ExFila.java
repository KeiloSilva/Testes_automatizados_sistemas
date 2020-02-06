/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*KMS*/
package exfila;
import java.util.ArrayList;
import java.util.Collections;

public class ExFila {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fila fila = new Fila();
        Paciente pa1 = new Paciente("Vanessa", 31, "Amarelo", 1);
        fila.insert(pa1);
		Paciente pa2 = new Paciente("Ricardo", 33, "Azul", 1);
        fila.insert(pa2);
		Paciente pa3  = new Paciente("Marcos", 21, "vermelho", 3);
        fila.insert(pa3);
		Paciente pa4  = new Paciente("Renata", 37, "Rosa", 3);
        fila.insert(pa4);
		Paciente pa5  = new Paciente("Alexandre", 28, "Cinza", 2);
        fila.insert(pa5);
		Paciente pa6  = new Paciente("Jamil", 26, "Preto", 1);
        fila.insert(pa6);
        Paciente pa7  = new Paciente("Filipe", 47, "Azul", 2);
        fila.insert(pa7);               
		
		System.out.println(" lista : "+fila.lista5());        
    }
    
}
