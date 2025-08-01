package Day4;

// Document Object System.
abstract class Document{
	public String docId;
	public String title;
	public String content;
	
	
	
	public Document(String docId,String title, String content) {
		super();
		this.docId = docId;
		this.title = title;
		this.content = content;
	}

	 public void open() {
	        System.out.println("Opening PDF: " + title);
	    }

	    public void save() {
	        System.out.println("Saving PDF: " + title);
	    }

	    public void close() {
	        System.out.println("Closing PDF: " + title);
	    }
}

class PDFDocument extends Document{
	public PDFDocument(String docId, String title, String content) {
		super(docId, title, content);
	}

	 public void open() {
	        System.out.println("Opening PDF: " + title);
	    }

	    public void save() {
	        System.out.println("Saving PDF: " + title);
	    }

	    public void close() {
	        System.out.println("Closing PDF: " + title);
	    }
}

class WordDocument extends Document{
	
	public WordDocument(String docId, String title, String content) {
		super(docId, title, content);
	}

	 public void open() {
	        System.out.println("Opening PDF: " + title);
	    }

	    public void save() {
	        System.out.println("Saving PDF: " + title);
	    }

	    public void close() {
	        System.out.println("Closing PDF: " + title);
	    }
}
public class Abstraction {

	public static void main(String[] args) {

		
		
	}

}
