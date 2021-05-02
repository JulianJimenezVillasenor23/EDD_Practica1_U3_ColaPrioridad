/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julia
 */
public class TDAColaPrioridad {
    //protected poder visualizarlo en las subclases
    //creamos un vector tipo TDAPrioridad 
    protected int ini, fin;
    protected TDAPrioridad[] datos;

    //construcor para determinar el tamaño del vector 
    public TDAColaPrioridad(int tam){
        datos = new TDAPrioridad[tam];
        //inicializamos ini y fin en -1 
        //determinamos cola vacia
        ini = fin = -1;
    }
    
    //metodo insertar dato = caracter 
    //prioridad = prioridad que el dato tiene respecto a los demas 
    public boolean insertar(char dato, int prioridad){
        //verificar si la cola esta llena (principio de jaimito el cartero xd)
        if(ColaLlena()){
            return false;
        }
        fin++;
        datos[fin] = new TDAPrioridad(prioridad, dato);
        ini = ini == -1? 0 : ini;
        priorizar();
        return true;
    }
    //eliminamos el dato de la cola con el inicio del vector
    public boolean eliminar(){
        if(ColaVacia()){
            return false;
        }
        if(ini == fin){
            ini = fin = -1;
        }else{
            ini++;
        }
        return true;
    }
    //Coloca el dato en su posicion segun su nivel de prioridad 
    private void priorizar(){
        if(ini == fin){
            return;
        }
        int a = fin, b = fin - 1;
        TDAPrioridad aux = new TDAPrioridad(0, '0');
        while(a != ini){
            if(datos[a].getPrioridad() > datos[b].getPrioridad()){
                aux.setObjeto(datos[a]);
                datos[a].setObjeto(datos[b]);
                datos[b].setObjeto(aux);
                b--;
                a--;
            }else{
                break;
            }
        }
    }
    //revisa si es posible ingresar un datos mas 
    protected boolean ColaLlena(){
        return fin == datos.length - 1;
    }
    //verifica si existe algun valor en la cola
    protected boolean ColaVacia(){
        return ini== - 1;
    }
    //retorna el valor de control ini
    public int getIni(){
        return ini;
    }
    //retorna el valor de control fin
    public int getFin(){
        return fin;
    }
    //regresa el objeto con la prioridad solicitada por el usuario
    public TDAPrioridad getDato(int pos){
        return datos[pos];
    }
    
    
}//class
