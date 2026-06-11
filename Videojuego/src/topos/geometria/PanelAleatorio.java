package topos.geometria;
import topos.geometria.Direccion;
import topos.geometria.Punto;
import topos.geometria.Estado;
import java.util.Random;
import  topos.geometria.PanelB;

public class PanelAleatorio  extends PanelB {
	private Random random ;
//Este panel ignora el golpe con una probabilidad del 50% usando java.util.Random	
	
public PanelAleatorio(Punto Posicion) {
	super(Posicion );               // En herencia, la llamada a super() siempre debe ser la primera línea del constructor.
	this.random = new Random();
}

@Override
public boolean golpeado() {
	// Tiene un 50% de probabilidad de ignorar el golpe
    if (random.nextBoolean()) { 
        return false; // Ignora el golpe
    }
    // Si no lo ignora, se comporta como un panel básico
	return super.golpeado();
}

@Override
public String toString() {
	
	// TODO Auto-generated method stub
	return"PanelAleatorio -> " 	+  super.toString();
}






















}
