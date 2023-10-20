package firstProject;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GenericTest<Integer> igen = new GenericTest<Integer>(24);
        System.out.println(igen.getObject());
        GenericTest<String> sgen = new GenericTest<String>("Pranita");
        System.out.println(sgen.getObject());
	}
	
	//collection is interface 
	//generics needed 
	//Generics means paramterized types 
	//Types of generic
	//Generic Method: a generic method is a type parameterisied that are cited by actual way.
	//Generic class: contains a type parameter section.
	//In parameter we can't use primitives like int,char or double.
	

}

class GenericTest<k> {
	k obj;
	GenericTest(k obj){
		this.obj=obj;
	}
	public k getObject() {
		return this.obj;
	}
}
