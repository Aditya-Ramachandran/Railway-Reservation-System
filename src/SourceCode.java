/*#Class 'Reservation' to perform the following:
 * Selection of destination from Mumbai
 * Selection of train to that destination
 * Options to perform booking of ticket,cancellation of ticket,checking availability of tickets,Search for passenger and
   his details,displaying the reservation chart of the train.
 */
import java.util.*;
public class Reservation
{//Start of class Reservation
    Scanner obj=new Scanner(System.in);
String name1[]=new String[100];
String name2[]=new String[100];
String name3[]=new String[100];
String name4[]=new String[100];
String name5[]=new String[100];
String name6[]=new String[100];
String name7[]=new String[100];
String name8[]=new String[100];
String name9[]=new String[100];
String name10[]=new String[100];
int age1[]=new int[100];
int age2[]=new int[100];
int age3[]=new int[100];
int age4[]=new int[100];
int age5[]=new int[100];
int age6[]=new int[100];
int age7[]=new int[100];
int age8[]=new int[100];
int age9[]=new int[100];
int age10[]=new int[100];
long pn1[]=new long[100];
long pn2[]=new long[100];
long pn3[]=new long[100];
long pn4[]=new long[100];
long pn5[]=new long[100];
long pn6[]=new long[100];
long pn7[]=new long[100];
long pn8[]=new long[100];
long pn9[]=new long[100];
long pn10[]=new long[100];
int ac1=1,f1=2,s1=2;
int ac2=1,f2=2,s2=2;
int ac3=1,f3=2,s3=2;
int ac4=1,f4=2,s4=2;
int ac5=1,f5=2,s5=2;
int ac6=1,f6=2,s6=2;
int ac7=1,f7=2,s7=2;
int ac8=1,f8=2,s8=2;
int ac9=1,f9=2,s9=2;
int ac10=1,f10=2,s10=2;
String pnr1[]=new String[100];
String pnr2[]=new String[100];
String pnr3[]=new String[100];
String pnr4[]=new String[100];
String pnr5[]=new String[100];
String pnr6[]=new String[100];
String pnr7[]=new String[100];
String pnr8[]=new String[100];
String pnr9[]=new String[100];
String pnr10[]=new String[100];
String class1[]=new String[100];
String class2[]=new String[100];
String class3[]=new String[100];
String class4[]=new String[100];
String class5[]=new String[100];
String class6[]=new String[100];
String class7[]=new String[100];
String class8[]=new String[100];
String class9[]=new String[100];
String class10[]=new String[100];
double tot1[]=new double[100];
double tot2[]=new double[100];
double tot3[]=new double[100];
double tot4[]=new double[100];
double tot5[]=new double[100];
double tot6[]=new double[100];
double tot7[]=new double[100];
double tot8[]=new double[100];
double tot9[]=new double[100];
double tot10[]=new double[100];
String gen1[]=new String[100];
String gen2[]=new String[100];
String gen3[]=new String[100];
String gen4[]=new String[100];
String gen5[]=new String[100];
String gen6[]=new String[100];
String gen7[]=new String[100];
String gen8[]=new String[100];
String gen9[]=new String[100];
String gen10[]=new String[100];
double pac=2000.0,pf=1500.0,ps=1000.0;
int p1=1,p2=1,p3=1,p4=1,p5=1,p6=1,p7=1,p8=1,p9=1,p10=1;
int np1=4,np2=4,np3=4,np4=4,np5=4,np6=4,np7=4,np8=4,np9=4,np10=4;
int z1=4,z2=4,z3=4,z4=4,z5=4,z6=4,z7=4,z8=4,z9=4,z10=4;
public Reservation()
{   name1[0]="K Swaminathan";
    name1[1]="Robin Anderson";
    name1[2]="Mohit Singh";
    name1[3]="Rahul Sharma";
    name1[4]="Ravi Kulkarni";

    name2[0]="K Swaminathan";
    name2[1]="Robin Anderson";
    name2[2]="Mohit Singh";
    name2[3]="Rahul Sharma";
    name2[4]="Ravi Kulkarni";

    name3[0]="K Swaminathan";
    name3[1]="Robin Anderson";
    name3[2]="Mohit Singh";
    name3[3]="Rahul Sharma";
    name3[4]="Ravi Kulkarni";

    name4[0]="K Swaminathan";
    name4[1]="Robin Anderson";
    name4[2]="Mohit Singh";
    name4[3]="Rahul Sharma";
    name4[4]="Ravi Kulkarni";

    name5[0]="K Swaminathan";
    name5[1]="Robin Anderson";
    name5[2]="Mohit Singh";
    name5[3]="Rahul Sharma";
    name5[4]="Ravi Kulkarni";

    name6[0]="K Swaminathan";
    name6[1]="Robin Anderson";
    name6[2]="Mohit Singh";
    name6[3]="Rahul Sharma";
    name6[4]="Ravi Kulkarni";

    name7[0]="K Swaminathan";
    name7[1]="Robin Anderson";
    name7[2]="Mohit Singh";
    name7[3]="Rahul Sharma";
    name7[4]="Ravi Kulkarni";

    name8[0]="K Swaminathan";
    name8[1]="Robin Anderson";
    name8[2]="Mohit Singh";
    name8[3]="Rahul Sharma";
    name8[4]="Ravi Kulkarni";

    name9[0]="K Swaminathan";
    name9[1]="Robin Anderson";
    name9[2]="Mohit Singh";
    name9[3]="Rahul Sharma";
    name9[4]="Ravi Kulkarni";

    name10[0]="K Swaminathan";
    name10[1]="Robin Anderson";
    name10[2]="Mohit Singh";
    name10[3]="Rahul Sharma";
    name10[4]="Ravi Kulkarni";

    age1[0]=11;
    age1[1]=26;
    age1[2]=56;
    age1[3]=4;
    age1[4]=75;

    age2[0]=11;
    age2[1]=26;
    age2[2]=56;
    age2[3]=4;
    age2[4]=75;

    age3[0]=11;
    age3[1]=26;
    age3[2]=56;
    age3[3]=4;
    age3[4]=75;

    age4[0]=11;
    age4[1]=26;
    age4[2]=56;
    age4[3]=4;
    age4[4]=75;

    age5[0]=11;
    age5[1]=26;
    age5[2]=56;
    age5[3]=4;
    age5[4]=75;

    age6[0]=11;
    age6[1]=26;
    age6[2]=56;
    age6[3]=4;
    age6[4]=75;

    age7[0]=11;
    age7[1]=26;
    age7[2]=56;
    age7[3]=4;
    age7[4]=75;

    age8[0]=11;
    age8[1]=26;
    age8[2]=56;
    age8[3]=4;
    age8[4]=75;

    age9[0]=11;
    age9[1]=26;
    age9[2]=56;
    age9[3]=4;
    age9[4]=75;

    age10[0]=11;
    age10[1]=26;
    age10[2]=56;
    age10[3]=4;
    age10[4]=75;


    pn1[0]=31236267;
    pn1[1]=73948763;
    pn1[2]=36408364;
    pn1[3]=57305873;
    pn1[4]=12324904;

    pn2[0]=31236267;
    pn2[1]=73948763;
    pn2[2]=36408364;
    pn2[3]=57305873;
    pn2[4]=12324904;

    pn3[0]=31236267;
    pn3[1]=73948763;
    pn3[2]=36408364;
    pn3[3]=57305873;
    pn3[4]=12324904;

    pn4[0]=31236267;
    pn4[1]=73948763;
    pn4[2]=36408364;
    pn4[3]=57305873;
    pn4[4]=12324904;

    pn5[0]=31236267;
    pn5[1]=73948763;
    pn5[2]=36408364;
    pn5[3]=57305873;
    pn5[4]=12324904;

    pn6[0]=31236267;
    pn6[1]=73948763;
    pn6[2]=36408364;
    pn6[3]=57305873;
    pn6[4]=12324904;

    pn7[0]=31236267;
    pn7[1]=73948763;
    pn7[2]=36408364;
    pn7[3]=57305873;
    pn7[4]=12324904;

    pn8[0]=31236267;
    pn8[1]=73948763;
    pn8[2]=36408364;
    pn8[3]=57305873;
    pn8[4]=12324904;

    pn9[0]=31236267;
    pn9[1]=73948763;
    pn9[2]=36408364;
    pn9[3]=57305873;
    pn9[4]=12324904;

    pn10[0]=31236267;
    pn10[1]=73948763;
    pn10[2]=36408364;
    pn10[3]=57305873;
    pn10[4]=12324904;

    pnr1[0]="PNR001";
    pnr1[1]="PNR001";
    pnr1[2]="PNR001";
    pnr1[3]="PNR001";
    pnr1[4]="PNR001";

    pnr2[0]="PNR001";
    pnr2[1]="PNR001";
    pnr2[2]="PNR001";
    pnr2[3]="PNR001";
    pnr2[4]="PNR001";

    pnr3[0]="PNR001";
    pnr3[1]="PNR001";
    pnr3[2]="PNR001";
    pnr3[3]="PNR001";
    pnr3[4]="PNR001";

    pnr4[0]="PNR001";
    pnr4[1]="PNR001";
    pnr4[2]="PNR001";
    pnr4[3]="PNR001";
    pnr4[4]="PNR001";

    pnr5[0]="PNR001";
    pnr5[1]="PNR001";
    pnr5[2]="PNR001";
    pnr5[3]="PNR001";
    pnr5[4]="PNR001";

    pnr6[0]="PNR001";
    pnr6[1]="PNR001";
    pnr6[2]="PNR001";
    pnr6[3]="PNR001";
    pnr6[4]="PNR001";

    pnr7[0]="PNR001";
    pnr7[1]="PNR001";
    pnr7[2]="PNR001";
    pnr7[3]="PNR001";
    pnr7[4]="PNR001";

    pnr8[0]="PNR001";
    pnr8[1]="PNR001";
    pnr8[2]="PNR001";
    pnr8[3]="PNR001";
    pnr8[4]="PNR001";

    pnr9[0]="PNR001";
    pnr9[1]="PNR001";
    pnr9[2]="PNR001";
    pnr9[3]="PNR001";
    pnr9[4]="PNR001";

    pnr10[0]="PNR001";
    pnr10[1]="PNR001";
    pnr10[2]="PNR001";
    pnr10[3]="PNR001";
    pnr10[4]="PNR001";

    class1[0]="Air Conditioned";
    class1[1]="First Class";
    class1[2]="Sleeper Class";
    class1[3]="First Class";
    class1[4]="Sleeper Class";

    class2[0]="Air Conditioned";
    class2[1]="First Class";
    class2[2]="Sleeper Class";
    class2[3]="First Class";
    class2[4]="Sleeper Class";

    class3[0]="Air Conditioned";
    class3[1]="First Class";
    class3[2]="Sleeper Class";
    class3[3]="First Class";
    class3[4]="Sleeper Class";

    class4[0]="Air Conditioned";
    class4[1]="First Class";
    class4[2]="Sleeper Class";
    class4[3]="First Class";
    class4[4]="Sleeper Class";

    class5[0]="Air Conditioned";
    class5[1]="First Class";
    class5[2]="Sleeper Class";
    class5[3]="First Class";
    class5[4]="Sleeper Class";

    class6[0]="Air Conditioned";
    class6[1]="First Class";
    class6[2]="Sleeper Class";
    class6[3]="First Class";
    class6[4]="Sleeper Class";

    class7[0]="Air Conditioned";
    class7[1]="First Class";
    class7[2]="Sleeper Class";
    class7[3]="First Class";
    class7[4]="Sleeper Class";

    class8[0]="Air Conditioned";
    class8[1]="First Class";
    class8[2]="Sleeper Class";
    class8[3]="First Class";
    class8[4]="Sleeper Class";

    class9[0]="Air Conditioned";
    class9[1]="First Class";
    class9[2]="Sleeper Class";
    class9[3]="First Class";
    class9[4]="Sleeper Class";

    class10[0]="Air Conditioned";
    class10[1]="First Class";
    class10[2]="Sleeper Class";
    class10[3]="First Class";
    class10[4]="Sleeper Class";

    tot1[0]=1600;
    tot1[1]=1500;
    tot1[2]=1000;
    tot1[3]=0;
    tot1[4]=800;

    tot2[0]=1600;
    tot2[1]=1500;
    tot2[2]=1000;
    tot2[3]=0;
    tot2[4]=800;

    tot3[0]=1600;
    tot3[1]=1500;
    tot3[2]=1000;
    tot3[3]=0;
    tot3[4]=800;

    tot4[0]=1600;
    tot4[1]=1500;
    tot4[2]=1000;
    tot4[3]=0;
    tot4[4]=800;

    tot5[0]=1600;
    tot5[1]=1500;
    tot5[2]=1000;
    tot5[3]=0;
    tot5[4]=800;

    tot6[0]=1600;
    tot6[1]=1500;
    tot6[2]=1000;
    tot6[3]=0;
    tot6[4]=800;

    tot7[0]=1600;
    tot7[1]=1500;
    tot7[2]=1000;
    tot7[3]=0;
    tot7[4]=800;

    tot8[0]=1600;
    tot8[1]=1500;
    tot8[2]=1000;
    tot8[3]=0;
    tot8[4]=800;

    tot9[0]=1600;
    tot9[1]=1500;
    tot9[2]=1000;
    tot9[3]=0;
    tot9[4]=800;

    tot10[0]=1600;
    tot10[1]=1500;
    tot10[2]=1000;
    tot10[3]=0;
    tot10[4]=800;


}
public void main()/*#Method to accept destination*/
{//Start of method main
System.out.println("Welcome to Indian Rail Ticket Booking System.");
for(;;)
{System.out.println("Please enter the following number for your destination");
System.out.println("from Mumbai: ");
System.out.println("1 for New Delhi.");
System.out.println("2 for Kolkata.");
System.out.println("3 for Chennai.");
System.out.println("4 for Bangalore.");
System.out.println("5 for Hyderabad.");
abc:
for(;true;)//loop to accept destination and access corresponding method
{char ts=obj.nextLine().charAt(0);
switch (ts)
{case '1':
delhi();break abc ;
case '2':
kolkata();break abc;
case '3':
chennai();break abc;
case '4':
bangalore();break abc;
case '5':
hyderabad();break abc;
default:
System.out.println("Please only enter the assigned numbers.");
}
}
System.out.println("Press 'Y' or 'y' to choose another destination.");
String Y=obj.nextLine();
if(Y.equals("Y")||Y.equals("y"))
;
else
break;

}
}//end of method main
public void delhi()//method to accept train
{//start of method delhi
for(;;)
{System.out.println("Trains from Mumbai to Delhi:");
System.out.println("1-Rajdhani Express.");
System.out.println("2-Nizamuddin Express.");
defg:
for(;true;)
{System.out.println("Please enter our choice-1/2.");
char c=obj.nextLine().charAt(0);
switch (c)
{case '1':
    Rajdhani();
    break defg;
    case '2':
    Nizamuddin();
    break defg;
    default:
    System.out.println("Please enter correct choice.");

}
}
System.out.println("press 'Y' or 'y' to choose another train.");
String y=obj.nextLine();
if(y.equals("Y")||y.equals("y"))
;
else
break;

}
}//end of method delhi
public void kolkata()//method to accept train
{//start of method kolkata
    for(;;)
{System.out.println("Trains from Mumbai to Kolkata:");
System.out.println("1-Howrah Express.");
System.out.println("2-Bengal Mail.");
System.out.println("Please enter our choice-1/2.");
defg:
for(;true;)
{System.out.println("Please enter our choice-1/2.");
char c=obj.nextLine().charAt(0);
switch (c)
{case '1':
    Howrah();
    break defg;
    case '2':
    Bengal();
    break defg;
    default:
    System.out.println("Please enter correct choice.");
    continue;
}
}System.out.println("press 'Y' or 'y' to choose another train.");
String y=obj.nextLine();
if(y.equals("Y")||y.equals("y"))
;
else
break;

}
}//end of method kolkata
public void chennai()//method to accept train
{//Start of method chennai
    for(;;)
{System.out.println("Trains from Mumbai to Chennai:");
System.out.println("1-Madras Express.");
System.out.println("2-Rameshwaram Express.");
System.out.println("Please enter our choice-1/2.");
defg:
for(;true;)
{System.out.println("Please enter our choice-1/2.");
char c=obj.nextLine().charAt(0);
switch (c)
{case '1':
    Madras();
    break defg;
    case '2':
    Rameshwaram();
    break defg;
    default:
    System.out.println("Please enter correct choice.");
    continue;
}
}System.out.println("press 'Y' or 'y' to choose another train.");
String y=obj.nextLine();
if(y.equals("Y")||y.equals("y"))
;
else
break;

}
}//end of method chennai
public void bangalore()//method to accept train
{//start of method bangalore
    for(;;)
{System.out.println("Trains from Mumbai to Bangalore:");
System.out.println("1-Carnatic Express.");
System.out.println("2-Sanjeevani Express.");
System.out.println("Please enter our choice-1/2.");
defg:
for(;true;)
{System.out.println("Please enter our choice-1/2.");
char c=obj.nextLine().charAt(0);
switch (c)
{case '1':
    Carnatic();
    break defg;
    case '2':
    Sanjeevani();
    break defg;
    default:
    System.out.println("Please enter correct choice.");
    continue;
}
}System.out.println("press 'Y' or 'y' to choose another train.");
String y=obj.nextLine();
if(y.equals("Y")||y.equals("y"))
;
else
break;

}
}//start of method bangalore
public void hyderabad()//method to accept train
{//start of method hyderabad
    for(;;)
{System.out.println("Trains from Mumbai to Hyderabad:");
System.out.println("1-Godavari Express.");
System.out.println("2-Hussein Express.");
System.out.println("Please enter our choice-1/2.");
defg:
for(;true;)
{System.out.println("Please enter our choice-1/2.");
char c=obj.nextLine().charAt(0);
switch (c)
{case '1':
    Godavari();
    break defg;
    case '2':
    Hussein();
    break defg;
    default:
    System.out.println("Please enter correct choice.");
    continue;
}
} System.out.println("press 'Y' or 'y' to choose another train.");
String y=obj.nextLine();
if(y.equals("Y")||y.equals("y"))
;
else
break;

 }
}//end of method hyderabad
public void Rajdhani()
{System.out.println("------------------------------RAJDHANI EXPRESS---------------------------------");
    abcde:
    for(;true;)
    {System.out.println("Please select the following options:");
    System.out.println("1-Availability of Seats.");
    System.out.println("2-Ticket Booking.");
    System.out.println("3-Ticket Cancellation.");
    System.out.println("4-Passenger Search.");
    System.out.println("5-Reservation Chart.");

        System.out.println("Please enter 1/2/3/4/5.");
    char c=obj.nextLine().charAt(0);
    switch (c)
    {case '1':
        seatAvailabilityRaj();
        break;
        case '2':
        reservationRaj();
        break;
        case '3':
        cancellationRaj();
        break;
        case '4':
        passengerSearchRaj();
        break;
        case '5':
        resChartRaj();
        break;
        default:
        System.out.println("Please enter the correct choice:");
        continue;
    }
    System.out.println();
    System.out.println("Please enter 1 if you want to choose another option else enter anything else.");
    char n=obj.nextLine().charAt(0);
    if(n=='1')
    continue;
    else
    {System.out.println("*********************THANK YOU************************");
    break abcde;}
}
}
public void Nizamuddin()
{System.out.println("------------------------------NIZAMUDDIN EXPRESS---------------------------------");

    abcde:
    for(;true;)
    {
        System.out.println("Please select the following options:");
    System.out.println("1-Availability of Seats.");
    System.out.println("2-Ticket Booking.");
    System.out.println("3-Ticket Cancellation.");
    System.out.println("4-Passenger Search.");
    System.out.println("5-Reservation Chart.");
    System.out.println("Please enter 1/2/3/4/5.");
    char c=obj.nextLine().charAt(0);
    switch (c)
    {case '1':
        seatAvailabilityNiz();
        break;
        case '2':
        reservationNiza();
        break;
        case '3':
        cancellationNiz();
        break;
        case '4':
        passengerSearchNiz();
        break;
        case '5':
        resChartNiz();
        break;
        default:
        System.out.println("Please enter the correct choice:");
        continue;
    }
    System.out.println();
    System.out.println("Please enter 1 if you want to choose another option else enter anything else.");
    char n=obj.nextLine().charAt(0);
    if(n=='1')
    continue;
    else
    {System.out.println("*********************THANK YOU************************");
    break abcde;}
}
}
public void Howrah()
{System.out.println("------------------------------HOWRAH EXPRESS---------------------------------");

    abcde:
    for(;true;)
    {System.out.println("Please select the following options:");
    System.out.println("1-Availability of Seats.");
    System.out.println("2-Ticket Booking.");
    System.out.println("3-Ticket Cancellation.");
    System.out.println("4-Passenger Search.");
    System.out.println("5-Reservation Chart.");
    System.out.println("Please enter 1/2/3/4/5.");
    char c=obj.nextLine().charAt(0);
    switch (c)
    {case '1':
        seatAvailabilityHow();
        break;
        case '2':
        reservationHow();
        break;
        case '3':
        cancellationHow();
        break;
        case '4':
        passengerSearchHow();
        break;
        case '5':
        resChartHow();
        break;
        default:
        System.out.println("Please enter the correct choice:");
        continue;
    }
    System.out.println();
    System.out.println("Please enter 1 if you want to choose another option else enter anything else.");
    char n=obj.nextLine().charAt(0);
    if(n=='1')
    continue;
    else
    {System.out.println("*********************THANK YOU************************");
    break abcde;}
}
}
public void Bengal()
{System.out.println("------------------------------BENGAL MAIL---------------------------------");

    abcde:
    for(;true;)
    {System.out.println("Please select the following options:");
    System.out.println("1-Availability of Seats.");
    System.out.println("2-Ticket Booking.");
    System.out.println("3-Ticket Cancellation.");
    System.out.println("4-Passenger Search.");
    System.out.println("5-Reservation Chart.");
    System.out.println("Please enter 1/2/3/4/5.");
    char c=obj.nextLine().charAt(0);
    switch (c)
    {case '1':
        seatAvailabilityBen();
        break;
        case '2':
        reservationBen();
        break;
        case '3':
        cancellationBen();
        break;
        case '4':
        passengerSearchBen();
        break;
        case '5':
        resChartBen();
        break;
        default:
        System.out.println("Please enter the correct choice:");
        continue;
    }
    System.out.println();
    System.out.println("Please enter 1 if you want to choose another option else enter anything else.");
    char n=obj.nextLine().charAt(0);
    if(n=='1')
    continue;
    else
    {System.out.println("*********************THANK YOU************************");
    break abcde;}
}
}
public void Madras()
{
    System.out.println("------------------------------MADRAS EXPRESS---------------------------------");

    abcde:
    for(;true;)
    {System.out.println("Please select the following options:");
    System.out.println("1-Availability of Seats.");
    System.out.println("2-Ticket Booking.");
    System.out.println("3-Ticket Cancellation.");
    System.out.println("4-Passenger Search.");
    System.out.println("5-Reservation Chart.");
    System.out.println("Please enter 1/2/3/4/5.");
    char c=obj.nextLine().charAt(0);
    switch (c)
    {case '1':
        seatAvailabilityMad();
        break;
        case '2':
        reservationMad();
        break;
        case '3':
        cancellationMad();
        break;
        case '4':
        passengerSearchMad();
        break;
        case '5':
        resChartMad();
        break;
        default:
        System.out.println("Please enter the correct choice:");
        continue;
    }
    System.out.println();
    System.out.println("Please enter 1 if you want to choose another option else enter anything else.");
    char n=obj.nextLine().charAt(0);
    if(n=='1')
    continue;
    else
    {System.out.println("*********************THANK YOU************************");
    break abcde;}
}
}
public void Rameshwaram()
{System.out.println("------------------------------RAMESHWARAM EXPRESS---------------------------------");

    abcde:
    for(;true;)
    {
        System.out.println("Please select the following options:");
    System.out.println("1-Availability of Seats.");
    System.out.println("2-Ticket Booking.");
    System.out.println("3-Ticket Cancellation.");
    System.out.println("4-Passenger Search.");
    System.out.println("5-Reservation Chart.");
    System.out.println("Please enter 1/2/3/4/5.");
    char c=obj.nextLine().charAt(0);
    switch (c)
    {case '1':
        seatAvailabilityRam();
        break;
        case '2':
        reservationRam();
        break;
        case '3':
        cancellationRam();
        break;
        case '4':
        passengerSearchRam();
        break;
        case '5':
        resChartRam();
        break;
        default:
        System.out.println("Please enter the correct choice:");
        continue;
    }
    System.out.println();
    System.out.println("Please enter 1 if you want to choose another option else enter anything else.");
    char n=obj.nextLine().charAt(0);
    if(n=='1')
    continue;
    else
    {System.out.println("*********************THANK YOU************************");
    break abcde;}
}
}
public void Carnatic()
{System.out.println("------------------------------CARNATIC EXPRESS---------------------------------");

    abcde:
    for(;true;)
    {System.out.println("Please select the following options:");
    System.out.println("1-Availability of Seats.");
    System.out.println("2-Ticket Booking.");
    System.out.println("3-Ticket Cancellation.");
    System.out.println("4-Passenger Search.");
    System.out.println("5-Reservation Chart.");
    System.out.println("Please enter 1/2/3/4/5.");
    char c=obj.nextLine().charAt(0);
    switch (c)
    {case '1':
        seatAvailabilityCar();
        break;
        case '2':
        reservationCar();
        break;
        case '3':
        cancellationCar();
        break;
        case '4':
        passengerSearchCar();
        break;
        case '5':
        resChartCar();
        break;
        default:
        System.out.println("Please enter the correct choice:");
        continue;
    }
    System.out.println();
    System.out.println("Please enter 1 if you want to choose another option else enter anything else.");
    char n=obj.nextLine().charAt(0);
    if(n=='1')
    continue;
    else
    {System.out.println("*********************THANK YOU************************");
    break abcde;}
}
}
public void Sanjeevani()
{System.out.println("------------------------------SANJEEVANI EXPRESS---------------------------------");

    abcde:
    for(;true;)
    {System.out.println("Please select the following options:");
    System.out.println("1-Availability of Seats.");
    System.out.println("2-Ticket Booking.");
    System.out.println("3-Ticket Cancellation.");
    System.out.println("4-Passenger Search.");
    System.out.println("5-Reservation Chart.");
    System.out.println("Please enter 1/2/3/4/5.");
    char c=obj.nextLine().charAt(0);
    switch (c)
    {case '1':
        seatAvailabilitySan();
        break;
        case '2':
        reservationSan();
        break;
        case '3':
        cancellationSan();
        break;
        case '4':
        passengerSearchSan();
        break;
        case '5':
        resChartSan();
        break;
        default:
        System.out.println("Please enter the correct choice:");
        continue;
    }
    System.out.println();
    System.out.println("Please enter 1 if you want to choose another option else enter anything else.");
    char n=obj.nextLine().charAt(0);
    if(n=='1')
    continue;
    else
    {System.out.println("*********************THANK YOU************************");
    break abcde;}
}
}
public void Godavari()
{System.out.println("------------------------------GODAVARI EXPRESS---------------------------------");

    abcde:
    for(;true;)
    {System.out.println("Please select the following options:");
    System.out.println("1-Availability of Seats.");
    System.out.println("2-Ticket Booking.");
    System.out.println("3-Ticket Cancellation.");
    System.out.println("4-Passenger Search.");
    System.out.println("5-Reservation Chart.");
    System.out.println("Please enter 1/2/3/4/5.");
    char c=obj.nextLine().charAt(0);
    switch (c)
    {case '1':
        seatAvailabilityGod();
        break;
        case '2':
        reservationGod();
        break;
        case '3':
        cancellationGod();
        break;
        case '4':
        passengerSearchGod();
        break;
        case '5':
        resChartGod();
        break;
        default:
        System.out.println("Please enter the correct choice:");
        continue;
    }
    System.out.println();
    System.out.println("Please enter 1 if you want to choose another option else enter anything else.");
    char n=obj.nextLine().charAt(0);
    if(n=='1')
    continue;
    else
    {System.out.println("*********************THANK YOU************************");
    break abcde;}
}
}
public void Hussein()
{System.out.println("------------------------------HUSSEIN EXPRESS---------------------------------");

    abcde:
    for(;true;)
    {System.out.println("Please select the following options:");
    System.out.println("1-Availability of Seats.");
    System.out.println("2-Ticket Booking.");
    System.out.println("3-Ticket Cancellation.");
    System.out.println("4-Passenger Search.");
    System.out.println("5-Reservation Chart.");
    System.out.println("Please enter 1/2/3/4/5.");
    char c=obj.nextLine().charAt(0);
    switch (c)
    {case '1':
        seatAvailabilityHus();
        break;
        case '2':
        reservationHus();
        break;
        case '3':
        cancellationHus();
        break;
        case '4':
        passengerSearchHus();
        break;
        case '5':
        resChartHus();
        break;
        default:
        System.out.println("Please enter the correct choice:");
        continue;
    }
    System.out.println();
    System.out.println("Please enter 1 if you want to choose another option else enter anything else.");
    char n=obj.nextLine().charAt(0);
    if(n=='1')
    continue;
    else
    {System.out.println("*********************THANK YOU************************");
    break abcde;}
}
}






public void reservationRaj()/*#Method to accept values and do reservation
for Rajdhani Express*/
{//Start of method reservationRaj
    int ul=0,ll=0;
    int k=0,n=0;
    double btot=0;
    for(;;){
        try{
            System.out.println("Please enter number of passengers:");
     n=obj.nextInt();
    obj.nextLine();
    if(n<=0 || n>10)
    {System.out.println("Please enter a number less than or equal to 10");
        continue;}
        else
        break;
}
catch(InputMismatchException obj1)
{System.out.println("Enter a number only.");
    obj.nextLine();
    continue;
}
}
int i=0;int l=0;
abcd:
for( i=np1;i<100 && k<n;i++,k++)//loop to accept passenger details
{
    for(    ;true;   )//loop to enter passenger name
{System.out.println("Please enter passenger's name :");
 name1[i]=obj.nextLine();
if(nameValidity(name1[i]))
    break;
else
 {   System.out.println("Please enter only letters and spaces.");
continue;
}
}
for(;true;)
{try
{ for(;true;)
    {System.out.println("Please enter passenger's age :");
        age1[i]=obj.nextInt();
        obj.nextLine();
        if(age1[i]<0||age1[i]>125)
            {System.out.println("Please enter proper age.");
             continue;
}
else
        break;}
}
catch(InputMismatchException obj1)
{System.out.println("Enter a Number only");
    obj.nextLine();

    continue;
}


if(k==0)
{if(age1[i]<18)
    {System.out.println("Booking by an underage is not allowed.");
        l=1;if(l==1)
    {
        i--;k--;l=0;
    }
        continue abcd;
    }}
break;
}
for(;;)//loop to enter gender
{System.out.println("Enter your gender[M/F].");
    gen1[i]=obj.nextLine();
    if(gen1[i].equals("M")||gen1[i].equals("m")||gen1[i].equals("F")||gen1[i].equals("f"))
    break;
    else
    System.out.println("Please enter correct gender.");
    continue;
}
for(;true;)//loop to enter phone number
{try
  { System.out.println("Enter your phone number:");
           pn1[i]=obj.nextInt();
           obj.nextLine();

}
  catch(InputMismatchException obj1)
  {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
  }
  if(pn1[i]<100000)
        {System.out.println("Enter a proper number greater than or equal to 6 digits.");
            continue;
  }
  break;
}
a:
for(;true;)//loop 'a' to accept class
{System.out.println("Please enter the following:");
 System.out.println("1-For Air Conditioned Coach.");
 System.out.println("2-For First Class.");
 System.out.println("3-For Sleeper Class.");
char c=obj.nextLine().charAt(0);
switch (c)//switch to accept class
{
case '1':
ac1++;
if(ac1>30)
{System.out.println("Sorry. All seats for AirConditioned Coach have been booked.");
 System.out.println("Please choose another Class.");

continue;}
else
{class1[i]="Air Conditioned";break a;
}

case '2':
f1++;
if(f1>30)
{
System.out.println("Sorry. All seats for First Class have been booked.");
System.out.println("Please choose another Class.");

continue;}
else
{class1[i]="First Class";break a;
}

case '3':
s1++;
if(s1>40)
{
System.out.println("Sorry. all seats for Sleeper class have been booked.");
System.out.println("Please choose another Class.");
continue;}
else
{class1[i]="Sleeper Class";break a;
}
default:
System.out.println("Please enter correct choice");
continue;
}
}
double t=0,p=0;
/*#if-else to calculate price*/
if(class1[i].equals("Air Conditioned"))
{if(age1[i]<=5)
 p=0;
 else if(age1[i]>5&&age1[i]<=12||age1[i]>=60)
p=0.80*pac;
else
p=pac;
}
else if(class1[i].equals("First Class"))
{if(age1[i]<=5)
 p=0;
 else if(age1[i]>5&&age1[i]<=12||age1[i]>=60)
p=0.80*pf;
else
p=pf;
}
else if(class1[i].equals("Sleeper Class"))
{if(age1[i]<=5)
 p=0;
 else if(age1[i]>5&&age1[i]<=12||age1[i]>=60)
p=0.80*ps;
else
p=ps;
}
tot1[i]=p;
System.out.println("Price of your ticket is rs. "+tot1[i]);
pnr1[i]=pnrNo(p1+1);
np1=i+1;
if(k==0)
ll=i;
if(k+1==n)
ul=i;
btot=btot+tot1[i];
}
System.out.println("Your TICKET COPY:");
System.out.println();
System.out.println();System.out.println();
System.out.println("******************************INDIAN RAILWAY CORPORATION********************************");
System.out.println("-----------------------------------RAJDHANI EXPRESS-------------------------------------");
System.out.println("*********************************OFFICIAL TICKET COPY***********************************");
System.out.println("SOURCE: MUMBAI C.S.T.                                             DESTINATION: NEW DELHI");
System.out.println("DEPARTURE: 5:00 A.M. 25th JANUARY, 2017************ARRIVAL: 9:00 P.M. 25th JANUARY, 2017");
System.out.println();
System.out.format("%15s %5s %15s %12s %15s %17s","NAME","AGE","PHN. NUMBER","GENDER","PNR NUMBER","TICKET CLASS");System.out.println();
System.out.println("----------------------------------------------------------------------------------------");
for(i=ll;i<=ul;i++)
{ System.out.format("%15s %5d %15d %12s %15s %17s",name1[i],age1[i],pn1[i],gen1[i],pnr1[i],class1[i]);System.out.println();
}System.out.println();
System.out.println("TOTAL BOOKING COST (incl. of all taxes): "+btot);
p1++;
System.out.println("Your Special PNR Number is: "+pnr1[np1-1]);
System.out.println("****************************************************************************************");
System.out.println();
System.out.println();
System.out.println();
System.out.println("THANK YOU!");
System.out.println("Your ticket has been successfully booked.");
}//end of method




public void reservationNiza()/*#Method to accept values and do reservation
for Nizamuddin Express*/
{//Start of method reservationNiza
        int ul=0,ll=0;
    int k=0,n=0;
    double btot=0;

    for(;;){
        try{
            System.out.println("Please enter number of passengers:");
     n=obj.nextInt();
    obj.nextLine();
    if(n<=0 || n>10)
    {System.out.println("Please enter a number less than or equal to 10");
        continue;}
        else
        break;
}
catch(InputMismatchException obj1)
{System.out.println("Enter a number only.");
    obj.nextLine();
    continue;
}
}
int i=0;int l=0;
abcd:
for( i=np2;i<100 && k<n;i++,k++)//loop to accept passenger details
{
    for(    ;true;   )//loop to enter passenger name
{System.out.println("Please enter passenger's name :");
 name2[i]=obj.nextLine();
if(nameValidity(name2[i]))
    break;
else
 {   System.out.println("Please enter only letters and spaces.");
continue;
}
}
for(;true;)
{try
{ for(;true;){System.out.println("Please enter passenger's age :");
        age2[i]=obj.nextInt();
        obj.nextLine();
        if(age2[i]<0||age2[i]>125)
            {System.out.println("Please enter proper age.");
             continue;
}
else
            break;}
}
catch(InputMismatchException obj1)
{System.out.println("Enter a Number only");
    obj.nextLine();

    continue;
}


if(k==0)
{if(age2[i]<18)
    {System.out.println("Booking by an underage is not allowed.");
        l=1;if(l==1)
    {
        i--;k--;l=0;
    }
        continue abcd;
    }}
break;
}
for(;;)//loop to enter gender
{System.out.println("Enter your gender[M/F].");
    gen2[i]=obj.nextLine();
    if(gen2[i].equals("M")||gen2[i].equals("m")||gen2[i].equals("F")||gen2[i].equals("f"))
    break;
    else
    System.out.println("Please enter correct gender.");
    continue;
}
for(;true;)//loop to enter phone number
{try
  { System.out.println("Enter your phone number:");
           pn2[i]=obj.nextInt();
           obj.nextLine();

}
  catch(InputMismatchException obj1)
  {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
  }
  if(pn2[i]<100000)
        {System.out.println("Enter a proper number greater than or equal to 6 digits.");
            continue;
  }
  break;
}
a:
for(;true;)//loop 'a' to accept class
{System.out.println("Please enter the following:");
 System.out.println("1-For Air Conditioned Coach.");
 System.out.println("2-For First Class.");
 System.out.println("3-For Sleeper Class.");
char c=obj.nextLine().charAt(0);
switch (c)//switch to accept class
{
case '1':
ac2++;
if(ac2>30)
{System.out.println("Sorry. All seats for AirConditioned Coach have been booked.");
 System.out.println("Please choose another Class.");

continue;}
else
{class2[i]="Air Conditioned";break a;
}

case '2':
f2++;
if(f2>30)
{
System.out.println("Sorry. All seats for First Class have been booked.");
System.out.println("Please choose another Class.");

continue;}
else
{class2[i]="First Class";break a;
}

case '3':
s2++;
if(s2>40)
{
System.out.println("Sorry. all seats for Sleeper class have been booked.");
System.out.println("Please choose another Class.");
continue;}
else
{class2[i]="Sleeper Class";break a;
}
default:
System.out.println("Please enter correct choice");
continue;
}
}
double t=0,p=0;
/*#if-else to calculate price*/
if(class2[i].equals("Air Conditioned"))
{if(age2[i]<=5)
 p=0;
 else if(age2[i]>5&&age2[i]<=12||age2[i]>=60)
p=0.80*pac;
else
p=pac;
}
else if(class2[i].equals("First Class"))
{if(age2[i]<=5)
 p=0;
 else if(age2[i]>5&&age2[i]<=12||age2[i]>=60)
p=0.80*pf;
else
p=pf;
}
else if(class2[i].equals("Sleeper Class"))
{if(age2[i]<=5)
 p=0;
 else if(age2[i]>5&&age2[i]<=12||age2[i]>=60)
p=0.80*ps;
else
p=ps;
}
tot2[i]=p;
System.out.println("Price of your ticket is rs. "+tot2[i]);
pnr2[i]=pnrNo(p2+1);
np2=i+1;

if(k==0)
ll=i;
if(k+1==n)
ul=i;
btot=btot+tot2[i];

}
System.out.println("Your TICKET COPY:");
System.out.println();System.out.println();System.out.println();
System.out.println("******************************INDIAN RAILWAY CORPORATION********************************");
System.out.println("----------------------------------NIZAMUDDIN EXPRESS------------------------------------");
System.out.println("*********************************OFFICIAL TICKET COPY***********************************");
System.out.println("SOURCE: MUMBAI C.S.T.                                             DESTINATION: NEW DELHI");
System.out.println("DEPARTURE: 5:00 A.M. 25th JANUARY, 2017************ARRIVAL: 9:00 P.M. 25th JANUARY, 2017");System.out.println();
System.out.format("%15s %5s %15s %12s %15s %17s","NAME","AGE","PHN. NUMBER","GENDER","PNR NUMBER","TICKET CLASS");System.out.println();
System.out.println("----------------------------------------------------------------------------------------");
for(i=ll;i<=ul;i++)
{ System.out.format("%15s %5d %15d %12s %15s %17s",name2[i],age2[i],pn2[i],gen2[i],pnr2[i],class2[i]);System.out.println();
}System.out.println();
System.out.println("TOTAL BOOKING COST (incl. of all taxes): "+btot);
p2++;
System.out.println("Your Special PNR Number is: "+pnr2[np2-1]);
System.out.println("****************************************************************************************");
System.out.println();
System.out.println();
System.out.println();
 System.out.println("THANK YOU!");
System.out.println("Your ticket has been successfully booked.");
}//end of method



public void reservationHow()/*#Method to accept values and do reservation
for Howrah Express*/
{//Start of method reservationHow
        int ul=0,ll=0;
    int k=0,n=0;
    double btot=0;

    for(;;){
        try{
            System.out.println("Please enter number of passengers:");
     n=obj.nextInt();
    obj.nextLine();
    if(n<=0 || n>10)
    {System.out.println("Please enter a number less than or equal to 10");
        continue;}
        else
        break;
}
catch(InputMismatchException obj1)
{System.out.println("Enter a number only.");
    obj.nextLine();
    continue;
}
}
int i=0;int l=0;
abcd:
for( i=np3;i<100 && k<n;i++,k++)//loop to accept passenger details
{
    for(    ;true;   )//loop to enter passenger name
{System.out.println("Please enter passenger's name :");
 name3[i]=obj.nextLine();
if(nameValidity(name3[i]))
    break;
else
 {   System.out.println("Please enter only letters and spaces.");
continue;
}
}
for(;true;)
{try
{ for(;true;){System.out.println("Please enter passenger's age :");
        age3[i]=obj.nextInt();
        obj.nextLine();
        if(age3[i]<0||age3[i]>125)
            {System.out.println("Please enter proper age.");
             continue;
}
else
            break;}
}
catch(InputMismatchException obj1)
{System.out.println("Enter a Number only");
    obj.nextLine();

    continue;
}


if(k==0)
{if(age3[i]<18)
    {System.out.println("Booking by an underage is not allowed.");
        l=1;if(l==1)
    {
        i--;k--;l=0;
    }
        continue abcd;
    }}
break;
}
for(;;)//loop to enter gender
{System.out.println("Enter your gender[M/F].");
    gen3[i]=obj.nextLine();
    if(gen3[i].equals("M")||gen3[i].equals("m")||gen3[i].equals("F")||gen3[i].equals("f"))
    break;
    else
    System.out.println("Please enter correct gender.");
    continue;
}
for(;true;)//loop to enter phone number
{try
  { System.out.println("Enter your phone number:");
           pn3[i]=obj.nextInt();
           obj.nextLine();

}
  catch(InputMismatchException obj1)
  {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
  }
  if(pn3[i]<100000)
        {System.out.println("Enter a proper number greater than or equal to 6 digits.");
            continue;
  }
  break;
}
a:
for(;true;)//loop 'a' to accept class
{System.out.println("Please enter the following:");
 System.out.println("1-For Air Conditioned Coach.");
 System.out.println("2-For First Class.");
 System.out.println("3-For Sleeper Class.");
char c=obj.nextLine().charAt(0);
switch (c)//switch to accept class
{
case '1':
ac3++;
if(ac3>30)
{System.out.println("Sorry. All seats for AirConditioned Coach have been booked.");
 System.out.println("Please choose another Class.");

continue;}
else
{class3[i]="Air Conditioned";break a;
}

case '2':
f3++;
if(f3>30)
{
System.out.println("Sorry. All seats for First Class have been booked.");
System.out.println("Please choose another Class.");

continue;}
else
{class3[i]="First Class";break a;
}

case '3':
s3++;
if(s3>40)
{
System.out.println("Sorry. all seats for Sleeper class have been booked.");
System.out.println("Please choose another Class.");
continue;}
else
{class3[i]="Sleeper Class";break a;
}
default:
System.out.println("Please enter correct choice");
continue;
}
}
double t=0,p=0;
/*#if-else to calculate price*/
if(class3[i].equals("Air Conditioned"))
{if(age3[i]<=5)
 p=0;
 else if(age3[i]>5&&age3[i]<=12||age3[i]>=60)
p=0.80*pac;
else
p=pac;
}
else if(class3[i].equals("First Class"))
{if(age3[i]<=5)
 p=0;
 else if(age3[i]>5&&age3[i]<=12||age3[i]>=60)
p=0.80*pf;
else
p=pf;
}
else if(class3[i].equals("Sleeper Class"))
{if(age3[i]<=5)
 p=0;
 else if(age3[i]>5&&age3[i]<=12||age3[i]>=60)
p=0.80*ps;
else
p=ps;
}
tot3[i]=p;
System.out.println("Price of your ticket is rs. "+tot3[i]);
pnr3[i]=pnrNo(p3+1);
np3=i+1;
if(k==0)
ll=i;
if(k+1==n)
ul=i;
btot=btot+tot3[i];

}
System.out.println("Your TICKET COPY:");
System.out.println();System.out.println();System.out.println();
System.out.println("******************************INDIAN RAILWAY CORPORATION********************************");
System.out.println("------------------------------------HOWRAH EXPRESS--------------------------------------");
System.out.println("*********************************OFFICIAL TICKET COPY***********************************");
System.out.println("SOURCE: MUMBAI C.S.T.                                 DESTINATION: DUM DUM R.S., KOLKATA");
System.out.println("DEPARTURE: 5:00 A.M. 25th JANUARY, 2017************ARRIVAL: 9:00 P.M. 25th JANUARY, 2017");System.out.println();
System.out.format("%15s %5s %15s %12s %15s %17s","NAME","AGE","PHN. NUMBER","GENDER","PNR NUMBER","TICKET CLASS");System.out.println();
System.out.println("----------------------------------------------------------------------------------------");
for(i=ll;i<=ul;i++)
{ System.out.format("%15s %5d %15d %12s %15s %17s",name3[i],age3[i],pn3[i],gen3[i],pnr3[i],class3[i]);System.out.println();
}System.out.println();
System.out.println("TOTAL BOOKING COST (incl. of all taxes): "+btot);
p3++;
System.out.println("Your Special PNR Number is: "+pnr3[np3-1]);
System.out.println("****************************************************************************************");
System.out.println();
System.out.println();
System.out.println();
 System.out.println("THANK YOU!");
System.out.println("Your ticket has been successfully booked.");
}//end of method



public void reservationBen()/*#Method to accept values and do reservation
for Bengal Mail*/
{//Start of method reservationRaj
        int ul=0,ll=0;
    int k=0,n=0;
    double btot=0;

    for(;;){
        try{
            System.out.println("Please enter number of passengers:");
     n=obj.nextInt();
    obj.nextLine();
    if(n<=0 || n>10)
    {System.out.println("Please enter a number less than or equal to 10");
        continue;}
        else
        break;
}
catch(InputMismatchException obj1)
{System.out.println("Enter a number only.");
    obj.nextLine();
    continue;
}
}
int i=0;int l=0;
abcd:
for( i=np4;i<100 && k<n;i++,k++)//loop to accept passenger details
{
    for(    ;true;   )//loop to enter passenger name
{System.out.println("Please enter passenger's name :");
 name4[i]=obj.nextLine();
if(nameValidity(name4[i]))
    break;
else
 {   System.out.println("Please enter only letters and spaces.");
continue;
}
}
for(;true;)
{try
{ for(;true;){System.out.println("Please enter passenger's age :");
        age4[i]=obj.nextInt();
        obj.nextLine();
        if(age4[i]<0||age4[i]>125)
            {System.out.println("Please enter proper age.");
             continue;
}
else
            break;}
}
catch(InputMismatchException obj1)
{System.out.println("Enter a Number only");
    obj.nextLine();

    continue;
}


if(k==0)
{if(age4[i]<18)
    {System.out.println("Booking by an underage is not allowed.");
        l=1;if(l==1)
    {
        i--;k--;l=0;
    }
        continue abcd;
    }}
break;
}
for(;;)//loop to enter gender
{System.out.println("Enter your gender[M/F].");
    gen4[i]=obj.nextLine();
    if(gen4[i].equals("M")||gen4[i].equals("m")||gen4[i].equals("F")||gen4[i].equals("f"))
    break;
    else
    System.out.println("Please enter correct gender.");
    continue;
}
for(;true;)//loop to enter phone number
{try
  { System.out.println("Enter your phone number:");
           pn4[i]=obj.nextInt();
           obj.nextLine();

}
  catch(InputMismatchException obj1)
  {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
  }
  if(pn4[i]<100000)
        {System.out.println("Enter a proper number greater than or equal to 6 digits.");
            continue;
  }
  break;
}
a:
for(;true;)//loop 'a' to accept class
{System.out.println("Please enter the following:");
 System.out.println("1-For Air Conditioned Coach.");
 System.out.println("2-For First Class.");
 System.out.println("3-For Sleeper Class.");
char c=obj.nextLine().charAt(0);
switch (c)//switch to accept class
{
case '1':
ac4++;
if(ac4>30)
{System.out.println("Sorry. All seats for AirConditioned Coach have been booked.");
 System.out.println("Please choose another Class.");

continue;}
else
{class4[i]="Air Conditioned";break a;
}

case '2':
f4++;
if(f4>30)
{
System.out.println("Sorry. All seats for First Class have been booked.");
System.out.println("Please choose another Class.");

continue;}
else
{class4[i]="First Class";break a;
}

case '3':
s4++;
if(s4>40)
{
System.out.println("Sorry. all seats for Sleeper class have been booked.");
System.out.println("Please choose another Class.");
continue;}
else
{class4[i]="Sleeper Class";break a;
}
default:
System.out.println("Please enter correct choice");
continue;
}
}
double t=0,p=0;
/*#if-else to calculate price*/
if(class4[i].equals("Air Conditioned"))
{if(age4[i]<=5)
 p=0;
 else if(age4[i]>5&&age4[i]<=12||age4[i]>=60)
p=0.80*pac;
else
p=pac;
}
else if(class4[i].equals("First Class"))
{if(age4[i]<=5)
 p=0;
 else if(age4[i]>5&&age4[i]<=12||age4[i]>=60)
p=0.80*pf;
else
p=pf;
}
else if(class4[i].equals("Sleeper Class"))
{if(age4[i]<=5)
 p=0;
 else if(age4[i]>5&&age4[i]<=12||age4[i]>=60)
p=0.80*ps;
else
p=ps;
}
tot4[i]=p;
System.out.println("Price of your ticket is rs. "+tot4[i]);
pnr4[i]=pnrNo(p4+1);
np4=i+1;
if(k==0)
ll=i;
if(k+1==n)
ul=i;
btot=btot+tot4[i];

}
System.out.println("Your TICKET COPY:");
System.out.println();System.out.println();System.out.println();
System.out.println("******************************INDIAN RAILWAY CORPORATION********************************");
System.out.println("-------------------------------------BENGAL  MAIL---------------------------------------");
System.out.println("*********************************OFFICIAL TICKET COPY***********************************");
System.out.println("SOURCE: MUMBAI C.S.T.                                 DESTINATION: DUM DUM R.S., KOLKATA");
System.out.println("DEPARTURE: 5:00 A.M. 25th JANUARY, 2017************ARRIVAL: 9:00 P.M. 25th JANUARY, 2017");System.out.println();
System.out.format("%15s %5s %15s %12s %15s %17s","NAME","AGE","PHN. NUMBER","GENDER","PNR NUMBER","TICKET CLASS");System.out.println();
System.out.println("----------------------------------------------------------------------------------------");
for(i=ll;i<=ul;i++)
{ System.out.format("%15s %5d %15d %12s %15s %17s",name4[i],age4[i],pn4[i],gen4[i],pnr4[i],class4[i]);System.out.println();
}System.out.println();
System.out.println("TOTAL BOOKING COST (incl. of all taxes): "+btot);
p4++;
System.out.println("Your Special PNR Number is: "+pnr4[np4-1]);
System.out.println("****************************************************************************************");
System.out.println();
System.out.println();
System.out.println();
 System.out.println("THANK YOU!");
System.out.println("Your ticket has been successfully booked.");
}//end of method



public void reservationMad()/*#Method to accept values and do reservation
for Madras Express*/
{//Start of method reservationMad
     int ul=0,ll=0;
    int k=0,n=0;
    double btot=0;

    for(;;){
        try{
            System.out.println("Please enter number of passengers:");
     n=obj.nextInt();
    obj.nextLine();
    if(n<=0 || n>10)
    {System.out.println("Please enter a number less than or equal to 10");
        continue;}
        else
        break;
}
catch(InputMismatchException obj1)
{System.out.println("Enter a number only.");
    obj.nextLine();
    continue;
}
}
int i=0;int l=0;
abcd:
for( i=np5;i<100 && k<n;i++,k++)//loop to accept passenger details
{
    for(    ;true;   )//loop to enter passenger name
{System.out.println("Please enter passenger's name :");
 name5[i]=obj.nextLine();
if(nameValidity(name5[i]))
    break;
else
 {   System.out.println("Please enter only letters and spaces.");
continue;
}
}
for(;true;)
{try
{ for(;true;){System.out.println("Please enter passenger's age :");
        age5[i]=obj.nextInt();
        obj.nextLine();
        if(age5[i]<0||age5[i]>125)
            {System.out.println("Please enter proper age.");
             continue;
}
else
            break;}
}
catch(InputMismatchException obj1)
{System.out.println("Enter a Number only");
    obj.nextLine();

    continue;
}


if(k==0)
{if(age5[i]<18)
    {System.out.println("Booking by an underage is not allowed.");
        l=1;if(l==1)
    {
        i--;k--;l=0;
    }
        continue abcd;
    }}
break;
}
for(;;)//loop to enter gender
{System.out.println("Enter your gender[M/F].");
    gen5[i]=obj.nextLine();
    if(gen5[i].equals("M")||gen5[i].equals("m")||gen5[i].equals("F")||gen5[i].equals("f"))
    break;
    else
    System.out.println("Please enter correct gender.");
    continue;
}
for(;true;)//loop to enter phone number
{try
  { System.out.println("Enter your phone number:");
           pn5[i]=obj.nextInt();
           obj.nextLine();

}
  catch(InputMismatchException obj1)
  {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
  }
  if(pn5[i]<100000)
        {System.out.println("Enter a proper number greater than or equal to 6 digits.");
            continue;
  }
  break;
}
a:
for(;true;)//loop 'a' to accept class
{System.out.println("Please enter the following:");
 System.out.println("1-For Air Conditioned Coach.");
 System.out.println("2-For First Class.");
 System.out.println("3-For Sleeper Class.");
char c=obj.nextLine().charAt(0);
switch (c)//switch to accept class
{
case '1':
ac5++;
if(ac5>30)
{System.out.println("Sorry. All seats for AirConditioned Coach have been booked.");
 System.out.println("Please choose another Class.");

continue;}
else
{class5[i]="Air Conditioned";break a;
}

case '2':
f5++;
if(f5>30)
{
System.out.println("Sorry. All seats for First Class have been booked.");
System.out.println("Please choose another Class.");

continue;}
else
{class5[i]="First Class";break a;
}

case '3':
s5++;
if(s5>40)
{
System.out.println("Sorry. all seats for Sleeper class have been booked.");
System.out.println("Please choose another Class.");
continue;}
else
{class5[i]="Sleeper Class";break a;
}
default:
System.out.println("Please enter correct choice");
continue;
}
}
double t=0,p=0;
/*#if-else to calculate price*/
if(class5[i].equals("Air Conditioned"))
{if(age5[i]<=5)
 p=0;
 else if(age5[i]>5&&age5[i]<=12||age5[i]>=60)
p=0.80*pac;
else
p=pac;
}
else if(class5[i].equals("First Class"))
{if(age5[i]<=5)
 p=0;
 else if(age5[i]>5&&age5[i]<=12||age5[i]>=60)
p=0.80*pf;
else
p=pf;
}
else if(class5[i].equals("Sleeper Class"))
{if(age5[i]<=5)
 p=0;
 else if(age5[i]>5&&age5[i]<=12||age5[i]>=60)
p=0.80*ps;
else
p=ps;
}
tot5[i]=p;
System.out.println("Price of your ticket is rs. "+tot5[i]);
pnr5[i]=pnrNo(p5+1);
np5=i+1;
if(k==0)
ll=i;
if(k+1==n)
ul=i;
btot=btot+tot5[i];

}
System.out.println("Your TICKET COPY:");
System.out.println();System.out.println();System.out.println();
System.out.println("******************************INDIAN RAILWAY CORPORATION********************************");
System.out.println("------------------------------------MADRAS EXPRESS-------------------------------------");
System.out.println("*********************************OFFICIAL TICKET COPY***********************************");
System.out.println("SOURCE: MUMBAI C.S.T.                         DESTINATION: CHENNAI CENTRAL R.S., CHENNAI");
System.out.println("DEPARTURE: 5:00 A.M. 25th JANUARY, 2017************ARRIVAL: 9:00 P.M. 25th JANUARY, 2017");System.out.println();
System.out.format("%15s %5s %15s %12s %15s %17s","NAME","AGE","PHN. NUMBER","GENDER","PNR NUMBER","TICKET CLASS");System.out.println();
System.out.println("----------------------------------------------------------------------------------------");
for(i=ll;i<=ul;i++)
{ System.out.format("%15s %5d %15d %12s %15s %17s",name5[i],age5[i],pn5[i],gen5[i],pnr5[i],class5[i]);System.out.println();
}System.out.println();
System.out.println("TOTAL BOOKING COST (incl. of all taxes): "+btot);
p5++;
System.out.println("Your Special PNR Number is: "+pnr5[np5-1]);
System.out.println("****************************************************************************************");
System.out.println();
System.out.println();
System.out.println();
 System.out.println("THANK YOU!");
System.out.println("Your ticket has been successfully booked.");
}//end of method



public void reservationRam()/*#Method to accept values and do reservation
for Rameshwaram Express*/
{//Start of method reservationRam
     int ul=0,ll=0;
    int k=0,n=0;
    double btot=0;

    for(;;){
        try{
            System.out.println("Please enter number of passengers:");
     n=obj.nextInt();
    obj.nextLine();
    if(n<=0 || n>10)
    {System.out.println("Please enter a number less than or equal to 10");
        continue;}
        else
        break;
}
catch(InputMismatchException obj1)
{System.out.println("Enter a number only.");
    obj.nextLine();
    continue;
}
}
int i=0;int l=0;
abcd:
for( i=np6;i<100 && k<n;i++,k++)//loop to accept passenger details
{
    for(    ;true;   )//loop to enter passenger name
{System.out.println("Please enter passenger's name :");
 name6[i]=obj.nextLine();
if(nameValidity(name6[i]))
    break;
else
 {   System.out.println("Please enter only letters and spaces.");
continue;
}
}
for(;true;)
{try
{ for(;true;){System.out.println("Please enter passenger's age :");
        age6[i]=obj.nextInt();
        obj.nextLine();
        if(age6[i]<0||age6[i]>125)
            {System.out.println("Please enter proper age.");
             continue;
}
else
            break;}
}
catch(InputMismatchException obj1)
{System.out.println("Enter a Number only");
    obj.nextLine();

    continue;
}


if(k==0)
{if(age6[i]<18)
    {System.out.println("Booking by an underage is not allowed.");
        l=1;if(l==1)
    {
        i--;k--;l=0;
    }
        continue abcd;
    }}
break;
}
for(;;)//loop to enter gender
{System.out.println("Enter your gender[M/F].");
    gen6[i]=obj.nextLine();
    if(gen6[i].equals("M")||gen6[i].equals("m")||gen6[i].equals("F")||gen6[i].equals("f"))
    break;
    else
    System.out.println("Please enter correct gender.");
    continue;
}
for(;true;)//loop to enter phone number
{try
  { System.out.println("Enter your phone number:");
           pn6[i]=obj.nextInt();
           obj.nextLine();

}
  catch(InputMismatchException obj1)
  {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
  }
  if(pn6[i]<100000)
        {System.out.println("Enter a proper number greater than or equal to 6 digits.");
            continue;
  }
  break;
}
a:
for(;true;)//loop 'a' to accept class
{System.out.println("Please enter the following:");
 System.out.println("1-For Air Conditioned Coach.");
 System.out.println("2-For First Class.");
 System.out.println("3-For Sleeper Class.");
char c=obj.nextLine().charAt(0);
switch (c)//switch to accept class
{
case '1':
ac6++;
if(ac6>30)
{System.out.println("Sorry. All seats for AirConditioned Coach have been booked.");
 System.out.println("Please choose another Class.");

continue;}
else
{class6[i]="Air Conditioned";break a;
}

case '2':
f6++;
if(f6>30)
{
System.out.println("Sorry. All seats for First Class have been booked.");
System.out.println("Please choose another Class.");

continue;}
else
{class6[i]="First Class";break a;
}

case '3':
s6++;
if(s6>40)
{
System.out.println("Sorry. all seats for Sleeper class have been booked.");
System.out.println("Please choose another Class.");
continue;}
else
{class6[i]="Sleeper Class";break a;
}
default:
System.out.println("Please enter correct choice");
continue;
}
}
double t=0,p=0;
/*#if-else to calculate price*/
if(class6[i].equals("Air Conditioned"))
{if(age6[i]<=5)
 p=0;
 else if(age6[i]>5&&age6[i]<=12||age6[i]>=60)
p=0.80*pac;
else
p=pac;
}
else if(class6[i].equals("First Class"))
{if(age6[i]<=5)
 p=0;
 else if(age6[i]>5&&age6[i]<=12||age6[i]>=60)
p=0.80*pf;
else
p=pf;
}
else if(class6[i].equals("Sleeper Class"))
{if(age6[i]<=5)
 p=0;
 else if(age6[i]>5&&age6[i]<=12||age6[i]>=60)
p=0.80*ps;
else
p=ps;
}
tot6[i]=p;
System.out.println("Price of your ticket is rs. "+tot6[i]);
pnr6[i]=pnrNo(p6+1);
np6=i+1;
if(k==0)
ll=i;
if(k+1==n)
ul=i;
btot=btot+tot6[i];

}
System.out.println("Your TICKET COPY:");
System.out.println();System.out.println();System.out.println();
System.out.println("******************************INDIAN RAILWAY CORPORATION********************************");
System.out.println("----------------------------------RAMESHWARAM EXPRESS-------------------------------------");
System.out.println("*********************************OFFICIAL TICKET  COPY***********************************");
System.out.println("SOURCE: MUMBAI C.S.T.                         DESTINATION: CHENNAI CENTRAL R.S., CHENNAI");
System.out.println("DEPARTURE: 5:00 A.M. 25th JANUARY, 2017************ARRIVAL: 9:00 P.M. 25th JANUARY, 2017");System.out.println();
System.out.format("%15s %5s %15s %12s %15s %17s","NAME","AGE","PHN. NUMBER","GENDER","PNR NUMBER","TICKET CLASS");System.out.println();
System.out.println("----------------------------------------------------------------------------------------");
for(i=ll;i<=ul;i++)
{ System.out.format("%15s %5d %15d %12s %15s %17s",name6[i],age6[i],pn6[i],gen6[i],pnr6[i],class6[i]);System.out.println();
}System.out.println();
System.out.println("TOTAL BOOKING COST (incl. of all taxes): "+btot);
p6++;
System.out.println("Your Special PNR Number is: "+pnr6[np6-1]);
System.out.println("****************************************************************************************");
System.out.println();
System.out.println();
System.out.println();
 System.out.println("THANK YOU!");
System.out.println("Your ticket has been successfully booked.");
}//end of method



public void reservationCar()/*#Method to accept values and do reservation
for Carnatic Express*/
{//Start of method reservationCar
     int ul=0,ll=0;
    int k=0,n=0;
    double btot=0;

    for(;;){
        try{
            System.out.println("Please enter number of passengers:");
     n=obj.nextInt();
    obj.nextLine();
    if(n<=0 || n>10)
    {System.out.println("Please enter a number less than or equal to 10");
        continue;}
        else
        break;
}
catch(InputMismatchException obj1)
{System.out.println("Enter a number only.");
    obj.nextLine();
    continue;
}
}
int i=0;int l=0;
abcd:
for( i=np7;i<100 && k<n;i++,k++)//loop to accept passenger details
{
    for(    ;true;   )//loop to enter passenger name
{System.out.println("Please enter passenger's name :");
 name7[i]=obj.nextLine();
if(nameValidity(name7[i]))
    break;
else
 {   System.out.println("Please enter only letters and spaces.");
continue;
}
}
for(;true;)
{try
{ for(;true;){System.out.println("Please enter passenger's age :");
        age7[i]=obj.nextInt();
        obj.nextLine();
        if(age7[i]<0||age7[i]>125)
            {System.out.println("Please enter proper age.");
             continue;
}
else
            break;}
}
catch(InputMismatchException obj1)
{System.out.println("Enter a Number only");
    obj.nextLine();

    continue;
}


if(k==0)
{if(age7[i]<18)
    {System.out.println("Booking by an underage is not allowed.");
        l=1;if(l==1)
    {
        i--;k--;l=0;
    }
        continue abcd;
    }}
break;
}
for(;;)//loop to enter gender
{System.out.println("Enter your gender[M/F].");
    gen7[i]=obj.nextLine();
    if(gen7[i].equals("M")||gen7[i].equals("m")||gen7[i].equals("F")||gen7[i].equals("f"))
    break;
    else
    System.out.println("Please enter correct gender.");
    continue;
}
for(;true;)//loop to enter phone number
{try
  { System.out.println("Enter your phone number:");
           pn7[i]=obj.nextInt();
           obj.nextLine();

}
  catch(InputMismatchException obj1)
  {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
  }
  if(pn7[i]<100000)
        {System.out.println("Enter a proper number greater than or equal to 6 digits.");
            continue;
  }
  break;
}
a:
for(;true;)//loop 'a' to accept class
{System.out.println("Please enter the following:");
 System.out.println("1-For Air Conditioned Coach.");
 System.out.println("2-For First Class.");
 System.out.println("3-For Sleeper Class.");
char c=obj.nextLine().charAt(0);
switch (c)//switch to accept class
{
case '1':
ac7++;
if(ac7>30)
{System.out.println("Sorry. All seats for AirConditioned Coach have been booked.");
 System.out.println("Please choose another Class.");

continue;}
else
{class7[i]="Air Conditioned";break a;
}

case '2':
f7++;
if(f7>30)
{
System.out.println("Sorry. All seats for First Class have been booked.");
System.out.println("Please choose another Class.");

continue;}
else
{class7[i]="First Class";break a;
}

case '3':
s7++;
if(s7>40)
{
System.out.println("Sorry. all seats for Sleeper class have been booked.");
System.out.println("Please choose another Class.");
continue;}
else
{class7[i]="Sleeper Class";break a;
}
default:
System.out.println("Please enter correct choice");
continue;
}
}
double t=0,p=0;
/*#if-else to calculate price*/
if(class7[i].equals("Air Conditioned"))
{if(age7[i]<=5)
 p=0;
 else if(age7[i]>5&&age7[i]<=12||age7[i]>=60)
p=0.80*pac;
else
p=pac;
}
else if(class7[i].equals("First Class"))
{if(age7[i]<=5)
 p=0;
 else if(age7[i]>5&&age7[i]<=12||age7[i]>=60)
p=0.80*pf;
else
p=pf;
}
else if(class7[i].equals("Sleeper Class"))
{if(age7[i]<=5)
 p=0;
 else if(age7[i]>5&&age7[i]<=12||age7[i]>=60)
p=0.80*ps;
else
p=ps;
}
tot7[i]=p;
System.out.println("Price of your ticket is rs. "+tot7[i]);
pnr7[i]=pnrNo(p7+1);
np7=i+1;
if(k==0)
ll=i;
if(k+1==n)
ul=i;
btot=btot+tot7[i];

}
System.out.println("Your TICKET COPY:");
System.out.println();System.out.println();System.out.println();
System.out.println("******************************INDIAN RAILWAY CORPORATION********************************");
System.out.println("-----------------------------------CARNATIC EXPRESS-------------------------------------");
System.out.println("*********************************OFFICIAL TICKET COPY***********************************");
System.out.println("SOURCE: MUMBAI C.S.T.                     DESTINATION: BANGALORE CANTONMENT RAIL STATION");
System.out.println("DEPARTURE: 5:00 A.M. 25th JANUARY, 2017************ARRIVAL: 9:00 P.M. 25th JANUARY, 2017");System.out.println();
System.out.format("%15s %5s %15s %12s %15s %17s","NAME","AGE","PHN. NUMBER","GENDER","PNR NUMBER","TICKET CLASS");System.out.println();
System.out.println("----------------------------------------------------------------------------------------");
for(i=ll;i<=ul;i++)
{ System.out.format("%15s %5d %15d %12s %15s %17s",name7[i],age7[i],pn7[i],gen7[i],pnr7[i],class7[i]);System.out.println();
}System.out.println();
System.out.println("TOTAL BOOKING COST (incl. of all taxes): "+btot);
p7++;
System.out.println("Your Special PNR Number is: "+pnr7[np7-1]);
System.out.println("****************************************************************************************");
System.out.println();
System.out.println();
System.out.println();
 System.out.println("THANK YOU!");
System.out.println("Your ticket has been successfully booked.");
}//end of method



public void reservationSan()/*#Method to accept values and do reservation
for Sanjeevani Express*/
{//Start of method reservationSan
     int ul=0,ll=0;
    int k=0,n=0;
    double btot=0;

    for(;;){
        try{
            System.out.println("Please enter number of passengers:");
     n=obj.nextInt();
    obj.nextLine();
    if(n<=0 || n>10)
    {System.out.println("Please enter a number less than or equal to 10");
        continue;}
        else
        break;
}
catch(InputMismatchException obj1)
{System.out.println("Enter a number only.");
    obj.nextLine();
    continue;
}
}
int i=0;int l=0;
abcd:
for( i=np8;i<100 && k<n;i++,k++)//loop to accept passenger details
{
    for(    ;true;   )//loop to enter passenger name
{System.out.println("Please enter passenger's name :");
 name8[i]=obj.nextLine();
if(nameValidity(name8[i]))
    break;
else
 {   System.out.println("Please enter only letters and spaces.");
continue;
}
}
for(;true;)
{try
{ for(;true;){System.out.println("Please enter passenger's age :");
        age8[i]=obj.nextInt();
        obj.nextLine();
        if(age8[i]<0||age8[i]>125)
            {System.out.println("Please enter proper age.");
             continue;
}
else
            break;}
}
catch(InputMismatchException obj1)
{System.out.println("Enter a Number only");
    obj.nextLine();

    continue;
}


if(k==0)
{if(age8[i]<18)
    {System.out.println("Booking by an underage is not allowed.");
        l=1;if(l==1)
    {
        i--;k--;l=0;
    }
        continue abcd;
    }}
break;
}
for(;;)//loop to enter gender
{System.out.println("Enter your gender[M/F].");
    gen8[i]=obj.nextLine();
    if(gen8[i].equals("M")||gen8[i].equals("m")||gen8[i].equals("F")||gen8[i].equals("f"))
    break;
    else
    System.out.println("Please enter correct gender.");
    continue;
}
for(;true;)//loop to enter phone number
{try
  { System.out.println("Enter your phone number:");
           pn8[i]=obj.nextInt();
           obj.nextLine();

}
  catch(InputMismatchException obj1)
  {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
  }
  if(pn8[i]<100000)
        {System.out.println("Enter a proper number greater than or equal to 6 digits.");
            continue;
  }
  break;
}
a:
for(;true;)//loop 'a' to accept class
{System.out.println("Please enter the following:");
 System.out.println("1-For Air Conditioned Coach.");
 System.out.println("2-For First Class.");
 System.out.println("3-For Sleeper Class.");
char c=obj.nextLine().charAt(0);
switch (c)//switch to accept class
{
case '1':
ac8++;
if(ac8>30)
{System.out.println("Sorry. All seats for AirConditioned Coach have been booked.");
 System.out.println("Please choose another Class.");

continue;}
else
{class8[i]="Air Conditioned";break a;
}

case '2':
f8++;
if(f8>30)
{
System.out.println("Sorry. All seats for First Class have been booked.");
System.out.println("Please choose another Class.");

continue;}
else
{class8[i]="First Class";break a;
}

case '3':
s8++;
if(s8>40)
{
System.out.println("Sorry. all seats for Sleeper class have been booked.");
System.out.println("Please choose another Class.");
continue;}
else
{class8[i]="Sleeper Class";break a;
}
default:
System.out.println("Please enter correct choice");
continue;
}
}
double t=0,p=0;
/*#if-else to calculate price*/
if(class8[i].equals("Air Conditioned"))
{if(age8[i]<=5)
 p=0;
 else if(age8[i]>5&&age8[i]<=12||age8[i]>=60)
p=0.80*pac;
else
p=pac;
}
else if(class8[i].equals("First Class"))
{if(age8[i]<=5)
 p=0;
 else if(age8[i]>5&&age8[i]<=12||age8[i]>=60)
p=0.80*pf;
else
p=pf;
}
else if(class8[i].equals("Sleeper Class"))
{if(age8[i]<=5)
 p=0;
 else if(age8[i]>5&&age8[i]<=12||age8[i]>=60)
p=0.80*ps;
else
p=ps;
}
tot8[i]=p;
System.out.println("Price of your ticket is rs. "+tot8[i]);
pnr8[i]=pnrNo(p8+1);
np8=i+1;
if(k==0)
ll=i;
if(k+1==n)
ul=i;
btot=btot+tot8[i];

}
System.out.println("Your TICKET COPY:");
System.out.println();System.out.println();System.out.println();
System.out.println("******************************INDIAN RAILWAY CORPORATION********************************");
System.out.println("----------------------------------SANJEEVANI EXPRESS------------------------------------");
System.out.println("*********************************OFFICIAL TICKET COPY***********************************");
System.out.println("SOURCE: MUMBAI C.S.T.                     DESTINATION: BANGALORE CANTONMENT RAIL STATION");
System.out.println("DEPARTURE: 5:00 A.M. 25th JANUARY, 2017************ARRIVAL: 9:00 P.M. 25th JANUARY, 2017");System.out.println();
System.out.format("%15s %5s %15s %12s %15s %17s","NAME","AGE","PHN. NUMBER","GENDER","PNR NUMBER","TICKET CLASS");System.out.println();
System.out.println("----------------------------------------------------------------------------------------");
for(i=ll;i<=ul;i++)
{ System.out.format("%15s %5d %15d %12s %15s %17s",name8[i],age8[i],pn8[i],gen8[i],pnr8[i],class8[i]);System.out.println();
}System.out.println();
System.out.println("TOTAL BOOKING COST (incl. of all taxes): "+btot);
p8++;
System.out.println("Your Special PNR Number is: "+pnr8[np8-1]);
System.out.println("****************************************************************************************");
System.out.println();
System.out.println();
System.out.println();
 System.out.println("THANK YOU!");
System.out.println("Your ticket has been successfully booked.");
}//end pf method



public void reservationGod()/*#Method to accept values and do reservation
for Godavari Express*/
{//Start of method reservationGod
     int ul=0,ll=0;
    int k=0,n=0;
    double btot=0;

    for(;;){
        try{
            System.out.println("Please enter number of passengers:");
     n=obj.nextInt();
    obj.nextLine();
    if(n<=0 || n>10)
    {System.out.println("Please enter a number less than or equal to 10");
        continue;}
        else
        break;
}
catch(InputMismatchException obj1)
{System.out.println("Enter a number only.");
    obj.nextLine();
    continue;
}
}
int i=0;int l=0;
abcd:
for( i=np9;i<100 && k<n;i++,k++)//loop to accept passenger details
{
    for(    ;true;   )//loop to enter passenger name
{System.out.println("Please enter passenger's name :");
 name9[i]=obj.nextLine();
if(nameValidity(name9[i]))
    break;
else
 {   System.out.println("Please enter only letters and spaces.");
continue;
}
}
for(;true;)
{try
{ for(;true;){System.out.println("Please enter passenger's age :");
        age9[i]=obj.nextInt();
        obj.nextLine();
        if(age9[i]<0||age9[i]>125)
            {System.out.println("Please enter proper age.");
             continue;
}
else
            break;}
}
catch(InputMismatchException obj1)
{System.out.println("Enter a Number only");
    obj.nextLine();

    continue;
}


if(k==0)
{if(age9[i]<18)
    {System.out.println("Booking by an underage is not allowed.");
        l=1;if(l==1)
    {
        i--;k--;l=0;
    }
        continue abcd;
    }}
break;
}
for(;;)//loop to enter gender
{System.out.println("Enter your gender[M/F].");
    gen9[i]=obj.nextLine();
    if(gen9[i].equals("M")||gen9[i].equals("m")||gen9[i].equals("F")||gen9[i].equals("f"))
    break;
    else
    System.out.println("Please enter correct gender.");
    continue;
}
for(;true;)//loop to enter phone number
{try
  { System.out.println("Enter your phone number:");
           pn9[i]=obj.nextInt();
           obj.nextLine();

}
  catch(InputMismatchException obj1)
  {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
  }
  if(pn9[i]<100000)
        {System.out.println("Enter a proper number greater than or equal to 6 digits.");
            continue;
  }
  break;
}
a:
for(;true;)//loop 'a' to accept class
{System.out.println("Please enter the following:");
 System.out.println("1-For Air Conditioned Coach.");
 System.out.println("2-For First Class.");
 System.out.println("3-For Sleeper Class.");
char c=obj.nextLine().charAt(0);
switch (c)//switch to accept class
{
case '1':
ac9++;
if(ac9>30)
{System.out.println("Sorry. All seats for AirConditioned Coach have been booked.");
 System.out.println("Please choose another Class.");

continue;}
else
{class9[i]="Air Conditioned";break a;
}

case '2':
f9++;
if(f9>30)
{
System.out.println("Sorry. All seats for First Class have been booked.");
System.out.println("Please choose another Class.");

continue;}
else
{class9[i]="First Class";break a;
}

case '3':
s9++;
if(s9>40)
{
System.out.println("Sorry. all seats for Sleeper class have been booked.");
System.out.println("Please choose another Class.");
continue;}
else
{class9[i]="Sleeper Class";break a;
}
default:
System.out.println("Please enter correct choice");
continue;
}
}
double t=0,p=0;
/*#if-else to calculate price*/
if(class9[i].equals("Air Conditioned"))
{if(age9[i]<=5)
 p=0;
 else if(age9[i]>5&&age9[i]<=12||age9[i]>=60)
p=0.80*pac;
else
p=pac;
}
else if(class9[i].equals("First Class"))
{if(age9[i]<=5)
 p=0;
 else if(age9[i]>5&&age9[i]<=12||age9[i]>=60)
p=0.80*pf;
else
p=pf;
}
else if(class9[i].equals("Sleeper Class"))
{if(age9[i]<=5)
 p=0;
 else if(age9[i]>5&&age9[i]<=12||age9[i]>=60)
p=0.80*ps;
else
p=ps;
}
tot9[i]=p;
System.out.println("Price of your ticket is rs. "+tot9[i]);
pnr9[i]=pnrNo(p9+1);
np9=i+1;
if(k==0)
ll=i;
if(k+1==n)
ul=i;
btot=btot+tot9[i];

}
System.out.println("Your TICKET COPY:");
System.out.println();System.out.println();System.out.println();
System.out.println("******************************INDIAN RAILWAY CORPORATION********************************");
System.out.println("-----------------------------------GODAVARI EXPRESS-------------------------------------");
System.out.println("*********************************OFFICIAL TICKET COPY***********************************");
System.out.println("SOURCE: MUMBAI C.S.T.                         DESTINATION: HYDERABAD DECCAN RAIL STATION");
System.out.println("DEPARTURE: 5:00 A.M. 25th JANUARY, 2017************ARRIVAL: 9:00 P.M. 25th JANUARY, 2017");System.out.println();
System.out.format("%15s %5s %15s %12s %15s %17s","NAME","AGE","PHN. NUMBER","GENDER","PNR NUMBER","TICKET CLASS");System.out.println();
System.out.println("----------------------------------------------------------------------------------------");
for(i=ll;i<=ul;i++)
{ System.out.format("%15s %5d %15d %12s %15s %17s",name9[i],age9[i],pn9[i],gen9[i],pnr9[i],class9[i]);System.out.println();
}System.out.println();
System.out.println("TOTAL BOOKING COST (incl. of all taxes): "+btot);
p9++;
System.out.println("Your Special PNR Number is: "+pnr9[np9-1]);
System.out.println("****************************************************************************************");
System.out.println();
System.out.println();
System.out.println();
 System.out.println("THANK YOU!");
System.out.println("Your ticket has been successfully booked.");
}//end of method



public void reservationHus()/*#Method to accept values and do reservation
for Hussein Express*/
{//Start of method reservationRaj
     int ul=0,ll=0;
    int k=0,n=0;
    double btot=0;

    for(;;){
        try{
            System.out.println("Please enter number of passengers:");
     n=obj.nextInt();
    obj.nextLine();
    if(n<=0 || n>10)
    {System.out.println("Please enter a number less than or equal to 10");
        continue;}
        else
        break;
}
catch(InputMismatchException obj1)
{System.out.println("Enter a number only.");
    obj.nextLine();
    continue;
}
}
int i=0;int l=0;
abcd:
for( i=np10;i<100 && k<n;i++,k++)//loop to accept passenger details
{
    for(    ;true;   )//loop to enter passenger name
{System.out.println("Please enter passenger's name :");
 name10[i]=obj.nextLine();
if(nameValidity(name10[i]))
    break;
else
 {   System.out.println("Please enter only letters and spaces.");
continue;
}
}
for(;true;)
{try
{ for(;true;){System.out.println("Please enter passenger's age :");
        age10[i]=obj.nextInt();
        obj.nextLine();
        if(age10[i]<0||age10[i]>125)
            {System.out.println("Please enter proper age.");
             continue;
}
else
            break;}
}
catch(InputMismatchException obj1)
{System.out.println("Enter a Number only");
    obj.nextLine();

    continue;
}


if(k==0)
{if(age10[i]<18)
    {System.out.println("Booking by an underage is not allowed.");
        l=1;if(l==1)
    {
        i--;k--;l=0;
    }
        continue abcd;
    }}
break;
}
for(;;)//loop to enter gender
{System.out.println("Enter your gender[M/F].");
    gen10[i]=obj.nextLine();
    if(gen10[i].equals("M")||gen10[i].equals("m")||gen10[i].equals("F")||gen10[i].equals("f"))
    break;
    else
    System.out.println("Please enter correct gender.");
    continue;
}
for(;true;)//loop to enter phone number
{try
  { System.out.println("Enter your phone number:");
           pn10[i]=obj.nextInt();
           obj.nextLine();

}
  catch(InputMismatchException obj1)
  {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
  }
  if(pn10[i]<100000)
        {System.out.println("Enter a proper number greater than or equal to 6 digits.");
            continue;
  }
  break;
}
a:
for(;true;)//loop 'a' to accept class
{System.out.println("Please enter the following:");
 System.out.println("1-For Air Conditioned Coach.");
 System.out.println("2-For First Class.");
 System.out.println("3-For Sleeper Class.");
char c=obj.nextLine().charAt(0);
switch (c)//switch to accept class
{
case '1':
ac10++;
if(ac10>30)
{System.out.println("Sorry. All seats for AirConditioned Coach have been booked.");
 System.out.println("Please choose another Class.");

continue;}
else
{class10[i]="Air Conditioned";break a;
}

case '2':
f10++;
if(f10>30)
{
System.out.println("Sorry. All seats for First Class have been booked.");
System.out.println("Please choose another Class.");

continue;}
else
{class10[i]="First Class";break a;
}

case '3':
s10++;
if(s10>40)
{
System.out.println("Sorry. all seats for Sleeper class have been booked.");
System.out.println("Please choose another Class.");
continue;}
else
{class10[i]="Sleeper Class";break a;
}
default:
System.out.println("Please enter correct choice");
continue;
}
}
double t=0,p=0;
/*#if-else to calculate price*/
if(class10[i].equals("Air Conditioned"))
{if(age10[i]<=5)
 p=0;
 else if(age10[i]>5&&age10[i]<=12||age10[i]>=60)
p=0.80*pac;
else
p=pac;
}
else if(class10[i].equals("First Class"))
{if(age10[i]<=5)
 p=0;
 else if(age10[i]>5&&age10[i]<=12||age10[i]>=60)
p=0.80*pf;
else
p=pf;
}
else if(class10[i].equals("Sleeper Class"))
{if(age10[i]<=5)
 p=0;
 else if(age10[i]>5&&age10[i]<=12||age10[i]>=60)
p=0.80*ps;
else
p=ps;
}
tot10[i]=p;
System.out.println("Price of your ticket is rs. "+tot10[i]);
pnr10[i]=pnrNo(p10+1);
np10=i+1;
if(k==0)
ll=i;
if(k+1==n)
ul=i;
btot=btot+tot10[i];

}
System.out.println("Your TICKET COPY:");
System.out.println();System.out.println();System.out.println();
System.out.println("******************************INDIAN RAILWAY CORPORATION********************************");
System.out.println("-----------------------------------HUSSEIN  EXPRESS-------------------------------------");
System.out.println("*********************************OFFICIAL TICKET COPY***********************************");
System.out.println("SOURCE: MUMBAI C.S.T.                         DESTINATION: HYDERABAD DECCAN RAIL STATION");
System.out.println("DEPARTURE: 5:00 A.M. 25th JANUARY, 2017************ARRIVAL: 9:00 P.M. 25th JANUARY, 2017");System.out.println();
System.out.format("%15s %5s %15s %12s %15s %17s","NAME","AGE","PHN. NUMBER","GENDER","PNR NUMBER","TICKET CLASS");System.out.println();
System.out.println("----------------------------------------------------------------------------------------");
for(i=ll;i<=ul;i++)
{ System.out.format("%15s %5d %15d %12s %15s %17s",name10[i],age10[i],pn10[i],gen10[i],pnr10[i],class10[i]);System.out.println();
}System.out.println();
System.out.println("TOTAL BOOKING COST (incl. of all taxes): "+btot);
p10++;
System.out.println("Your Special PNR Number is: "+pnr10[np10-1]);
System.out.println("****************************************************************************************");
System.out.println();
System.out.println();
System.out.println();
 System.out.println("THANK YOU!");
System.out.println("Your ticket has been successfully booked.");
}//end of method


public String pnrNo(int n)//method to generate PNR no.
{//Start of method
    String pnr="";
int r=0,c=0,t=n;
for(  ;n!=0;)
{n=n/10;
c++;
}
if(c==1)
{pnr="PNR00"+t;}
else if(c==2)
{pnr="PNR0"+t;}
else if(c==3)
{pnr="PNR"+t;}
return pnr;
}//End of method
public boolean nameValidity(String s)/*#Method to check validity of a name*/
{//Start of method nameValidity
int k=0,sb=0;
for(int i=0;i<s.length();i++)
{if(s.charAt(i)==' ')
{sb++;}
}
for(int i=0;i<s.length();i++)
{
if(sb==s.length())
{k++;break;}
else if(Character.isLetter(s.charAt(i))||s.charAt(i)==' ')
continue;
else
{k++; break;}
}
if(k==1)
return false;
else
return true;
}//End of method nameValidity
public void cancellationRaj()/*#Method to cancel a ticket
of Rajdhani Express*/
{//Start of method cancellationRaj
    double totr=0;
    double re=0;int dn=0;
    System.out.println("******TICKET CANCELLATION******");
    System.out.println("*******RAJDHANI EXPRESS********");
        for(;true;)
        {try
          { for(;true;)
             {System.out.println("Please enter days left for journey.");
            dn=obj.nextInt();
           obj.nextLine();
           if(dn<0||dn>100)
           {System.out.println("Please enter proper number of days.");
               continue;}
               break;}

        }
        catch(InputMismatchException obj1)
        {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
        }
        break;
    }
    System.out.println("REFUND RATES:");
    System.out.println("50% refund if more than 10 days are left.");
    System.out.println("20% refund if 2 to 10 days are left.");
    System.out.println("0% refund if 1 or 0 days left.");

    int k=0;abcde:
    for(;true;)
    {System.out.println("Please enter your PNR number :");
    String pnr=obj.nextLine();

         k=0;
    for(int i=0;i<100;i++)
    {
        if(pnr.equalsIgnoreCase(pnr1[i]))
        {
            k++;
            name1[i]="#CANCELLED#";
           age1[i]=0;
            pn1[i]=0;
            class1[i]="#CANCELLED#";
            if(dn>10)
            {re=0.50*tot1[i];}
            else if(dn>=2 && dn<=10)
            {re=0.20*tot1[i];
            }
            else if(dn==0 || dn==1)
            {re=0.0;
            }

            totr=totr+re;
            }
        }
            System.out.println("Your ticket has been cancelled.");
            System.out.println("A Refund of Rs. "+totr+" will be given to you.");

    if(k==0)
    {
       System.out.println("Please enter correct PNR number:");

    }
else
break;
}//endof method cancellationRaj

}

public void cancellationNiz()/*#Method to cancel a ticket
of Nizamuddin Express*/
{//Start of method cancellationNiz
    double totr=0;
    double re=0;int dn=0;
    System.out.println("******TICKET CANCELLATION******");
    System.out.println("*******NIZAMUDDIN EXPRESS*******");
        for(;true;)
        {try
          { for(;true;)
             {System.out.println("Please enter days left for journey.");
            dn=obj.nextInt();
           obj.nextLine();
           if(dn<0||dn>100)
           {System.out.println("Please enter proper number of days.");
               continue;}
               break;}

        }
        catch(InputMismatchException obj1)
        {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
        }
        break;
    }
    System.out.println("REFUND RATES:");
    System.out.println("50% refund if more than 10 days are left.");
    System.out.println("20% refund if 2 to 10 days are left.");
    System.out.println("0% refund if 1 or 0 days left.");

    int k=0;abcde:
    for(;true;)
    {System.out.println("Please enter your PNR number :");
    String pnr=obj.nextLine();

         k=0;
    for(int i=0;i<100;i++)
    {
        if(pnr.equalsIgnoreCase(pnr2[i]))
        {
            k++;
            name2[i]="#CANCELLED#";
           age2[i]=0;
            pn2[i]=0;
            class2[i]="#CANCELLED#";
            if(dn>10)
            {re=0.50*tot2[i];}
            else if(dn>=2 && dn<=10)
            {re=0.20*tot2[i];
            }
            else if(dn==0 || dn==1)
            {re=0.0;
            }totr=totr+re;

            }
        }

            System.out.println("Your ticket has been cancelled.");
            System.out.println("A Refund of Rs. "+totr+" will be given to you.");
    if(k==0)
    {
       System.out.println("Please enter correct PNR number:");

    }
else
break;}//endof method cancellationNiz

}

public void cancellationHow()/*#Method to cancel a ticket
of Howrah Express*/
{//Start of method cancellationHow
    double totr=0;
    double re=0;int dn=0;
    System.out.println("******TICKET CANCELLATION******");
    System.out.println("*******HOWRAH EXPRESS********");
        for(;true;)
        {try
          { for(;true;)
             {System.out.println("Please enter days left for journey.");
            dn=obj.nextInt();
           obj.nextLine();
           if(dn<0||dn>100)
           {System.out.println("Please enter proper number of days.");
               continue;}
               break;}

        }
        catch(InputMismatchException obj1)
        {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
        }
        break;
    }
    System.out.println("REFUND RATES:");
    System.out.println("50% refund if more than 10 days are left.");
    System.out.println("20% refund if 2 to 10 days are left.");
    System.out.println("0% refund if 1 or 0 days left.");

    int k=0;abcde:
    for(;true;)
    {System.out.println("Please enter your PNR number :");
    String pnr=obj.nextLine();

         k=0;
    for(int i=0;i<100;i++)
    {
        if(pnr.equalsIgnoreCase(pnr3[i]))
        {
            k++;
            name3[i]="#CANCELLED#";
           age3[i]=0;
            pn3[i]=0;
            class3[i]="#CANCELLED#";
            if(dn>10)
            {re=0.50*tot3[i];}
            else if(dn>=2 && dn<=10)
            {re=0.20*tot3[i];
            }
            else if(dn==0 || dn==1)
            {re=0.0;
            }
            totr=totr+re;
            }
        }

            System.out.println("Your ticket has been cancelled.");
            System.out.println("A Refund of Rs. "+totr+" will be given to you.");
    if(k==0)
    {
       System.out.println("Please enter correct PNR number:");

    }
else
break;}//endof method cancellationHow

}

public void cancellationBen()/*#Method to cancel a ticket
of Bengal Mail*/
{//Start of method cancellationRaj
    double totr=0;
    double re=0;int dn=0;
    System.out.println("******TICKET CANCELLATION******");
    System.out.println("*********BENGAL MAIL***********");
        for(;true;)
        {try
          { for(;true;)
             {System.out.println("Please enter days left for journey.");
            dn=obj.nextInt();
           obj.nextLine();
           if(dn<0||dn>100)
           {System.out.println("Please enter proper number of days.");
               continue;}
               break;}

        }
        catch(InputMismatchException obj1)
        {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
        }
        break;
    }
    System.out.println("REFUND RATES:");
    System.out.println("50% refund if more than 10 days are left.");
    System.out.println("20% refund if 2 to 10 days are left.");
    System.out.println("0% refund if 1 or 0 days left.");

    int k=0;abcde:
    for(;true;)
    {System.out.println("Please enter your PNR number :");
    String pnr=obj.nextLine();

         k=0;
    for(int i=0;i<100;i++)
    {
        if(pnr.equalsIgnoreCase(pnr4[i]))
        {
            k++;
            name4[i]="#CANCELLED#";
           age4[i]=0;
            pn4[i]=0;
            class4[i]="#CANCELLED#";
            if(dn>10)
            {re=0.50*tot4[i];}
            else if(dn>=2 && dn<=10)
            {re=0.20*tot4[i];
            }
            else if(dn==0 || dn==1)
            {re=0.0;
            }
            totr=totr+re;
            }
        }
            System.out.println("Your ticket has been cancelled.");
            System.out.println("A Refund of Rs. "+totr+" will be given to you.");

    if(k==0)
    {
       System.out.println("Please enter correct PNR number:");

    }
else
break;}//endof method cancellationBen

}


public void cancellationMad()/*#Method to cancel a ticket
of Madras Express*/
{//Start of method cancellationMad
    double totr=0;
    double re=0;int dn=0;
    System.out.println("******TICKET CANCELLATION******");
    System.out.println("*******MADRAS EXPRESS********");
        for(;true;)
        {try
          { for(;true;)
             {System.out.println("Please enter days left for journey.");
            dn=obj.nextInt();
           obj.nextLine();
           if(dn<0||dn>100)
           {System.out.println("Please enter proper number of days.");
               continue;}
               break;}

        }
        catch(InputMismatchException obj1)
        {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
        }
        break;
    }
    System.out.println("REFUND RATES:");
    System.out.println("50% refund if more than 10 days are left.");
    System.out.println("20% refund if 2 to 10 days are left.");
    System.out.println("0% refund if 1 or 0 days left.");

    int k=0;abcde:
    for(;true;)
    {System.out.println("Please enter your PNR number :");
    String pnr=obj.nextLine();

         k=0;
    for(int i=0;i<100;i++)
    {
        if(pnr.equalsIgnoreCase(pnr5[i]))
        {
            k++;
            name5[i]="#CANCELLED#";
           age5[i]=0;
            pn5[i]=0;
            class5[i]="#CANCELLED#";
            if(dn>10)
            {re=0.50*tot5[i];}
            else if(dn>=2 && dn<=10)
            {re=0.20*tot5[i];
            }
            else if(dn==0 || dn==1)
            {re=0.0;
            }
            totr=totr+re;
            }
        }
            System.out.println("Your ticket has been cancelled.");
            System.out.println("A Refund of Rs. "+totr+" will be given to you.");

    if(k==0)
    {
       System.out.println("Please enter correct PNR number:");

    }
else
break;}//endof method cancellationMad

}

public void cancellationRam()/*#Method to cancel a ticket
of Rameshwaram Express*/
{//Start of method cancellationRam
    double totr=0;
    double re=0;int dn=0;
    System.out.println("******TICKET CANCELLATION******");
    System.out.println("******RAMESHWARAM EXPRESS******");
        for(;true;)
        {try
          { for(;true;)
             {System.out.println("Please enter days left for journey.");
            dn=obj.nextInt();
           obj.nextLine();
           if(dn<0||dn>100)
           {System.out.println("Please enter proper number of days.");
               continue;}
               break;}

        }
        catch(InputMismatchException obj1)
        {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
        }
        break;
    }
    System.out.println("REFUND RATES:");
    System.out.println("50% refund if more than 10 days are left.");
    System.out.println("20% refund if 2 to 10 days are left.");
    System.out.println("0% refund if 1 or 0 days left.");

    int k=0;abcde:
    for(;true;)
    {System.out.println("Please enter your PNR number :");
    String pnr=obj.nextLine();

         k=0;
    for(int i=0;i<100;i++)
    {
        if(pnr.equalsIgnoreCase(pnr6[i]))
        {
            k++;
            name6[i]="#CANCELLED#";
           age6[i]=0;
            pn6[i]=0;
            class6[i]="#CANCELLED#";
            if(dn>10)
            {re=0.50*tot6[i];}
            else if(dn>=2 && dn<=10)
            {re=0.20*tot6[i];
            }
            else if(dn==0 || dn==1)
            {re=0.0;
            }
            totr=totr+re;
            }
        }
            System.out.println("Your ticket has been cancelled.");
            System.out.println("A Refund of Rs. "+totr+" will be given to you.");

    if(k==0)
    {
       System.out.println("Please enter correct PNR number:");

    }
else
break;}//endof method cancellationRam

}


public void cancellationCar()/*#Method to cancel a ticket
of Carnatic Express*/
{//Start of method cancellationCar
    double totr=0;
    double re=0;int dn=0;
    System.out.println("******TICKET CANCELLATION******");
    System.out.println("*******CARNATIC EXPRESS********");
        for(;true;)
        {try
          { for(;true;)
             {System.out.println("Please enter days left for journey.");
            dn=obj.nextInt();
           obj.nextLine();
           if(dn<0||dn>100)
           {System.out.println("Please enter proper number of days.");
               continue;}
               break;}

        }
        catch(InputMismatchException obj1)
        {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
        }
        break;
    }
    System.out.println("REFUND RATES:");
    System.out.println("50% refund if more than 10 days are left.");
    System.out.println("20% refund if 2 to 10 days are left.");
    System.out.println("0% refund if 1 or 0 days left.");

    int k=0;abcde:
    for(;true;)
    {System.out.println("Please enter your PNR number :");
    String pnr=obj.nextLine();

         k=0;
    for(int i=0;i<100;i++)
    {
        if(pnr.equalsIgnoreCase(pnr7[i]))
        {
            k++;
            name7[i]="#CANCELLED#";
           age7[i]=0;
            pn7[i]=0;
            class7[i]="#CANCELLED#";
            if(dn>10)
            {re=0.50*tot7[i];}
            else if(dn>=2 && dn<=10)
            {re=0.20*tot7[i];
            }
            else if(dn==0 || dn==1)
            {re=0.0;
            }
            totr=totr+re;
            }
        }
            System.out.println("Your ticket has been cancelled.");
            System.out.println("A Refund of Rs. "+totr+" will be given to you.");

    if(k==0)
    {
       System.out.println("Please enter correct PNR number:");

    }
else
break;}//endof method cancellationCar

}

public void cancellationSan()/*#Method to cancel a ticket
of Sanjeevani Express*/
{//Start of method cancellationRaj
    double totr=0;
    double re=0;int dn=0;
    System.out.println("*******TICKET CANCELLATION******");
    System.out.println("*******SANJEEVANI EXPRESS********");
        for(;true;)
        {try
          { for(;true;)
             {System.out.println("Please enter days left for journey.");
            dn=obj.nextInt();
           obj.nextLine();
           if(dn<0||dn>100)
           {System.out.println("Please enter proper number of days.");
               continue;}
               break;}

        }
        catch(InputMismatchException obj1)
        {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
        }
        break;
    }
    System.out.println("REFUND RATES:");
    System.out.println("50% refund if more than 10 days are left.");
    System.out.println("20% refund if 2 to 10 days are left.");
    System.out.println("0% refund if 1 or 0 days left.");

    int k=0;abcde:
    for(;true;)
    {System.out.println("Please enter your PNR number :");
    String pnr=obj.nextLine();

         k=0;
    for(int i=0;i<100;i++)
    {
        if(pnr.equalsIgnoreCase(pnr8[i]))
        {
            k++;
            name8[i]="#CANCELLED#";
           age8[i]=0;
            pn8[i]=0;
            class8[i]="#CANCELLED#";
            if(dn>10)
            {re=0.50*tot8[i];}
            else if(dn>=2 && dn<=10)
            {re=0.20*tot8[i];
            }
            else if(dn==0 || dn==1)
            {re=0.0;
            }
            totr=totr+re;
            }
        }
            System.out.println("Your ticket has been cancelled.");
            System.out.println("A Refund of Rs. "+totr+" will be given to you.");

    if(k==0)
    {
       System.out.println("Please enter correct PNR number:");

    }
else
break;}//endof method cancellationSan

}

public void cancellationGod()/*#Method to cancel a ticket
of Godavari Express*/
{//Start of method cancellationGod
    double totr=0;
    double re=0;int dn=0;
    System.out.println("******TICKET CANCELLATION******");
    System.out.println("*******GODAVARI EXPRESS********");
        for(;true;)
        {try
          { for(;true;)
             {System.out.println("Please enter days left for journey.");
            dn=obj.nextInt();
           obj.nextLine();
           if(dn<0||dn>100)
           {System.out.println("Please enter proper number of days.");
               continue;}
               break;}

        }
        catch(InputMismatchException obj1)
        {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
        }
        break;
    }
    System.out.println("REFUND RATES:");
    System.out.println("50% refund if more than 10 days are left.");
    System.out.println("20% refund if 2 to 10 days are left.");
    System.out.println("0% refund if 1 or 0 days left.");

    int k=0;abcde:
    for(;true;)
    {System.out.println("Please enter your PNR number :");
    String pnr=obj.nextLine();

         k=0;
    for(int i=0;i<100;i++)
    {
        if(pnr.equalsIgnoreCase(pnr9[i]))
        {
            k++;
            name9[i]="#CANCELLED#";
           age9[i]=0;
            pn9[i]=0;
            class9[i]="#CANCELLED#";
            if(dn>10)
            {re=0.50*tot9[i];}
            else if(dn>=2 && dn<=10)
            {re=0.20*tot9[i];
            }
            else if(dn==0 || dn==1)
            {re=0.0;
            }
            totr=totr+re;
            }
        }
            System.out.println("Your ticket has been cancelled.");
            System.out.println("A Refund of Rs. "+totr+" will be given to you.");

    if(k==0)
    {
       System.out.println("Please enter correct PNR number:");

    }
else
break;}//endof method cancellationGod

}

public void cancellationHus()/*#Method to cancel a ticket
of Hussein Express*/
{//Start of method cancellationRaj
    double totr=0;
    double re=0;int dn=0;
    System.out.println("******TICKET CANCELLATION******");
    System.out.println("*******HUSSEIN EXPRESS********");
        for(;true;)
        {try
          { for(;true;)
             {System.out.println("Please enter days left for journey.");
            dn=obj.nextInt();
           obj.nextLine();
           if(dn<0||dn>100)
           {System.out.println("Please enter proper number of days.");
               continue;}
               break;}

        }
        catch(InputMismatchException obj1)
        {System.out.println("Enter a Number only");
         obj.nextLine();
         continue;
        }
        break;
    }
    System.out.println("REFUND RATES:");
    System.out.println("50% refund if more than 10 days are left.");
    System.out.println("20% refund if 2 to 10 days are left.");
    System.out.println("0% refund if 1 or 0 days left.");

    int k=0;abcde:
    for(;true;)
    {System.out.println("Please enter your PNR number :");
    String pnr=obj.nextLine();

         k=0;
    for(int i=0;i<100;i++)
    {
        if(pnr.equalsIgnoreCase(pnr10[i]))
        {
            k++;
            name10[i]="#CANCELLED#";
           age10[i]=0;
            pn10[i]=0;
            class10[i]="#CANCELLED#";
            if(dn>10)
            {re=0.50*tot10[i];}
            else if(dn>=2 && dn<=10)
            {re=0.20*tot10[i];
            }
            else if(dn==0 || dn==1)
            {re=0.0;
            }
            totr=totr+re;
            }
        }
            System.out.println("Your ticket has been cancelled.");
            System.out.println("A Refund of Rs. "+totr+" will be given to you.");

    if(k==0)
    {
       System.out.println("Please enter correct PNR number:");

    }
else
break;}//endof method cancellationHus

}

public void passengerSearchRaj()/*#method to search for a passenger and check his or her details
in Rajdhani Express.*/
{//Start of method passengerSearchRaj
    System.out.println("*******PASSENGER SEARCH*******");
    System.out.println("*******RAJDHANI EXPRESS*******");
    for(;true;)
    {System.out.println("Please enter the passenger's PNR number:");
    String pnr=obj.nextLine();int k=0;

            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pnr.equalsIgnoreCase(pnr1[i]))
        {k++;
            System.out.format("%15s %5d %15d %15.2f %17s",name1[i],age1[i],pn1[i],tot1[i],class1[i]);System.out.println();
        }
     }
     if(k==0)
     System.out.println("Passenger not found.");
     else
     break;
    }
}//end of method passengerSearchRaj

