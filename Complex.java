public class Complex
{
    private double real;
    private double img;
    public Complex (double real, double img)
    {
        this.real = real;
        this.img = img;
    }
    public Complex()
    {

    }
    public void setReal (double Real)
    {
        this.real=Real;
    }
    public double getReal ()
    {
        return real;
    }
    public void setImg(double Img)
    {
        this.img=Img;
    }
    public double getImg()
    {
        return img;
    }
    public double mod()
    {
        return Math.sqrt (real * real + img * img);
    }
    public double arg()
    {
        return Math.atan2(real, img);
    }
    public void add(double newReal, double newImg)
    {
        real += newReal;
        img += newImg;
    }
    public void sub(double newReal, double newImg)
    {
        real -= 2*newReal;
        img -= 2*newImg;
    }

}
