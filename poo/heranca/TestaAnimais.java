package Familia52.poo.heranca;


public class TestaAnimais  {

	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro ("rex",10 );
		Animal cavalo = new Cavalo ("bambam",5 );
		Animal preguica = new Preguica ("dorminhoco",7 );
		
		
	
		cachorro.somAnimal();
		cavalo.somAnimal();
		preguica.somAnimal();
		
		
	

	}

}
/* package questao2Lista6;

import questao1Lista6.Cachorro;
import questao1Lista6.Cavalo;
import questao1Lista6.Preguica;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro HuskySiberiano = new Cachorro("Cachorro Lob�oo", 7);
		Cavalo MangaLargaMarchador = new Cavalo("Spirit", 5);
		Preguica PreguicinhaPresidente = new Preguica("Jair", 67);
		
		System.out.println("M�todo emiteSom() - Som do cachorro: ");
		HuskySiberiano.emiteSom();
		HuskySiberiano.emiteSom();
		HuskySiberiano.emiteSom();
		
		System.out.println("\nM�todo emiteSom() - Som do cavalo: ");
		MangaLargaMarchador.emiteSom();
		MangaLargaMarchador.emiteSom();
		MangaLargaMarchador.emiteSom();
		
		System.out.println("\nM�todo emiteSom() - Som da pregui�a: ");
		PreguicinhaPresidente.emiteSom();
		PreguicinhaPresidente.emiteSom();	
		PreguicinhaPresidente.emiteSom();	

	}

}*/