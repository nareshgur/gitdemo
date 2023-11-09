package TestMusic;
import music.Playable;
import music.string.*;
import music.wind.*;

public class testmus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Veena v = new Veena();
     v.play();
     Saxophone s = new Saxophone();
     s.play();
     Playable p = new Veena();
     p.play();
     Playable b = new Saxophone();
     b.play();
     
	}

}
