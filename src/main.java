
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		padre[] lista=new padre[4];
		lista[0]=new Articulo(2,3);
		lista[1]=new Producto(1,5);
		lista[2]=new Articulo(4,7);
		lista[3]=new Producto(2,9);
		int resultado = 0;
		for(int cont=0;cont<4;cont++){
			resultado=lista[cont].resultado()+resultado;
		}
		System.out.print(resultado);
	}
}
