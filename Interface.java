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