public void passengerSearchNiz()/*#method to search for a passenger and check his or her details
in Nizamuddin Express.*/
{//Start of method passengerSearchNiz
    System.out.println("*******PASSENGER SEARCH*******");
    System.out.println("******NIZAMUDDIN EXPRESS*******");
    for(;true;)
    {System.out.println("Please enter the passenger's PNR number:");
    String pnr=obj.nextLine();int k=0;

            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pnr.equalsIgnoreCase(pnr2[i]))
        {k++;
            System.out.format("%15s %5d %15d %15.2f %17s",name2[i],age2[i],pn2[i],tot2[i],class2[i]);System.out.println();
        }
     }
     if(k==0)
     System.out.println("Passenger not found.");
     else
     break;
    }
}//end of method passengerSearchNiz

public void passengerSearchHow()/*#method to search for a passenger and check his or her details
in Howrah Express.*/
{//Start of method passengerSearchHow
    System.out.println("*******PASSENGER SEARCH*******");
    System.out.println("********HOWRAH EXPRESS********");
    for(;true;)
    {System.out.println("Please enter the passenger's PNR number:");
    String pnr=obj.nextLine();int k=0;
            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pnr.equalsIgnoreCase(pnr3[i]))
        {k++;
            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.format("%15s %5d %15d %15.2f %17s",name3[i],age3[i],pn3[i],tot3[i],class3[i]);System.out.println();
        }
     }
     if(k==0)
     System.out.println("Passenger not found.");
     else
     break;

}
}//end of method passengerSearchHow

