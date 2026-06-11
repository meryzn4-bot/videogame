package topos.geometria;
import topos.geometria.ConfigPartida;
import topos.geometria.Punto;
import topos.geometria.PanelB;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Partida {
	private ConfigPartida configuracion = null;
	private Punto objetivo;
	private int disparosRest;
	private int puntos;
	private final List<PanelB> paneles ;
	private LocalDateTime inicio;
	
	
	private boolean finalizada;
	private boolean enjuego;
	
	
	public Partida() {
		this.configuracion = configuracion ;
		this.objetivo= new Punto(0,0);
		this.puntos = 0;
		this.disparosRest= configuracion.disparos() ;
		this.paneles = new ArrayList<>();
		this.inicio= null;
		}
	
	  // --- Propiedades de Estado ---
	
	public boolean isiniciada() {
		return inicio != null;
	}
	
	public int getsegundorest() {
		if(!isiniciada()) return -1;
		long transcurrido = Duration.between(inicio, LocalDateTime.now()).getSeconds(); //orresponde con los segundos que quedan en la partida
		  int restantes = configuracion.maxtiempo() - (int) transcurrido;
	        return Math.max(0, restantes);
		
		}
	public boolean isfinalizada() {
		return getsegundorest()==0;
		
	}

	
	 public boolean enjuego() {
		 return isiniciada() && !isfinalizada() && disparosRest > 0;
		 
	 }
	
	
	//---FUNCIONALIDADES 
	
	private boolean posicionvalida(Punto punt) {
		 return punt.getX() >= 0 && punt.getX() <=configuracion.ancho() &&
				 punt.getY() >= 0 && punt.getY() <= configuracion.alto();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

