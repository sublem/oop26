public class Segment
{
    public Point p,q;


    public float length()
    {
    return (float) Math.hypot(p.getX() - q.getX(), p.getY() - q.getY());
    }
    public static Segment findmax(Segment[] segmenets)
    {
        Segment maxSeg = segmenets[0];
        for (Segment s : segmenets)
        {
            if (s.length()> maxSeg.length()) maxSeg = s;
        }
        return maxSeg;
    }
}
