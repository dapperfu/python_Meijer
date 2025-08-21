package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class L6 {

    /* renamed from: a, reason: collision with root package name */
    private int f69100a = 2500;

    /* renamed from: b, reason: collision with root package name */
    private int f69101b;

    public final int a() {
        return this.f69101b;
    }

    public final int b() {
        return this.f69100a;
    }

    public final void c(zzapv zzapvVar) throws zzapv {
        int i10 = this.f69101b + 1;
        this.f69101b = i10;
        int i11 = this.f69100a;
        this.f69100a = i11 + i11;
        if (i10 > 1) {
            throw zzapvVar;
        }
    }
}
