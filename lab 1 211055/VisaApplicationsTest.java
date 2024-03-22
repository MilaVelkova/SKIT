import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class VisaApplicationsTest {

    @Test
    //Test 1 Base choice
    public void test1(){
        List<String> ukVisaApplication = Arrays.asList("x1", "x2", "x3", "x4");
        List<String> usaVisaApplication = Arrays.asList("x2","x3","x4", "x5");

        List<String> commonApplications = VisaApplications.applicantsForBothVisas(ukVisaApplication, usaVisaApplication);
        assertEquals(Arrays.asList("x2", "x3", "x4"), commonApplications);
    }
    @Test
    //Test 2 uk=null
    public void test2(){
        assertThrows(NullPointerException.class, () ->{
            VisaApplications.applicantsForBothVisas(null, Arrays.asList("x1", "x2"));
        });
    }
    @Test
    //Test 3 usa=null
    public void test3(){
        assertThrows(NullPointerException.class, () ->{
            VisaApplications.applicantsForBothVisas(Arrays.asList("x1", "x2"), null);
        });
    }
    @Test
    //Test 4 uk=[ ]
    public void test4(){
        List<String> ukVisaApplications = new ArrayList<>();
            assertNull(VisaApplications.applicantsForBothVisas(ukVisaApplications, Arrays.asList("x1", "x2")));
    }
    @Test
    //Test 5 usa=[ ]
    public void test5(){
        List<String> usaVisaApplications = new ArrayList<>();
        assertNull(VisaApplications.applicantsForBothVisas(Arrays.asList("x1", "x2"), usaVisaApplications));
    }
    @Test
    //Test 6
    public void test6(){
        List<String> ukVisaApplication = Arrays.asList("x1", "x2", "x3");
        List<String> usaVisaApplication = Arrays.asList("x4","x5","x6");

        assertNull(VisaApplications.applicantsForBothVisas(ukVisaApplication, usaVisaApplication));
    }
}
