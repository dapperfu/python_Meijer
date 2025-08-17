package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Ny0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f68977a;

    /* renamed from: b, reason: collision with root package name */
    public final C f68978b;

    /* renamed from: c, reason: collision with root package name */
    public final C f68979c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68980d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68981e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ny0.class == obj.getClass()) {
            Ny0 ny0 = (Ny0) obj;
            if (this.f68980d == ny0.f68980d && this.f68981e == ny0.f68981e && this.f68977a.equals(ny0.f68977a) && this.f68978b.equals(ny0.f68978b) && this.f68979c.equals(ny0.f68979c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f68980d + 527) * 31) + this.f68981e) * 31) + this.f68977a.hashCode()) * 31) + this.f68978b.hashCode()) * 31) + this.f68979c.hashCode();
    }

    public Ny0(String str, C c10, C c11, int i10, int i11) {
        boolean z10 = true;
        if (i10 != 0) {
            if (i11 == 0) {
                i11 = 0;
            } else {
                z10 = false;
            }
        }
        C8086gC.d(z10);
        C8086gC.c(str);
        this.f68977a = str;
        this.f68978b = c10;
        c11.getClass();
        this.f68979c = c11;
        this.f68980d = i10;
        this.f68981e = i11;
    }
}
