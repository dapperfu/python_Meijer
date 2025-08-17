package h3;

import a3.C5560A;
import d3.InterfaceC13473h;
import d3.P;

/* loaded from: classes.dex */
public final class N implements I {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13473h f134206a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f134207b;

    /* renamed from: c, reason: collision with root package name */
    private long f134208c;

    /* renamed from: d, reason: collision with root package name */
    private long f134209d;

    /* renamed from: e, reason: collision with root package name */
    private C5560A f134210e = C5560A.f43549d;

    @Override // h3.I
    public long I() {
        long j10 = this.f134208c;
        if (!this.f134207b) {
            return j10;
        }
        long jC = this.f134206a.c() - this.f134209d;
        C5560A c5560a = this.f134210e;
        return j10 + (c5560a.f43552a == 1.0f ? P.M0(jC) : c5560a.a(jC));
    }

    public void a(long j10) {
        this.f134208c = j10;
        if (this.f134207b) {
            this.f134209d = this.f134206a.c();
        }
    }

    public void b() {
        if (this.f134207b) {
            return;
        }
        this.f134209d = this.f134206a.c();
        this.f134207b = true;
    }

    public void c() {
        if (this.f134207b) {
            a(I());
            this.f134207b = false;
        }
    }

    @Override // h3.I
    public void d(C5560A c5560a) {
        if (this.f134207b) {
            a(I());
        }
        this.f134210e = c5560a;
    }

    @Override // h3.I
    public C5560A f() {
        return this.f134210e;
    }

    public N(InterfaceC13473h interfaceC13473h) {
        this.f134206a = interfaceC13473h;
    }
}
