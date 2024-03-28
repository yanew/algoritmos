package ordenacao;

public class Mergesort implements Sort{

	private int[] arrayDesordenado;
	
	public Mergesort(int[] arrayDesordenado) {
		this.arrayDesordenado = arrayDesordenado;
	}
	
	@Override
	public void sort() {
		
	}
	
	public void mergesort(int[] arrayDesordenado, int ini, int fim) {
		if(ini<fim) {
			int meio = (ini + fim)/2;
			if(ini < meio){
				mergesort(arrayDesordenado, ini, meio);
			}
			if(meio + 1< fim) {
				mergesort(arrayDesordenado, meio + 1, fim);
			}
			this.merge(arrayDesordenado, ini, meio, fim);
		}
	}
	
	private void merge(int[] arrayDesordenado, int ini, int meio, int fim) {
		int[] arrayTemp = new int[arrayDesordenado.length];
		
		int i = 0;
		int j = 0;
		for(i = ini; i <= meio; i++) {
			arrayTemp[i] = arrayDesordenado[i];
		}
		for(j = meio + 1; j <= fim; j++) {
			arrayTemp[fim+meio+1-j] = arrayDesordenado[j];
		}
		i = ini;
		j = fim;
		for(int k = ini; k <= fim; k++) {
			if(arrayTemp[i]<=arrayTemp[j]) {
				arrayDesordenado[k] = arrayTemp[i];
				i++;
			}else{
				arrayDesordenado[k] = arrayTemp[j];
				j--;
			}
		}
	}
	
	public int[] getArrayDesordenado() {
		return arrayDesordenado;
	}
	
	public static void main(String[] args) {
		
		int[] arrayDesordenado = {3,4,2,7};//6, 4, 7, 9, 2, 3

		Mergesort mergesort = new Mergesort(arrayDesordenado);
		
		mergesort.mergesort(arrayDesordenado, 0, arrayDesordenado.length - 1);
		 
		for (int i : mergesort.getArrayDesordenado()) {
			System.out.print(i + ", ");
		}
		
	}
	
}
