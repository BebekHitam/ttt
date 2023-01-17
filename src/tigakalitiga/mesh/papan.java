/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tigakalitiga.mesh;

/**
 *
 * @author Windows 8
 */
public class papan {
    public meshi [] [] papan;
    
    public papan(){
        this.papan = new meshi [3] [3];
        this.Bersihkan();
    }

    public papan(meshi[][] blabak) {
        this.papan=blabak;
    }
    public final void Bersihkan() {
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                this.papan[i][j]= meshi.KOSONG;
            } 
        }
    
    }
    public void gambar() {
       System.out.printf("\n  0 1 2 \n");
       for (int i=0;i<3;i++) {
           System.out.printf("%d ", i);
           for (int j=0;j<3;j++){
               if (j<2) {
                   System.out.printf("%s|", papan[i][j]);
               }
               else {
                   System.out.printf("%s", papan [i][j]);
               }
               
           }
           System.out.printf("\n");
           if (i<2) {
               System.out.printf("  -+-+-\n");
           }
        }
    }
    public boolean pena (meshi tulis, int x, int y) {
        this.papan[x][y]=tulis;
        return true;
    }
        /*throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody*/      
    
}
