package spring1;

import java.util.Date;
import java.util.List;

public class Triangle {
	
	private String type;
	Date date;
	 private List<String> triangleList;
	 
	    public List<String> getTriangleList() {
	        return triangleList;
	    }
	 
	    public void setTriangleList(List<String> triangleList) {
	        this.triangleList = triangleList;
	    }
	     
	    public void printTriangles(){
	        System.out.println(this.triangleList);
	    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Triangle Drawn: [date=" + date + "]";
	}

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Triangle Drawn");
	}
}
