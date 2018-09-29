///////////////////////////////////////////////////////////////////////////////
// File: ItemType.java
// By:   Greening, Zachary
// Date: September 28, 2018
// Description: An enumerator for the class of item (ie a type of audio for
//      music)
//
///////////////////////////////////////////////////////////////////////////////

package ProductionLine;


public enum ItemType {
    NA,     //Not Assigned
    AU,     //Audio
    VI,     //Visual
    AM,     //AudioMobile
    VM;     //VisualMobile


    /**
     * Overrides toString to return the full name of the Item code
     * rather than the two letter code.
     *
     * @return full name for the two letter Item Code
     */
    @Override
    public String toString() {
        String returnValue;

        if (ordinal() == NA.ordinal())
            returnValue = "Not Assigned";
        else if (ordinal() == AU.ordinal())
            returnValue = "Audio";
        else if (ordinal() == VI.ordinal())
            returnValue = "Visual";
        else if (ordinal() == AM.ordinal())
            returnValue = "Audio Mobile";
        else if (ordinal() == VM.ordinal())
            returnValue = "Visual Mobile";
        else
            returnValue = "Unrecognized Type";

        return returnValue;
    }
}