public void passengerSearchBen()/*#method to search for a passenger and check his or her details
in Bengal Mail.*/
{//Start of method passengerSearchBen
    System.out.println("*******PASSENGER SEARCH*******");
    System.out.println("*********BENGAL MAIL**********");
    for(;true;)
    {System.out.println("Please enter the passenger's PNR number:");
    String pnr=obj.nextLine();int k=0;
            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pnr.equalsIgnoreCase(pnr4[i]))
        {k++;
            System.out.format("%15s %5d %15d %15.2f %17s",name4[i],age4[i],pn4[i],tot4[i],class4[i]);System.out.println();
        }
     }
     if(k==0)
     System.out.println("Passenger not found.");
     else
     break;
    }
}//end of method passengerSearchBen

public void passengerSearchMad()/*#method to search for a passenger and check his or her details
in Madras Express.*/
{//Start of method passengerSearchRaj
    System.out.println("*******PASSENGER SEARCH*******");
    System.out.println("********MADRAS EXPRESS********");
    for(;true;)
    {System.out.println("Please enter the passenger's PNR number:");
    String pnr=obj.nextLine();int k=0;
            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pnr.equalsIgnoreCase(pnr5[i]))
        {k++;
            System.out.format("%15s %5d %15d %15.2f %17s",name5[i],age5[i],pn5[i],tot5[i],class5[i]);System.out.println();
        }
     }
     if(k==0)
     System.out.println("Passenger not found.");
     else
     break;
    }
}//end of method passengerSearchRaj

