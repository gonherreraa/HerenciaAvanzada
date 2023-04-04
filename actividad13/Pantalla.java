package actividad13;

import java.util.ArrayList;
import java.util.Iterator;

public class Pantalla {

	//creamos un arrayList de Figuras
	private ArrayList<Figura> lista;
	
	public Pantalla() {
		this.lista= new ArrayList<>();
	}
	
	//añadimos al array las figuras
	public void añadr_Figura(Figura a) {
		lista.add(a);
	}
	
	//hacemos un for, recorremos el array de figuras y accediendo a cada figura le cambiamos el caracter
	public void modifica_Figura(char a) {
		
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).setCharacter(a);
		}
	}
	
	//hacemos un for mejorado y en funcion de si es un triangulo o un cuadrado te mostrara una u otra informacion
	public void lista_Figura() {
		if(lista.size()!=0) {
			for(Figura a : lista) {
				if(a instanceof Rectangulo) {
					Rectangulo r = (Rectangulo)a;
					System.out.println(a.nombre() + " de " + r.getBase()+"x"+r.getAltura());
				}else if(a instanceof Triangulo) {
					Triangulo t = (Triangulo)a;
					System.out.println("Triangulo tipo " + t.getTipo() + " de lado " + t.getLado());
				}else
					System.out.println("No hay figuras de ese tipo");
				
			}
		}
	}
	
	//Calculamos el area total de todas las fiiguras
	public int area_Pantalla() {
		int total_area=0;
		for (int i = 0; i < lista.size(); i++) {
			total_area=total_area+lista.get(i).area();
		}
		return total_area;
	}
	
	//dibujamos las figuras
	public void mostra_Pantalla() {
		for (Figura a : lista) {
			a.dibujar();
		}
	}
}



