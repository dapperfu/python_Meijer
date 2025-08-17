package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class D00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f66101a;

    public D00(Boolean bool) {
        this.f66101a = bool;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Boolean bool = this.f66101a;
        AB ab2 = (AB) obj;
        if (bool != null) {
            ab2.f65088a.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