public void passengerSearchRam()/*#method to search for a passenger and check his or her details
in Rameshwaram Express.*/
{//Start of method passengerSearchRam
    System.out.println("*******PASSENGER SEARCH*******");
    System.out.println("******RAMESHWARAM EXPRESS*****");
    for(;true;)
    {System.out.println("Please enter the passenger's PNR number:");
    String pnr=obj.nextLine();int k=0;
            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pnr.equalsIgnoreCase(pnr6[i]))
        {k++;
            System.out.format("%15s %5d %15d %15.2f %17s",name6[i],age6[i],pn6[i],tot6[i],class6[i]);System.out.println();
        }
     }
     if(k==0)
     System.out.println("Passenger not found.");
     else
     break;
    }
}//end of method passengerSearchRam

public void passengerSearchCar()/*#method to search for a passenger and check his or her details
in Carnatic Express.*/
{//Start of method passengerSearchCar
    System.out.println("*******PASSENGER SEARCH*******");
    System.out.println("*******CARNATIC EXPRESS*******");
    for(;true;)
    {System.out.println("Please enter the passenger's PNR number:");
    String pnr=obj.nextLine();int k=0;
            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pnr.equalsIgnoreCase(pnr7[i]))
        {k++;
            System.out.format("%15s %5d %15d %15.2f %17s",name7[i],age7[i],pn7[i],tot7[i],class7[i]);System.out.println();
        }
     }
     if(k==0)
     System.out.println("Passenger not found.");
     else
     break;
    }
}//end of method passengerSearchCar

