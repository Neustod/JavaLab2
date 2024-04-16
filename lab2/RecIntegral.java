package lab1;

/**
 *
 * @author User
 */
public class RecIntegral {
    public RecIntegral()
    {
        limitL = "";
        limitR = "";
        dx = "";
        result = "";
    }
    
    public RecIntegral(IntegralCalculator src)
    {
        limitL = String.valueOf(src.A());
        limitR = String.valueOf(src.B());
        dx = String.valueOf(src.E());
        result = String.valueOf(src.F());
    }
    
    public RecIntegral(double _limitL, double _limitR, double _dx, double _result)
    {
        limitL = String.valueOf(_limitL);
        limitR = String.valueOf(_limitR);
        dx = String.valueOf(_dx);
        result = String.valueOf(_result);
    }
    
    private String limitL, limitR, dx, result;
    
    public String LimitL() { return limitL; }
    public String LimitR() { return limitR; }
    public String Dx() { return dx; }
    public String Result() { return result; }
    
    public void SetLimitL(double _limitL) { limitL = String.valueOf(_limitL); }
    public void SetLimitR(double _limitR) { limitR = String.valueOf(_limitR); }
    public void SetDx(double _dx) { dx = String.valueOf(_dx); }
    public void SetResult(double _result) { result = String.valueOf(_result); }
    
    public void Clear()
    {
        limitL = "";
        limitR = "";
        dx = "";
        result = "";
    }
}
