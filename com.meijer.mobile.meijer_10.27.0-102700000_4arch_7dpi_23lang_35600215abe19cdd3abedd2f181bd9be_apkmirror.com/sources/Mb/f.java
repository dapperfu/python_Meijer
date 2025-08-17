package Mb;

import java.util.Date;

/* loaded from: classes4.dex */
public class f extends i implements Comparable<f> {

    /* renamed from: c, reason: collision with root package name */
    private double f19081c;

    /* renamed from: d, reason: collision with root package name */
    private double f19082d;

    /* renamed from: e, reason: collision with root package name */
    private long f19083e;

    /* renamed from: f, reason: collision with root package name */
    private String f19084f;

    public f(double d10, double d11, double d12, long j10, String str) {
        super(d10, d11);
        this.f19081c = d12;
        this.f19083e = j10;
        this.f19084f = str;
    }

    public double p() {
        return this.f19081c;
    }

    public double t() {
        return this.f19082d;
    }

    @Override // Mb.i
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(a());
        sb2.append(",");
        sb2.append(b());
        sb2.append(":");
        sb2.append(p());
        sb2.append(" @ ");
        sb2.append(new Date(u()).toString());
        sb2.append("/millis=");
        sb2.append(u());
        if (t() > 0.0d) {
            str = "/spd=" + t();
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    public long u() {
        return this.f19083e;
    }

    public String w() {
        return this.f19084f;
    }

    @Override // java.lang.Comparable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        long jU = u() - fVar.u();
        if (jU > 0) {
            return 1;
        }
        if (jU < 0) {
            return -1;
        }
        return 0;
    }

    public long z(f fVar) {
        return fVar.u() - u();
    }

    public f(f fVar, f fVar2) {
        super(fVar.a(), fVar.b());
        this.f19081c = fVar.p();
        this.f19083e = fVar2.u();
        this.f19084f = fVar2.w();
    }

    private f() {
    }
}
