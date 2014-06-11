/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soluciones.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Ruben
 */
public class ProbarPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ServiciosRuben.class);
        
Persona p= ctx.getBean(Persona.class);
        System.out.println(p.ejecutarGracia());
    }
    
}
