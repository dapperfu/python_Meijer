package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9133q10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f77691a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77692b;

    public C9133q10(String str, int i10) {
        this.f77691a = str;
        this.f77692b = i10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((AB) obj).f65089b.putString("request_id", this.f77691a);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        ab2.f65088a.putString("request_id", this.f77691a);
        if (this.f77692b == 2) {
            ab2.f65088a.putInt("sod", 1);
        }
    }
}
