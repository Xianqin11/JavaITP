package de.tum.cit.ase;

import java.util.Date;

/**
 * Represents a conviction. Contains the date of the conviction and the description of the crime, and also a custom
 * <code>toString</code> method which returns a string in the format of:<br>
 * <blockquote><pre>
 *     Convicted on <code>dateOfConviction</code> for <code>crimeDescription</code>
 * </pre></blockquote>
 */
public class Conviction {

    private Date dateOfConviction;
    private String crimeDescription;

    /**
     * Creates a new <code>Conviction</code> with the given date of conviction and the crime description
     * @param dateOfConviction a <code>Date</code> object representing the date of the conviction
     * @param crimeDescription a <code>String</code> with the description of the crime
     */
    public Conviction(Date dateOfConviction, String crimeDescription) {
        this.dateOfConviction = dateOfConviction;
        this.crimeDescription = crimeDescription;
    }

    public Date getDateOfConviction() {
        return dateOfConviction;
    }

    public void setDateOfConviction(Date dateOfConviction) {
        this.dateOfConviction = dateOfConviction;
    }

    public String getCrimeDescription() {
        return crimeDescription;
    }

    public void setCrimeDescription(String crimeDescription) {
        this.crimeDescription = crimeDescription;
    }

    /**
     * Returns a string with the format of:
     * <blockquote><pre>
     *     Convicted on <code>dateOfConviction</code> for <code>crimeDescription</code>
     * </pre></blockquote>
     */
    @Override
    public String toString() {
        return "Convicted on " + dateOfConviction + " for " + crimeDescription;
    }
}
