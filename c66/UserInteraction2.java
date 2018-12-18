import java.util.Scanner;
class PhoneEntry
{
  private String name;    // name of a person
  private String phone;   // their phone number

  public PhoneEntry( String n, String p )
  {
    name = n; phone = p;
  }
  
  public String getName()  {return name;}
  public String getPhone() {return phone;}
}

class PhoneBook
{ 
  private PhoneEntry[] phoneBook; 

  public PhoneBook()    // constructor
  {
    phoneBook = new PhoneEntry[ 7 ] ;

    phoneBook[0] = new PhoneEntry( "James Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Grace Dunbar", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Paul Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Violet Smith", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry( "John Wood", "(913) 883-2874" );
    phoneBook[5] = new PhoneEntry( "John Smith", "(812) 339-4916" );
    phoneBook[6] = new PhoneEntry( "Willoughby Smith", "(312) 992-8761" );

  }

  public PhoneEntry search( String targetName )  
  {
    targetName =   targetName.toUpperCase();
    for ( int j=0; j < phoneBook.length; j++ )
    {
      if ( phoneBook[ j] != null && phoneBook[ j ].getName().toUpperCase().equals( targetName ) )
        return phoneBook[ j ];
    }

    return null;
  }
public PhoneEntry searchLastName( String targetName )  
{
  int nameLength= 0;
  targetName =   targetName.toUpperCase();
  for ( int j=0; j < phoneBook.length; j++ )
  {
    int length = phoneBook[j].getName().length();
    for(int i = 0; i <= phoneBook[j].getName().length(); i ++){
      if(phoneBook[ j ].getName().charAt(i) == ' '){
        nameLength = i + 1;
        i = i + phoneBook[j].getName().length();
      }
      }
    if(  phoneBook[ j ].getName().toUpperCase().substring(nameLength, length).equals( targetName ) ){
      System.out.println( phoneBook[ j ]);
    }
  }

  return null;
}
public PhoneEntry searchFirstName( String targetName )  
{
  int nameLength= 0;
  targetName =   targetName.toUpperCase();
  for ( int j=0; j < phoneBook.length; j++ )
  {
    for(int i = 0; i <= phoneBook[j].getName().length(); i ++){
      if(phoneBook[ j ].getName().charAt(i) == ' '){
        nameLength = i;
        i = i + phoneBook[j].getName().length();
      }
     }
    
    if ( phoneBook[ j ].getName().toUpperCase().substring(0, nameLength).equals( targetName ) )
      System.out.println(phoneBook[ j]);
  }

  return null;
}
}


public class UserInteraction2
{
  public static void main ( String[] args )
  {
    
    System.out.println("Last Name?" );
      Scanner scan = new Scanner(System.in);
      String lastNameTarget = scan.nextLine();
      System.out.println("First Name?" );
      if(lastNameTarget.equals( "?")){
      }
      String firstNameTarget = scan.nextLine();
    PhoneBook pb = new PhoneBook();  
    PhoneEntry entry = null;
    // search for "Violet Smith"
    if( lastNameTarget != "?" && firstNameTarget.equals("?")){
      System.out.println("Last");
        entry = pb.searchLastName( lastNameTarget );
    }
    else if( firstNameTarget != "?" && lastNameTarget.equals("?")){
      System.out.println("First");
       entry = pb.searchFirstName( firstNameTarget );
    }
    else{
      if( firstNameTarget != "?" && lastNameTarget != "?"){
      System.out.println("Both");
        entry = pb.search( firstNameTarget + " " + lastNameTarget ); 
      }
    }
    
    if ( entry != null ){
      System.out.println( entry.getName() + ": " + entry.getPhone() );
    }else{
      System.out.println("Name not found" );
    }
  }
}


/*
60  All √
61  1-6 9-10 √
62  Chapter Notes
63  1-3
64  Quiz & Chapter Notes
65  Quiz & Chapter Notes
66  1-3, 5  <--- on 2 almost 3
67  1-6
NO 68
*/