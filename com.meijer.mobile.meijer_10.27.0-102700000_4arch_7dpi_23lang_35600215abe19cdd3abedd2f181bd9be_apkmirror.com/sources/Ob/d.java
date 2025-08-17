package Ob;

import android.location.Location;

/* loaded from: classes4.dex */
public class d implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private long f23485a;

    /* renamed from: b, reason: collision with root package name */
    private double f23486b;

    /* renamed from: c, reason: collision with root package name */
    private double f23487c;

    /* renamed from: d, reason: collision with root package name */
    private double f23488d;

    /* renamed from: e, reason: collision with root package name */
    private float f23489e;

    /* renamed from: f, reason: collision with root package name */
    private int f23490f;

    /* renamed from: g, reason: collision with root package name */
    private float f23491g;

    /* renamed from: h, reason: collision with root package name */
    private double f23492h;

    public static d a(Location location) {
        d dVar = new d();
        dVar.h(location.getTime());
        dVar.i(location.getLatitude());
        dVar.j(location.getLongitude());
        dVar.g(location.getAccuracy());
        dVar.k(location.getSpeed());
        dVar.f(location.getBearing());
        dVar.e(location.getAltitude());
        return dVar;
    }

    public long b() {
        return this.f23485a;
    }

    public double c() {
        return this.f23486b;
    }

    public double d() {
        return this.f23487c;
    }

    public void e(double d10) {
        this.f23492h = d10;
    }

    public void f(float f10) {
        this.f23491g = f10;
    }

    public void g(double d10) {
        this.f23488d = d10;
    }

    public void h(long j10) {
        this.f23485a = j10;
    }

    public void i(double d10) {
        this.f23486b = d10;
    }

    public void j(double d10) {
        this.f23487c = d10;
    }

    public void k(float f10) {
        this.f23489e = f10;
    }

    public String toString() {
        return "BCProtocol{fixTime=" + this.f23485a + ", latitude=" + this.f23486b + ", longitude=" + this.f23487c + ", fixAccuracy=" + this.f23488d + ", speed=" + this.f23489e + ", timeZoneOffset=" + this.f23490f + ", bearing=" + this.f23491g + ", altitude=" + this.f23492h + '}';
    }
}
