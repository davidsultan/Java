package setChallenge;

public class Planet extends HeavenlyBody{

	public Planet(String name, double orbitalPeriod) {
		super(name, orbitalPeriod, BodyTypes.PLANET);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addSatellite(HeavenlyBody moon) {
		// TODO Auto-generated method stub
		if(moon.getKey().getBodyType() == BodyTypes.MOON){
			return super.addSatellite(moon); 
		}else{
			return false;
		}
		
	}
	
}
