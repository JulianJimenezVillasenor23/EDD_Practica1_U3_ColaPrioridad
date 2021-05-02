/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julia
 */
public class TDAPrioridad {
    //privado solo es visible en esta clase 
    private int prioridad;
    private char dato;
    
    //constructor 
    public TDAPrioridad(int prioridad, char dato){
        //asignamos valores a las variables
        this.dato = dato;
        this.prioridad = prioridad;
    }
 
    //utilizando los get y set de cada variable

    //se regresa o retorna el orden de la prioridad
    public int getPrioridad() {
        return prioridad;
    }
            //le da orden de prioridad
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
            //muestra el dato del objeto 
    public char getDato() {
        return dato;
    }
            //establece el dato guardado en el objeto
    public void setDato(char dato) {
        this.dato = dato;
    }
    
    //copia los valores del objeto de prioridad al actual
    public void setObjeto(TDAPrioridad obj){
        this.prioridad = obj.prioridad;
        this.dato = obj.dato;
    }
    
    //le da formato al momento de mostrar la cola 
    @Override
    public String toString(){
        //le da el formato [ini] = [valor, fin] ejemplo: [0] = [a,1]
        return String.format("%c, %d", dato, prioridad);
    }
     
    
    
}//class
