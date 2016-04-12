package code;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	
	Student a, b, c;
	Solution solution;
	
	@Before
	public void setUp() throws Exception {
		solution = new Solution();
		a = new Student("Dale", "Steyn", 23);
		b = new Student("Brett", "Lee", 25);
		c = new Student("Shane", "Bond", 40);
	}

	@Test
	public void testWithCourse1GTCourse2() {
		Student[] course1 = {a, b, c};
		Student[] course2 = {c};
		assertEquals(1, solution.checkCommonStudents(course1, course2));
	}
	
	@Test
	public void testWithCourse1LTCourse2() {
		Student[] course1 = {a};
		Student[] course2 = {a, b, c};
		assertEquals(1, solution.checkCommonStudents(course1, course2));
	}
	
	@Test
	public void testNoCommonStudent() {
		Student[] course1 = {a, b};
		Student[] course2 = {c};
		assertEquals(0, solution.checkCommonStudents(course1, course2));
	}
	
	@Test
	public void testBothEqualSizeSame() {
		Student[] course1 = {a};
		Student[] course2 = {a};
		assertEquals(1, solution.checkCommonStudents(course1, course2));
	}
	
	@Test
	public void testBothEqualSizeDifferent() {
		Student[] course1 = {a};
		Student[] course2 = {b};
		assertEquals(0, solution.checkCommonStudents(course1, course2));
	}
	
	@Test
	public void testNullCourseList() {
		Student[] course1 = {a, b};
		Student[] course2 = null;
		assertEquals(0, solution.checkCommonStudents(course1, course2));
	}
	
	@Test
	public void testEmptyCourseList() {
		Student[] course1 = {};
		Student[] course2 = {a, b};
		assertEquals(0, solution.checkCommonStudents(course1, course2));
	}
}
