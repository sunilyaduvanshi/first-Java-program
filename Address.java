package com.spring.com;
public class Address {
private String street1;
private String street2;
private String street3;
private String district;
private String state;
private String pin;
public Address() {
super();
}
public Address(String street1, String street2, String street3, String district, String state, String pin) {
super();
this.street1 = street1;
this.street2 = street2;
this.street3 = street3;
this.district = district;
this.state = state;
this.pin = pin;
}
public String getStreet1() {
return street1;
}
public void setStreet1(String street1) {
this.street1 = street1;
}
public String getStreet2() {
return street2;
}
public void setStreet2(String street2) {
this.street2 = street2;
}
public String getStreet3() {
return street3;
}
public void setStreet3(String street3) {
this.street3 = street3;
}
public String getDistrict() {
return district;
}
public void setDistrict(String district) {
this.district = district;
}
public String getState() {
return state;
}
public void setState(String state) {
this.state = state;
}
public String getPin() {
return pin;
}
public void setPin(String pin) {
this.pin = pin;
}
@Override
public String toString() {
return "Address [street1=" + street1 + ", street2=" + street2 + ", street3=" + street3 + ", district=" + district
+ ", state=" + state + ", pin=" + pin + "]";
}
}
Changes
