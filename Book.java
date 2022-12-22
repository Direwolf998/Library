class Book{
private String pulName;
private String auName;
private String bookName;
private int isbcNum;
public String getpulName()
{
	return pulName;
}
public void setpulName(String pulName)
{
this.pulName=pulName;
}
public String getauName()
{
	return auName;
}
public void setauName(String auName)
{
this.auName=auName;
}
public String getbookName()
{
	return bookName;
}
public void setbookName(String bookName)
{
this.bookName=bookName;
}
public int getisbcNum()
{
return isbcNum;
}
public void setisbcNum(int isbcNum)
{
this.isbcNum=isbcNum;
}}
class McGrawhill extends Book{
	
}
class Packt extends Book{
}
class MainBook{
public static void main(String... args)
{
Book bk=new Book();
Packt pt= new Packt();
McGrawhill mg= new McGrawhill();

mg.setpulName("prakash");
mg.setauName("Laksh");
mg.setbookName("crime novel");
mg.setisbcNum(1111998);
System.out.println("\nFrom McGrawhill");
System.out.println("Publisher Name : "+mg.getpulName());
System.out.println("Author Name: "+mg.getauName());
System.out.println("From McGrawhill isbc: "+mg.getisbcNum());
System.out.println("From McGrawhill isbc: "+mg.getbookName());

System.out.println("\nFrom Packt");

pt.setpulName("Prakash");
pt.setauName("Laksh");
pt.setbookName("crime novel");
pt.setisbcNum(1111998);
System.out.println("Publisher Name : "+pt.getpulName());
System.out.println("Author Name: "+pt.getauName());
System.out.println("From McGrawhill isbc: "+pt.getisbcNum());
System.out.println("From McGrawhill isbc: "+pt.getbookName());

}
}
