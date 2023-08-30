/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Telas.GameOver;
import Telas.Jogo;

/**
 *
 * @author é o r's
 */
public class Segundos implements Runnable {
    
    static String login, nomeExibi;
    static int scoreArmazenado, id;
    public boolean stop = false;
    
        @Override
        public void run() {

        GameOver go = new GameOver(login, scoreArmazenado, id,nomeExibi);

        while(!stop){
            int counter = Integer.parseInt(Jogo.txtSegundos.getText());
            
            counter++;
            Jogo.txtSegundos.setText("" + counter);
            
            if(counter * 1000 >= 5000){               
                if(!stop)Jogo.getFrames()[0].dispose();
                go.setVisible(true);
                stop = true;
                break;
            }

            try{
                Thread.sleep(1300);
            } catch(Exception e){
            }

        }
        
    }
    
}
