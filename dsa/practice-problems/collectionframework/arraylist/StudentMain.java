package oopsjavapractice.practiceproblem.collectionframework.arraylist;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        StudentData studentData = new StudentData(101, "Adarsh", 22, "CSE");
        StudentData studentData1 = new StudentData(102, "Tushar", 21, "CSE");
        StudentData studentData2 = new StudentData(103, "Aman", 28, "CSE");
        StudentData studentData3 = new StudentData(104, "Piyush", 26, "CSE");

        ArrayList<StudentData> list = new ArrayList<>();

        list.add(studentData);
        list.add(studentData1);
        list.add(studentData2);
        list.add(studentData3);

//        Print all Data
        for (StudentData data : list) {
            System.out.println("---------------------------");
            System.out.println(data);
            System.out.println("---------------------------");
        }

//        Specific Data
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        for (StudentData data : list) {
//            if (data.Name.toLowerCase().contains(name)) {
//                System.out.println(data);
//            }
//        }

//      Age above 25
//        for (StudentData data : list) {
//            if (data.Age > 25) {
//                System.out.println(data);
//            }
//        }


//        Largest Name
//        int len = 0;
//        String name = " ";
//        for (StudentData data : list) {
//            if (data.Name.length() > len) {
//                len = data.Name.length();
//                name = data.Name;
//            }
//        }
//
//        for (StudentData data : list) {
//            if (data.Name.equalsIgnoreCase(name)) {
//                System.out.println(data);
//                break;
//            }
//        }


    }
}