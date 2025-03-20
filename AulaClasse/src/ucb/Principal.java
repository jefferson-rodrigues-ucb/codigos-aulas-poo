package ucb;

import ucb.animal.Cachorro;

public class Principal {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Príncipe", "vira-lata", "preto", 58, 15);
		Cachorro cachorro2 = new Cachorro("Huck", "vira-lata", "cinza", 53, 17);
		
		System.out.println(cachorro1);
		
		System.out.println("Nome do segundo cachorro: " + cachorro2.getNome());
		
		cachorro1.setPeso(25.3f);
		
		cachorro2.aniversario();
		
		System.out.println(cachorro2);
		
		System.out.println(cachorro1);
	}

}
