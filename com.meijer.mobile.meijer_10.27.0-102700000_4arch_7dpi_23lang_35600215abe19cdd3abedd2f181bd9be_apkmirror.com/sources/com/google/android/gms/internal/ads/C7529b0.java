package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7529b0 {

    /* renamed from: a, reason: collision with root package name */
    protected final V f72692a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC7422a0 f72693b;

    /* renamed from: c, reason: collision with root package name */
    protected X f72694c;

    /* renamed from: d, reason: collision with root package name */
    private final int f72695d;

    protected C7529b0(Y y10, InterfaceC7422a0 interfaceC7422a0, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f72693b = interfaceC7422a0;
        this.f72695d = i10;
        this.f72692a = new V(y10, j10, 0L, j12, j13, j14, j15);
    }

    protected static final int f(InterfaceC9236r0 interfaceC9236r0, long j10, N0 n02) {
        if (j10 == interfaceC9236r0.zzf()) {
            return 0;
        }
        n02.f68790a = j10;
        return 1;
    }

    public final Q0 b() {
        return this.f72692a;
    }

    protected final void c(boolean z10, long j10) {
        this.f72694c = null;
        this.f72693b.zzb();
    }

    public final boolean e() {
        return this.f72694c != null;
    }

    public final int a(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        while (true) {
            X x10 = this.f72694c;
            C8086gC.b(x10);
            long j10 = x10.f71228f;
            long j11 = x10.f71229g;
            long j12 = x10.f71230h;
            if (j11 - j10 <= this.f72695d) {
                c(false, j10);
                return f(interfaceC9236r0, j10, n02);
            }
            if (!g(interfaceC9236r0, j12)) {
                return f(interfaceC9236r0, j12, n02);
            }
            interfaceC9236r0.zzj();
            Z zA = this.f72693b.a(interfaceC9236r0, x10.f71224b);
            int i10 = zA.f71953a;
            if (i10 == -3) {
                c(false, j12);
                return f(interfaceC9236r0, j12, n02);
            }
            if (i10 == -2) {
                X.h(x10, zA.f71954b, zA.f71955c);
            } else {
                if (i10 != -1) {
                    g(interfaceC9236r0, zA.f71955c);
                    c(true, zA.f71955c);
                    return f(interfaceC9236r0, zA.f71955c, n02);
                }
                X.g(x10, zA.f71954b, zA.f71955c);
            }
        }
    }

    public final void d(long j10) {
        X x10 = this.f72694c;
        if (x10 == null || x10.f71223a != j10) {
            V v10 = this.f72692a;
            this.f72694c = new X(j10, v10.e(j10), 0L, v10.f70750c, v10.f70751d, v10.f70752e, v10.f70753f);
        }
    }

    protected static final boolean g(InterfaceC9236r0 interfaceC9236r0, long j10) throws IOException {
        long jZzf = j10 - interfaceC9236r0.zzf();
        if (jZzf >= 0 && jZzf <= 262144) {
            interfaceC9236r0.e((int) jZzf);
            return true;
        }
        return false;
    }
}
