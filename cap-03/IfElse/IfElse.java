class IfElse {
	public static void main(String[] args) {
		int idade = 17;
		boolean amigoDoDono = false;
		
			if (idade >= 18 || !amigoDoDono) {
				System.out.println("Você tem: "+idade+" anos de idade! \nPode entrar!");
				
			}	else {
					System.out.println("Você tem apenas: "+idade+" anos de idade! \nNão pode entrar!");	
					}
			
	}
}