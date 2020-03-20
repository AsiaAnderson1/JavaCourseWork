/*Create job applicant class 
 */
package com.mycompany.first_last_jobapplicant;

/**
 *
 * @author Asia
 */
public class JobApplicant {
        
private String name;
private String phone;
private boolean hasWordSkills;
private boolean hasSpreadsheetSkills;
private boolean hasDatabaseSkills;
private boolean hasGraphicSkills;

    public JobApplicant(String name, String phone, boolean hasWordSkills, boolean hasSpreadsheetSkills, boolean hasDatabaseSkills, boolean hasGraphicSkills) {
        this.name = name;
        this.phone = phone;
        this.hasWordSkills = hasWordSkills;
        this.hasSpreadsheetSkills = hasSpreadsheetSkills;
        this.hasDatabaseSkills = hasDatabaseSkills;
        this.hasGraphicSkills = hasGraphicSkills;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isHasWordSkills() {
        return hasWordSkills;
    }

    public boolean isHasSpreadsheetSkills() {
        return hasSpreadsheetSkills;
    }

    public boolean isHasDatabaseSkills() {
        return hasDatabaseSkills;
    }

    public boolean isHasGraphicSkills() {
        return hasGraphicSkills;
    }


    
}
