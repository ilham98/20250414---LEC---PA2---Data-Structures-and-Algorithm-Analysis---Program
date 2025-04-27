import java.util.Scanner;

public class StudentDatabase {
    private Node head;
    private int size;

    public StudentDatabase() {
        this.head = null;
        this.size = 0;
    }

    public void pushStudent(String nim, String name, String major) {
        if (size >= 5) {
            System.out.println("Maximum number of students reached.");
            return;
        }
        if (nim.length() > 10 || name.length() > 30 || major.length() > 50) {
            System.out.println("Invalid input lengths.");
            return;
        }
        Student student = new Student(nim, name, major);
        Node newNode = new Node(student);
        if (head == null || head.student.getNim().compareTo(nim) > 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.student.getNim().compareTo(nim) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void displayStudents() {
        if (head == null) {
            System.out.println("No students in the database.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println("NIM: " + current.student.getNim() + ", Name: " + current.student.getName() + ", Major: " + current.student.getMajor());
            current = current.next;
        }
    }

    public void popAllStudents() {
        head = null;
        size = 0;
        System.out.println("All students have been removed.");
    }
}
