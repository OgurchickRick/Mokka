package models.responseModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObjectModel {
    public Boolean isHourlyPayment;
    public String city;
    public String softlineEmail;
    public Integer legalEntityId;
    public Integer externalRankId;
    public Boolean isRentViewer;
    public Boolean isStaffCoordinator;
    public Boolean isSaleManager;
    public Boolean isServiceAgreement;
    public Boolean isNotParticipateWorkActivities;
    public String gosNums;
    public String uuid;
    public Integer id;
    public Boolean isCertificateManager;
    public Boolean isStudentCurator;
    public String dateOfReviseHolidays;
    public Boolean isContentEditor;
    public Boolean isHRManager;
    public Boolean isCommonEmployee;
    public Boolean isProjectManager;
    public Boolean isTestManager;
    public Boolean isInternalEmployee;
    public String kindOfActivity;
    public Boolean isGroupManager;
    public Boolean isDeputyingEmployee;
    public Integer gradeId;
    public String phoneNumber;
    public Integer positions;
    public Boolean isDepartmentManager;
    public String phoneConfirmationDate;
    public String itn;
    public Integer numberOfVacationDays;
    public String skype;
    public Boolean isVisiblePrivateData;
    public String sid;
    public Boolean isExternalUser;
    public Boolean isStudent;
    public Boolean isShiftWork;
    public Boolean isNoMentorRequired;
    public Boolean isRemoteWork;
    public Integer genderId;
    public Boolean isAdmin;
    public Boolean isSwitchedOn;
    public String patronymic;
    public String dateOfBirth;
    public String login;
    public String email;
    public Integer workTime;
    public Integer kindOfActivityId;
    public Integer mentorId;
    public Boolean isDismissed;
    public Boolean isDeleted;
    public String lastName;
    public String firstName;
    public String employmentDate;
    public Integer employeeId;
    public Boolean isSupportManager;
    public UserTokenModel userTokenModel;
}

