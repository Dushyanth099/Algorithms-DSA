package Programs;

public class parse_int {

	public static void main(String[] args) {
		//wrapper class
		//converting integer object into float/double object
		Integer x=10;
		Float f=x.floatValue();
		System.out.println(x.floatValue());
		System.out.println("f ="+f);
		//converting primitive data type into objects
		String str="10";//primitive data type
			Integer y=Integer.parseInt(str);
			Double d=y.doubleValue();
			System.out.println("y="+y);
			System.out.println("d="+d);
			//String str2=d.toString();
			System.out.println(d.toString());
			System.out.println(String.valueOf(str));
	}
	

	}


