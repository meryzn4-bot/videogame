package topos.geometria;
import topos.geometria.Direccion;
import topos.geometria.Punto;
import topos.geometria.Estado;
import java.util.Random;
import  topos.geometria.PanelB;
public class prueba {
	public static void main(String[] args) {
        System.out.println("--- PRUEBA DE PANELES --- \n");

        // 1. Probar Panel Básico
        PanelB pb = new PanelB(new Punto(1, 1));
        System.out.println("Inicio: " + pb);
        System.out.println("Golpe 1: " + pb.golpeado() + " | " + pb);
        System.out.println("Golpe 2: " + pb.golpeado() + " | " + pb);
        System.out.println("Levantar: " + pb.levantar() + " | " + pb);

        System.out.println("\n-------------------------\n");

        // 2. Probar Panel Débil
        PanelDebil pd = new PanelDebil(new Punto(2, 2));
        for (int i = 1; i <= 4; i++) {
            pd.golpeado();
            boolean pudoLevantarse = pd.levantar();
            System.out.println("Ciclo " + i + " - Derribado y levantado: " + pudoLevantarse + " | " + pd);
        }

        System.out.println("\n-------------------------\n");

        // 3. Probar Panel Resistente
        panelresistente pr = new panelresistente(new Punto(3, 3), 3); // Dureza 3
        System.out.println("Inicio: " + pr);
        System.out.println("Golpe 1: " + pr.golpeado() + " | " + pr);
        System.out.println("Golpe 2: " + pr.golpeado() + " | " + pr);
        System.out.println("Golpe 3: " + pr.golpeado() + " | " + pr); // Aquí debería caer
    }

}
