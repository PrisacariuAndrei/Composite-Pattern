import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cutie {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Component hd = new Leaf("Hardrive", 1000);
		Component mouse = new Leaf("Mouse", 10);
		Component monitor = new Leaf("Monitor", 2200);
		Component CPU = new Leaf("CPU", 1431);
		Component RAM = new Leaf("RAM", 871);
		
		Composite ph = new Composite("Periferics");
		Composite computer = new Composite("Computer");
		Composite mb = new Composite("Motherboard");
		Composite cutie = new Composite("Cutie");
		
		mb.addComponent(CPU);
		mb.addComponent(RAM);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		computer.addComponent(mb);
		computer.addComponent(hd);
		
		cutie.addComponent(ph);
		cutie.addComponent(computer);
		
		System.out.println("Alegere un numar pentru afisare: 1-Periferice; 2-Computer; 3-Motherboard; 4-Continutul intregii cutii : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(reader.readLine());
		
		switch (n){
		case 1: ph.showPrice(); break;
		case 2: computer.showPrice(); break;
		case 3: mb.showPrice(); break;
		case 4: cutie.showPrice(); break;
		}
		
		
		
		
		
	}

}
