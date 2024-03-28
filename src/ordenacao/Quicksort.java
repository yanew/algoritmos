package ordenacao;

public class Quicksort implements Sort{
	
	private int[] arrayDesordenado;
	
	
	public Quicksort(int[] arrayDesordenado) {
		this.arrayDesordenado = arrayDesordenado;
	}
	
	@Override
	public void sort() {
		
	}
	
	public void sort2() {
		
	}
	
	
	public void quicksort(int[] a, int lo, int hi) {
		if(lo<hi) {
			int p = this.particiona(a, lo, hi);
			quicksort(a, lo, p - 1);
			quicksort(a, p+1, hi);
		}
	}
	
	private int particiona(int[] a, int lo, int hi) {
		int pivo = a[hi];
		int i = lo - 1;
		
		for(int j = lo; j < hi; j++) {
			if(a[j]<pivo) {
				i++;
				int tempI = a[i];
				int tempJ = a[j];
				a[i] = tempJ;
				a[j] = tempI;
			}
		}
		
		if(pivo < a[i+1]) {
			int tempIMaisUm = a[i+1];
			int tempHi = a[hi];
			a[i+1] = tempHi;
			a[hi] = tempIMaisUm;
		}
		return i + 1;
	}
	
	public void quicksort2(int[] x, int iniVet, int fimVet) {
		int i, j, pivo, aux;
		
		i = iniVet;
		j = fimVet;
		pivo = x[(iniVet+fimVet)/2];
		
		while(i<=j) {
			while(x[i]<pivo) {
				i++;
			}
			while(x[j]>pivo) {
				j--;
			}
			if(i<=j) {
				aux = x[i];
				x[i] = x[j];
				x[j] = aux;
				i++;
				j--;
			}
		}
		if(iniVet<j) {
			quicksort2(x, iniVet, j);
		}
		if(i < fimVet) {
			quicksort2(x, i, fimVet);
		}
	}
	
	public int[] getArrayDesordenado() {
		return arrayDesordenado;
	}
	
	public static void main(String[] args) {
		
		int[] arrayDesordenado = {6, 4, 7, 9, 2, 3, 5, 0};

		Quicksort quickSort = new Quicksort(arrayDesordenado);
		
		//quickSort.quicksort(arrayDesordenado, 0, arrayDesordenado.length-1);
		//quickSort.quicksort2(arrayDesordenado, 0, arrayDesordenado.length-1);
		 
		//System.out.println((0+3)/2);
		
		for (int i : quickSort.getArrayDesordenado()) {
			System.out.print(i + ", ");
		}
		
	}
}
