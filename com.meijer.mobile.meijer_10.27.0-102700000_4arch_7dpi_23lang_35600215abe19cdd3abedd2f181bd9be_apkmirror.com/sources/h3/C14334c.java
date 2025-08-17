package h3;

import d3.C13466a;

/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14334c {

    /* renamed from: a, reason: collision with root package name */
    public final String f134226a;

    /* renamed from: b, reason: collision with root package name */
    public final a3.t f134227b;

    /* renamed from: c, reason: collision with root package name */
    public final a3.t f134228c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134229d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134230e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14334c.class == obj.getClass()) {
            C14334c c14334c = (C14334c) obj;
            if (this.f134229d == c14334c.f134229d && this.f134230e == c14334c.f134230e && this.f134226a.equals(c14334c.f134226a) && this.f134227b.equals(c14334c.f134227b) && this.f134228c.equals(c14334c.f134228c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f134229d) * 31) + this.f134230e) * 31) + this.f134226a.hashCode()) * 31) + this.f134227b.hashCode()) * 31) + this.f134228c.hashCode();
    }

    public C14334c(String str, a3.t tVar, a3.t tVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        C13466a.a(z10);
        this.f134226a = C13466a.d(str);
        this.f134227b = (a3.t) C13466a.e(tVar);
        this.f134228c = (a3.t) C13466a.e(tVar2);
        this.f134229d = i10;
        this.f134230e = i11;
    }
}
