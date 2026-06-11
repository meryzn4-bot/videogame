package topos.geometria;
import topos.geometria.Direccion;
import topos.geometria.Punto;
import topos.geometria.Estado;
import java.util.Random;
import  topos.geometria.PanelB;	

public class panelresistente extends PanelB {
	private int dureza;
	private int cuenta ;
	
	
	// Constructor con dureza específica
	public panelresistente(Punto posicion, int dureza) {
		super(posicion);
		this.dureza=dureza;
		this.cuenta = 0;
		
	}
	
	
	// Constructor con dureza por defecto (2)
    public panelresistente(Punto posicion) {
        this(posicion, 2);
    }
    
    
    
    @Override
    public boolean levantar() {
        boolean levantado = super.levantar();
        if (levantado) {
            this.cuenta= 0; // Se reinicia el contador al levantarse de nuevo
        }
        return levantado;
    }

    public int getDureza() {
        return dureza;
    }

    public int getContadorGolpes() {
        return cuenta ;
    }

    @Override
    public String toString() {
        return "PanelResistente [Dureza=" + dureza + ", Golpes Recibidos=" + cuenta + "] -> " + super.toString();
    }

}
