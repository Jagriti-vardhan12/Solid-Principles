Add those 5 principles code here! in this folder
1. SINGLE RESPONSIBILITY PRINCIPLE:

package com.example.jv;
 class Student
{
	private String name;
	private int id;
	
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String getDetails()
	{
		return "Employee: " + name + ", ID:" + id;
	}
}

 class StudentPersistance 
{
	public void saveToFile(Student student)
	{
		System.out.println("Saving student to file: " + student.getDetails());
	}
}

public class Single_responsibility {

	public static void main(String[] args) {
		Student st = new Student("Alice", 105);
		StudentPersistance per =  new StudentPersistance();
		per.saveToFile(st);
		// TODO Auto-generated method stub
	}
}

OUTPUT - Saving student to file: Employee: Alice, ID:105

2 .OPEN AND CLOSE PRINCIPLE:

package com.example.jv;
interface PaymentMethod
{
	void pay();	
}
class creditCard implements PaymentMethod
{
	public void pay() {
		System.out.println("process Creditcard payment");
	}
}
//this new features
class debitCard implements PaymentMethod
{
	@Override
	public void pay() {
		System.out.println("process debitcard payment");
	}
}

class Processor
{
	void Process(PaymentMethod paymentMethod) {
		paymentMethod.pay();
	}
}
public class Open_Close_principal {

	public static void main(String[] args) {
		Processor p = new Processor();
		p.Process(new creditCard());
		p.Process(new debitCard());
	}
}

OUTPUT :- process Creditcard payment
          process debitcard payment


3. LISKOV SUBSTITUTION PRINCIPLE:

   package com.example.jv;
abstract class Bird {
	public abstract void makeSound();
}

interface Flyable
{
	void fly();
}
abstract class Parrot extends Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("Parrot talks!");
		
	}
	public void makeSound() {
		System.out.println("Parrot are green!");
		
	}
}

abstract class Penguin extends Bird {
	@Override
	public void makeSound() {
		System.out.println("Penguin squawks!");
	}	
}

public class Liskov_Substitution {

	private static Bird penguin;

	public static void main(String[] args) {
		Bird par = new Parrot();
		Bird pen = new Penguin();
		
		Parrot.makeSound();
		penguin.makeSound();
		
		makeItFly(parrot);
		
		Flyable flyingBird = new Parrot();
		flyingBird.fly();
		
		static void makeItFly(Bird bird) {
			if(bird instanceof Flyable ) {
				
			}else {
				System.out.println("This bird cant fly!");			}
		}
		// TODO Auto-generated method stub

	}

}

4 . INTERFACE SEGREGATION PRINCIPLE:

package com.example.jv;
interface Printer {
 void print();
}
interface Scanner {
 void scan();
}
interface Fax {
 void fax();
}
class SimplePrinter implements Printer {
 public void print() {
     System.out.println("SimplePrinter: Printing...");
 }
}

class AllInOnePrinter implements Printer, Scanner, Fax {
 public void print() {
     System.out.println("AllInOnePrinter: Printing...");
 }
 public void scan() {
     System.out.println("AllInOnePrinter: Scanning...");
 }
 public void fax() {
     System.out.println("AllInOnePrinter: Faxing...");
 }
}

class Photocopier implements Printer, Scanner {
 public void print() {
     System.out.println("Photocopier: Printing...");
 }
 public void scan() {
     System.out.println("Photocopier: Scanning...");
 }
}

public class Interface {
 public static void main(String[] args) {
     Printer p = new SimplePrinter();
     p.print();

     AllInOnePrinter aio = new AllInOnePrinter();
     aio.print();
     aio.scan();
     aio.fax();

     Photocopier pc = new Photocopier();
     pc.print();
     pc.scan();
 }
}
OUTPUT - 
Photocopier: Printing...
Photocopier: Scanning...

5. DEPENDENCY INVERSION PRINCIPLE:

   package com.example.jv;
interface MessageSender {
 void sendMessage(String message, String recipient);
}

class EmailSender implements MessageSender {
 public void sendMessage(String message, String recipient) {
     System.out.println("Email sent to " + recipient + ": " + message);
 }
}

class SMSSender implements MessageSender {
 public void sendMessage(String message, String recipient) {
     System.out.println("SMS sent to " + recipient + ": " + message);
 }
}

class NotificationService {
 private final MessageSender messageSender;
 
 // Dependency is injected through constructor
 public NotificationService(MessageSender messageSender) {
     this.messageSender = messageSender;
 }

 public void notifyUser(String message, String recipient) {
     messageSender.sendMessage(message, recipient);
 }
}


public class Dependency {
 public static void main(String[] args) {
     // Use EmailSender
     MessageSender emailSender = new EmailSender();
     NotificationService emailNotification = new NotificationService(emailSender);
     emailNotification.notifyUser("Dependency Inversion Principle saves the day!", "alice@example.com");
     
     // Use SMSSender
     MessageSender smsSender = new SMSSender();
     NotificationService smsNotification = new NotificationService(smsSender);
     smsNotification.notifyUser("DIP allows for decoupling!", "+1234567890");
 }
}

OUTPUT:
Email sent to alice@example.com: Dependency Inversion Principle saves the day!
SMS sent to +1234567890: DIP allows for decoupling!





