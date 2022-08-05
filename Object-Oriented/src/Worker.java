
public class Worker extends Human {
	int salary;
	
	void raise(int rate){
		salary += salary*rate/100;
	}
}
