package InterfaceDemo;

interface I3{
    public void x();
}

interface I4 extends I3{
    public void z();
    //private void z();
}

public class InterfaceDemo6 implements I4{
    public void x(){}
    public void z(){}
}
