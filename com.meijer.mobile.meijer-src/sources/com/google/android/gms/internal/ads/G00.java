package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class G00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f67890a;

    public G00(Boolean bool) {
        this.f67890a = bool;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        Boolean bool = this.f67890a;
        if (bool == null) {
            bundle.putInt("lft", -1);
        } else if (bool.booleanValue()) {
            bundle.putInt("lft", 1);
        } else {
            bundle.putInt("lft", 0);
        }
    }
}
