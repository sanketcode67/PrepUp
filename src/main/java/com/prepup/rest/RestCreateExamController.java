
 package com.prepup.rest;
 
 import java.sql.Date;
 
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.web.bind.annotation.PostMapping; import
  org.springframework.web.bind.annotation.RequestBody; import
  org.springframework.web.bind.annotation.RestController;
  
  import com.prepup.dao.ClassDetailsDao; import
  com.prepup.model.CreateClassDetails; import
  com.prepup.model.CreateExamDetails; import com.prepup.rest.model.Status;
  
  import com.prepup.service.ClassDetailsService; import
  com.prepup.service.ExamDetailsService; impoilsVO;rt com.prepup.vo.ExamDeta
  
  @RestController public class RestCreateExamController {
 
  
  
  @Autowired ExamDetailsService examDetailsService;
  
  
  @PostMapping("rest/createexam") public Status createClass(@RequestBody
  CreateExamDetails createExamDetails) { Boolean
  status=examDetailsService.createExam(createExamDetails); Status s = new
  Status(); if(status==true) { s.setStatus_code(200);
  s.setMessage("Your exam is created"); } else { s.setStatus_code(400);
  s.setMessage("Class creation failed"); } // CreateExamDetails cde =new
  CreateExamDetails(); // cde.seteName("Python Mock test -1"); //
  cde.setClassId("C8657"); // cde.setDate(Date.valueOf("2020-10-31")); //
  
  return s; } }
 
