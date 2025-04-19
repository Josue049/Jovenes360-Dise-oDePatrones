/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Includify;

import Includify.empleo.EmpleosServices;
import java.util.Scanner;
import usuario.EmpresaServices;

/**
 *
 * @author Marco
 */
public class Pagina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la empresa");
        String nombre = in.nextLine();
        
        System.out.println("Ingresa la contraseña");
        String contrasena = in.nextLine();
        
        System.out.println("Ingresa el telefono");
        String telefono = in.nextLine();
        
        EmpresaServices empresa = new EmpresaServices();
        empresa.crearEmpresa(telefono, nombre, contrasena);
        
        EmpleosServices empleo = new EmpleosServices();
        
        System.out.println("Ingresa el anuncio: ");
        String Anuncio = in.nextLine();
        
        empleo.CrearEmpleo(empresa.obtenerEmpresa(),  Anuncio);
        
        System.out.println("¿Deseas actualizar datos? (SI/NO)");
        
        System.out.println("si");
        System.out.println("no");
        String eleccion = in.nextLine();
        eleccion = eleccion.toLowerCase();
        if( eleccion.equals("si")){
        empresa.actualizarEmpresa(contrasena);        
        System.out.println("Ingresa la nueva contraseña");
        contrasena = in.nextLine();
        
        }
        
    }
}
