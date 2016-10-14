class Farm 
{     
   private Animal[] animals = new Animal[3];
   public Farm()
   {
   		animals[0] = new NamedCow("Cow", "Albert", "moo");
   		animals[1] = new Chick("Chick", "cluck", "cheep");
   		animals[2] = new Pig("Pig", "oink");
   }
   public void animalSounds()
   {
	   	for (int nI = 0; nI < animals.length; nI++)
	   	{
	   		System.out.println(animals[nI].getType() + " goes " + animals[nI].getSound());
	   	}
         System.out.println("The cow is known as " + ((NamedCow)animals[0]).getName());
   }
}
