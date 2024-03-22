import java.util.ArrayList;
import java.util.List;

public class VisaApplications {

    public static List<String> applicantsForBothVisas(List<String> ukVisaApplications,
                                                      List<String> usaVisaApplications){
        if (ukVisaApplications == null || usaVisaApplications == null){

            throw new NullPointerException("ukVisaApplications or usaVisaApplications can't be null");
        }

        List<String> commonApplicants = new ArrayList<>(ukVisaApplications);
        commonApplicants.retainAll(usaVisaApplications);

        return commonApplicants.isEmpty() ? null : commonApplicants;

    }
}