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


//boolean containsAll(collection<?>c)
//boolean addAll(collection<?extends E>c)
//boolean removeAll(collection<?>c)
//boolean retainAll(collection<?>c)
//void clear()

//Lists
//Lists are collections that maintain their elements in order and can contain duplicates
//Elements are ordered
//Each element are position based, starting from index 0


//lists Methods
//E get(int index)-
//E set(int index, E element)-
//void add(int index, E element)
//boolean addAll(int index,collections<?extend f>c)
//E remove(int index)
