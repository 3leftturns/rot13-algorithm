/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rot13;

import java.io.IOException;

/**
 *
 * @author andrewjohnson
 */
public class Rot13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        CipherKey x = new CipherKey();
       
        
        x.codeDecode(x.readInput());
    }
    
}