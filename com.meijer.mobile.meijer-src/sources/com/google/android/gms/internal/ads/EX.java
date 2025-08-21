package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class EX implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f67319a;

    public EX(boolean z10) {
        this.f67319a = z10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((AB) obj).f65928a.putString("adid_p", true != this.f67319a ? "0" : "1");
    }
}
