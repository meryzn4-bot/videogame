package topos.geometria;
import topos.geometria.Direccion;
import topos.geometria.Punto;
import topos.geometria.Estado;
import java.util.Random;
import  topos.geometria.PanelB;		

public class PanelDebil extends PanelB  {
    private int numderribos;
    private static final int MAX_DERRIBOS = 3;
    
    public PanelDebil(Punto posicion) {
    	super(posicion);
    	this.numderribos = 0; // Inicializado en 0 
    	 }

	@Override
	public boolean golpeado() {
		
		
		boolean cambiado = super.golpeado();
        if (cambiado) {
            this.numderribos++; // Incrementa si efectivamente pasó de LEVANTADO a DERRIBADO
        }
        return cambiado;
	}
	@Override
	boolean levantar() {
		if (this.numderribos >= MAX_DERRIBOS) {
            return false;
        }
		return super.levantar();
	}
	public int getnumderribos() {
        return numderribos;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PanelDebil [Derribos=" + numderribos + "] -> " + super.toString();
	}
    
    
    
}
