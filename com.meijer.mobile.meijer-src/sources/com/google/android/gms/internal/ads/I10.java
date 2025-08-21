package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class I10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f68372a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68373b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68374c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68375d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68376e;

    /* renamed from: f, reason: collision with root package name */
    public final int f68377f;

    /* renamed from: g, reason: collision with root package name */
    public final int f68378g;

    /* renamed from: h, reason: collision with root package name */
    public final String f68379h;

    I10(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12, String str2) {
        this.f68372a = z10;
        this.f68373b = z11;
        this.f68374c = str;
        this.f68375d = z12;
        this.f68376e = i10;
        this.f68377f = i11;
        this.f68378g = i12;
        this.f68379h = str2;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AB ab2 = (AB) obj;
        ab2.f65929b.putString("js", this.f68374c);
        ab2.f65929b.putInt("target_api", this.f68376e);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        bundle.putString("js", this.f68374c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) Oc.A.c().a(C8784lf.f76940P3));
        bundle.putInt("target_api", this.f68376e);
        bundle.putInt("dv", this.f68377f);
        bundle.putInt("lv", this.f68378g);
        if (((Boolean) Oc.A.c().a(C8784lf.f76928O5)).booleanValue() && !TextUtils.isEmpty(this.f68379h)) {
            bundle.putString("ev", this.f68379h);
        }
        Bundle bundleA = H60.a(bundle, "sdk_env");
        bundleA.putBoolean("mf", ((Boolean) C8893mg.f77687c.e()).booleanValue());
        bundleA.putBoolean("instant_app", this.f68372a);
        bundleA.putBoolean("lite", this.f68373b);
        bundleA.putBoolean("is_privileged_process", this.f68375d);
        bundle.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = H60.a(bundleA, "build_meta");
        bundleA2.putString("cl", "697668803");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }
}
