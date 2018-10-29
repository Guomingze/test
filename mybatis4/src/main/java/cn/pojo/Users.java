package cn.pojo;


import java.util.List;

public class Users {

  private Integer uid;
  private String uname;
  private String upassword;
  private Integer usex;
  private String uphone;
  private String udelivery;
  private Integer ubalance;
  private Integer ustate;
  private Integer unumber;
  private String u1;
  private String u2;
  private String u3;
  private List<Site> siteList;

  public List<Site> getSiteList() {
    return siteList;
  }

  public void setSiteList(List<Site> siteList) {
    this.siteList = siteList;
  }

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getUpassword() {
    return upassword;
  }

  public void setUpassword(String upassword) {
    this.upassword = upassword;
  }

  public Integer getUsex() {
    return usex;
  }

  public void setUsex(Integer usex) {
    this.usex = usex;
  }

  public String getUphone() {
    return uphone;
  }

  public void setUphone(String uphone) {
    this.uphone = uphone;
  }

  public String getUdelivery() {
    return udelivery;
  }

  public void setUdelivery(String udelivery) {
    this.udelivery = udelivery;
  }

  public Integer getUbalance() {
    return ubalance;
  }

  public void setUbalance(Integer ubalance) {
    this.ubalance = ubalance;
  }

  public Integer getUstate() {
    return ustate;
  }

  public void setUstate(Integer ustate) {
    this.ustate = ustate;
  }

  public Integer getUnumber() {
    return unumber;
  }

  public void setUnumber(Integer unumber) {
    this.unumber = unumber;
  }

  public String getU1() {
    return u1;
  }

  public void setU1(String u1) {
    this.u1 = u1;
  }

  public String getU2() {
    return u2;
  }

  public void setU2(String u2) {
    this.u2 = u2;
  }

  public String getU3() {
    return u3;
  }

  public void setU3(String u3) {
    this.u3 = u3;
  }
}
