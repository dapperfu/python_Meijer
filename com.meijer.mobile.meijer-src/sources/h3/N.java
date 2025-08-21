package h3;

import a3.C5643A;
import d3.InterfaceC13606h;
import d3.P;

/* loaded from: classes.dex */
public final class N implements I {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13606h f134677a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f134678b;

    /* renamed from: c, reason: collision with root package name */
    private long f134679c;

    /* renamed from: d, reason: collision with root package name */
    private long f134680d;

    /* renamed from: e, reason: collision with root package name */
    private C5643A f134681e = C5643A.f44367d;

    @Override // h3.I
    public long I() {
        long j10 = this.f134679c;
        if (!this.f134678b) {
            return j10;
        }
        long jC = this.f134677a.c() - this.f134680d;
        C5643A c5643a = this.f134681e;
        return j10 + (c5643a.f44370a == 1.0f ? P.M0(jC) : c5643a.a(jC));
    }

    public void a(long j10) {
        this.f134679c = j10;
        if (this.f134678b) {
            this.f134680d = this.f134677a.c();
        }
    }

    public void b() {
        if (this.f134678b) {
            return;
        }
        this.f134680d = this.f134677a.c();
        this.f134678b = true;
    }

    public void c() {
        if (this.f134678b) {
            a(I());
            this.f134678b = false;
        }
    }

    @Override // h3.I
    public void d(C5643A c5643a) {
        if (this.f134678b) {
            a(I());
        }
        this.f134681e = c5643a;
    }

    @Override // h3.I
    public C5643A f() {
        return this.f134681e;
    }

    public N(InterfaceC13606h interfaceC13606h) {
        this.f134677a = interfaceC13606h;
    }
}
