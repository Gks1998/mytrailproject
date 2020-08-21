import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws Exception {

		System.out.println("welcome");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("press 1 to add student ");
			System.out.println("press 2 to delete student ");
			System.out.println("press 3 to insert student ");
			System.out.println("press 4 to update student ");
			System.out.println("press 5 to exit ");
			int ch = Integer.parseInt(br.readLine());

			if (ch == 1) {
				System.out.println("enter student name");
				String name = br.readLine();
				System.out.println("enter phone number");
				String phone = br.readLine();
				System.out.println("enter city");
				String city = br.readLine();
				Student st= new Student(name,phone,city);
				boolean ans = StudentDao.insertStudent(st);
				if(ans){
					System.out.println("student added successfully");
					
				}
				else System.out.println("something goner wrong");
                  
			} 
			else if (ch == 2) {
				          System.out.println("enter the id of student ");
				          int id = Integer.parseInt(br.readLine());
				          boolean ans=StudentDao.deleteStudent(id);
				          if(ans){
								System.out.println("student deleted successfully");
								
							}
							else System.out.println("something goner wrong");
			} else if (ch == 3) {
                  StudentDao.showALL();
			}
			else if(ch==4) {
				//System.out.println();
				//StudentDao.updateStudent()
			}
			else
				break;

		}
	}

}
