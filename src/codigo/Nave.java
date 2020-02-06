/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author Guille López
 */
public class Nave {
    Image imagen = null;
    public int posX = 0;
    public int posY = 0;
    
    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;
    
    public Nave(){
        try{
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        }
        catch(Exception ijoe){
            
        }
    }
    
    public void mueve(){
        if (pulsadoIzquierda){
            posX--;
        }
        if (pulsadoDerecha){
            posX++;
        }
    }
    
}
