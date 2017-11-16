/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi Martínez Limon
 */
public class PilaTest {

    /**
     * Prova d'afegir un numero negatiu a la pila.
     */
    @Test
    public void testAfegirNegatiu() {
        System.out.println("Afegir un numero negatiu a la pila.");
        Pila instance = new Pila();
        int num = -7;
        int expResult = 0;
        int result = instance.afegir(num);
        assertEquals(expResult, result);
    }

    /**
     * Prova d'afegir el numero anterior a 1 a la pila.
     */
    @Test
    public void testAfegirMenysU() {
        System.out.println("Afegir el numero anterior a 0 (-1) a la pila.");
        Pila instance = new Pila();
        int num = -1;
        int expResult = 0;
        int result = instance.afegir(num);
        assertEquals(expResult, result);
    }

    /**
     * Prova d'afegir el numero 0 a la pila.
     */
    @Test
    public void testAfegirZero() {
        System.out.println("Afegir el numero 0 a la pila.");
        Pila instance = new Pila();
        int num = 0;
        int expResult = 0;
        int result = instance.afegir(num);
        assertEquals(expResult, result);
    }

    /**
     * Prova d'afegir el numero seguent de 0 a la pila.
     */
    @Test
    public void testAfegirU() {
        System.out.println("Afegir el numero seguent de 0 (1) a la pila.");
        Pila instance = new Pila();
        int num = 1;
        int expResult = 1;
        int result = instance.afegir(num);
        assertEquals(expResult, result);
    }

    /**
     * Prova d'afegir un numero qualsevol a la pila, que ja es troba plena.
     */
    @Test
    public void testAfegirPlena() {
        System.out.println("Afegir un numero a la pila plena.");
        Pila instance = new Pila();
        for (int i = 1; i <= instance.MAX; i++) {
            instance.afegir(i);
        }
        int num = 1;
        int expResult = 0;
        int result = instance.afegir(num);
        assertEquals(expResult, result);
    }

    /**
     * Prova de treure un element de la pila.
     */
    @Test
    public void testTreure() {
        System.out.println("Treure un element de la pila.");
        Pila instance = new Pila();
        int num = 2;
        instance.afegir(num);
        int expResult = 2;
        int result = instance.treure();
        assertEquals(expResult, result);
    }

    /**
     * Prova de treure un element de la pila, que es troba buida.
     */
    @Test
    public void testTreureBuida() {
        System.out.println("Treure un element de la pila buida.");
        Pila instance = new Pila();
        int expResult = -1;
        int result = instance.treure();
        assertEquals(expResult, result);
    }
}
