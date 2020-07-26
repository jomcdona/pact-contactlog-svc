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
  public contactdm(int mmid1, int mmid2, int gpsloc, String city, String state, String country) {
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
  @GeneratedValue(strategy = GenerationType.AUTO)
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

  /**
   * @return the mmid1
   */
  public int getMmid1() {
      return mmid1;
  }

  /**
   * @param mmid1 the mmid1 to set
   */
  public void setMmid1(int mmid1) {
      this.mmid1 = mmid1;
  }

  /**
   * @return the mmid2
   */
  public int getMmid2() {
      return mmid2;
  }

  /**
   * @param mmid2 the mmid2 to set
   */
  public void setMmid2(int mmid2) {
      this.mmid2 = mmid2;
  }

  /**
   * @return the gpsloc
   */
  public int getGpsloc() {
      return gpsloc;
  }

  /**
   * @param gpsloc the gpsloc to set
   */
  public void setGpsloc(int gpsloc) {
      this.gpsloc = gpsloc;
  }

  /**
   * @return the city
   */
  public String getCity() {
      return city;
  }

  /**
   * @param city the city to set
   */
  public void setCity(String city) {
      this.city = city;
  }

  /**
   * @return the state
   */
  public String getState() {
      return state;
  }

  /**
   * @param state the state to set
   */
  public void setState(String state) {
      this.state = state;
  }

  /**
   * @return the country
   */
  public String getCountry() {
      return country;
  }

  /**
   * @param country the country to set
   */
  public void setCountry(String country) {
      this.country = country;
  }
  
  public String toString()
  {
      return this.toString();
  }
  /**
   * @param mmid1
   */
  
}
