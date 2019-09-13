package io.p;

public abstract class Game {
    abstract void initlize();
	abstract void startPlay();
	abstract void endPlay();
	public final void play() {
		initlize();
		startPlay();
		endPlay();
		
	}
	
	
}
