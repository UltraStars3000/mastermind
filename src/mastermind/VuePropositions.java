package mastermind;

import java.awt.*;
import java.util.*;

public class VuePropositions extends Canvas implements Observer {
	
	public VuePropositions(Modele m) {
		super();
		this.setPreferredSize(new Dimension(400,700));
		m.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
