package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class GO implements HF {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f68023a = new Bundle();

    @Override // com.google.android.gms.internal.ads.HF
    public final synchronized void L(String str) {
        this.f68023a.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.HF
    public final synchronized void a(String str, String str2) {
        this.f68023a.putInt(str, 3);
    }

    public final synchronized Bundle b() {
        return new Bundle(this.f68023a);
    }

    @Override // com.google.android.gms.internal.ads.HF
    public final synchronized void p(String str) {
        this.f68023a.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.HF
    public final void zza(String str) {
    }

    @Override // com.google.android.gms.internal.ads.HF
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.HF
    public final void zzf() {
    }
}
