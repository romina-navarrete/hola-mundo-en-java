/*
	Muestra por pantalla la frase "¡Hola Mundo!"

	@autor mgm11299

*/
public class HolaMundo
{
	public static void main(String[] args)
	{
		String naranja="\033[33m";
		String azul="\033[34m";

		System.out.println(naranja + "¡Hola Mundo!");
		System.out.println(azul + "Aquí estamos haciendo pruebas con Git.");
	}
}