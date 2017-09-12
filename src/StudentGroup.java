import java.util.Date;
import java.util.Scanner;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int length;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		Scanner sc=new Scanner(system.in);
		int i=0;
		int students[1237];
		try{
			
			if((students[i++]=sc.nextInt())==null)
			    throws IllegalArgumentException;
		}catch(Exception e) {this.length=i;setStudent(students);}		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	    int i=0,in=0;
		if(this.students.length<0||this.students.length>students.length)
			  throws IllegalArgumentException;
		else
			this.students[i++]=students[in++];
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		int  student[index];
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			 throws IllegalArgumentException;
		else
			this.students[this.length++]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		int i,j=0,k,find=0,element=this.students[index];
		try {
		if(this.length>index||index<0)
			throws IllegalArgumentException;
		for(i=0;i<this.length;i++)
			if(element==this.students[j++])find=1;
		if(find)
		{
			for(k=j;j<this.length-1;k++)
				this.students[k]=this.students[k+1];
			this.length=this.length-1;
		}
		}catch(Exception IllegalArgumentException) {System.out.print("Student doesnot exit");}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int fir_var,sec_var;
		int len=this.students.length;
		for(fir_var=0;fir_var<len;fir_var++)
			for(sec_var=fir_var+1;sec_var<len-fir_var-1;sec_var++)
				if(this.students[fir_var]>this.students[sec_var]) {
					int t=this.students[fir_var];
					this.students[fir_var]=this.students[sec_var];
					this.students[sec_var]=t;
				}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
