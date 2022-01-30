
interface TiposBarajas extends Baraja {
enum tipoBarajas {Española, Inglesa};
enum valor{};
enum palo{};

 boolean asignaryValorPalo (int valor,int palo); 
 boolean añadirvalor(int valor ) throws Throwable;  
 tipoBarajas propiedadesBaraja();
boolean añadirvalor(int palo, int valor) throws Throwable;

}
