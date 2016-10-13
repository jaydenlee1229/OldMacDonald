class Farm 
{     
   private Animal[] animals = new Animal[3];
   public Farm()
   {
   		animals[0] = new Cow("cow", "moo");
   		animals[1] = new Chick("chick", "cluck", "cheep");
   		animals[2] = new Pig("pig", "oink");
   }
   public void animalSounds()
   {
	   	for (int nI = 0; nI < animals.length; nI++)
	   	{
	   		System.out.println(animals[nI].getType() + " goes " + animals[nI].getSound());
	   	}
   }
}
