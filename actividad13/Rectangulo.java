package actividad13;

public class Rectangulo implements Figura{

	private int base;
	private int altura;
	private char character;
	
	public Rectangulo(int base,int altura,char character) {
		this.base=base;
		this.altura=altura;
		this.character=character;
	}
	
	
	@Override
	public String nombre() {
		return "Rectangulo";
	}

	//Hacemos una matriz de la altura y la base y la rellenamos con el caracter
	@Override
	public void dibujar() {
		
		int[][] matriz = new int[altura][base];
		 for (int i = 0; i<matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	               matriz[i][j]=character;
	              
	            }
	        }
		 
		 for (int i = 0; i<matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(character);
	            }
	            System.out.println(" ");
		 }
	}

	//calculamos el area
	@Override
	public int area() {	
		return base*altura;
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


	public int getBase() {
		return base;
	}


	public int getAltura() {
		return altura;
	}

	

}
