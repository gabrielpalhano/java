class ExercicioTres {
	public static void main (String[] args) {
		//(SOLUÇÃO FOR)
	double f = 1;	
		for (double c = 1; c <= 30; c++, f *= (c - 1)) {
			/*System.out.println(f);*/
		}
	System.out.println(f);	
		
		//(SOLUÇÃO WHILE)	
		
 /*	long f = 1; 
	long c = 1;
		while (c <= 10) {
			c++;
			f *= (c - 1);
				System.out.println(f);
		}*/
	}
}

//	 Imprima	os	fatoriais	de	1	a	10.

/* No	código	do	exercício	anterior,	aumente	a	quantidade	de	números	que	terão	os	fatoriais	impressos
até	20,	30	e	40.	Em	um	determinado	momento,	além	de	esse	cálculo	demorar,	começará	a	mostrar
respostas	completamente	erradas.	Por	quê?
Mude	de		int		para		long		a	fim	de	ver	alguma	mudança.*/