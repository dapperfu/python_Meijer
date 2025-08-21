package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7781cA0 {

    /* renamed from: a, reason: collision with root package name */
    private long f73977a;

    /* renamed from: b, reason: collision with root package name */
    private float f73978b;

    /* renamed from: c, reason: collision with root package name */
    private long f73979c;

    public C7781cA0() {
        this.f73977a = -9223372036854775807L;
        this.f73978b = -3.4028235E38f;
        this.f73979c = -9223372036854775807L;
    }

    public final C7781cA0 e(long j10) {
        this.f73977a = j10;
        return this;
    }

    public final C7781cA0 f(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        C8211gC.d(z10);
        this.f73978b = f10;
        return this;
    }

    public final C7994eA0 g() {
        return new C7994eA0(this, null);
    }

    /* synthetic */ C7781cA0(C7994eA0 c7994eA0, C7888dA0 c7888dA0) {
        this.f73977a = c7994eA0.f74617a;
        this.f73978b = c7994eA0.f74618b;
        this.f73979c = c7994eA0.f74619c;
    }

    public final C7781cA0 d(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        C8211gC.d(z10);
        this.f73979c = j10;
        return this;
    }
}
