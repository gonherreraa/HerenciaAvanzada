package actividad13;

public class Triangulo implements Figura{

	private int lado;
	private String tipo;
	private char character;
	
	public Triangulo(int lado,String tipo,char character) {
		this.lado=lado;
		this.tipo=tipo;
		this.character=character;
	}
	
	@Override
	public String nombre() {
		return "Triangulo";
	}

	//Mediante una matriz cuadrada del lado del triangulo, 
	//iremos rellenando con espacios para que nos salgan los triangulos
	@Override
	public void dibujar() {
		int[][] matriz = new int[lado][lado];
		switch (tipo) {
			case "a":{
				//tipo a
				for(int i=0;i<matriz.length;i++) {
					int row=matriz[i].length-i;
					for(int j=0; j<row;j++) {
					System.out.print(character);
					}
					System.out.println("");
				}
			}break;
			case "b":{
				//tipo b
				for(int i=0;i<matriz.length;i++) {
					for(int j=0; j<matriz[i].length;j++) {
					if(j<matriz.length-(matriz.length- i)) {
					System.out.print(" ");
					}else System.out.print(character);
					}
					System.out.println("");
				}
			}break;
			case "c":{
				//tipo c
				for(int i=0;i<matriz.length;i++) {
					for(int j=0; j<matriz[i].length;j++) {
					if(j<(i+1)) {
					System.out.print("*");
					}else System.out.print(" ");
					}
					System.out.println("");
					}
				
			}break;
			case "d":{
				//tipo d
				 for (int i = 0; i<matriz.length; i++) {
			            for (int j = 0; j < matriz[i].length; j++) {  
			               if(j<matriz.length-(i+1)) {
			            	System.out.print(" ");
			               }else
			            	System.out.print(character);
			            }
			            System.out.println("");
				 }
			}break;
			default:
			System.out.println("Opcion no valida");
		}
	}

	//calculamos el area
	@Override
	public int area() {
		return lado*lado;
	}

	//Para poder cambiar el caracter de la figura
	@Override
	public void setCharacter(char a) {
		this.character=a;
	}

	//Obtenemos el caracter
	@Override
	public char getCharacter() {
		return character;
	}

	public int getLado() {
		return lado;
	}

	public String getTipo() {
		return tipo;
	}

	
}
