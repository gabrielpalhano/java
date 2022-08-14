class ExercicioAnoBissexto {
	public static void main(String[] args) {
		int ab = 1004;
		
			if ((ab % 4 == 0 && ab % 100 != 0) || (ab % 400 == 0)) {
				System.out.println("O ano de: "+ab+" é bissexto!!");
			} else {
				System.out.println("O ano de: "+ab+" não é bissexto!!");
			}
			
			
		/*	if (ab % 4 != 0) {
				System.out.println("O ano de: "+ab+" não é bissexto!!");
			} else if (ab % 100 != 0) {
				System.out.println("O ano de: "+ab+" é bissexto!!");
			} else if (ab % 400 == 0) {
				System.out.println("O ano de: "+ab+" é bissexto!!");
			} else {
				System.out.println("O ano de: "+ab+" não é bissexto!!");
			} */
	}
}


/* System.out.println("O ano de: "+ab+" é bissexto!!");
System.out.println("O ano de: "+ab+" não é bissexto!!"); */