/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Includify.empleo;

import Includify.empleo.Empleos;

/**
 *
 * @author Marco
 */
public class EmpleosServices implements Acciones {
    
  public void CrearEmpleo(String nobreEmpresa, String anuncio){
      Empleos empleo = new Empleos(nobreEmpresa, anuncio);
      System.out.println("Empleo creadro: " + empleo);
  }  
}
