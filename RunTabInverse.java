public class RunTabInverse{
	public static void main(String args[]){
		int tabAinverser[] = new int[5];
		tabAinverser[0] = 1;
		tabAinverser[1] = 80;
		tabAinverser[2] = 71;
		tabAinverser[3] = 6;
		tabAinverser[4] = 500;
		TabInverse.afficheTab(TabInverse.inverseTab(tabAinverser));
	}
}