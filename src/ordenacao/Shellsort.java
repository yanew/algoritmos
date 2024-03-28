package ordenacao;

public class Shellsort implements Sort{
	
	private int[] arrayDesordenado;
	
	public Shellsort(int[] arrayDesordenado) {
		this.arrayDesordenado = arrayDesordenado;
	}
	
	@Override
	public void sort() {
		int h = 1;
	    int n = this.arrayDesordenado.length;
	    
	    while(h < n) {
	            h = h * 3 + 1;
	    }
	    
	    h = h / 3;
	    int pivo, j;
	    
	    while (h > 0) {
	        for (int i = h; i < n; i++) {
	            pivo = this.arrayDesordenado[i];
	            j = i;
	            while (j >= h && this.arrayDesordenado[j - h] > pivo) {
	            	this.arrayDesordenado[j] = this.arrayDesordenado[j - h];
	                j = j - h;
	            }
	            this.arrayDesordenado[j] = pivo;
	        }
	        h = h / 2;
	    }
		
	}
	
	public int[] getArrayDesordenado() {
		return arrayDesordenado;
	}
	
	public static void main(String[] args) {
		
		int[] arrayDesordenado = {6, 4, 7, 9, 2, 3};

		Shellsort shellsort = new Shellsort(arrayDesordenado);
		
		shellsort.sort();
		 
		for (int i : shellsort.getArrayDesordenado()) {
			System.out.print(i + ", ");
		}
		
	}
}
