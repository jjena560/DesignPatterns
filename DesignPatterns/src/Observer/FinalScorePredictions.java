package Observer;

public class FinalScorePredictions implements Subscriber{

	@Override
	public void update(Subject s) {
		display((CricketData) s);
		
	}

	private void display(CricketData s) {
		System.out.println("PRECIDTED FINAL SCORE ______________");
		double nrr = s.getRuns() * 1.0 / s.getOvers();
		int pfs = (int) (nrr * 50);
		System.out.println(pfs);
	}

}
