/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment;

/**
 *
 * @author sabbir
 */
public class SerialNumber {
    private int serial=0;

    /**
    * @return the serial
    */
    
    SerialNumber(int serial){
        this.serial = serial;
    }
    
    public int getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(int serial) {
        this.serial = serial;
    }
}
