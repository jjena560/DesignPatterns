package Observer;

public class NetRunRateDispay implements Subscriber{

	@Override
	public void update(Subject s) {
		display((CricketData) s);
		
	}

	private void display(CricketData s) {
		System.out.println("NET RUNRATE ______________");
		double nrr = s.getRuns() * 1.0 / s.getOvers();
		System.out.println(nrr);;
	}

}
