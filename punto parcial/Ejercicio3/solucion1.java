/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Estudiante
 */
public class solucion1 {
    public void SolucionarLaberinto(Laberinto x,int w,int t){
             City Cali=x.getCiudad();
        Robot z = new Robot(Cali,w,t,Direction.EAST,0);
        boolean[][] matriz= new boolean[12][15];
        for(int i=0;i<12;i++){
            for(int j=0;j<15;j++){
                matriz[i][j]=false;
            }
        }
        boolean terminar=false;
        while(terminar==false){
            
            while(z.frontIsClear()){
                z.move();
                if(z.canPickThing()){
                matriz[z.getStreet()][z.getAvenue()]=true;
                z.pickThing();
                }
            }
            z.turnLeft();
            z.turnLeft();
            while(z.frontIsClear()){
                z.move();
                if(z.canPickThing()){
                matriz[z.getStreet()][z.getAvenue()]=true;
                z.pickThing();
                }
            }
            z.turnLeft();
            z.turnLeft();
            if((z.getStreet()==0)&&(z.getAvenue()==1)){
                terminar = true;
                while(z.frontIsClear()){
                    if(z.canPickThing()){
                        z.pickThing();
                        matriz[z.getStreet()][z.getAvenue()]=true;
                    }
                    z.move();
                }
            }
            else{
                int inicial = z.getStreet();
                do{
                    z.turnLeft();
                    if(z.frontIsClear()){
                        z.move();
                        for(int k=0;k<3;k++){
                            z.turnLeft();
                        }
                    }
                    else{
                        for(int k=0;k<3;k++){
                            z.turnLeft();
                        }
                        z.move();
                    }
                }while(inicial==z.getStreet()); 
            }
        }
        int c =0;
        for(int i=0; i< 12;i++){
            for(int j=0;j<14;j++){
                if(matriz[i][j]){
                    System.out.println("Habia una cosa en "+i+","+j);
                    c++;
                }
            }
        }
        System.out.println("habia "+c+" cosas");
    }
}

