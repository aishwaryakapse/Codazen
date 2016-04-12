package code;

import java.util.HashSet;

public class Solution {

	public int checkCommonStudents(Student[] input1, Student[] input2) {
		// check if any input is null
		if (input1 == null || input2 == null) {
			return 0;
		}
		// check if any input is empty
		if (input1.length == 0 || input2.length == 0) {
			return 0;
		}

		// HashSet used because it does not allow duplicates and the basic
		// operations take constant time.
		HashSet<Student> set = new HashSet<Student>();

		// add elements from the 1st course to the hash set
		for (Student a : input1) { // for each student in the input1

			set.add(a); // add each student to the hash set. This also takes
						// care of duplications. No duplication allowed.

		}

		int count = 0; // To count the no of students common to both the courses

		for (Student a : input2) {// for each student in the input2

			if (set.add(a) == false) { // check if the student already exists

				count++; // increment count if the student already exists

			}

		}

		return count; // return the no of students common to both the courses
	}

	public static void main(String[] args) {

		Solution sol = new Solution(); // create an object of the Solution class

		// Driver Program
		// initialize the Students
		Student a = new Student("Dale", "Steyn", 23);
		Student b = new Student("Brett", "Lee", 25);
		Student c = new Student("Shane", "Bond", 40);

		Student[] c1 = { a, b }; // add Student array to course1

		Student[] c2 = { c }; // add student to course2

		int common = sol.checkCommonStudents(c1, c2); // call the function to
														// check the common
														// students

		System.out.println(common); // print the number of students common
	}
}
