package Tasks;

// Utilizaremmos interfaces para la herencia multiple,
// los trabajadores que hereden de esta interfaz van a heredar propiedades de ambos PitCrewTeam y TeamDriverA

public interface TeamDriverA {//TyreOn(4),FrontJack(1)

    // Atributos
    String color = "Rojo";//Se necesita inicializar y este será también un diferenciador

    // Metodos
    public void trabajoEspecial(); // Este metodo va a sufrir un override

    private void special(){
        System.out.println("\033[0;31mYo trabajo especialmente con el piloto A y por eso soy color \033[0m"+color);
    }
    default void accederPrivado(){
        special();
    }
}
