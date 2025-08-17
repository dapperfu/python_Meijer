package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class I10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f67532a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67533b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67534c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f67535d;

    /* renamed from: e, reason: collision with root package name */
    public final int f67536e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67537f;

    /* renamed from: g, reason: collision with root package name */
    public final int f67538g;

    /* renamed from: h, reason: collision with root package name */
    public final String f67539h;

    I10(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12, String str2) {
        this.f67532a = z10;
        this.f67533b = z11;
        this.f67534c = str;
        this.f67535d = z12;
        this.f67536e = i10;
        this.f67537f = i11;
        this.f67538g = i12;
        this.f67539h = str2;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AB ab2 = (AB) obj;
        ab2.f65089b.putString("js", this.f67534c);
        ab2.f65089b.putInt("target_api", this.f67536e);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        bundle.putString("js", this.f67534c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) Mc.A.c().a(C8659lf.f76100P3));
        bundle.putInt("target_api", this.f67536e);
        bundle.putInt("dv", this.f67537f);
        bundle.putInt("lv", this.f67538g);
        if (((Boolean) Mc.A.c().a(C8659lf.f76088O5)).booleanValue() && !TextUtils.isEmpty(this.f67539h)) {
            bundle.putString("ev", this.f67539h);
        }
        Bundle bundleA = H60.a(bundle, "sdk_env");
        bundleA.putBoolean("mf", ((Boolean) C8768mg.f76847c.e()).booleanValue());
        bundleA.putBoolean("instant_app", this.f67532a);
        bundleA.putBoolean("lite", this.f67533b);
        bundleA.putBoolean("is_privileged_process", this.f67535d);
        bundle.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = H60.a(bundleA, "build_meta");
        bundleA2.putString("cl", "697668803");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }
}
