import java.security.PublicKey;

public class Segment
{
    public Point p,q;

    public Segment(Point p, Point q)
    {
        this.p=p;
        this.q=q;

    }

    @Override
    public String toString()
    {
        return "Segment{ p = "+p+", q= "+q+"}";
    }

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
