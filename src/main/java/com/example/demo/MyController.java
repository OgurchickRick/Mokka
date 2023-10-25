package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import models.requestModel.UserRequestModel;
import models.responseModel.ObjectModel;
import models.responseModel.UserModel;
import models.responseModel.UserTokenModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @PostMapping("/data")
    public ResponseEntity<Object> getMyData(@RequestBody UserRequestModel request) throws JsonProcessingException {
        UserModel json = UserModel.builder()
                .isSuccess(true)
                .object(ObjectModel.builder()
                        .isHourlyPayment(false)
                        .city("Кострома")
                        .softlineEmail("soft@email.ru")
                        .legalEntityId(2)
                        .externalRankId(2)
                        .isRentViewer(false)
                        .isStaffCoordinator(false)
                        .isSaleManager(false)
                        .isServiceAgreement(false)
                        .isNotParticipateWorkActivities(false)
                        .gosNums("XXXXXXX")
                        .uuid("рандомный uuid")
                        .id(999)
                        .isCertificateManager(false)
                        .isStudentCurator(true)
                        .dateOfReviseHolidays("2023-09-01")
                        .isContentEditor(false)
                        .isHRManager(false)
                        .isCommonEmployee(true)
                        .isProjectManager(false)
                        .isTestManager(false)
                        .isInternalEmployee(false)
                        .kindOfActivity("Отдел")
                        .isGroupManager(false)
                        .isDeputyingEmployee(false)
                        .gradeId(0)
                        .phoneNumber("+7 999 999 9999")
                        .positions(85)
                        .isDepartmentManager(false)
                        .phoneConfirmationDate("2023-07-07")
                        .itn("440118746333")
                        .numberOfVacationDays(27)
                        .skype("skype")
                        .isVisiblePrivateData(true)
                        .sid("S-1-5-21-3214324325-624373001-229021696-39535")
                        .isExternalUser(false)
                        .isStudent(false)
                        .isShiftWork(false)
                        .isNoMentorRequired(false)
                        .isRemoteWork(false)
                        .genderId(1)
                        .isAdmin(false)
                        .isSwitchedOn(true)
                        .patronymic("")
                        .dateOfBirth("2004-09-17")
                        .login("login")
                        .email("email@example.com")
                        .workTime(8)
                        .kindOfActivityId(14)
                        .mentorId(0)
                        .isDismissed(false)
                        .isDeleted(false)
                        .lastName("Дербин")
                        .firstName("Артем")
                        .employmentDate("2023-25-10")
                        .employeeId(0)
                        .isSupportManager(false)
                        .userTokenModel(UserTokenModel.builder()
                                .expiration("1698860900936")
                                .isDeleted(false)
                                .tokenInfo("sdfsdgerghrthjti76b2d711a90778cfec1b2618544656755f1")
                                .employeeId(1312)
                                .tokenId(235650)
                                .build())
                        .build())
                .build();
        if(!request.getLogin().isEmpty() && !request.getPassword().isEmpty()){
            return ResponseEntity.ok(json);
        }else {
            return ResponseEntity.badRequest().build();
        }
    }
}






