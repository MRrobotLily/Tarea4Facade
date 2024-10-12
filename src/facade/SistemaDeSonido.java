/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author niza
 */
public class SistemaDeSonido {
    public void encender() {
        System.out.println("Sistema de sonido encendido.");
    }
    
    public void apagar() {
        System.out.println("Sistema de sonido apagado.");
    }
    
    public void configurarVolumen(int nivel) {
        System.out.println("Volumen del sistema de sonido ajustado a: " + nivel);
    }
}
