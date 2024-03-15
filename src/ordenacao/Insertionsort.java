package ordenacao;

public class Insertionsort implements Sort{

	private int[] arrayDesordenado;
	
	public Insertionsort(int[] arrayDesordenado) {
		this.arrayDesordenado = arrayDesordenado;
	}
	
	@Override
	public void sort() {
		
		for(int i = 1; i<this.arrayDesordenado.length; i++) {
			int pivo = this.arrayDesordenado[i];
			int j = i -1;
			while(j>=0 && this.arrayDesordenado[j] > pivo){
				this.arrayDesordenado[j+1] = this.arrayDesordenado[j];
				j = j -1;
			}
			this.arrayDesordenado[j+1] = pivo;
		}
	}
	
	public int[] getArrayDesordenado() {
		return this.arrayDesordenado;
	}

	public static void main(String[] args) {
		
		int[] arrayDesordenado = {6, 4, 7, 9, 2, 3};

		Insertionsort insertionsort = new Insertionsort(arrayDesordenado);
		insertionsort.sort();
		 
		for (int i : insertionsort.getArrayDesordenado()) {
			System.out.print(i + ", ");
		}
		
	}

	
	
}
