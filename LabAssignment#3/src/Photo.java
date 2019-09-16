
public class Photo {
	private float size;
	private String dimensions;

	@Override
	public String toString() {
		return "Photo [size=" + size + ", dimensions=" + dimensions + "]";
	}
	
	
	// default constructor	
		public Photo() {
		size = size;
		dimensions = "";
		}
	
	
	
	public Photo(float size, String dimensions) {
		this.size = size;
		this.dimensions = dimensions;
	}
	
	
	//GETTERS AND SETTERS 
	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	
	public String getDimensions() {
		return dimensions;
	}

	
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	
	

}
