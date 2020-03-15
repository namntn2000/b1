package bai1;

import java.util.Scanner;

public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     ManagerOfficer managerOfficer = new ManagerOfficer();
     while (true) {
        System.out.println("application manager officer");
        System.out.println("enter 1: to insert officer");
        System.out.println("enter 2: to search by name: ");
        System.out.println("enter 3: to show information officers");
        System.out.println("enter 4: to exit: ");
        String line = scanner.nextLine();
        switch (line){
            case "1":{
                System.out.println("enter a: to inssert Enginner");
                System.out.println("enter b; to insert Worker");
                System.out.println("enter c: to insert Staff");
                String type = scanner.nextLine();
                switch (type){
            case "a":{
                System.out.print("enter name: '");
                String name = scanner.nextLine();
                System.out.print("enter age: ");
                int age = scanner.nextInt();
                System.out.print("enter gendr: ");
                scanner.nextLine();
                String gender = scanner.nextLine();
                System,out.print("enter address: ");
                String address = scanner.nextLine();
                System.out.print("enter branch: ");
                String branch = scanner.nextLine();
                Officer engineer = new Engineer(name,age,gender,address,branch);
                manegerOfficer.addOfficer(engineer);
                System.out.println(engineer.toString());
                break;
            }
            case "b": {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("enter gender: ");
                scanner.nextLine();
                String gender = scanner.nextLine();
                System.out.print("enter address:");
                String address = scanner.nextLine();
                System.out.print("enter level: ");
                int level = scanner.nextInt();
                Officer worker = new Worker(name, age, gender, address, level) {};
                managerOfficer.addOfficer(worker);
                System.out.println(worker.toString());
                scanner.nextLine();
                break;
            }
            case "c": {
            System.out.print("enter name: ");
            String name = scanner.nextLine();
            System.out.print("enter age: ");
            int age = scanner.nextInt();
            System.out.print("enter gender: ");
            scanner.nextLine();
            String gender = scanner.nextLine();
            System.out.print("enter address: ");
            String address = scanner.nextLine();
            System.out.print("enter task: ");
            String task = scanner.nextLine();
            Officer staff = new Staff(name, age, gender, address, task);
            manaderOfficer.addOfficer(staff);
            System.out.println(staff.toString());
            break;
            }
            default:
                System.out.println("Invalid");
                break;
        }
        break;
     }
     case "2": {
            System.out.println("enter name to search: ");
            String name = scanner.nextLine();
            managerOfficer,searchOfficerByName(name).forEach(officer -> {
        System.out.println(officer.toString());
    });
     break;
    }
     case "3":{
     manegerOfficeer.showListInforOfficer();
     break;
    }
     case "4":{
    return;
    }
     default:
        System.out.println("Invalid");
        continue;
     }
     }
    }

  

