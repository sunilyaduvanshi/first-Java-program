package com.spring.com;
public class Employee {
private int id;
private String name;
private Address address;
 PersonalInfo  pinfo;
public Employee() {
super();
}
public Employee(int id, String name, Address address, PersonalInfo pinfo) {
super();
this.id = id;
this.name = name;
this.address = address;
this.pinfo=pinfo;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}

public PersonalInfo getPinfo() {
	return pinfo;
}
public void setPinfo(PersonalInfo pinfo) {
	this.pinfo = pinfo;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", pinfo=" + pinfo + "]";
}


}
