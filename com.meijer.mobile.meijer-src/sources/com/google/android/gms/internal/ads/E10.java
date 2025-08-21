package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class E10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final String f67165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67166b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67167c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67168d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f67169e;

    public E10(String str, String str2, String str3, String str4, Long l10) {
        this.f67165a = str;
        this.f67166b = str2;
        this.f67167c = str3;
        this.f67168d = str4;
        this.f67169e = l10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        H60.c(((AB) obj).f65929b, "fbs_aeid", this.f67167c);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        H60.c(bundle, "gmp_app_id", this.f67165a);
        H60.c(bundle, "fbs_aiid", this.f67166b);
        H60.c(bundle, "fbs_aeid", this.f67167c);
        H60.c(bundle, "apm_id_origin", this.f67168d);
        Long l10 = this.f67169e;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
