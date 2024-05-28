package cr.ac.ucenfotec.misia.visa_ai.egpav.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VisaFormDto {

    private String name;
    private int age;
    private String sex;
    private String birthCountry;
    private String residenceCountry;
    private String maritalStatus;
    private int numberOfChildren;
    private String passportCountry;
    private String nationality;
    private String primaryOccupation;
    private double monthlyIncome;
    private int ownedProperties;
    private int ownedVehicles;
    private double bankAccountBalance;
    private double creditcardDebt;
    private String spousePrimaryOccupation;
    private double spouseMonthlyIncome;
    private int spouseAge;
    private String spouseBirthCountry;
    private String spouseResidenceCountry;
    private String spouseNationality;
    private int livingParents;
    private String fatherBirthCountry;
    private String fatherResidenceCountry;
    private String fatherPrimaryOccupation;
    private String motherBirthCountry;
    private String motherResidenceCountry;
    private String motherPrimaryOccupation;
    private String tripPurpose;
    private String tripCompanion;
    private int tripDuration;
    private boolean selfTripPayer = false;
    private String relationToTripPayer;
    private String countriesVisited;
    private String lastAcademicDegree;
    private String visaType;
    private boolean visaPreviouslyGranted = false;
    private boolean visaPreviouslyDenied = false;
    private int directFamilyMembersInUS;
    private int inderectFamilyMembersInUS;
    private boolean previousVisitToUS = false;
    private int lastVisitDays;
}
