/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;




public class JosselynPolancoUedi {

    RegistroAcademico registroA=new RegistroAcademico(2018,1);
    Carrera carrera=new Carrera(1,"Esta es una descripción");
    
    @Test
    public void testeoDescripcion() throws Exception{
        when(registroA.cheequearCarnet()).thenReturn(true);
        when(registroA.getAnio()).thenReturn(2018);
        when(carrera.procesarCarrera()).thenReturn(1);
        asig=new AsignarHorario();
        assertEquals("Vespertino",asig.generarHorario(carrera,registro).getDescripcion());
    }

    @Test
    public void testeoHorario()  throws Exception{
        when(registroA.cheequearCarnet()).thenReturn(true);
        when(registroA.getAnio()).thenReturn(2018);
        when(carrera.procesarCarrera()).thenReturn(1);
        asig=new AsignarHorario();
        assertEquals(210, asig.generarHorario(carrera,registro).getCodigoHorario());
    }

}