package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class ZF0 implements SF0 {

    /* renamed from: a, reason: collision with root package name */
    private final SF0 f72124a;

    /* renamed from: b, reason: collision with root package name */
    private final long f72125b;

    public ZF0(SF0 sf0, long j10) {
        this.f72124a = sf0;
        this.f72125b = j10;
    }

    public final SF0 c() {
        return this.f72124a;
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final int a(long j10) {
        return this.f72124a.a(j10 - this.f72125b);
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final int b(Zz0 zz0, By0 by0, int i10) {
        int iB = this.f72124a.b(zz0, by0, i10);
        if (iB != -4) {
            return iB;
        }
        by0.f65633f += this.f72125b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final void zzd() throws IOException {
        this.f72124a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final boolean zze() {
        return this.f72124a.zze();
    }
}
