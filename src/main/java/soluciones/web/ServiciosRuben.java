/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soluciones.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ruben
 */
@Configuration
public class ServiciosRuben {
    @Bean
    Persona ejecutarGracia(){
    return new Cantante();
    }
}
