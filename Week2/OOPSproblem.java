// File: Playable.java
// Package: music
package music;

public interface Playable {
    void play();
}
package music.string;

import music.Playable;

public class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Veena...");
    }
}
package music.wind;

import music.Playable;

public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Saxophone...");
    }
}
package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
      
        Veena veena = new Veena();
        veena.play();

        
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        
        Playable p;

        p = veena;   
        p.play();

        p = saxophone; 
        p.play();
    }
}
