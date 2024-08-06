package aplication;

import java.util.Scanner;
import entities.Rooms;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rooms[] rooms = new Rooms[10];
		
		System.out.print("Enter how many rooms will be rented: ");
		int n;
		while (true) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n > 0) {
					sc.nextLine();
					break;
				} else {
					System.out.println("Invalid data. Try again!");
					System.out.print("Enter how many rooms will be rented: ");
					sc.nextLine();
				} 
			} else {
				System.out.println("Invalid data. Try again!");
				System.out.print("Enter how many rooms will be rented: ");
				sc.nextLine();
			}
		}
		
		String name, email;
		int room;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d:%n", i+1);
			
			System.out.print("Name: ");
			while (true) {
				name = sc.nextLine();
				if (name.matches("[a-zA-ZÀ-ÿ ]+")) {
					break;
				} else {
					System.out.println("Invalid data. Try again!");
					System.out.print("Name: ");
				}
			}
			
			System.out.print("Email: ");
			while (true) {
				email = sc.nextLine();
				if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
					break;
				} else {
					System.out.println("Invalid data. Try again!");
					System.out.print("Email: ");
					sc.nextLine();
				}
			}
			
			System.out.print("Room: ");
			while (true) {
				if (sc.hasNextInt()) {
					room = sc.nextInt();
					if (room >= 0 && room < 10) {
						sc.nextLine();
						break;
					} else {
						System.out.println("Invalid data. Try again!");
						System.out.print("Room: ");
						sc.nextLine();
					} 
				} else {
					System.out.println("Invalid data. Try again!");
					System.out.print("Room: ");
					sc.nextLine();
				}
			}
			
			rooms[room] = new Rooms(name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < 10; i++) {
			if (rooms[i] != null) {
				System.out.printf("%d: %s, %s%n", i, rooms[i].getnames(), rooms[i].getEmails());
			}
		}
		sc.close();
	}
}
