package oops_concept;

public class Access_specifier_parent
{
 public void public_specifier()
 {
  System.out.println("Available @ all place");	 
 }
 private void private_specifier()
 {
  System.out.println("Available only within the class"); 
 }
 void default_specifier()
 {
  System.out.println("Available within the package");	 
 }
 protected void protected_specifier()
 {
  System.out.println("Available within class, if extended avail within package");	 
 }
}