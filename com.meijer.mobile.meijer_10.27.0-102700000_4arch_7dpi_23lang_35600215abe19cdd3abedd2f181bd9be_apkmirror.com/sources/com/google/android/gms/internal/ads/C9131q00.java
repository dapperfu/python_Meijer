package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.q00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9131q00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final String f77688a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77689b;

    public C9131q00(String str, boolean z10) {
        this.f77688a = str;
        this.f77689b = z10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((AB) obj).f65089b.putString("gct", this.f77688a);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        bundle.putString("gct", this.f77688a);
        if (this.f77689b) {
            bundle.putString("de", "1");
        }
    }
}
