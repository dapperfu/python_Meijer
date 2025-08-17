package Mb;

/* loaded from: classes4.dex */
public class i implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private double f19092a;

    /* renamed from: b, reason: collision with root package name */
    private double f19093b;

    public i(double d10, double d11) {
        this.f19092a = d11;
        this.f19093b = d10;
    }

    public double a() {
        return this.f19093b;
    }

    public double b() {
        return this.f19092a;
    }

    protected void l(double d10) {
        this.f19093b = d10;
    }

    protected void m(double d10) {
        this.f19092a = d10;
    }

    public String toString() {
        return "(" + a() + "," + b() + ")";
    }

    public double e(i iVar) {
        double dB = b();
        double dA = a();
        double dB2 = iVar.b();
        double dA2 = iVar.a();
        double radians = Math.toRadians(dA - dA2);
        double d10 = radians / 2.0d;
        double radians2 = Math.toRadians(dB - dB2) / 2.0d;
        double dSin = (Math.sin(d10) * Math.sin(d10)) + (Math.cos(Math.toRadians(dA2)) * Math.cos(Math.toRadians(dA)) * Math.sin(radians2) * Math.sin(radians2));
        return Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d * 6371000.0d;
    }

    protected i() {
    }
}
