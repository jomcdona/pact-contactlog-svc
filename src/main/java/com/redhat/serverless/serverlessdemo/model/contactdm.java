package com.redhat.serverless.serverlessdemo.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity // This tells Hibernate to make a table out of this class
@Data // Lombok: adds getters and setters
@Table(name = "contactlst")
public class contactdm
{
  public contactdm(int mmid1, int mmid2, int gpsloc, String city, String state, String country)
  {
     this.mmid1 = mmid1;
     this.mmid2 = mmid2;
     this.gpsloc = gpsloc;
     this.city = city;
     this.state = state;
     this.country = country;
  }
  
  public contactdm()
  {
  }

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  @Column(name = "mmid1")
  private int mmid1;
  @Column(name = "mmid2")
  private int mmid2;
  @Column(name = "gpsloc")
  private int gpsloc;
  @Column(name = "city")
  private String city;
  @Column(name = "state")
  private String state;
  @Column(name = "country")
  private String country;
}
