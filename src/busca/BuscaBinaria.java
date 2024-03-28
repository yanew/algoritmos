package busca;

public class BuscaBinaria {

	
	
	public int buscaBinariaCrescente(int procurado, int[] array, int inicio, int fim) {
		int pivo = (inicio + fim)/2;
		
		if((procurado<array[inicio])||(procurado>array[fim])) {
			return -1;
		}
		
		if(fim >=0 && fim<array.length) {
			if(array[pivo]==procurado) {
				return pivo;
			}else if(array[pivo]<procurado){
				pivo = this.buscaBinariaCrescente(procurado, array, pivo+1, fim);
			}else if(array[pivo]>procurado) {
				pivo = this.buscaBinariaCrescente(procurado, array, inicio, pivo - 1);
			}
		}else {
			pivo = -1;
		}
	
		return pivo;
	}
	
	
	
	public static void main(String[] args) {
		BuscaBinaria bb = new BuscaBinaria();
		
		int[] array = {1,2,3,4,5};
		
		//System.out.println(bs.buscaPadrao(90, array));
		
		System.out.println(bb.buscaBinariaCrescente(2, array, 0, array.length-1));
		
		
	}
	
}
