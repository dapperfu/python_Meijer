package e4;

import a3.t;
import d3.C13466a;
import e4.L;
import java.util.Collections;
import java.util.List;
import x3.O;

/* renamed from: e4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13620l implements InterfaceC13621m {

    /* renamed from: a, reason: collision with root package name */
    private final List<L.a> f128375a;

    /* renamed from: b, reason: collision with root package name */
    private final String f128376b;

    /* renamed from: c, reason: collision with root package name */
    private final O[] f128377c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f128378d;

    /* renamed from: e, reason: collision with root package name */
    private int f128379e;

    /* renamed from: f, reason: collision with root package name */
    private int f128380f;

    /* renamed from: g, reason: collision with root package name */
    private long f128381g = -9223372036854775807L;

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128378d = false;
        this.f128381g = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f128377c.length; i10++) {
            L.a aVar = this.f128375a.get(i10);
            dVar.a();
            O oT = rVar.t(dVar.c(), 3);
            oT.b(new t.b().f0(dVar.b()).U(this.f128376b).u0("application/dvbsubs").g0(Collections.singletonList(aVar.f128268c)).j0(aVar.f128266a).N());
            this.f128377c[i10] = oT;
        }
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) {
        if (this.f128378d) {
            if (this.f128379e != 2 || b(d10, 32)) {
                if (this.f128379e != 1 || b(d10, 0)) {
                    int iF = d10.f();
                    int iA = d10.a();
                    for (O o10 : this.f128377c) {
                        d10.W(iF);
                        o10.d(d10, iA);
                    }
                    this.f128380f += iA;
                }
            }
        }
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
        if (this.f128378d) {
            C13466a.g(this.f128381g != -9223372036854775807L);
            for (O o10 : this.f128377c) {
                o10.c(this.f128381g, 1, this.f128380f, 0, null);
            }
            this.f128378d = false;
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f128378d = true;
        this.f128381g = j10;
        this.f128380f = 0;
        this.f128379e = 2;
    }

    public C13620l(List<L.a> list, String str) {
        this.f128375a = list;
        this.f128376b = str;
        this.f128377c = new O[list.size()];
    }

    private boolean b(d3.D d10, int i10) {
        if (d10.a() == 0) {
            return false;
        }
        if (d10.H() != i10) {
            this.f128378d = false;
        }
        this.f128379e--;
        return this.f128378d;
    }
}
