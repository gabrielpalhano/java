class Treino {
	public static void main(String[] args) {
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
	}
}

/* O objetivo é que todo dia eu treine aqui qualquer coisa que eu precisar treinar;
Normalmente, referente aos estudos do dia anterior, a fim de fixar melhor o conteúdo;
Então é provável que todo dia o código deste arquivo mude!! */

/* if(n == 1) {
				System.out.println("Seu número alcançou o resultado: "+n);
			}
				else */


