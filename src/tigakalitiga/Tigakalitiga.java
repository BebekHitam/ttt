/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tigakalitiga;

import tigakalitiga.mesh.meshi;
import tigakalitiga.mesh.papan;

/**
 *
 * @author Windows 8
 */
public class Tigakalitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        papan permainan = new papan();
        
        permainan.gambar();
        permainan.pena(meshi.x, 2, 2);
        permainan.pena(meshi.KOSONG, 0, 0);
        permainan.pena(meshi.x, 2, 0);
        permainan.pena(meshi.o, 1, 1);
        permainan.gambar();
        
        // TODO code application logic here
    }
    
}
