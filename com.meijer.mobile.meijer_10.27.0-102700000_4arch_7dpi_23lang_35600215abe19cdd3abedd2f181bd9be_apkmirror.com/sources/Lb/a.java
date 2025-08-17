package Lb;

import cb.C6380a;
import cb.C6381b;
import com.medallia.digital.mobilesdk.l8;

/* loaded from: classes4.dex */
public class a implements Nb.a {

    /* renamed from: m, reason: collision with root package name */
    private static final C6380a f17918m = C6381b.a(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private String f17919a;

    /* renamed from: b, reason: collision with root package name */
    private int f17920b;

    /* renamed from: c, reason: collision with root package name */
    private long f17921c;

    /* renamed from: d, reason: collision with root package name */
    private long f17922d;

    /* renamed from: e, reason: collision with root package name */
    private double f17923e;

    /* renamed from: f, reason: collision with root package name */
    private long f17924f;

    /* renamed from: g, reason: collision with root package name */
    private long f17925g;

    /* renamed from: h, reason: collision with root package name */
    private o f17926h;

    /* renamed from: i, reason: collision with root package name */
    private long f17927i;

    /* renamed from: j, reason: collision with root package name */
    private int f17928j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17929k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17930l;

    public a(String str, int i10, long j10, long j11) {
        this.f17919a = str;
        this.f17920b = i10;
        this.f17921c = j10;
        this.f17922d = j11;
        long jD = d();
        this.f17925g = jD;
        this.f17924f = jD;
    }

    public synchronized boolean a() {
        try {
            b();
            double d10 = this.f17923e + 1.0d;
            this.f17923e = d10;
            if (d10 <= this.f17920b || this.f17925g <= d() - this.f17922d) {
                this.f17925g = d();
                this.f17930l = !this.f17929k;
                this.f17929k = true;
            } else {
                c();
                this.f17930l = this.f17929k;
                this.f17929k = false;
            }
            e();
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f17929k;
    }

    private void e() {
        this.f17928j++;
        long jD = d() - this.f17927i;
        if (this.f17930l || jD > l8.b.f92526c || (this.f17928j > 5 && jD > l8.b.f92525b)) {
            o oVar = this.f17926h;
            if (oVar.f17966b.get(c()) == null) {
                c();
            } else {
                oVar.f17965a.a(c(), this);
            }
            this.f17927i = d();
            this.f17928j = 0;
        }
    }

    public String c() {
        return this.f17919a;
    }

    public void g(int i10) {
        this.f17920b = i10;
    }

    public void h(long j10) {
        this.f17922d = j10;
    }

    public void i(long j10) {
        this.f17921c = j10;
    }

    public void j(o oVar) {
        this.f17926h = oVar;
    }

    private void b() {
        if (d() > this.f17924f + this.f17921c) {
            this.f17923e /= 2.0d;
            this.f17924f = d();
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
