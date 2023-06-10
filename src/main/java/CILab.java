public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String upper = myString.toUpperCase();
        String lower = myString.toLowerCase();

        if (myString.charAt(0) == lower.charAt(0))
            return true;

        if(myString.equals(upper)) {
            return true;
        }

        if(myString.equals(lower))
            return true;
        
        return false;
    }

}

