/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment;

import java.util.ArrayList;

/**
 
 * @author sabbir
 */
public class DoctorInformationPage {
    
    private String DoctorName ;
    private String Qualification;
    private String Spaclization;
    private String Time;
    private String dept;
    
    public DoctorInformationPage( String DoctorName,String Qualification,String Spaclization,String Time,String dept){
        
        this.DoctorName=DoctorName;
        this.Qualification=Qualification;
        this.Spaclization=Spaclization;
        this.Time= Time;
        this.dept=dept;
        
    }

    /**
     * @return the DoctorName
     */
    public String getDoctorName() {
        return DoctorName;
    }

    /**
     * @return the Qualification
     */
    public String getQualification() {
        return Qualification;
    }

   

    /**
     * @return the dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param DoctorName the DoctorName to set
     */
    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    /**
     * @param Qualification the Qualification to set
     */
    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    /**
     * @param Spaclization the Spaclization to set
     */
    public void setSpaclization(String Spaclization) {
        this.Spaclization = Spaclization;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * @return the Spaclization
     */
    public String getSpaclization() {
        return Spaclization;
    }

    /**
     * @return the Time
     */
    public String getTime() {
        return Time;
    }
    
    
    
}
