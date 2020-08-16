public class TabInverse{
	/*méthode retournant sous forme de tableau l’inverse d’un tableau transmis en argument */
	public static int[] inverseTab(int t[]){
		int tabres[] = new int[t.length];
		for (int i = t.length - 1; i >= 0; i--) {
			tabres[t.length - i - 1] = t[i];
		}
		return tabres;
	}

	/*méthode affichant les éléments du tableau renversé*/
	public static void afficheTab(int t[]){
		for(int i = 0; i < t.length; i++){
			System.out.print(t[i]+ " ");
		}
	}
}