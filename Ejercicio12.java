import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dimension");
		int a = sc.nextInt();
		int num_aux[] = rellenar_aux(a);
		
		System.out.println("Introduce digito en el que quieres que acaben");
		a = sc.nextInt();
		if (a > 0) {
			int num[] = recorrer(num_aux, a);
		}else {
			System.out.println("Eror en numero introducido");
		}

	}
	
	public static int [] rellenar_aux (int a) {
		int max = 300;
		int min = 1;
		int num[]= new int [a];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * (max - min - 1) + (min)) + 1;
		}
		
		return num;
	}
	
	public static void imprimir(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("En la posicion "+i+ " hay el valor "+lista[i]);
		}
	}
	
	public static int [] recorrer(int lista[], int a) {
		int num[] = new int [lista.length];
		for (int i = 0; i < lista.length; i++) {
			if (lista[i]%10 == a) {
				num[i] = lista[i];
			}
			
		}
		
		return num;
	}

}
