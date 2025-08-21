package com.google.android.gms.internal.ads;

import fsimpl.C14170dq;

/* renamed from: com.google.android.gms.internal.ads.gc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8246gc0 extends AbstractC7926dc0 {

    /* renamed from: a, reason: collision with root package name */
    private String f75181a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f75182b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f75183c;

    /* renamed from: d, reason: collision with root package name */
    private long f75184d;

    /* renamed from: e, reason: collision with root package name */
    private long f75185e;

    /* renamed from: f, reason: collision with root package name */
    private byte f75186f;

    C8246gc0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7926dc0
    public final AbstractC7926dc0 b(boolean z10) {
        this.f75186f = (byte) (this.f75186f | C14170dq.SCREEN);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7926dc0
    public final AbstractC7926dc0 c(boolean z10) {
        this.f75186f = (byte) (this.f75186f | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7926dc0
    public final AbstractC7926dc0 d(boolean z10) {
        this.f75183c = true;
        this.f75186f = (byte) (this.f75186f | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7926dc0
    public final AbstractC7926dc0 e(long j10) {
        this.f75185e = 300L;
        this.f75186f = (byte) (this.f75186f | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7926dc0
    public final AbstractC7926dc0 f(long j10) {
        this.f75184d = 100L;
        this.f75186f = (byte) (this.f75186f | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7926dc0
    public final AbstractC7926dc0 g(boolean z10) {
        this.f75182b = z10;
        this.f75186f = (byte) (this.f75186f | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7926dc0
    public final AbstractC7926dc0 a(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.f75181a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7926dc0
    public final AbstractC8032ec0 h() {
        String str;
        if (this.f75186f == 63 && (str = this.f75181a) != null) {
            return new C8460ic0(str, this.f75182b, this.f75183c, false, this.f75184d, false, this.f75185e, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f75181a == null) {
            sb2.append(" clientVersion");
        }
        if ((this.f75186f & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.f75186f & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f75186f & 4) == 0) {
            sb2.append(" enableQuerySignalsTimeout");
        }
        if ((this.f75186f & 8) == 0) {
            sb2.append(" querySignalsTimeoutMs");
        }
        if ((this.f75186f & C14170dq.SCREEN) == 0) {
            sb2.append(" enableQuerySignalsCache");
        }
        if ((this.f75186f & 32) == 0) {
            sb2.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
