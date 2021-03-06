public class Address
{
private String streetAddress;
private String city;
private String state;
private String zip;
public Address()
{
streetAddress = "";
city = "";
state = "";
zip = "";
}
public Address(String sAddress, String c, String s, String z)
{
streetAddress = sAddress;
city = c;
state = s;
zip = z;
}
public void print()
{
System.out.println(streetAddress);
System.out.println(city + ", " + state + " - " + zip);
}
public String toString()
{
return (streetAddress + "\n" + city + ", " + state + " - " + zip);
}
public void setAddress(String sAddress, String c, String s, String z)
{
streetAddress = sAddress;
city = c;
state = s;
zip = z;
}
public String getStreetAddress()
{
return streetAddress;
}
public String getCity()
{
return city;
}
public String getState()
{
return state;
}
public String getZip()
{
return zip;
}
public void copyAddress(Address otherAddress)
{
streetAddress = otherAddress.streetAddress;
city = otherAddress.city;
state = otherAddress.state;
zip = otherAddress.zip;
}
}