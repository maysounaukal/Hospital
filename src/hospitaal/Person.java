package hospitaal;

public class Person {
public String title;
public FullName name;
public String homeAddress;
public Gender gender;
public String name1;

public Person(Gender gender, String name1) {
	this.gender = gender;
	this.name1 = name1;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public FullName getName() {
	return name;
}
public void setName(FullName name) {
	this.name = name;
}
public String getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(String homeAddress) {
	this.homeAddress = homeAddress;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Person [title=" + title + ", name=" + name + ", homeAddress=" + homeAddress + ", gender=" + gender + "]";
}



}
