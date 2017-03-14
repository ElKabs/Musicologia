import java.io.File;

import org.jfugue.*;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;
import org.jfugue.theory.Note;
import org.jfugue.*;
public class CrabCanon
{
public static void main(String[] args)

{

	Pattern pattern = new Pattern("I[Flute] E E F G G F E D C C D E E D D "+
									"E E F G G F E D C C D E D C C "+
									"D D E C D E F E C D E F E D C D "+
									"E E F G G F E D C C D E D C C ");
	
	Player player = new Player();
	
	pattern.setTempo(116);
	
	System.out.println(pattern.getPattern());
	
	player.play(pattern);
	
//	Rhythm rhythm = new Rhythm()
//	  .addLayer("O..oO...O..oOoO..")
//	  .addLayer("..S...SsSsssS...S...S.")
//	  .addLayer("````````````````")
//	  .addLayer("oooOOoooOOoooOOO")
//	  .addLayer("````````````````")
//	  .addLayer("E");
//	
//	new Player().play(rhythm.getPattern().repeat(2).setTempo(100));
	
}

public Pattern getPattern()

{

	Pattern canon = new Pattern("D5h E5h A5h Bb5h C#5h Rq A5q "+
	
	"A5q Ab5h G5q G5q F#5h F5q F5q E5q Eb5q D5q "+
	
	"C#5q A3q D5q G5q F5h E5h D5h F5h "+
	
	"A5i G5i A5i D6i A5i F5i E5i F5i G5i A5i B5i C#6i "+
	
	"D6i F5i G5i A5i Bb5i E5i F5i G5i A5i G5i F5i E5i "+
	
	"F5i G5i A5i Bb5i C6i Bb5i A5i G5i A5i Bb5i C6i D6i "+
	
	"Eb6i C6i Bb5i A5i B5i C#6i D6i E6i F6i D6i C#6i B5i "+
	
	"C#6i D6i E6i F6i G6i E6i A5i E6i D6i E6i F6i G6i "+
	
	"F6i E6i D6i C#6i D6q A5q F5q D5q");
	
	// Lower the octaves of the reversed pattern


return canon;

}

}
