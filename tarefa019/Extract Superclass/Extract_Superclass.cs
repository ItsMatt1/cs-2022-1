// Before refactoring
public class Circle : IDrawable
{
    public Point Center { get; private set; }
    public Color MyColor { get; private set; }
    public int Radius { get; private set; }
    public void Funcionalidade()
    {
    // Funcionalidade...
    }
}
public interface IDrawable
{
    void Funcionalidade();
}
// After refactoring
public abstract class Shape : IDrawable
{
    public Color MyColor { get; private set; }
    public abstract void Funcionalidade();
}
public class Circle : Shape
{
    public Point Center { get; private set; }
    public int Radius { get; private set; }
    public override void Funcionalidade()
    {
    // Funcionalidade...
    }
}
public interface IDrawable
{
    void Funcionalidade();
}