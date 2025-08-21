package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9683u00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f79549a;

    public C9683u00(Integer num) {
        this.f79549a = num;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.f79549a;
        AB ab2 = (AB) obj;
        if (num != null) {
            ab2.f65928a.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
