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
public class patientInformation{
    public static int pre = -1;
    private String PatientName;
    private String UserName;
    private String Pass;
    private String Cont;
    private String Add;
    private String Birth;

    public patientInformation(String PatientName, String UserName, String Pass, String Cont, String Add, String Birth) {
        this.PatientName = PatientName;
        this.UserName = UserName;
        this.Pass = Pass;
        this.Cont = Cont;
        this.Add = Add;
        this.Birth = Birth;
    }

    /**
     * @return the PatientName
     */
    public String getPatientName() {
        return PatientName;
    }

    /**
     * @param PatientName the PatientName to set
     */
    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the Pass
     */
    public String getPass() {
        return Pass;
    }

    /**
     * @param Pass the Pass to set
     */
    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    /**
     * @return the Cont
     */
    public String getCont() {
        return Cont;
    }

    /**
     * @param Cont the Cont to set
     */
    public void setCont(String Cont) {
        this.Cont = Cont;
    }

    /**
     * @return the Add
     */
    public String getAdd() {
        return Add;
    }

    /**
     * @param Add the Add to set
     */
    public void setAdd(String Add) {
        this.Add = Add;
    }

    /**
     * @return the Birth
     */
    public String getBirth() {
        return Birth;
    }

    /**
     * @param Birth the Birth to set
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }
    
    
    
    
}
