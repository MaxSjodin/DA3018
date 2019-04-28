public class CourseInfo {

	public static void main(String[] args) {
		BinarySearchTree courses = new BinarySearchTree();
		
		courses.insert("DA3018", "Computer Science", 7.5);
		courses.insert("MM2001", "Matematik I", 30.0);
		courses.insert("DA2004", "Programmeringsteknik", 7.5);
		courses.insert("DA3005", "Programmeringsstatistik", 7.5);
		courses.insert("DA9999", "Programmeringspajaseri", 1.5);
		
		int n = courses.size();
		System.out.printf("There are %d courses in the database.\n", n);
		
		//int x = courses.find("DA0000");
		//if(x==1){
        //    System.out.printf("The course EXISTS in the database.\n");
		//}
		//else {
        //    System.out.printf("The course DOESN'T EXISTS in the database.\n");
		//}
		String name = courses.find("MM2001").getCourseName();
		System.out.printf("Name: %s\n", name);
	}

}
