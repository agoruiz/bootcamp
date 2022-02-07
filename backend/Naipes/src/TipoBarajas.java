
interface TiposBarajas extends Baraja {
enum tipoBarajas {Española, Inglesa};
enum valor{};
enum palo{};

 boolean asignaryValorPalo (int valor,int palo) throws Throwable; 
 boolean añadirvalor(int valor ) throws Throwable;  
 tipoBarajas propiedadesBaraja() throws Throwable;
boolean añadirvalor(int palo, int valor) throws Throwable;

}
