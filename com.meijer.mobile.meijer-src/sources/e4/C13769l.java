package e4;

import a3.t;
import d3.C13599a;
import e4.L;
import java.util.Collections;
import java.util.List;
import x3.O;

/* renamed from: e4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13769l implements InterfaceC13770m {

    /* renamed from: a, reason: collision with root package name */
    private final List<L.a> f129711a;

    /* renamed from: b, reason: collision with root package name */
    private final String f129712b;

    /* renamed from: c, reason: collision with root package name */
    private final O[] f129713c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f129714d;

    /* renamed from: e, reason: collision with root package name */
    private int f129715e;

    /* renamed from: f, reason: collision with root package name */
    private int f129716f;

    /* renamed from: g, reason: collision with root package name */
    private long f129717g = -9223372036854775807L;

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129714d = false;
        this.f129717g = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f129713c.length; i10++) {
            L.a aVar = this.f129711a.get(i10);
            dVar.a();
            O oT = rVar.t(dVar.c(), 3);
            oT.b(new t.b().f0(dVar.b()).U(this.f129712b).u0("application/dvbsubs").g0(Collections.singletonList(aVar.f129604c)).j0(aVar.f129602a).N());
            this.f129713c[i10] = oT;
        }
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) {
        if (this.f129714d) {
            if (this.f129715e != 2 || b(d10, 32)) {
                if (this.f129715e != 1 || b(d10, 0)) {
                    int iF = d10.f();
                    int iA = d10.a();
                    for (O o10 : this.f129713c) {
                        d10.W(iF);
                        o10.d(d10, iA);
                    }
                    this.f129716f += iA;
                }
            }
        }
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
        if (this.f129714d) {
            C13599a.g(this.f129717g != -9223372036854775807L);
            for (O o10 : this.f129713c) {
                o10.c(this.f129717g, 1, this.f129716f, 0, null);
            }
            this.f129714d = false;
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f129714d = true;
        this.f129717g = j10;
        this.f129716f = 0;
        this.f129715e = 2;
    }

    public C13769l(List<L.a> list, String str) {
        this.f129711a = list;
        this.f129712b = str;
        this.f129713c = new O[list.size()];
    }

    private boolean b(d3.D d10, int i10) {
        if (d10.a() == 0) {
            return false;
        }
        if (d10.H() != i10) {
            this.f129714d = false;
        }
        this.f129715e--;
        return this.f129714d;
    }
}
