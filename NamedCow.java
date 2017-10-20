class NamedCow extends Cow 
{
	private String myName;
	public NamedCow(String type, String cowName, String sound )
	{
		myType = type;
		myName = cowName;
		sound = mySound;

	}
	public String getName()
	{
		return myName;
	}


}