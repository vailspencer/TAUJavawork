package Chapter9;

public class Square extends Rectangle
{
    @Override
    public double calculatePermiter()
    {
        return sides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}

