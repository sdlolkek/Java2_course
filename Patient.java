/**
 File name: Patient.java
 
 Class that extends Person class by adding a Social
 Security Number and appropriate construtors, accessors, and mutators.
 
 
 */
public class Patient extends Person
{
    private String name;
    private String ssn; // Social security number (3-2-4 format preferred)
    
    /**
     Create a Patient with a default name and a default social security number. The default Ssn is '000-00-0000'
     */
    public Patient() {
        super();
        setSsn("000-00-0000");
    }
    
    /**
     Create a Patient with name <it>aName</it> and and the default social security number '000-00-0000'
     @param aName the name of the patient
     */
    public Patient (String aName)  {
        super(aName);
        setSsn("000-00-0000");
    }
    
    /**
     Create a Patient with name <it>aName</it> and social security number <it>aSsn</it>
     @param aName the name of the patient
     @param aSsn the social security number
     */
    public Patient (String aName, String aSsn) {
        super(aName);
        setSsn(aSsn);
    }
    
    /**
     Get a string representation of this Patient.
     @return a string representation of this Patient
     */
    public String toString()  {
        return super.toString()+";Ssn: "+ssn;
    }
    
    /**
     Set the social security number of this Patient to <it>newSsn</it>
     @param newSsn The new social security number of this Patient.
     */
    public void setSsn(String newSsn) {
        ssn = newSsn;
    }
    
    /**
     Get the social security number of this Patient.
     @return the social security number of this Patient.
     */
    public String getSsn() {
        return ssn;
    }
    
    /**
     Determine if this Patient is equal to <it>otherObj</it>.
     @param otherObj the object to determine equality with
     @return true if this Patient is equal to otherObj, false otherwise
     */
    public boolean equals(Object otherObj) {
        if (otherObj == null) {
            return false;
        }
        if (getClass() != otherObj.getClass()) {
            return false;
        }
        
        Patient aPatient = (Patient) otherObj;
        return(super.equals(aPatient)
                   && this.ssn.equalsIgnoreCase(aPatient.getSsn()));
    }
    
    public static boolean isValidSsn(String aSsn) {
      if(aSSn.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]")) {
        return true;
      }
      else {
        return false;
      }
    }
}