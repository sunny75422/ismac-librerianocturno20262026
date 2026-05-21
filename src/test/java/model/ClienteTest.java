package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setup (){

        cliente = new Cliente( 1,
                "1728456300",
                "Juan",
                "Taipe",
                "Av. por ahi",
                "0986521915",
                "jtaipe@correo.com" );
    }


    @Test
    public void testClienteConstructorAndGetters(){
        assertAll( "Validar datos del clinte",
                () -> assertEquals (1,cliente.getIdcliente()),
                () -> assertEquals ("1728456300",cliente.getCedula()),
                () -> assertEquals ("Juan",cliente.getNombre()),
                () -> assertEquals ("Taipe",cliente.getApellido()),
                () -> assertEquals ("Av. por ahi",cliente.getDireccion()),
                () -> assertEquals ("0986521915",cliente.getTelefono()),
                () -> assertEquals ("jtaipe@correo.com",cliente.getCorreo())

        );
        System.out.println("======== Test unitarias en cleinte");
        System.out.println(cliente.toString());


    }
    @Test
    public void testClienteSetters(){
        cliente.setIdcliente(2);
        cliente.setCedula("17285463544");
        cliente.setNombre("Juan3");
        cliente.setApellido("Taipe3");
        cliente.setDireccion("Av. por ahi 3");
        cliente.setTelefono("099999999");
        cliente.setCorreo("jtaipe3@correo.com");

        assertAll( "Validar datos cliente setters",
                () -> assertEquals (2,cliente.getIdcliente()),
                () -> assertEquals ("17285463544",cliente.getCedula()),
                () -> assertEquals ("Juan3",cliente.getNombre()),
                () -> assertEquals ("Taipe3",cliente.getApellido()),
                () -> assertEquals ("Av. por ahi 3",cliente.getDireccion()),
                () -> assertEquals ("099999999",cliente.getTelefono()),
                () -> assertEquals ("jtaipe3@correo.com",cliente.getCorreo())
        );
    }

    @Test
    public void TestClienteToString(){
        String str = cliente.toString();
        assertAll("Validar datos de cliente con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1728456300")),
                () -> assertTrue(str.contains("Juan")),
                () -> assertTrue(str.contains("Taipe")),
                () -> assertTrue(str.contains("Av. por ahí")),
                () -> assertTrue(str.contains("0986521915")),
                () -> assertTrue(str.contains("jtaipe@correo.com"))



        );

    }
}
