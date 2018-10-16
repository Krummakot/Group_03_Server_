
public class Lobby extends Server{
private static int boardScore;
static int diceRoll;
private static boolean playerReady;
private static int playerScore;
	
	
	public int getBoardScore() {
		return boardScore;
	}
	
	public int getDiceRoll() {
		return diceRoll;
	}
	
	private void addDiceToScore(int diceToScore) {
		playerScore += diceToScore;
	}
	
	private boolean checkIfRead() {
		if(playerReady == false) {
			return false;
		} else {
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
