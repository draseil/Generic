import org.jsfml.graphics.RenderWindow;
import org.jsfml.window.Keyboard;
import org.jsfml.window.Keyboard.Key;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;

public class Main {

	public static final int WIDTH = 640, HEIGHT = 480;	// This sets the window's size
	public static final String TITLE = "JSFML Window";	// Sets the window's height

	private VideoMode mode;					// I don't really know how to explain what this is, so just add it.  In a way, it's the window's parameters
	private RenderWindow window;				// A render target (something for you to put sprites on).  A window, in this case

	public Main() {						// Constructor
		createObjects();				// Calls method

		while (window.isOpen()) {			// Calls methods as long as the window didn't close
			draw();
			input();
		}
	}

	public void createObjects() {
		mode	= new VideoMode(WIDTH, HEIGHT);		// Initialises the VideoMode to the height and width we want
		window	= new RenderWindow();			// Initialises the RenderWindow

		window.create(mode, TITLE);			// Draws the RenderWindow with the three parameters we set at the beginning
								// You can also add another param, which is Window.FULLSCREEN.  I'm sure you can guess what that does.
	}

	public void draw() {
		window.clear();					// This clears the window so that you don't get duplicate sprites whenever something moves
		window.display();				// This displays the window.
	}

	public void input() {
		for (Event event : window.pollEvents()) {	// If you want a key event for moving sprites, put it outside this for loop
			if (event.type == Event.Type.CLOSED || Keyboard.isKeyPressed(Key.ESCAPE)) {	// Checks to see if the escape button or cross button was pressed
				window.close();			// Closes the RenderWindow
				System.exit(0);			// Exits the program with a clean exit
			}
		}
	}

	public static void main(String[] args) {
		new Main();					// Starts the program
	}
}
