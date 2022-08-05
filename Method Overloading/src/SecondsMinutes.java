
public class SecondsMinutes {
/*
	public static String getDurationString(int minutes,int seconds){
		if (seconds<0 || seconds>=60 || minutes<0)
			return "invalid range";

		int hour = minutes/60;
		int remainingMinutes=minutes%60;

		return hour +"h " + remainingMinutes + "m " + seconds+ "s";
	}BELOW ADDING LEADÝNG ZEROES*/
	public static String getDurationString(int minutes,int seconds){
		if (seconds<0 || seconds>=60 || minutes<0)
			return "invalid range";

		int hour = minutes/60;
		int remainingMinutes=minutes%60;
		
		String hourString=hour+"h ";
		if(hour<10)
			hourString ="0"+hourString;

		String minutesString = remainingMinutes+"m ";
		if(remainingMinutes<10)
			minutesString ="0"+minutesString;
		
		String secondsString=seconds+"s ";
		if(seconds<10)
			secondsString ="0"+secondsString;
		return hourString + minutesString + secondsString;
	}
	public static String getDurationString(int seconds){
		if (seconds<0)
			return "invalid range";
		return getDurationString(seconds/60,seconds%60);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result=getDurationString(60,20);
		System.out.println(result);
	}

}
