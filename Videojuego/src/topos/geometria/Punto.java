package topos.geometria;

import topos.geometria.Direccion;
import topos.geometria.Punto;

public class Punto {
	private double X;
	private double Y;
  
	
	//constructores 
	 // con argumento 
	
	public Punto(double X, double Y ) {
		this.X=X;
		this.Y=Y;
		
	}
	//sin argumento 
	public Punto() {
		this.X=0;
		this.Y=0;
	}
	  //metodos de accesso a las propiedades  
	
		public Punto(Punto v1) {
		// TODO Auto-generated constructor stub
	}
		public double getX() {
			return X;
			}
		public double getY() {
			return Y;
			}
		public void setX(double X) {
		    this.X = X;
		}

		public void setY(double Y) {
		    this.Y = Y;
		}
	
	//funcionalidad
	 public void desplazar(double incX,double incY) {
		 this.X+=incX ;
		 this.Y += incY;
		 
	 }
	 
	 public void situar(double nuevaX,double nuevaY) {
		 this.X = nuevaX;
		 this.Y=nuevaY;
	 }
	public Punto reflejoX() {
		return new Punto(this.X,-this.Y);
		
	}
	public Punto reflejoY() {
		return new Punto( -this.X, this.Y);
		
	} 
	
	public double distancia(Punto otro) {
		double dx =this.X-otro.X;
		double dy=this.Y-otro.Y;
		
	   return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
	
	
   public void Desplazar(Direccion direccion) {
	   switch (direccion) {
	   case ARRIBA ->this.Y++;  
	   case  ABAJO  ->this.Y--; 
	   case DERECHA ->this.X++; 
	   case IZQUIERDA ->this.X--;
	   default -> System.out.println("direccion no valida");
	   }
	   
   }
@Override
public String toString() {
	return "punto [X=" + X + ", Y=" + Y + "]";
}
   
   
 
	  
}


