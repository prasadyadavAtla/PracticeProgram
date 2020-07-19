package Retaframeork.Retaframeork;

public class Employee {
	
	int eid;
	String ename;
	
	 Employee(int eid,String ename)
	 {
		 this.eid=eid;
		 
		 this.ename=ename;
	 }
	 @Override
	 public String toString()
	 {
		return ename+""+eid;
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee r=new Employee(111,"prasad");
		System.out.println(r);

	}

}
