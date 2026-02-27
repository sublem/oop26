public class Segmenet
{
    public Point p,q;
    public float length()
    {
    return (float) Math.hypot(p.x - q.x, p.y - q.y);
    }
}
