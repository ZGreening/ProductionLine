package ProductionLine;


public enum ItemType {
    NA,     //Not Assigned
    AU,     //Audio
    VI,     //Visual
    AM,     //AudioMobile
    VM;     //VisualMobile


    public String toString()
    {
        String returnValue;

        if (ordinal()==NA.ordinal())
            returnValue = "Not Assigned";
        else if (ordinal()==AU.ordinal())
            returnValue = "Audio";
        else if (ordinal()==VI.ordinal())
            returnValue = "Visual";
        else if (ordinal()==AM.ordinal())
            returnValue = "Audio Mobile";
        else if (ordinal()==VM.ordinal())
            returnValue = "Visual Mobile";
        else
            returnValue = "Unrecognized Type";

        return returnValue;
    }
}