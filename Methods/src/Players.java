
public class Players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int HighScore = CalculateHighScore(100);
		DisplayHighScore("Gilbert",HighScore);
		
		HighScore = CalculateHighScore(4433);
		DisplayHighScore("Louise",HighScore);
		
		HighScore = CalculateHighScore(1990);
		DisplayHighScore("Taylor",HighScore);
		
	}
public static void DisplayHighScore(String name, int highScore) {
	System.out.println(name + ", managet to get " +
			+ highScore +" on the table");
}
public static int CalculateHighScore(int x){/*
	if(x>=1000)
		return 1;
	else if((x >= 500) && (x < 1000))
		return 2;
	else if((x >= 300) && (x < 500))
		return 3;
	else
		return 4;
		
	if(x>=1000)
		return 1;
	else if((x >= 500))
		return 2;
	else if((x >= 300))
		return 3;
	else
		return 4;
	*/
	int sth=5;
	if(x>=1000)
		sth= 1;
	else if((x >= 500))
		sth= 2;
	else if((x >= 300))
		sth= 3;
	else
		sth= 4;
	return sth;
	}
}