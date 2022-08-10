class ExercicioUm {
	public static void main (String[] args) {
		int total = 0;
		int contador = 1;
			while (contador <= 1000) {
				total += contador;
				contador++;
					/* if (total < 500500) {
						continue;
					} */	
			} 
		System.out.println(total);	
	}
}

// Imprima	a	soma	de	1	até	1000.