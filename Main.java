import org.jsfml.graphics.RenderWindow;
import org.jsfml.window.Keyboard;
import org.jsfml.window.Keyboard.Key;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;

public class Main {
	// Set 3 variables, the window's width, height and title
	public static final int WIDTH = 640, HEIGHT = 480;
	public static final String TITLE = "JSFML Window"; 

	// Creates objects
	private VideoMode mode;
	private RenderWindow window;

	public Main() {
		createObjects();

		// Loops while the window is open
		while (window.isOpen()) {
			draw();
			input();
		}
	}

	// Initialises objects
	public void createObjects() {
		mode	= new VideoMode(WIDTH, HEIGHT);
		window	= new RenderWindow();

		window.create(mode, TITLE);	// Draws window
	}

	// Draws objects onto the render target (window)
	public void draw() {
		window.clear();
		window.display();
	}

	// Listens to key events.  Exits when close is requested
	public void input() {
		for (Event event : window.pollEvents()) {
			if (event.type == Event.Type.CLOSED || Keyboard.isKeyPressed(Key.ESCAPE)) {
				window.close();
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new Main();					// Starts the program
	}
}
