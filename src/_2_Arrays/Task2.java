package _2_Arrays;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        class Student implements Comparable<Student> {
            String name;

            Student() {
                this.name = "Vasya";
            }

            @Override
            public int compareTo(Student o) {
                return name.compareTo(o.name);
            }
        }

        Set<Student> students = new TreeSet<>();
        Student student1 = new Student();
        students.add(student1);

        System.out.println(students.contains(new Student()));
        System.out.println(student1);
        System.out.println(new Student());

        int[] numbers = {9, 9,9,9,9};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i += 2) {
            System.out.println(A[i] + " " + A[i+1]);
            if(A[i] != A[i+1]) return A[i];
        }
        return A[A.length-1];
    }
}
