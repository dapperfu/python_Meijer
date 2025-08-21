package h3;

import d3.C13599a;

/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14447c {

    /* renamed from: a, reason: collision with root package name */
    public final String f134697a;

    /* renamed from: b, reason: collision with root package name */
    public final a3.t f134698b;

    /* renamed from: c, reason: collision with root package name */
    public final a3.t f134699c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134700d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134701e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14447c.class == obj.getClass()) {
            C14447c c14447c = (C14447c) obj;
            if (this.f134700d == c14447c.f134700d && this.f134701e == c14447c.f134701e && this.f134697a.equals(c14447c.f134697a) && this.f134698b.equals(c14447c.f134698b) && this.f134699c.equals(c14447c.f134699c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f134700d) * 31) + this.f134701e) * 31) + this.f134697a.hashCode()) * 31) + this.f134698b.hashCode()) * 31) + this.f134699c.hashCode();
    }

    public C14447c(String str, a3.t tVar, a3.t tVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        C13599a.a(z10);
        this.f134697a = C13599a.d(str);
        this.f134698b = (a3.t) C13599a.e(tVar);
        this.f134699c = (a3.t) C13599a.e(tVar2);
        this.f134700d = i10;
        this.f134701e = i11;
    }
}
