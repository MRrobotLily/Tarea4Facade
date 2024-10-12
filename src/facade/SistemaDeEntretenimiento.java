/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author niza
 */
public class SistemaDeEntretenimiento {
    private Television television;
    private SistemaDeSonido sistemaDeSonido;
    private ConsolaDeVideojuegos consolaDeVideojuegos;

    public SistemaDeEntretenimiento() {
        this.television = new Television();
        this.sistemaDeSonido = new SistemaDeSonido();
        this.consolaDeVideojuegos = new ConsolaDeVideojuegos();
    }

    public void encenderTodo() {
        television.encender();
        sistemaDeSonido.encender();
        sistemaDeSonido.configurarVolumen(15);
        consolaDeVideojuegos.encender();
        System.out.println("Todos los sistemas han sido encendidos.");
    }

    public void apagarTodo() {
        television.apagar();
        sistemaDeSonido.apagar();
        consolaDeVideojuegos.apagar();
        System.out.println("Todos los sistemas han sido apagados.");
    }
}
