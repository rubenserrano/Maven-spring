/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.soluciones.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ruben
 */
    @Controller
    @RequestMapping("/Hola")
public class ControladorHola {
    @RequestMapping(value="/mensaje",method=RequestMethod.GET,headers ={"Accept=text/html"} )
    public @ResponseBody String algo(){
        String facil="Mi primer servicio en java con Rest y spring";
        return facil;
    }
}
