package da2.jjml.u1;

import java.io.Serializable;

public class Operation implements Serializable{
	private int valuex;
	private int valuey;
	

	public int getValuex() {
		return valuex;
	}


	public void setValuex(int valuex) {
		this.valuex = valuex;
	}


	public int getValuey() {
		return valuey;
	}


	public void setValuey(int valuey) {
		this.valuey = valuey;
	}


	public double getResult(){
		return (valuex +(3*valuey))*((2*valuex)+valuey);
	}
	
	

}
