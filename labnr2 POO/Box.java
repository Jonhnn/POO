
public class Box {

    int height;
    int weight;
    int depth;
    
    
    Box(){
	    height = 1;
		weight = 1;
		depth = 1;
    }
    
    Box(int height){
    	this.height = height;
    	this.weight = height;
    	this.depth = height;
    }
    
    Box(int h, int w, int d){
    	this.height = h;
    	this.weight = w;
    	this.depth = d;	    	
    }
    
    public double volume() {
    	return this.height * this.weight *this.depth;
    }
	    
    public double aria() {
    	return (2 * this.depth * this.weight + 2 * this.depth * this.height + 2 * this.height * this.weight);
    }
    public String showRes()
    {
        return ("\nHeight: " + this.height + "\nWidth: " + this.weight + "\nDepth: " + this.depth);
    }
    
}
