package actividad13;

import java.util.ArrayList;
import java.util.Scanner;

public class DibujarPantalla {
	
static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in); 
		Pantalla a = new Pantalla();
		
		//llamamos al metodo acceso
		acceso(a);
	}

	//metodo para llamar al menu
	public static void menu() {
		System.out.println("***MENU***");
		System.out.println("a - Añadir una figura");
		System.out.println("b - Modificar una figura");
		System.out.println("c - Mostrar la pantalla");
		System.out.println("d - Área de la pantalla");
		System.out.println("e - Listar figuras");
		System.out.println("f - Salir");
		System.out.println("Seleccione una opcion [a-f]");
		
	}
	
	//Bucle que si el caracter que meta es distinto de f se mostrara el menu
	//Luego en funcion de la letra accedera al switch y luego el menu otra vez hasta que quiera salir
	public static void acceso(Pantalla sol) {
		
		char a = 'z';
		while(a!='f') {
			menu();
			 a = sc.next().charAt(0);
			switch (a) {
			case 'a': {
				System.out.println("¿Rectangulo (r) o triangulo (t)?");
				char res = sc.next().charAt(0);
				if(res=='r') {
					System.out.println("Indica la base: ");
					int base = sc.nextInt();
					System.out.println("Indica la altura: ");
					int altura = sc.nextInt();
					System.out.println("Indica el caracter: ");
					char car = sc.next().charAt(0);
					sol.añadr_Figura(new Rectangulo(base, altura, car));
					
				}else if(res=='t') {
					System.out.println("Indica el lado: ");
					int lado = sc.nextInt();
					System.out.println("Indica el tipo(a,b,c,d): ");
					String tipo = sc.next();
					System.out.println("Indica el caracter: ");
					char car = sc.next().charAt(0);
					sol.añadr_Figura(new Triangulo(lado, tipo, car));
				}else {
					System.out.println("Opcion no valida");
				}
					
			}break;
			case 'b': {
				System.out.println("Indica el nuevo caracter para las figuras:  ");
				char car = sc.next().charAt(0);
				sol.modifica_Figura(car);
			}break;
			case 'c': {
				System.out.println("Las figuras que has añadido son: ");
				sol.mostra_Pantalla();
				
			}break;
			case 'd': {
				System.out.println("El area total de la pantalla es: ");
				System.out.println(sol.area_Pantalla());
		
			}break;
			case 'e': {
				System.out.println("El listado de las figuras añadidas son:");
				sol.lista_Figura();
		
			}break;
			case 'f': {
				System.out.println("Hasta luego");
			}break;
			default:
				System.out.println("Opcion no valida");
			}
		}
	}
}
