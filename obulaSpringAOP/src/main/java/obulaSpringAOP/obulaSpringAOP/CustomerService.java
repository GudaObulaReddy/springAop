package obulaSpringAOP.obulaSpringAOP;

public class CustomerService {
private String name;
private String url;

public CustomerService() {
	super();
}

public CustomerService(String name, String url) {
	super();
	this.name = name;
	this.url = url;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void printName()
{
	System.out.println("Customer Name:"+this.name);
}
public void printURL()
{
	System.out.println("Customer url:"+this.url);
}
public void printThrowSxception()
{
	System.out.println("exception occured");
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}

@Override
public String toString() {
	return "CustomerService [name=" + name + ", url=" + url + "]";
}

}
