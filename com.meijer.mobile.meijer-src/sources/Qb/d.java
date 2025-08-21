package Qb;

import android.location.Location;

/* loaded from: classes4.dex */
public class d implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private long f27973a;

    /* renamed from: b, reason: collision with root package name */
    private double f27974b;

    /* renamed from: c, reason: collision with root package name */
    private double f27975c;

    /* renamed from: d, reason: collision with root package name */
    private double f27976d;

    /* renamed from: e, reason: collision with root package name */
    private float f27977e;

    /* renamed from: f, reason: collision with root package name */
    private int f27978f;

    /* renamed from: g, reason: collision with root package name */
    private float f27979g;

    /* renamed from: h, reason: collision with root package name */
    private double f27980h;

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
        return this.f27973a;
    }

    public double c() {
        return this.f27974b;
    }

    public double d() {
        return this.f27975c;
    }

    public void e(double d10) {
        this.f27980h = d10;
    }

    public void f(float f10) {
        this.f27979g = f10;
    }

    public void g(double d10) {
        this.f27976d = d10;
    }

    public void h(long j10) {
        this.f27973a = j10;
    }

    public void i(double d10) {
        this.f27974b = d10;
    }

    public void j(double d10) {
        this.f27975c = d10;
    }

    public void k(float f10) {
        this.f27977e = f10;
    }

    public String toString() {
        return "BCProtocol{fixTime=" + this.f27973a + ", latitude=" + this.f27974b + ", longitude=" + this.f27975c + ", fixAccuracy=" + this.f27976d + ", speed=" + this.f27977e + ", timeZoneOffset=" + this.f27978f + ", bearing=" + this.f27979g + ", altitude=" + this.f27980h + '}';
    }
}
