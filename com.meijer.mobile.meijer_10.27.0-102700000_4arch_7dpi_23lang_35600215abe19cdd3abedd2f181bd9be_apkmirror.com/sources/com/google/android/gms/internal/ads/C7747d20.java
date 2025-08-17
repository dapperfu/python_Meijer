package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.d20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7747d20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73320a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73321b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73322c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f73323d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f73324e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f73325f;

    /* renamed from: g, reason: collision with root package name */
    public final String f73326g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f73327h;

    /* renamed from: i, reason: collision with root package name */
    public final String f73328i;

    /* renamed from: j, reason: collision with root package name */
    public final String f73329j;

    /* renamed from: k, reason: collision with root package name */
    public final String f73330k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f73331l;

    /* renamed from: m, reason: collision with root package name */
    public final String f73332m;

    /* renamed from: n, reason: collision with root package name */
    public final long f73333n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f73334o;

    /* renamed from: p, reason: collision with root package name */
    public final String f73335p;

    /* renamed from: q, reason: collision with root package name */
    public final int f73336q;

    public C7747d20(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z15, String str6, long j10, boolean z16, String str7, int i10) {
        this.f73320a = z10;
        this.f73321b = z11;
        this.f73322c = str;
        this.f73323d = z12;
        this.f73324e = z13;
        this.f73325f = z14;
        this.f73326g = str2;
        this.f73327h = arrayList;
        this.f73328i = str3;
        this.f73329j = str4;
        this.f73330k = str5;
        this.f73331l = z15;
        this.f73332m = str6;
        this.f73333n = j10;
        this.f73334o = z16;
        this.f73335p = str7;
        this.f73336q = i10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AB) obj).f65089b;
        bundle.putBoolean("simulator", this.f73323d);
        bundle.putInt("build_api_level", this.f73336q);
        if (!this.f73327h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f73327h);
        }
        bundle.putString("submodel", this.f73332m);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        bundle.putBoolean("cog", this.f73320a);
        bundle.putBoolean("coh", this.f73321b);
        bundle.putString("gl", this.f73322c);
        bundle.putBoolean("simulator", this.f73323d);
        bundle.putBoolean("is_latchsky", this.f73324e);
        bundle.putInt("build_api_level", this.f73336q);
        if (!((Boolean) Mc.A.c().a(C8659lf.f76177Ua)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f73325f);
        }
        bundle.putString("hl", this.f73326g);
        if (!this.f73327h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f73327h);
        }
        bundle.putString("mv", this.f73328i);
        bundle.putString("submodel", this.f73332m);
        Bundle bundleA = H60.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        bundleA.putString("build", this.f73330k);
        bundleA.putLong("remaining_data_partition_space", this.f73333n);
        Bundle bundleA2 = H60.a(bundleA, "browser");
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f73331l);
        if (!TextUtils.isEmpty(this.f73329j)) {
            Bundle bundleA3 = H60.a(bundleA, "play_store");
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", this.f73329j);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76401kb)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f73334o);
        }
        if (!TextUtils.isEmpty(this.f73335p)) {
            bundle.putString("v_unity", this.f73335p);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76317eb)).booleanValue()) {
            H60.g(bundle, "gotmt_l", true, ((Boolean) Mc.A.c().a(C8659lf.f76275bb)).booleanValue());
            H60.g(bundle, "gotmt_i", true, ((Boolean) Mc.A.c().a(C8659lf.f76261ab)).booleanValue());
        }
    }
}
