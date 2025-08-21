package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.q00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9256q00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final String f78528a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f78529b;

    public C9256q00(String str, boolean z10) {
        this.f78528a = str;
        this.f78529b = z10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((AB) obj).f65929b.putString("gct", this.f78528a);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        bundle.putString("gct", this.f78528a);
        if (this.f78529b) {
            bundle.putString("de", "1");
        }
    }
}
