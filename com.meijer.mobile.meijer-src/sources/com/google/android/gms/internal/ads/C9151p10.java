package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9151p10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f78311a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78312b;

    C9151p10(String str, int i10) {
        this.f78311a = str;
        this.f78312b = i10;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.h(new C9258q10(this.f78311a, this.f78312b));
    }
}
