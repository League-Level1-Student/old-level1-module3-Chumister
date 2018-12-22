package extra;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World grid = new World();
		grid.show();
		Bug b = new Bug();
		Location sand = new Location(0, 1);
		b.setColor(Color.BLUE);
		grid.add(sand, b);
		Bug s = new Bug();
		Location forest = new Location(5, 3);
		grid.add(forest, s);
		b.turn();
		b.turn();
		Flower floral = new Flower();
		Location ocean = new Location(0, 0);
		grid.add(ocean, floral);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Location under = new Location(i, j);
				grid.add(under, floral);
			}
		}
	}
}