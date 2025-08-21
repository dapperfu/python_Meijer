package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.g10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8190g10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f75053a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f75054b;

    /* renamed from: c, reason: collision with root package name */
    private final String f75055c;

    /* renamed from: d, reason: collision with root package name */
    private final String f75056d;

    /* renamed from: e, reason: collision with root package name */
    private final String f75057e;

    /* renamed from: f, reason: collision with root package name */
    private final String f75058f;

    public C8190g10(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f75053a = str;
        this.f75054b = num;
        this.f75055c = str2;
        this.f75056d = str3;
        this.f75057e = str4;
        this.f75058f = str5;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AB) obj).f65929b;
        H60.c(bundle, "pn", this.f75053a);
        H60.c(bundle, "dl", this.f75056d);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        H60.c(bundle, "pn", this.f75053a);
        Integer num = this.f75054b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        H60.c(bundle, "vnm", this.f75055c);
        H60.c(bundle, "dl", this.f75056d);
        H60.c(bundle, "ins_pn", this.f75057e);
        H60.c(bundle, "ini_pn", this.f75058f);
    }
}
