package busca;

public class BuscaSequencial {
	
	
	
	public int buscaPadrao(int procurado, int[] array) {
		boolean achou= false;
		int i = 0;
		while(!achou&&i<array.length) {
			if(array[i]==procurado) {
				achou = true;
			}
			i++;
		}
		if(!achou) {
			i = -1;
		}
		return i;
	}
	
	
	public int buscaRecursiva(int procurado, int[] array, int limite) {
		int indice = -1;
		
		if(limite <array.length) {
			if(array[limite]==procurado) {
				return limite;
			}else {
				indice = this.buscaRecursiva(procurado, array, limite+1);
			}	
		}
		
		return indice;
	}
	
	public int buscaRecursiva2(int procurado, int[] array, int limite) {
		if(limite>=0) {
			if(array[limite]==procurado) {
				return limite;
			}else {
				limite = this.buscaRecursiva2(procurado, array, limite-1);
			}
		}
		return limite;
	}
	
	public static void main(String[] args) {
		BuscaSequencial bs = new BuscaSequencial();
		
		int[] array = {7,4,5,9,8};
		
		//System.out.println(bs.buscaPadrao(90, array));
		
		System.out.println(bs.buscaRecursiva2(5, array, array.length-1));
		
		
	}
	
}
