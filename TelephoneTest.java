import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneTest {

    @org.junit.jupiter.api.Test
    void isFormatted() {
        String goodNumber = "(570)267-4492";
        Telephone tele = new Telephone();
        assertTrue(tele.isFormatted(goodNumber));
      }

      @Test
    void bulkIsFormatted(){
        String[] numbers = new String[]{"5702674492","(570)267-4492", "(12)3456-7890", "123(456)789-0", "1-2-3-4-5-6-7-8-9-0"};
        //Success Array has correct answers
        Boolean[] success = new Boolean[]{false,true,false,false,false};
        Boolean[] results = new Boolean[5];
        Telephone tele = new Telephone();
//        This For loop runs each number through the method and stores the responses in the results array
        for(int x = 0; x<5;x++){
            results[x] = tele.isFormatted(numbers[x]);
            System.out.println(numbers[x] + " is Formatted Correctly :" + results[x]);
        }
        assertArrayEquals(success, results);
      }

      @Test
    void format(){
        Telephone tele = new Telephone();
          String[] numbers = new String[]{"5702674492","(570)267-4492", "(12)3456-7890", "123(456)789-0", "1-2-3-4-5-6-7-8-9-0"};
          String[] formattedNumbers = new String[]{"(570)267-4492","(570)267-4492","(123)456-7890", "(123)456-7890", "(123)456-7890"};
          String[] results = new String[5];
          for(int i = 0; i<5;i++){
              results[i] = tele.format(numbers[i]);
              System.out.println(tele.format(numbers[i]));
          }
          assertArrayEquals(formattedNumbers,results);
    }


}