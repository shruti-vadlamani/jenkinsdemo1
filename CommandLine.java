import java.util.*;
class CommandLine {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("enter name roll no and college name");
		}
		else {
			System.out.println("name: "+args[0]+"\nrollno: "+args[1]+"\ncollege name: "+args[2]);
		}
	}
}
