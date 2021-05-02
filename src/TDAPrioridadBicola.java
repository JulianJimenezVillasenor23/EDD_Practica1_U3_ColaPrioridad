/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julia
 */
public class TDAPrioridadBicola extends TDAColaPrioridad{
    //constructor del TDAPrioridadBicola
    public TDAPrioridadBicola(int tam) {
        super(tam);
    }
    //metodo de insercion de datos de bicola
    public boolean insertarIni(char dato, int prioridad){
        if(ini == 0){
            return false;
        }
        ini--;
        datos[ini] = new TDAPrioridad(prioridad, dato);
        priorizar();
        return true;
    }
    //metodo de eliminar de bicola
    public boolean eliminarFin(){
        //Cola vacia de TDAColaPrioridad
        if(super.ColaVacia()){
            return false;
        }
        if(fin == ini){
            ini = fin = - 1;           
        }else{
            fin--;
        }
        return true;
    }
    
    //prioridad de los datos, es privado para que 
    //no sobreescriba al metodo de la clase padre
    private void priorizar(){
        if(ini == fin){
            return;
        }
        int a = ini, b= ini +1;
        TDAPrioridad aux = new TDAPrioridad(0 , 'o');
        while(a != fin){
            if(datos[a].getPrioridad() <= datos[b].getPrioridad()){
                aux.setObjeto(datos[b]);
                datos[b].setObjeto(datos[a]);
                datos[a].setObjeto(aux);
                a = b++;
            }else{
                break;
            }
        }
    }
    
    
 
}//class