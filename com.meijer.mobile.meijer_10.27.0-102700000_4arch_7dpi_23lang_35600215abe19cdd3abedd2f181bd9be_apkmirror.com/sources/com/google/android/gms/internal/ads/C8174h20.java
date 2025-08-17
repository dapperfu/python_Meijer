package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.h20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8174h20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final String f74578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74580c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74581d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74582e;

    /* renamed from: f, reason: collision with root package name */
    public final int f74583f;

    public C8174h20(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.f74578a = str;
        this.f74579b = i10;
        this.f74580c = i11;
        this.f74581d = i12;
        this.f74582e = z10;
        this.f74583f = i13;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        H60.f(bundle, "carrier", this.f74578a, !TextUtils.isEmpty(this.f74578a));
        int i10 = this.f74579b;
        H60.e(bundle, "cnt", i10, i10 != -2);
        bundle.putInt("gnt", this.f74580c);
        bundle.putInt("pt", this.f74581d);
        Bundle bundleA = H60.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = H60.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f74583f);
        bundleA2.putBoolean("active_network_metered", this.f74582e);
    }
}
