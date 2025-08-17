package com.google.android.gms.internal.ads;

import fsimpl.C14045dq;

/* renamed from: com.google.android.gms.internal.ads.gc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8121gc0 extends AbstractC7801dc0 {

    /* renamed from: a, reason: collision with root package name */
    private String f74341a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f74342b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f74343c;

    /* renamed from: d, reason: collision with root package name */
    private long f74344d;

    /* renamed from: e, reason: collision with root package name */
    private long f74345e;

    /* renamed from: f, reason: collision with root package name */
    private byte f74346f;

    C8121gc0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7801dc0
    public final AbstractC7801dc0 b(boolean z10) {
        this.f74346f = (byte) (this.f74346f | C14045dq.SCREEN);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7801dc0
    public final AbstractC7801dc0 c(boolean z10) {
        this.f74346f = (byte) (this.f74346f | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7801dc0
    public final AbstractC7801dc0 d(boolean z10) {
        this.f74343c = true;
        this.f74346f = (byte) (this.f74346f | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7801dc0
    public final AbstractC7801dc0 e(long j10) {
        this.f74345e = 300L;
        this.f74346f = (byte) (this.f74346f | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7801dc0
    public final AbstractC7801dc0 f(long j10) {
        this.f74344d = 100L;
        this.f74346f = (byte) (this.f74346f | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7801dc0
    public final AbstractC7801dc0 g(boolean z10) {
        this.f74342b = z10;
        this.f74346f = (byte) (this.f74346f | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7801dc0
    public final AbstractC7801dc0 a(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.f74341a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7801dc0
    public final AbstractC7907ec0 h() {
        String str;
        if (this.f74346f == 63 && (str = this.f74341a) != null) {
            return new C8335ic0(str, this.f74342b, this.f74343c, false, this.f74344d, false, this.f74345e, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f74341a == null) {
            sb2.append(" clientVersion");
        }
        if ((this.f74346f & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.f74346f & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f74346f & 4) == 0) {
            sb2.append(" enableQuerySignalsTimeout");
        }
        if ((this.f74346f & 8) == 0) {
            sb2.append(" querySignalsTimeoutMs");
        }
        if ((this.f74346f & C14045dq.SCREEN) == 0) {
            sb2.append(" enableQuerySignalsCache");
        }
        if ((this.f74346f & 32) == 0) {
            sb2.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
