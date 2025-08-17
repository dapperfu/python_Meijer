package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.g10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8065g10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f74213a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f74214b;

    /* renamed from: c, reason: collision with root package name */
    private final String f74215c;

    /* renamed from: d, reason: collision with root package name */
    private final String f74216d;

    /* renamed from: e, reason: collision with root package name */
    private final String f74217e;

    /* renamed from: f, reason: collision with root package name */
    private final String f74218f;

    public C8065g10(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f74213a = str;
        this.f74214b = num;
        this.f74215c = str2;
        this.f74216d = str3;
        this.f74217e = str4;
        this.f74218f = str5;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AB) obj).f65089b;
        H60.c(bundle, "pn", this.f74213a);
        H60.c(bundle, "dl", this.f74216d);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        H60.c(bundle, "pn", this.f74213a);
        Integer num = this.f74214b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        H60.c(bundle, "vnm", this.f74215c);
        H60.c(bundle, "dl", this.f74216d);
        H60.c(bundle, "ins_pn", this.f74217e);
        H60.c(bundle, "ini_pn", this.f74218f);
    }
}
