
interface TiposBarajas extends Baraja {
enum tipoBarajas {Espa�ola, Inglesa};
enum valor{};
enum palo{};

 boolean asignaryValorPalo (int valor,int palo) throws Throwable; 
 boolean a�adirvalor(int valor ) throws Throwable;  
 tipoBarajas propiedadesBaraja() throws Throwable;
boolean a�adirvalor(int palo, int valor) throws Throwable;

}
