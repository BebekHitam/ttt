/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tigakalitiga.mesh;

/**
 *
 * @author Windows 8
 */
public enum meshi {
    x('X'),o('O'), KOSONG(' ');
    
    private char ch;
    
    meshi (char ch) {
       this.ch = ch; 
    }
    
    @Override 
    public String toString() {
        return String.format("%c", this.ch);
    }
    
}
