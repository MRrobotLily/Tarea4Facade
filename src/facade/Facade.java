/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facade;

/**
 *
 * @author niza
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaDeEntretenimiento sistema = new SistemaDeEntretenimiento();
        
        sistema.encenderTodo();
        
        sistema.apagarTodo();
    }
}
