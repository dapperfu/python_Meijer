package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9258q10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f78531a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78532b;

    public C9258q10(String str, int i10) {
        this.f78531a = str;
        this.f78532b = i10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((AB) obj).f65929b.putString("request_id", this.f78531a);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        ab2.f65928a.putString("request_id", this.f78531a);
        if (this.f78532b == 2) {
            ab2.f65928a.putInt("sod", 1);
        }
    }
}
