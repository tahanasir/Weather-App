/**This class contains the main method to run the GUI window of the weather viewer*/

package ca.uwo.csd.cs2212.team4;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.SwingUtilities;

public class GUIApp {
	public static void main(String[]args) throws JSONException, IOException {
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				GUICurrentWeather window;
				try {
					window = new GUICurrentWeather();
					window.setVisible(true);

				} catch (JSONException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
		});
		
		
	}

}