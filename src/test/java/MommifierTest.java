import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
     @Test
    public void isNullOfString(){
         //Givn
         Mommifier mommifier = new Mommifier();
         String strIsNull=null;
         //When
         String result = mommifier.check(strIsNull);
         //Then
         assertEquals(null, result);
     }
     @Test
    public void notContainVowels(){
         //Givn
         Mommifier mommifier = new Mommifier();
         String strOfNotContainVowels="sky";
         //When
         String result = mommifier.check(strOfNotContainVowels);
         //Then
         assertEquals("sky", result);
     }
    @Test
    public void containVowelsLessThanThirtyPercent(){
        //Givn
        Mommifier mommifier = new Mommifier();
        String strOfContainVowelsLessThanThirtyPercent="girl";
        //When
        String result = mommifier.check(strOfContainVowelsLessThanThirtyPercent);
        //Then
        assertEquals("girl", result);
    }
    @Test
    public void containVowelsMoreessThanThirtyPercent(){
        //Givn
        Mommifier mommifier = new Mommifier();
        String strOfContainVowelsMoreessThanThirtyPercent="keep";
        //When
        String result = mommifier.check(strOfContainVowelsMoreessThanThirtyPercent);
        //Then
        assertEquals("kemommyep", result);
    }

}
