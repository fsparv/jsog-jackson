package com.voodoodyne.jackson.jsog;

import java.util.Date;

public class Thing {
  private String name;
  private Date date;
  Thing[] things = new Thing[2];

  public Thing(String name, Date date) {
    this.name = name;
    this.date = date;
    things[0] = this;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Thing[] getThings() {
    return things;
  }

  public void setThings(Thing[] things) {
    this.things = things;
  }
}
