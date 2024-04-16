package lab1;

/**
 *
 * @author User
 */
public class IntegralCalculator {
    
    public IntegralCalculator()
    {
        a = 0;
        b = 1;
        e = 1.0e-4;
    }
    
    public IntegralCalculator(double _a, double _b, double _e)
    {
        if (_a > _b)
        {
            a = _b;
            b = _a;
        }
        else 
        {
            a = _a;
            b = _b;
        }
        
        if (_e == 0) { e = 1.0e-4; }
        else { e = Math.abs(_e); }
    }
    
    private double e, a, b;
    
    public double E() { return e; }
    public double A() { return a; }
    public double B() { return b; }
    
    public void SetE(double _e) {
        if (_e == 0) return;
        e = Math.abs(_e); 
    }
    
    public void SetArea(double _a, double _b) {
        if (_a > _b)
        {
            a = _b;
            b = _a;
        }
        else
        {
            a = _a;
            b = _b;
        }
    }
    
    public double F()
    {
        double result = 0;
        double lBound = a, rBound = a + e;
        
        while (rBound < b)
        {
            result += e * (Math.exp(-lBound) + Math.exp(-rBound)) / 2;
            
            lBound += e;
            rBound += e;
        }
        
        if (lBound < b) result += e * (Math.exp(-lBound) + Math.exp(-b)) / 2;
        
        return result;
    }
}