public void passengerSearchSan()/*#method to search for a passenger and check his or her details
in Sanjeevani Express.*/
{//Start of method passengerSearchSan
    System.out.println("*******PASSENGER SEARCH*******");
    System.out.println("******SANJEEVANI EXPRESS*******");
    for(;true;)
    {System.out.println("Please enter the passenger's PNR number:");
    String pnr=obj.nextLine();int k=0;
            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pnr.equalsIgnoreCase(pnr8[i]))
        {k++;
            System.out.format("%15s %5d %15d %15.2f %17s",name8[i],age8[i],pn8[i],tot8[i],class8[i]);System.out.println();
        }
     }
     if(k==0)
     System.out.println("Passenger not found.");
     else
     break;
    }
}//end of method passengerSearchSan

public void passengerSearchGod()/*#method to search for a passenger and check his or her details
in Godavari Express.*/
{//Start of method passengerSearchGod
    System.out.println("*******PASSENGER SEARCH*******");
    System.out.println("*******GODAVARI EXPRESS*******");
    for(;true;)
    {System.out.println("Please enter the passenger's PNR number:");
    String pnr=obj.nextLine();int k=0;
            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pnr.equalsIgnoreCase(pnr9[i]))
        {k++;
            System.out.format("%15s %5d %15d %15.2f %17s",name9[i],age9[i],pn9[i],tot9[i],class9[i]);System.out.println();
        }
     }
     if(k==0)
     System.out.println("Passenger not found.");
     else
     break;
    }
}//end of method passengerSearchGod

