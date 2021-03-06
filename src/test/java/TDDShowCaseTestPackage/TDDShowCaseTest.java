package TDDShowCaseTestPackage;

import TDDShowCasePackage.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TDDShowCaseTest {

    TDDShowcase myTDDShowCase = new TDDShowcase();

    @Test
    public void TDDShowCase_1(){
        System.out.println("Das ist der erste Test");
        assertTrue(true);
    }

    @Test
    public void TDDShowCase_2(){
        System.out.println("Das ist der zweite Test");
        assertTrue(true);
    }

}

