import java.util.Scanner;


public class InnerClasses {

	private static Scanner scanner = new Scanner(System.in);
	private static Button binPrint = new Button("Print");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Gearbox mclaren = new Gearbox(6);
//		mclaren.operateClutch(true);
//		mclaren.changeGear(1);
//		mclaren.operateClutch(false);
//		System.out.println(mclaren.wheelSpeed(1000));
//		mclaren.changeGear(2);
//		System.out.println(mclaren.wheelSpeed(3000));
//		mclaren.operateClutch(true);
//		mclaren.changeGear(3);
//		mclaren.operateClutch(false);
//		System.out.println(mclaren.wheelSpeed(6000));
		
//		class ClickListener implements Button.OnClickListener{ // ####LOCAL CLASS#####
//			public ClickListener(){
//				System.out.println("I have been attached i mean fucked once");
//			}
//			public void onClick(String title){
//				System.out.println(title + " was clicked");
//			}
//		}
//		
//		binPrint.setOnClickListener(new ClickListener());
		
		
		
		
		binPrint.setOnClickListener(new Button.OnClickListener(){//###ANANYMOUS CLASS####
			public void onClick(String title){
				System.out.println(title + " was clicked");
			}
		});
		
		
	
		listen();
	}
	
	private static void listen(){
		boolean quit = false;
		while(!quit){
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice){
			case 0:
				quit = true;
				break;
			case 1:
				binPrint.onClick();
			}
		}
	}

}