public void passengerSearchHus()/*#method to search for a passenger and check his or her details
in Hussein Express.*/
{//Start of method passengerSearchHus
    System.out.println("*******PASSENGER SEARCH*******");
    System.out.println("********HUSSEIN EXPRESS*******");
    for(;true;)
    {System.out.println("Please enter the passenger's PNR number:");
    String pnr=obj.nextLine();int k=0;
            System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","TOTAL AMT.","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pnr.equalsIgnoreCase(pnr10[i]))
        {k++;
            System.out.format("%15s %5d %15d %15.2f %17s",name10[i],age10[i],pn10[i],tot10[i],class10[i]);System.out.println();
        }
     }
     if(k==0)
     System.out.println("Passenger not found.");
     else
     break;
    }
}//end of method passengerSearchHus

public void seatAvailabilityRaj()/*#method to check availibilty of seats of each ticket class
 in Rajdhani Express.*/
{//Start of method seatAvailibilityRaj
    System.out.println("******************SEAT AVAILABILITY******************");
    System.out.println("******************RAJDHANI  EXPRESS******************");
    System.out.println("Seats available in Air Conditioned Class: "+(30-ac1));
    System.out.println("Seats available in First Class: "+(30-f1));
    System.out.println("Seats available in Sleeper Class: "+(40-s1));
}//End of method

