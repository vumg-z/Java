import java.util.Stack;


public class StackApp {

	public static void main(String[] args) {
		
		//Hacer un programa en java que imprima todas las 'a' o 'A' al reves. 
		
		Stack<Character> Pila = new Stack<Character>();
		
		String frase = "Hola amigos como se encuentrAn hoy";
		
		char[] arregloCadena = frase.toCharArray();
		
		for(Character elemento: arregloCadena) {
			if(elemento == 'a' || elemento == 'A')
				Pila.push(elemento);
		}
		
		while(!Pila.isEmpty()) {
			System.out.print(Pila.pop());
		}
		
		
	}
	
}
