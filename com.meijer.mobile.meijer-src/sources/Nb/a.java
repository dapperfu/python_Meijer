package Nb;

import com.medallia.digital.mobilesdk.l8;
import eb.C13784a;
import eb.C13785b;

/* loaded from: classes4.dex */
public class a implements Pb.a {

    /* renamed from: m, reason: collision with root package name */
    private static final C13784a f20738m = C13785b.a(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private String f20739a;

    /* renamed from: b, reason: collision with root package name */
    private int f20740b;

    /* renamed from: c, reason: collision with root package name */
    private long f20741c;

    /* renamed from: d, reason: collision with root package name */
    private long f20742d;

    /* renamed from: e, reason: collision with root package name */
    private double f20743e;

    /* renamed from: f, reason: collision with root package name */
    private long f20744f;

    /* renamed from: g, reason: collision with root package name */
    private long f20745g;

    /* renamed from: h, reason: collision with root package name */
    private o f20746h;

    /* renamed from: i, reason: collision with root package name */
    private long f20747i;

    /* renamed from: j, reason: collision with root package name */
    private int f20748j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20749k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20750l;

    public a(String str, int i10, long j10, long j11) {
        this.f20739a = str;
        this.f20740b = i10;
        this.f20741c = j10;
        this.f20742d = j11;
        long jD = d();
        this.f20745g = jD;
        this.f20744f = jD;
    }

    public synchronized boolean a() {
        try {
            b();
            double d10 = this.f20743e + 1.0d;
            this.f20743e = d10;
            if (d10 <= this.f20740b || this.f20745g <= d() - this.f20742d) {
                this.f20745g = d();
                this.f20750l = !this.f20749k;
                this.f20749k = true;
            } else {
                c();
                this.f20750l = this.f20749k;
                this.f20749k = false;
            }
            e();
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20749k;
    }

    private void e() {
        this.f20748j++;
        long jD = d() - this.f20747i;
        if (this.f20750l || jD > l8.b.f93365c || (this.f20748j > 5 && jD > l8.b.f93364b)) {
            o oVar = this.f20746h;
            if (oVar.f20786b.get(c()) == null) {
                c();
            } else {
                oVar.f20785a.a(c(), this);
            }
            this.f20747i = d();
            this.f20748j = 0;
        }
    }

    public String c() {
        return this.f20739a;
    }

    public void g(int i10) {
        this.f20740b = i10;
    }

    public void h(long j10) {
        this.f20742d = j10;
    }

    public void i(long j10) {
        this.f20741c = j10;
    }

    public void j(o oVar) {
        this.f20746h = oVar;
    }

    private void b() {
        if (d() > this.f20744f + this.f20741c) {
            this.f20743e /= 2.0d;
            this.f20744f = d();
        }
    }

    private long d() {
        return System.currentTimeMillis();
    }

    public void f() {
        b();
        e();
    }

    public a() {
    }
}