public void seatAvailabilityNiz()/*#method to check availibilty of seats of each ticket class
 in Nizamuddin Express.*/
{//Start of method seatAvailibilityNiz
    System.out.println("******************SEAT AVAILABILITY******************");
    System.out.println("*****************NIZAMUDDIN  EXPRESS*****************");
    System.out.println("Seats available in Air Conditioned Class: "+(30-ac2));
    System.out.println("Seats available in First Class: "+(30-f2));
    System.out.println("Seats available in Sleeper Class: "+(40-s2));
}//End of method

public void seatAvailabilityHow()/*#method to check availibilty of seats of each ticket class
 in Howrah Express.*/
{//Start of method seatAvailibilityHow
    System.out.println("******************SEAT AVAILABILITY******************");
    System.out.println("*******************HOWRAH  EXPRESS*******************");
    System.out.println("Seats available in Air Conditioned Class: "+(30-ac3));
    System.out.println("Seats available in First Class: "+(30-f3));
    System.out.println("Seats available in Sleeper Class: "+(40-s3));
}//End of method

public void seatAvailabilityBen()/*#method to check availibilty of seats of each ticket class
 in Bengal Mail.*/
{//Start of method seatAvailibilityBen
    System.out.println("******************SEAT AVAILABILITY******************");
    System.out.println("*********************BENGAL MAIL*********************");
    System.out.println("Seats available in Air Conditioned Class: "+(30-ac4));
    System.out.println("Seats available in First Class: "+(30-f4));
    System.out.println("Seats available in Sleeper Class: "+(40-s4));
}//End of method

