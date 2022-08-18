class ExercicioQuatro {
	public static void main(String[] args) {
		int n;
			for(n = 13; n != 1;) {
				if(n % 2 == 0) {
					n /= 2;
						System.out.println(n);
				} else {
					n = 3 * n + 1;
						System.out.println(n);
				}
			}
	}
}

/* Escreva um programa em que, dada	uma	variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte	regra:
Se x é par, x =	x / 2 ;
Se x é impar, x = 3 * x	+ 1;
Imprime	x ;
O programa deve	parar quando x tiver o valor final de 1. */

	// MODO "DO WHILE DE RESOLVER"
	
	/*public static void main(String[] args) {
		long n = 13;
			do {				
				if (n % 2 == 0) {
					n /= 2;
						System.out.println(n);
				} else {
					n = 3 * n + 1;
						System.out.println(n);
				} 
			} while (n != 1);
	}*/