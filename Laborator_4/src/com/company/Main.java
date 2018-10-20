package com.company;

public class Main {
	public static void main(String[] args) {
	    A a = new A("A - Class", new X("X Class"));
		System.out.println(a);
	    B b = new B("Class A", "Class B", new X("Class X"));
		System.out.println(b);
	    C c = new C("Class A","Class B","Class C",new X("Class X"));
		System.out.println(c);
	    D d = new D("Class A","Class B","Class C","Class D",new X("Class X"));
		System.out.println(d);
	    E e = new E("Class A","Class B","Class C","Class D","Class E", new X("Class X"));
		System.out.println(e);
		F f = new F("Class A","Class B","Class C","Class D","Class E","Class F", new X("Class X"));
		System.out.println(f);
		G g = new G("Class A","Class B","Class C","Class D","Class E","Class F","Class G", new X("Class X"));
		System.out.println(g);
		H h = new H("Class A","Class B","Class C","Class D","Class E","Class F","Class G","Class H", new X("Class X"));
		System.out.println(h);
		I i = new I("Class A","Class B","Class C","Class D","Class E","Class F","Class G","Class H","Class I", new X("Class X"));
		System.out.println(i);
		J j = new J("Class A","Class B","Class C","Class D","Class E","Class F","Class G","Class H","Class I","Class J", new X("Class X"));
		System.out.println(j);
    }
}
