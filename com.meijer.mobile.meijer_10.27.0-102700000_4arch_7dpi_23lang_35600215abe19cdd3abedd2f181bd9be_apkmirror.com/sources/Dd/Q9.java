package Dd;

import java.io.UnsupportedEncodingException;

/* loaded from: classes6.dex */
public final class Q9 implements C9 {

    /* renamed from: a, reason: collision with root package name */
    private final C3077a7 f5496a;

    /* renamed from: b, reason: collision with root package name */
    private Y8 f5497b = new Y8();

    /* renamed from: c, reason: collision with root package name */
    private final int f5498c;

    public static C9 d(C3077a7 c3077a7) {
        return new Q9(c3077a7, 0);
    }

    public static C9 e(C3077a7 c3077a7, int i10) {
        return new Q9(c3077a7, 1);
    }

    @Override // Dd.C9
    public final C9 a(Y8 y82) {
        this.f5497b = y82;
        return this;
    }

    @Override // Dd.C9
    public final byte[] b(int i10, boolean z10) {
        this.f5497b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f5497b.e(Boolean.FALSE);
        this.f5496a.i(this.f5497b.m());
        try {
            C3080aa.a();
            if (i10 == 0) {
                return new Df.d().j(R5.f5502a).k(true).i().b(this.f5496a.j()).getBytes("utf-8");
            }
            C3101c7 c3101c7J = this.f5496a.j();
            U0 u02 = new U0();
            R5.f5502a.a(u02);
            return u02.b().a(c3101c7J);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // Dd.C9
    public final C9 c(Z6 z62) {
        this.f5496a.f(z62);
        return this;
    }

    @Override // Dd.C9
    public final int zza() {
        return this.f5498c;
    }

    @Override // Dd.C9
    public final String zzd() {
        C3079a9 c3079a9G = this.f5496a.j().g();
        return (c3079a9G == null || C3313v.b(c3079a9G.k())) ? "NA" : (String) com.google.android.gms.common.internal.r.l(c3079a9G.k());
    }

    private Q9(C3077a7 c3077a7, int i10) {
        this.f5496a = c3077a7;
        C3080aa.a();
        this.f5498c = i10;
    }
}
