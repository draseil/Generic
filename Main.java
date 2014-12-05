import org.jsfml.graphics.RenderWindow;
import org.jsfml.window.Keyboard;
import org.jsfml.window.Keyboard.Key;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;

public class Main {

	public static final int WIDTH = 640, HEIGHT = 480;
	public static final String TITLE = "JSFML Window";

	private VideoMode mode;
	private RenderWindow window;

	public Main() {
		createObjects();

		while (window.isOpen()) {
			draw();
			input();
		}
	}

	public void createObjects() {
		mode	= new VideoMode(WIDTH, HEIGHT);
		window	= new RenderWindow();

		window.create(mode, TITLE);
	}

	public void draw() {
		window.clear();
		window.display();
	}

	public void input() {
		for (Event event : window.pollEvents()) {
			if (event.type == Event.Type.CLOSED || Keyboard.isKeyPressed(Key.ESCAPE)) {
				window.close();
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
