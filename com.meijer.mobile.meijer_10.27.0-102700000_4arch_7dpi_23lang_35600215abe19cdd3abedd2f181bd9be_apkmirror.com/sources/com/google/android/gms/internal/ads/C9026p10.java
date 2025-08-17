package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9026p10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f77471a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77472b;

    C9026p10(String str, int i10) {
        this.f77471a = str;
        this.f77472b = i10;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.h(new C9133q10(this.f77471a, this.f77472b));
    }
}
