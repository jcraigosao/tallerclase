/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.util.Scanner;
/**
 *
 * @author Koonda15
 * @version 1.0
 */
public class main {
    public static void main(String[] args) {
        City Cali= new City();
        Laberinto Dl = new Laberinto(Cali);
        Dl.Dibujar();
        solucion1 s= new solucion1();
        s.SolucionarLaberinto (Dl,11, 0);// se le indica a la solucion donde debe
        //aparecer el robot y en que escenario
    }
}
