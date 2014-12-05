import org.jsfml.graphics.RenderWindow;
import org.jsfml.window.Keyboard;
import org.jsfml.window.Keyboard.Key;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;

public class Main {

	public static final int WIDTH = 640, HEIGHT = 480;
	public static final String TITLE = "JSFML Window";	// Set 3 variables, the window's width, height and title

	private VideoMode mode;					// I don't really know how to explain what this is, so just add it.  In a way, it's the window's parameters
	private RenderWindow window;				// A render target (something for you to put sprites on).  A window, in this case

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

		window.create(mode, TITLE);			// Draws the RenderWindow with the three parameters we set at the beginning
								// You can also add another param, which is Window.FULLSCREEN.
	}

	public void draw() {
		window.clear();					// This clears the window so that you don't get duplicate sprites whenever something moves
		// Put window.draw(drawable object) to draw stuff.  Read up on sprites, textures and images to find out more
		window.display();
	}

	public void input() {
		for (Event event : window.pollEvents()) {	// If you want a key event for moving sprites, put it outside this for loop
			if (event.type == Event.Type.CLOSED || Keyboard.isKeyPressed(Key.ESCAPE)) {
				window.close();			// Closes the window when close is requested
				System.exit(0);			// Exits the program with a clean exit
			}
		}
	}

	public static void main(String[] args) {
		new Main();					// Starts the program
	}
}
