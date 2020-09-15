public class Mommifier {

    public String check(String string) {
       if (string == null){
           return null;
       }
       if (string.matches("[^a][^e][^i]|[^o]|[^u]")){
           System.out.println(1);
           return string;
       }
       if (((float)((string.split("[aeiou]").length)-1) / (float) string.length()) < 0.33){
           System.out.println(2);
           return string;
       }
       if (((float)((string.split("[aeiou]").length)-1) / (float) string.length()) > 0.33 && string.matches("[aeiou]{2,}")){
           System.out.println(1);
           if (string.lastIndexOf('e') == string.indexOf('e')+1){
               StringBuffer stringBuffer = new StringBuffer(string);
               check(stringBuffer.insert((string.lastIndexOf('e') + 1), "mommy").toString());
           }
       }

        return null;
    }
}
