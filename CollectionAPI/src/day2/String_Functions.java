package day2;
public class String_Functions {
	public static void main(String[] args)  {
		
		String str = "sudo cd pwd ps ls pwn chmod chown";
		System.out.println(" ************************ ");
		
		String temp[] = str.split(" ");
		for(int i=0;i<temp.length;i++) {
			System.out.println("  ~bin/bash/ "+ temp[i]);
		}
		
	}
}
