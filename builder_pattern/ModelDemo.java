// model class for immutable objects

import java.util.Date;
class Person {
	private String name;
	private Date dob;
	private int id;
	/*declare the constructor as private so as to ensure that only the builder class is
		used to create an object. Howeber declaring it public will let you create object
		but with all the attributes set to the default values*/
	private Person() {}

	public String getName() {
		return name;//strings are immutable so no need for a defensive copy
	}

	public Date getDOB() {
		return new Date(dob.getTime());//return a defensive copy instead of
		// the original one to maintain immutability of the Object
	}

	public int getId() {
		return id;// defensive copies are meaningless for primitive type;
	}

	public static class Builder {
		private String name;
		private Date dob;
		private int id;

		Builder() {
			name=null;
			dob=null;
			id = -1;
		}

		/*This constructor allows creation of copy of the object.
		 if no setter method is called then the new object created has same attributes as the one passed in the
		parameters. If a setter method is called then only that value is set and other values are the same as that of
		the object passed as argument*/
		Builder(Person person) {
			name = person.getName();
			dob = person.getDOB();
			id = person.getId();
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setDOB(Date date) {
			this.dob = new Date(date.getTime());// new object for immutability;
			return this;
		}

		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public Person build() {
			Person person = new Person();
			person.name = this.name;
			person.dob = this.dob;
			person.id = this.id;

			return person;
		}


	}

	@Override
	public String toString() {
		return id+" "+name+" "+dob;
	}
}

class ModelDemo {
	public static void main(String[] args) {
		/* The line below will give error */
		//Person person = new Person();

		Person person1 = new Person.Builder()
							.setName("XYZ")
							.setDOB(new Date())
							.setId(1)
							.build();

		System.out.println(person1);

		Person person2 = new Person.Builder(person1)
							.setId(2)
							.build();

		System.out.println(person2);


	}
}
