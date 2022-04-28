public class Wrapper {
    public static String wrap(String sText, int nColumns) {
        if(sText==null || sText.equals("")){
            return "";
        }
        if(sText.length()>nColumns){
            int wrapIndex = sText.lastIndexOf(" ");
            if(wrapIndex!=-1){
                return sText.substring(0,wrapIndex)+ "\n" + sText.substring(wrapIndex+1);
            }
            return sText.substring(0,nColumns)+ "\n" + sText.substring(nColumns);
        }
        return sText;
    }
}
