class Treino {
	public static void main(String[] args) {
		int ab = 1000;
		
			if ((ab % 4 == 0 && ab % 100 != 0) || (ab % 400 == 0)) {
				System.out.println("O ano de: "+ab+" é bissexto!!");
			} else {
				System.out.println("O ano de: "+ab+" não é bissexto!!");
			}
	}
}

/* O objetivo é que todo dia eu treine aqui qualquer coisa que eu precisar treinar;
Normalmente, referente aos estudos do dia anterior, a fim de fixar melhor o conteúdo;
Então é provável que todo dia o código deste arquivo mude!! */


/* System.out.println("O ano de: "+ab+" é bissexto!!");
System.out.println("O ano de: "+ab+" não é bissexto!!"); */

/*	if (ab % 4 != 0) {
				System.out.println("O ano de: "+ab+" não é bissexto!!");
			} else if (ab % 100 != 0) {
				System.out.println("O ano de: "+ab+" é bissexto!!");
			} else if (ab % 400 == 0) {
				System.out.println("O ano de: "+ab+" é bissexto!!");
			} else {
				System.out.println("O ano de: "+ab+" não é bissexto!!");
			} */