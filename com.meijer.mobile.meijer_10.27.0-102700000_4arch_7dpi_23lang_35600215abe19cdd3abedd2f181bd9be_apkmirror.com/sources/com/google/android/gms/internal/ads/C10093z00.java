package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10093z00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f80324a;

    public C10093z00(boolean z10) {
        this.f80324a = z10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((AB) obj).f65089b.putBoolean("is_gbid", this.f80324a);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((AB) obj).f65088a.putBoolean("is_gbid", this.f80324a);
    }
}
