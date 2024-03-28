package ordenacao;

public class SelectionSort implements Sort{

private int[] arrayDesordenado;
	
	public SelectionSort(int[] arrayDesordenado) {
		this.arrayDesordenado = arrayDesordenado;
	}
	
	@Override
	public void sort() {
		for(int i = 0; i< arrayDesordenado.length-1; i++) {
			int min  = i;
			for(int j = i+1; j< arrayDesordenado.length; j++) {
				if(arrayDesordenado[j]<arrayDesordenado[min]) {
					min = j;
				}
			}	
			int tempI = arrayDesordenado[i];
			int tempMin = arrayDesordenado[min];
			arrayDesordenado[min]  = tempI;
			arrayDesordenado[i] = tempMin;
		}
	}
	
	public int[] getArrayDesordenado() {
		return arrayDesordenado;
	}
	
	public static void main(String[] args) {
		
		int[] arrayDesordenado = {6, 4, 7, 9, 2, 3};

		SelectionSort selectionSort = new SelectionSort(arrayDesordenado);
		
		selectionSort.sort();
		 
		for (int i : selectionSort.getArrayDesordenado()) {
			System.out.print(i + ", ");
		}
		
	}

}
