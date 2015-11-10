package sixthree;

public class Student {

	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	
	public Student(){
		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal(){
		int total;
		total = kor + eng + math;
		return total;
	}
	
	public float getAverage(){
		float average;
		average = (float)(kor + eng + math)/3;
		return average;
	}

	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

}
