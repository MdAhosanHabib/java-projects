/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sabbir
 */
public class MainClass {

    public static ArrayList<DoctorInformationPage> DoctorInformation = new ArrayList<DoctorInformationPage>();
    public static ArrayList<patientInformation> PatientInformation = new ArrayList<patientInformation>();
    public static List<SerialNumber> serial = new ArrayList<SerialNumber>();
    
    void patientInformation(){
    
        PatientInformation.add(new patientInformation("sabbir","72562","12345","01823585800","dhaka","02-04-2017"));
        PatientInformation.add(new patientInformation("sabbir","72562","12345","01823585800","dhaka","02-04-2017"));
        PatientInformation.add(new patientInformation("sabbir","72562","12345","01823585800","dhaka","02-04-2017"));
        PatientInformation.add(new patientInformation("sabbir","72562","12345","01823585800","dhaka","02-04-2017"));
    }
     void doctorInformation(){
         
         DoctorInformation.add(new DoctorInformationPage("tanbir","MBBS","Brain","8:30-1:00","madisin"));
         serial.add(new SerialNumber(0));
         
         DoctorInformation.add(new DoctorInformationPage("tanbir","MBBS","Brain","8:30-1:00","madisin"));
         serial.add(new SerialNumber(0));
         
         DoctorInformation.add(new DoctorInformationPage("tanbir","MBBS","Brain","8:30-1:00","madisin"));
         serial.add(new SerialNumber(0));
         
         DoctorInformation.add(new DoctorInformationPage("tanbir","MBBS","Brain","8:30-1:00","madisin"));
         serial.add(new SerialNumber(0));
     }
     
     
    public static void main(String[] args){
        
       new MainClass().doctorInformation();
       new MainClass().patientInformation();
       new HomePage().setVisible(true);
        
    }
    
}
