package Fd;

import java.io.UnsupportedEncodingException;

/* loaded from: classes6.dex */
public final class Q9 implements C9 {

    /* renamed from: a, reason: collision with root package name */
    private final C3299a7 f9529a;

    /* renamed from: b, reason: collision with root package name */
    private Y8 f9530b = new Y8();

    /* renamed from: c, reason: collision with root package name */
    private final int f9531c;

    public static C9 d(C3299a7 c3299a7) {
        return new Q9(c3299a7, 0);
    }

    public static C9 e(C3299a7 c3299a7, int i10) {
        return new Q9(c3299a7, 1);
    }

    @Override // Fd.C9
    public final C9 a(Y8 y82) {
        this.f9530b = y82;
        return this;
    }

    @Override // Fd.C9
    public final byte[] b(int i10, boolean z10) {
        this.f9530b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f9530b.e(Boolean.FALSE);
        this.f9529a.i(this.f9530b.m());
        try {
            C3302aa.a();
            if (i10 == 0) {
                return new Ff.d().j(R5.f9535a).k(true).i().b(this.f9529a.j()).getBytes("utf-8");
            }
            C3323c7 c3323c7J = this.f9529a.j();
            U0 u02 = new U0();
            R5.f9535a.a(u02);
            return u02.b().a(c3323c7J);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // Fd.C9
    public final C9 c(Z6 z62) {
        this.f9529a.f(z62);
        return this;
    }

    @Override // Fd.C9
    public final int zza() {
        return this.f9531c;
    }

    @Override // Fd.C9
    public final String zzd() {
        C3301a9 c3301a9G = this.f9529a.j().g();
        return (c3301a9G == null || C3535v.b(c3301a9G.k())) ? "NA" : (String) com.google.android.gms.common.internal.r.l(c3301a9G.k());
    }

    private Q9(C3299a7 c3299a7, int i10) {
        this.f9529a = c3299a7;
        C3302aa.a();
        this.f9531c = i10;
    }
}
