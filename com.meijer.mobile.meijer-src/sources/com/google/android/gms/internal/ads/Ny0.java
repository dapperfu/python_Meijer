package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Ny0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f69817a;

    /* renamed from: b, reason: collision with root package name */
    public final C f69818b;

    /* renamed from: c, reason: collision with root package name */
    public final C f69819c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69820d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69821e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ny0.class == obj.getClass()) {
            Ny0 ny0 = (Ny0) obj;
            if (this.f69820d == ny0.f69820d && this.f69821e == ny0.f69821e && this.f69817a.equals(ny0.f69817a) && this.f69818b.equals(ny0.f69818b) && this.f69819c.equals(ny0.f69819c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f69820d + 527) * 31) + this.f69821e) * 31) + this.f69817a.hashCode()) * 31) + this.f69818b.hashCode()) * 31) + this.f69819c.hashCode();
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
        C8211gC.d(z10);
        C8211gC.c(str);
        this.f69817a = str;
        this.f69818b = c10;
        c11.getClass();
        this.f69819c = c11;
        this.f69820d = i10;
        this.f69821e = i11;
    }
}
