package ordenacao;

public class Bubblesort implements Sort{

	private int[] arrayDesordenado;
	
	public Bubblesort(int[] arrayDesordenado) {
		this.arrayDesordenado = arrayDesordenado;
	}
	
	@Override
	public void sort() {
		for(int i = 1; i< arrayDesordenado.length; i++) {
			for(int j = 0; j< arrayDesordenado.length-i; j++) {
				if(arrayDesordenado[j]>arrayDesordenado[j+1]) {
					int temp = arrayDesordenado[j];
					arrayDesordenado[j] = arrayDesordenado[j+1];
					arrayDesordenado[j+1] = temp;
				}
			}	
		}
	}
	
	public int[] getArrayDesordenado() {
		return arrayDesordenado;
	}
	
	public static void main(String[] args) {
		
		int[] arrayDesordenado = {6, 4, 7, 9, 2, 3};

		Bubblesort bubblesort = new Bubblesort(arrayDesordenado);
		
		bubblesort.sort();
		 
		for (int i : bubblesort.getArrayDesordenado()) {
			System.out.print(i + ", ");
		}
		
	}
	
	
}
