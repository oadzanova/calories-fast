package cs211;

import java.util.EnumMap;
import java.util.Map.Entry;

enum STATE{
	START,STOP,PAUSE;
}
public class EnumMapExample {

	public static void main(String[] args) {
		EnumMap<STATE,String> stateNames = new EnumMap<STATE,String>(STATE.class);
		stateNames.put(STATE.START, "Start playing");
		stateNames.put(STATE.STOP, "Stop playing");
		stateNames.put(STATE.PAUSE, "Pause playing");
		
		for (STATE s: stateNames.keySet()){
			System.out.println(stateNames.get(s));
		}
		
		for (Entry<STATE, String> e: stateNames.entrySet()){
			System.out.println(e.getKey() + ":" +e.getValue());
		}
		
	}

}
