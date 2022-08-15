// Antes
class Circle
{
  public Point Center { get; private set; }
  public Color Color { get; private set; }
  public int Radius { get; private set; }
  
  public void Func()
  {
    // Funcionalidade...
  }
}
// Depois
interface IShape
{
  Color Color { get; }
  void Func();
}
class Circle : IShape
{
  public Point Center { get; private set; }
  public Color Color { get; private set; }
  public int Radius { get; private set; }

  public void Func()
  {
    // Funcionalidade...
  }
}