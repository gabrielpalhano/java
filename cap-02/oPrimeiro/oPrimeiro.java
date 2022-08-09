class OutroNome {
	public static void main (String args[]) {
		
		System.out.println("O primeiro programinha do: "+args[0]);
	}
}

// exercicio opcional do livro, não entendi muito bem mas acho que ele quer que eu salve o mesmo arquivo, na mesma pasta, só que com outro nome pra ver se roda, sei lá
// Descobri que na verdade ele queria que eu renomeasse a class para OutroNome e quando eu rodasse o javac, mesmo meu arquivo se chamando oPrimeiro, ele criaria um arquivo
// OutroNome.class pois o compilador cria o nome do bytecode usando o nome que estiver na class e não o mesmo nome do arquivo .java, que neste caso é oPrimeiro!