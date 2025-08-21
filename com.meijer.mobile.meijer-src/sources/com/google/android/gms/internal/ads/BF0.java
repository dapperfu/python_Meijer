package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class BF0 implements SF0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f66332a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EF0 f66333b;

    public BF0(EF0 ef0, int i10) {
        this.f66333b = ef0;
        this.f66332a = i10;
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final int a(long j10) {
        return this.f66333b.K(this.f66332a, j10);
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final int b(Zz0 zz0, By0 by0, int i10) {
        return this.f66333b.J(this.f66332a, zz0, by0, i10);
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final void zzd() throws IOException {
        this.f66333b.w(this.f66332a);
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final boolean zze() {
        return this.f66333b.y(this.f66332a);
    }
}
