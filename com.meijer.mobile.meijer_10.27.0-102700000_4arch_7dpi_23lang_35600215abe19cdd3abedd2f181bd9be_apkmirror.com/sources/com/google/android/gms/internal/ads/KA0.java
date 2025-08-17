package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class KA0 {

    /* renamed from: a, reason: collision with root package name */
    private final FA0 f68048a;

    /* renamed from: b, reason: collision with root package name */
    private final int f68049b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f68050c = false;

    public KA0(FA0 fa0, int i10) {
        this.f68048a = fa0;
        this.f68049b = i10;
    }

    public final void f(JA0 ja0, C[] cArr, SF0 sf0, long j10, boolean z10, boolean z11, long j11, long j12, C7453aF0 c7453aF0, Vy0 vy0) throws zzib {
        this.f68050c = true;
        this.f68048a.l(ja0, cArr, sf0, j10, z10, z11, j11, j12, c7453aF0);
        vy0.c(this.f68048a);
    }

    public final boolean z(C8083gA0 c8083gA0) {
        FA0 fa0 = null;
        if (c8083gA0 != null) {
            int i10 = this.f68049b;
            SF0[] sf0Arr = c8083gA0.f74264c;
            if (sf0Arr[i10] != null && this.f68048a.zzp() == sf0Arr[i10]) {
                fa0 = this.f68048a;
            }
        }
        return fa0 != null;
    }

    public final int b() {
        return A(this.f68048a) ? 1 : 0;
    }

    public final int c() {
        return this.f68048a.zzb();
    }

    public final void e(Vy0 vy0) {
        FA0 fa0 = this.f68048a;
        if (A(fa0)) {
            vy0.b(fa0);
            a(fa0);
            fa0.zzr();
        }
    }

    public final void g() {
        if (A(this.f68048a)) {
            this.f68048a.zzt();
        }
    }

    public final void h(int i10, Object obj) throws zzib {
        this.f68048a.v(11, obj);
    }

    public final void i() throws IOException {
        this.f68048a.zzw();
    }

    public final void j() {
        this.f68048a.zzG();
        this.f68050c = false;
    }

    public final void k(long j10, long j11) throws zzib {
        if (A(this.f68048a)) {
            this.f68048a.m(j10, j11);
        }
    }

    public final void l(C[] cArr, SF0 sf0, long j10, long j11, C7453aF0 c7453aF0) throws zzib {
        this.f68048a.e(cArr, sf0, j10, j11, c7453aF0);
    }

    public final void m() {
        if (this.f68050c) {
            this.f68048a.g();
            this.f68050c = false;
        }
    }

    public final void n(long j10) throws zzib {
        if (A(this.f68048a)) {
            this.f68048a.p(j10);
        }
    }

    public final void o(long j10) {
        FA0 fa0 = this.f68048a;
        fa0.n();
        if (fa0 instanceof C8095gG0) {
            throw null;
        }
    }

    public final void p(float f10, float f11) throws zzib {
        this.f68048a.s(f10, f11);
    }

    public final void q(AbstractC7307Wl abstractC7307Wl) {
        this.f68048a.j(abstractC7307Wl);
    }

    public final void r(Object obj) throws zzib {
        if (this.f68048a.zzb() == 2) {
            this.f68048a.v(1, obj);
        }
    }

    public final void s() throws zzib {
        if (this.f68048a.k() == 1) {
            this.f68048a.c();
        }
    }

    public final void t() {
        if (A(this.f68048a)) {
            a(this.f68048a);
        }
    }

    public final boolean u(C8083gA0 c8083gA0) throws IOException {
        SF0 sf0 = c8083gA0.f74264c[this.f68049b];
        FA0 fa0 = this.f68048a;
        boolean z10 = sf0 != fa0.zzp();
        return z10 || (!z10 && fa0.d()) || fa0.o() || fa0.a();
    }

    public final boolean v(C8083gA0 c8083gA0) {
        SF0 sf0 = c8083gA0.f74264c[this.f68049b];
        if (this.f68048a.zzp() != sf0) {
            return false;
        }
        if (sf0 == null || this.f68048a.d()) {
            return true;
        }
        c8083gA0.g();
        boolean z10 = c8083gA0.f74268g.f74622f;
        return false;
    }

    public final boolean w() {
        return this.f68048a.d();
    }

    public final boolean x() {
        return this.f68048a.h();
    }

    public final boolean y() {
        return this.f68048a.a();
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

    public final long d(C8083gA0 c8083gA0) {
        C8086gC.f(z(c8083gA0));
        return this.f68048a.u();
    }
}
