package Gd;

import java.io.UnsupportedEncodingException;

/* loaded from: classes6.dex */
public final class y5 implements InterfaceC3727p5 {

    /* renamed from: a, reason: collision with root package name */
    private final G3 f12480a;

    /* renamed from: b, reason: collision with root package name */
    private K4 f12481b = new K4();

    public static InterfaceC3727p5 d(G3 g32) {
        return new y5(g32, 0);
    }

    @Override // Gd.InterfaceC3727p5
    public final byte[] a(int i10, boolean z10) {
        this.f12481b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f12481b.e(Boolean.FALSE);
        this.f12480a.e(this.f12481b.m());
        try {
            K5.a();
            if (i10 == 0) {
                return new Ff.d().j(N2.f11791a).k(true).i().b(this.f12480a.f()).getBytes("utf-8");
            }
            I3 i3F = this.f12480a.f();
            C3707n c3707n = new C3707n();
            N2.f11791a.a(c3707n);
            return c3707n.b().a(i3F);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // Gd.InterfaceC3727p5
    public final InterfaceC3727p5 b(K4 k42) {
        this.f12481b = k42;
        return this;
    }

    @Override // Gd.InterfaceC3727p5
    public final InterfaceC3727p5 c(F3 f32) {
        this.f12480a.c(f32);
        return this;
    }

    @Override // Gd.InterfaceC3727p5
    public final String zzc() {
        N4 n4C = this.f12480a.f().c();
        return (n4C == null || C3668h2.b(n4C.k())) ? "NA" : (String) com.google.android.gms.common.internal.r.l(n4C.k());
    }

    private y5(G3 g32, int i10) {
        this.f12480a = g32;
        K5.a();
    }
}
