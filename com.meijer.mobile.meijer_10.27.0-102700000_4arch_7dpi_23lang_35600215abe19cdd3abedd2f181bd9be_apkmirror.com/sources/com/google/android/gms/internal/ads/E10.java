package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class E10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final String f66325a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66326b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66327c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66328d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f66329e;

    public E10(String str, String str2, String str3, String str4, Long l10) {
        this.f66325a = str;
        this.f66326b = str2;
        this.f66327c = str3;
        this.f66328d = str4;
        this.f66329e = l10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        H60.c(((AB) obj).f65089b, "fbs_aeid", this.f66327c);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        H60.c(bundle, "gmp_app_id", this.f66325a);
        H60.c(bundle, "fbs_aiid", this.f66326b);
        H60.c(bundle, "fbs_aeid", this.f66327c);
        H60.c(bundle, "apm_id_origin", this.f66328d);
        Long l10 = this.f66329e;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