public void seatAvailabilityMad()/*#method to check availibilty of seats of each ticket class
 in Madras Express.*/
{//Start of method seatAvailibilityMad
    System.out.println("******************SEAT AVAILABILITY******************");
    System.out.println("*******************MADRAS  EXPRESS*******************");
    System.out.println("Seats available in Air Conditioned Class: "+(30-ac5));
    System.out.println("Seats available in First Class: "+(30-f5));
    System.out.println("Seats available in Sleeper Class: "+(40-s5));
}//End of method

public void seatAvailabilityRam()/*#method to check availibilty of seats of each ticket class
 in Rameshwaram Express.*/
{//Start of method seatAvailibilityRam
    System.out.println("******************SEAT AVAILABILITY******************");
    System.out.println("*****************RAMESHWARAM EXPRESS*****************");
    System.out.println("Seats available in Air Conditioned Class: "+(30-ac6));
    System.out.println("Seats available in First Class: "+(30-f6));
    System.out.println("Seats available in Sleeper Class: "+(40-s6));
}//End of method

public void seatAvailabilityCar()/*#method to check availibilty of seats of each ticket class
 in Carnatic Express.*/
{//Start of method seatAvailibilityCar
    System.out.println("******************SEAT AVAILABILITY******************");
    System.out.println("******************CARNATIC  EXPRESS******************");
    System.out.println("Seats available in Air Conditioned Class: "+(30-ac7));
    System.out.println("Seats available in First Class: "+(30-f7));
    System.out.println("Seats available in Sleeper Class: "+(40-s7));
}//End of method

public void seatAvailabilitySan()/*#method to check availibilty of seats of each ticket class
 in Sanjeevani Express.*/
{//Start of method seatAvailibilitySan
    System.out.println("******************SEAT AVAILABILITY******************");
    System.out.println("*****************SANJEEVANI  EXPRESS*****************");
    System.out.println("Seats available in Air Conditioned Class: "+(30-ac8));
    System.out.println("Seats available in First Class: "+(30-f8));
    System.out.println("Seats available in Sleeper Class: "+(40-s8));
}//End of method

public void seatAvailabilityGod()/*#method to check availibilty of seats of each ticket class
 in Godavari Express.*/
{//Start of method seatAvailibilityGod
    System.out.println("******************SEAT AVAILABILITY******************");
    System.out.println("******************GODAVARI  EXPRESS******************");
    System.out.println("Seats available in Air Conditioned Class: "+(30-ac9));
    System.out.println("Seats available in First Class: "+(30-f9));
    System.out.println("Seats available in Sleeper Class: "+(40-s9));
}//End of method

public void seatAvailabilityHus()/*#method to check availibilty of seats of each ticket class
 in Hussein Express.*/
{//Start of method seatAvailibiltyHus
    System.out.println("******************SEAT AVAILABILITY******************");
    System.out.println("*******************HUSSEIN EXPRESS*******************");
    System.out.println("Seats available in Air Conditioned Class: "+(30-ac10));
    System.out.println("Seats available in First Class: "+(30-f10));
    System.out.println("Seats available in Sleeper Class: "+(40-s10));
}//End of method

public void resChartRaj()/*#Method to print reservation chart of
Rajdhani Express*/
{//Start of method resChartRaj
    System.out.println("***********************RESERVATION CHART: RAJDHANI EXPRESS**************************");
   int k=0;

System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","PNR NUMBER","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
{if(pn1[i]==0);
    else
           { System.out.format("%15s %5d %15d %15s %17s",name1[i],age1[i],pn1[i],pnr1[i],class1[i]);System.out.println();}

        }

}//End of method

public void resChartNiz()/*#Method to print reservation chart of
Nizamuddin Express*/
{//Start of method resChartNiz
    System.out.println("***********************RESERVATION CHART: NIZAMUDDIN EXPRESS**************************");
   int k=0;

System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","PNR NUMBER","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pn2[i]!=0)
           { System.out.format("%15s %5d %15d %15s %17s",name2[i],age2[i],pn2[i],pnr2[i],class2[i]);System.out.println();}

        }

}//End of method

public void resChartHow()/*#Method to print reservation chart of
Howrah Express*/
{//Start of method resChartHow
    System.out.println("***********************RESERVATION CHART: HOWRAH EXPRESS**************************");
   int k=0;

System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","PNR NUMBER","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pn3[i]!=0)
           { System.out.format("%15s %5d %15d %15s %17s",name3[i],age3[i],pn3[i],pnr3[i],class3[i]);System.out.println();}

        }

}//End of method

public void resChartBen()/*#Method to print reservation chart of
Bengal Mail*/
{//Start of method resChartBen
    System.out.println("***********************RESERVATION CHART: BENGAL MAIL**************************");

System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","PNR NUMBER","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pn4[i]!=0)
           { System.out.format("%15s %5d %15d %15s %17s",name4[i],age4[i],pn4[i],pnr4[i],class4[i]);System.out.println();}

        }

}//End of method

public void resChartMad()/*#Method to print reservation chart of
Madras Express*/
{//Start of method resChartMad
    System.out.println("***********************RESERVATION CHART: MADRAS EXPRESS**************************");

System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","PNR NUMBER","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
   for(int i=0;i<100;i++)
    {if(pn5[i]!=0)
           { System.out.format("%15s %5d %15d %15s %17s",name5[i],age5[i],pn5[i],pnr5[i],class5[i]);System.out.println();}

        }
}//End of method

public void resChartRam()/*#Method to print reservation chart of
Rameshwaram Express*/
{//Start of method resChartRam
    System.out.println("***********************RESERVATION CHART: RAMESHWARAM EXPRESS**************************");

System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","PNR NUMBER","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
   for(int i=0;i<100;i++)
    {if(pn6[i]!=0)
           { System.out.format("%15s %5d %15d %15s %17s",name6[i],age6[i],pn6[i],pnr6[i],class6[i]);System.out.println();}

        }
}//End of method

public void resChartCar()/*#Method to print reservation chart of
Carnatic Express*/
{//Start of method resChartCar
    System.out.println("***********************RESERVATION CHART: CARNATIC EXPRESS**************************");

System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","PNR NUMBER","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
   for(int i=0;i<100;i++)
    {if(pn7[i]!=0)
           { System.out.format("%15s %5d %15d %15s %17s",name7[i],age7[i],pn7[i],pnr7[i],class7[i]);System.out.println();}

        }
}//End of method

public void resChartSan()/*#Method to print reservation chart of
Sanjeevani Express*/
{//Start of method resChartSan
    System.out.println("***********************RESERVATION CHART: SANJEEVANI EXPRESS**************************");

System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","PNR NUMBER","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
   for(int i=0;i<100;i++)
    {if(pn8[i]!=0)
           { System.out.format("%15s %5d %15d %15s %17s",name8[i],age8[i],pn8[i],pnr8[i],class8[i]);System.out.println();}

        }
}//End of method

public void resChartGod()/*#Method to print reservation chart of
Godavari Express*/
{//Start of method resChartGod
    System.out.println("***********************RESERVATION CHART: GODAVARI EXPRESS**************************");

System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","PNR NUMBER","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
   for(int i=0;i<100;i++)
    {if(pn9[i]!=0)
           { System.out.format("%15s %5d %15d %15s %17s",name9[i],age9[i],pn9[i],pnr9[i],class9[i]);System.out.println();}

        }
}//End of method

public void resChartHus()/*#Method to print reservation chart of
Hussein Express*/
{//Start of method resChartHus
    System.out.println("***********************RESERVATION CHART: HUSSEIN EXPRESS**************************");


System.out.format("%15s %5s %15s %15s %17s","NAME","AGE","PHN. NUMBER","PNR NUMBER","TICKET CLASS");System.out.println();
            System.out.println("--------------------------------------------------------------------------------------");
    for(int i=0;i<100;i++)
    {if(pn10[i]!=0)
           { System.out.format("%15s %5d %15d %15s %17s",name10[i],age10[i],pn10[i],pnr10[i],class10[i]);System.out.println();}

        }

}//End of method


}//End of class RailwayReservation
