package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class KA0 {

    /* renamed from: a, reason: collision with root package name */
    private final FA0 f68888a;

    /* renamed from: b, reason: collision with root package name */
    private final int f68889b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f68890c = false;

    public KA0(FA0 fa0, int i10) {
        this.f68888a = fa0;
        this.f68889b = i10;
    }

    public final void f(JA0 ja0, C[] cArr, SF0 sf0, long j10, boolean z10, boolean z11, long j11, long j12, C7578aF0 c7578aF0, Vy0 vy0) throws zzib {
        this.f68890c = true;
        this.f68888a.l(ja0, cArr, sf0, j10, z10, z11, j11, j12, c7578aF0);
        vy0.c(this.f68888a);
    }

    public final boolean z(C8208gA0 c8208gA0) {
        FA0 fa0 = null;
        if (c8208gA0 != null) {
            int i10 = this.f68889b;
            SF0[] sf0Arr = c8208gA0.f75104c;
            if (sf0Arr[i10] != null && this.f68888a.zzp() == sf0Arr[i10]) {
                fa0 = this.f68888a;
            }
        }
        return fa0 != null;
    }

    public final int b() {
        return A(this.f68888a) ? 1 : 0;
    }

    public final int c() {
        return this.f68888a.zzb();
    }

    public final void e(Vy0 vy0) {
        FA0 fa0 = this.f68888a;
        if (A(fa0)) {
            vy0.b(fa0);
            a(fa0);
            fa0.zzr();
        }
    }

    public final void g() {
        if (A(this.f68888a)) {
            this.f68888a.zzt();
        }
    }

    public final void h(int i10, Object obj) throws zzib {
        this.f68888a.v(11, obj);
    }

    public final void i() throws IOException {
        this.f68888a.zzw();
    }

    public final void j() {
        this.f68888a.zzG();
        this.f68890c = false;
    }

    public final void k(long j10, long j11) throws zzib {
        if (A(this.f68888a)) {
            this.f68888a.m(j10, j11);
        }
    }

    public final void l(C[] cArr, SF0 sf0, long j10, long j11, C7578aF0 c7578aF0) throws zzib {
        this.f68888a.e(cArr, sf0, j10, j11, c7578aF0);
    }

    public final void m() {
        if (this.f68890c) {
            this.f68888a.h();
            this.f68890c = false;
        }
    }

    public final void n(long j10) throws zzib {
        if (A(this.f68888a)) {
            this.f68888a.p(j10);
        }
    }

    public final void o(long j10) {
        FA0 fa0 = this.f68888a;
        fa0.n();
        if (fa0 instanceof C8220gG0) {
            throw null;
        }
    }

    public final void p(float f10, float f11) throws zzib {
        this.f68888a.s(f10, f11);
    }

    public final void q(AbstractC7432Wl abstractC7432Wl) {
        this.f68888a.j(abstractC7432Wl);
    }

    public final void r(Object obj) throws zzib {
        if (this.f68888a.zzb() == 2) {
            this.f68888a.v(1, obj);
        }
    }

    public final void s() throws zzib {
        if (this.f68888a.k() == 1) {
            this.f68888a.c();
        }
    }

    public final void t() {
        if (A(this.f68888a)) {
            a(this.f68888a);
        }
    }

    public final boolean u(C8208gA0 c8208gA0) throws IOException {
        SF0 sf0 = c8208gA0.f75104c[this.f68889b];
        FA0 fa0 = this.f68888a;
        boolean z10 = sf0 != fa0.zzp();
        return z10 || (!z10 && fa0.d()) || fa0.o() || fa0.a();
    }

    public final boolean v(C8208gA0 c8208gA0) {
        SF0 sf0 = c8208gA0.f75104c[this.f68889b];
        if (this.f68888a.zzp() != sf0) {
            return false;
        }
        if (sf0 == null || this.f68888a.d()) {
            return true;
        }
        c8208gA0.g();
        boolean z10 = c8208gA0.f75108g.f75462f;
        return false;
    }

    public final boolean w() {
        return this.f68888a.d();
    }

    public final boolean x() {
        return this.f68888a.f();
    }

    public final boolean y() {
        return this.f68888a.a();
    }

    private static boolean A(FA0 fa0) {
        if (fa0.k() != 0) {
            return true;
        }
        return false;
    }

    private static final void a(FA0 fa0) {
        if (fa0.k() == 2) {
            fa0.t();
        }
    }

    public final long d(C8208gA0 c8208gA0) {
        C8211gC.f(z(c8208gA0));
        return this.f68888a.u();
    }
}
