package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class L6 {

    /* renamed from: a, reason: collision with root package name */
    private int f68260a = 2500;

    /* renamed from: b, reason: collision with root package name */
    private int f68261b;

    public final int a() {
        return this.f68261b;
    }

    public final int b() {
        return this.f68260a;
    }

    public final void c(zzapv zzapvVar) throws zzapv {
        int i10 = this.f68261b + 1;
        this.f68261b = i10;
        int i11 = this.f68260a;
        this.f68260a = i11 + i11;
        if (i10 > 1) {
            throw zzapvVar;
        }
    }
}
