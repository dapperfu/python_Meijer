package Ed;

import java.io.UnsupportedEncodingException;

/* loaded from: classes6.dex */
public final class y5 implements InterfaceC3535p5 {

    /* renamed from: a, reason: collision with root package name */
    private final G3 f8928a;

    /* renamed from: b, reason: collision with root package name */
    private K4 f8929b = new K4();

    public static InterfaceC3535p5 d(G3 g32) {
        return new y5(g32, 0);
    }

    @Override // Ed.InterfaceC3535p5
    public final InterfaceC3535p5 a(F3 f32) {
        this.f8928a.c(f32);
        return this;
    }

    @Override // Ed.InterfaceC3535p5
    public final InterfaceC3535p5 b(K4 k42) {
        this.f8929b = k42;
        return this;
    }

    @Override // Ed.InterfaceC3535p5
    public final byte[] c(int i10, boolean z10) {
        this.f8929b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f8929b.e(Boolean.FALSE);
        this.f8928a.e(this.f8929b.m());
        try {
            K5.a();
            if (i10 == 0) {
                return new Df.d().j(N2.f8239a).k(true).i().b(this.f8928a.f()).getBytes("utf-8");
            }
            I3 i3F = this.f8928a.f();
            C3515n c3515n = new C3515n();
            N2.f8239a.a(c3515n);
            return c3515n.b().a(i3F);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // Ed.InterfaceC3535p5
    public final String zzc() {
        N4 n4C = this.f8928a.f().c();
        return (n4C == null || C3476h2.b(n4C.k())) ? "NA" : (String) com.google.android.gms.common.internal.r.l(n4C.k());
    }

    private y5(G3 g32, int i10) {
        this.f8928a = g32;
        K5.a();
    }
}
