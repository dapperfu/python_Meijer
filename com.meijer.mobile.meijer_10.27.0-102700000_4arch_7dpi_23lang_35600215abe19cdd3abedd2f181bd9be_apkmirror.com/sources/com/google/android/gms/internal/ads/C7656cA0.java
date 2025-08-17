package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7656cA0 {

    /* renamed from: a, reason: collision with root package name */
    private long f73137a;

    /* renamed from: b, reason: collision with root package name */
    private float f73138b;

    /* renamed from: c, reason: collision with root package name */
    private long f73139c;

    public C7656cA0() {
        this.f73137a = -9223372036854775807L;
        this.f73138b = -3.4028235E38f;
        this.f73139c = -9223372036854775807L;
    }

    public final C7656cA0 e(long j10) {
        this.f73137a = j10;
        return this;
    }

    public final C7656cA0 f(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        C8086gC.d(z10);
        this.f73138b = f10;
        return this;
    }

    public final C7869eA0 g() {
        return new C7869eA0(this, null);
    }

    /* synthetic */ C7656cA0(C7869eA0 c7869eA0, C7763dA0 c7763dA0) {
        this.f73137a = c7869eA0.f73777a;
        this.f73138b = c7869eA0.f73778b;
        this.f73139c = c7869eA0.f73779c;
    }

    public final C7656cA0 d(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        C8086gC.d(z10);
        this.f73139c = j10;
        return this;
    }
}
