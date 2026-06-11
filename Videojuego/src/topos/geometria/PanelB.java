package topos.geometria;

import topos.geometria.Direccion;
import topos.geometria.Punto;
import topos.geometria.Estado;

public class PanelB {
	
	// Atributos protegidos para que las clases hijas puedan acceder a ellos
	protected  Punto Posicion ;
	protected Estado estado ;
	
	// Se construye solo con la posición. Inicialmente está LEVANTADO.
	public PanelB(Punto Posicion) {
		this.Posicion = Posicion ;
		this.estado=Estado.LEVANTADO;
		}
	
	// Operación golpear: si está levantado, pasa a derribado y retorna true
	public boolean golpeado() {
		if(this.estado==Estado.LEVANTADO) {
			this.estado = Estado.DERRIBADO;
			return true;	
		}
	return false ;	
	}
	// Operación levantar: si está derribado, pasa a levantado y retorna true
    boolean levantar(){
    	if(this.estado==Estado.DERRIBADO) {
			this.estado = Estado.LEVANTADO;
			return true;	
		}
	return false ;	
    
}
    public void Desplazar(Direccion direccion ) {
   this.Posicion.Desplazar(direccion);
}
    
    public void situar(Punto nuevaPosicion ){
    	this.Posicion=nuevaPosicion;
    	
    	
    }
    
 // Getters y Setters necesarios
    public Punto getPosicion() {
        return Posicion;
    }

    public Estado getEstado() {
        return estado;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return"PanelB [Posición=" + Posicion + ", Estado=" + estado + "]";
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
