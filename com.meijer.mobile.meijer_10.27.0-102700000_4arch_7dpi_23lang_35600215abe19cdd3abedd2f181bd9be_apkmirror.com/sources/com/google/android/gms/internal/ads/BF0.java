package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class BF0 implements SF0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f65492a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EF0 f65493b;

    public BF0(EF0 ef0, int i10) {
        this.f65493b = ef0;
        this.f65492a = i10;
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final int a(long j10) {
        return this.f65493b.K(this.f65492a, j10);
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final int b(Zz0 zz0, By0 by0, int i10) {
        return this.f65493b.J(this.f65492a, zz0, by0, i10);
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final void zzd() throws IOException {
        this.f65493b.w(this.f65492a);
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final boolean zze() {
        return this.f65493b.y(this.f65492a);
    }
}
