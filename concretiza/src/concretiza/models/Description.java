package concretiza.models;

public class Description {
	private String text;
	private float weight;
	private float height;
	private float width;
	private float depth;
	
	public Description(String text,float weight,float height,float width,float depth) {
		this.text = text;
		this.weight = weight;
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public Description(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return this.width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getDepth() {
		return this.depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	
}
