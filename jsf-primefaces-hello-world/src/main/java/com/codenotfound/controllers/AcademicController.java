package com.codenotfound.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.codenotfound.model.Academic;
import com.codenotfound.services.AcademicService;

@Named
public class AcademicController {

  private String firstName = "John";
  private String lastName = "Doe";
  
//  private AcademicService AcademicService = new  AcademicService();
  private List<Academic> listaAcademic = new ArrayList<Academic>();
  
  @Inject
  private AcademicService academicService;

  @PostConstruct
  public void init(){
    this.listaAcademic = academicService.getAcademicList();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
    Academic s = new Academic();
    s.setNombre(firstName + " " + lastName);
    this.listaAcademic.add(s);
    return "Hello " + firstName + " " + lastName + "!";
  }

    /**
     * @return List<Academic> return the listaAcademic
     */
    public List<Academic> getListaAcademic() {
        return listaAcademic;
    }

  

}
