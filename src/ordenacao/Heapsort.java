package ordenacao;

public class Heapsort implements Sort{

private int[] arrayDesordenado;
	
	public Heapsort(int[] arrayDesordenado) {
		this.arrayDesordenado = arrayDesordenado;
	}
	
	@Override
	public void sort() {
		int tamanho = arrayDesordenado.length;
		 
        // Build heap (rearrange array)
        for (int i = tamanho / 2 - 1; i >= 0; i--)
            this.heapify(tamanho, i);
 
        // One by one extract an element from heap
        for (int i = tamanho - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arrayDesordenado[0];
            arrayDesordenado[0] = arrayDesordenado[i];
            arrayDesordenado[i] = temp;
 
            // call max heapify on the reduced heap
            this.heapify(i, 0);
        }
	}
	
	  // To heapify a subtree rooted with node i which is
    // an index in arrayDesordenado[]. n is size of heap
	private void heapify(int tamanho, int raiz){
        int largest = raiz; // Initialize largest as root
        int l = 2 * raiz + 1; // left = 2*i + 1
        int r = 2 * raiz + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < tamanho && arrayDesordenado[l] > arrayDesordenado[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < tamanho && arrayDesordenado[r] > arrayDesordenado[largest])
            largest = r;
 
        // If largest is not root
        if (largest != raiz) {
            int swap = arrayDesordenado[raiz];
            arrayDesordenado[raiz] = arrayDesordenado[largest];
            arrayDesordenado[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify( tamanho, largest);
        }
    }

	
	public int[] getArrayDesordenado() {
		return arrayDesordenado;
	}
	
	public static void main(String[] args) {
		
		int[] arrayDesordenado = {4,3,7,2};

		Heapsort heapsort = new Heapsort(arrayDesordenado);
		
		heapsort.sort();
		 
		for (int i : heapsort.getArrayDesordenado()) {
			System.out.print(i + ", ");
		}
		
	}
	

}
