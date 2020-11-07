//Author:Shakamuri Sushma
//Date:11/07/2020
//Desc:Code for Reference

import java.util.function.Consumer;

public class Referencemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reference r=new Reference(10,"Sushma");
		Consumer<String> c=r::reference;
		Consumer<String> k=System.out::print;
		k.accept("capgemini");
		System.out.println("\n");
		c.accept("hi");
	}

}
