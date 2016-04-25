import java.util.Scanner;


public class Cadastrar_Item {
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Código de tombamento
		
		System.out.println("Insira Código de Tombamento");
		Scanner Cod_Tombamento = new
		Scanner(System.in);
		String codigoTombamento = Cod_Tombamento.nextLine();
		
		
		//Item tombado
		System.out.println("Insira Item Tombado");
		Scanner Item = new
		Scanner(System.in);
		String item = Item.nextLine();
		
		//Imprima
		System.out.println("Código: " + codigoTombamento);
		System.out.println("Item: " + item);
	}

}
