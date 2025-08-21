package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7654b0 {

    /* renamed from: a, reason: collision with root package name */
    protected final V f73532a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC7547a0 f73533b;

    /* renamed from: c, reason: collision with root package name */
    protected X f73534c;

    /* renamed from: d, reason: collision with root package name */
    private final int f73535d;

    protected C7654b0(Y y10, InterfaceC7547a0 interfaceC7547a0, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f73533b = interfaceC7547a0;
        this.f73535d = i10;
        this.f73532a = new V(y10, j10, 0L, j12, j13, j14, j15);
    }

    protected static final int f(InterfaceC9361r0 interfaceC9361r0, long j10, N0 n02) {
        if (j10 == interfaceC9361r0.zzf()) {
            return 0;
        }
        n02.f69630a = j10;
        return 1;
    }

    public final Q0 b() {
        return this.f73532a;
    }

    protected final void c(boolean z10, long j10) {
        this.f73534c = null;
        this.f73533b.zzb();
    }

    public final boolean e() {
        return this.f73534c != null;
    }

    public final int a(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        while (true) {
            X x10 = this.f73534c;
            C8211gC.b(x10);
            long j10 = x10.f72068f;
            long j11 = x10.f72069g;
            long j12 = x10.f72070h;
            if (j11 - j10 <= this.f73535d) {
                c(false, j10);
                return f(interfaceC9361r0, j10, n02);
            }
            if (!g(interfaceC9361r0, j12)) {
                return f(interfaceC9361r0, j12, n02);
            }
            interfaceC9361r0.zzj();
            Z zA = this.f73533b.a(interfaceC9361r0, x10.f72064b);
            int i10 = zA.f72793a;
            if (i10 == -3) {
                c(false, j12);
                return f(interfaceC9361r0, j12, n02);
            }
            if (i10 == -2) {
                X.h(x10, zA.f72794b, zA.f72795c);
            } else {
                if (i10 != -1) {
                    g(interfaceC9361r0, zA.f72795c);
                    c(true, zA.f72795c);
                    return f(interfaceC9361r0, zA.f72795c, n02);
                }
                X.g(x10, zA.f72794b, zA.f72795c);
            }
        }
    }

    public final void d(long j10) {
        X x10 = this.f73534c;
        if (x10 == null || x10.f72063a != j10) {
            V v10 = this.f73532a;
            this.f73534c = new X(j10, v10.e(j10), 0L, v10.f71590c, v10.f71591d, v10.f71592e, v10.f71593f);
        }
    }

    protected static final boolean g(InterfaceC9361r0 interfaceC9361r0, long j10) throws IOException {
        long jZzf = j10 - interfaceC9361r0.zzf();
        if (jZzf >= 0 && jZzf <= 262144) {
            interfaceC9361r0.e((int) jZzf);
            return true;
        }
        return false;
    }
}
