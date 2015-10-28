/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeiroviajante;

/**
 *
 * @author UDESC
 */
public class Cidade {
    private int id;
    private int x;
    private int y;
    
    public Cidade(int id,int x,int y){
        this.id=id;
        this.x=x;
        this.y=y;             
    }
    
    public int getID(){
        return id;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
