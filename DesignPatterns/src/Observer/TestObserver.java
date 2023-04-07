package Observer;

public class TestObserver {

	public static void main(String[] args) {
		CricketData cd = new CricketData();
		cd.setData(710, 40, 6);
		
		ScoreCardDisplay scd = new ScoreCardDisplay();
		NetRunRateDispay nrd = new NetRunRateDispay();
		FinalScorePredictions fdp = new FinalScorePredictions();
		
		cd.subscribe(scd);
		cd.subscribe(nrd);
		cd.subscribe(fdp);
		
		cd.setData(100, 20, 2);
	}
}
