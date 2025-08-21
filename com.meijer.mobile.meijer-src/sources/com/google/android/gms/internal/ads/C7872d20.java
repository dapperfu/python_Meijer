package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.d20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7872d20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f74160a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f74161b;

    /* renamed from: c, reason: collision with root package name */
    public final String f74162c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f74163d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74164e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f74165f;

    /* renamed from: g, reason: collision with root package name */
    public final String f74166g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f74167h;

    /* renamed from: i, reason: collision with root package name */
    public final String f74168i;

    /* renamed from: j, reason: collision with root package name */
    public final String f74169j;

    /* renamed from: k, reason: collision with root package name */
    public final String f74170k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f74171l;

    /* renamed from: m, reason: collision with root package name */
    public final String f74172m;

    /* renamed from: n, reason: collision with root package name */
    public final long f74173n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f74174o;

    /* renamed from: p, reason: collision with root package name */
    public final String f74175p;

    /* renamed from: q, reason: collision with root package name */
    public final int f74176q;

    public C7872d20(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z15, String str6, long j10, boolean z16, String str7, int i10) {
        this.f74160a = z10;
        this.f74161b = z11;
        this.f74162c = str;
        this.f74163d = z12;
        this.f74164e = z13;
        this.f74165f = z14;
        this.f74166g = str2;
        this.f74167h = arrayList;
        this.f74168i = str3;
        this.f74169j = str4;
        this.f74170k = str5;
        this.f74171l = z15;
        this.f74172m = str6;
        this.f74173n = j10;
        this.f74174o = z16;
        this.f74175p = str7;
        this.f74176q = i10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AB) obj).f65929b;
        bundle.putBoolean("simulator", this.f74163d);
        bundle.putInt("build_api_level", this.f74176q);
        if (!this.f74167h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f74167h);
        }
        bundle.putString("submodel", this.f74172m);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        bundle.putBoolean("cog", this.f74160a);
        bundle.putBoolean("coh", this.f74161b);
        bundle.putString("gl", this.f74162c);
        bundle.putBoolean("simulator", this.f74163d);
        bundle.putBoolean("is_latchsky", this.f74164e);
        bundle.putInt("build_api_level", this.f74176q);
        if (!((Boolean) Oc.A.c().a(C8784lf.f77017Ua)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f74165f);
        }
        bundle.putString("hl", this.f74166g);
        if (!this.f74167h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f74167h);
        }
        bundle.putString("mv", this.f74168i);
        bundle.putString("submodel", this.f74172m);
        Bundle bundleA = H60.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        bundleA.putString("build", this.f74170k);
        bundleA.putLong("remaining_data_partition_space", this.f74173n);
        Bundle bundleA2 = H60.a(bundleA, "browser");
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f74171l);
        if (!TextUtils.isEmpty(this.f74169j)) {
            Bundle bundleA3 = H60.a(bundleA, "play_store");
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", this.f74169j);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77241kb)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f74174o);
        }
        if (!TextUtils.isEmpty(this.f74175p)) {
            bundle.putString("v_unity", this.f74175p);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77157eb)).booleanValue()) {
            H60.g(bundle, "gotmt_l", true, ((Boolean) Oc.A.c().a(C8784lf.f77115bb)).booleanValue());
            H60.g(bundle, "gotmt_i", true, ((Boolean) Oc.A.c().a(C8784lf.f77101ab)).booleanValue());
        }
    }
}
