package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.h20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8299h20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final String f75418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75419b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75420c;

    /* renamed from: d, reason: collision with root package name */
    public final int f75421d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f75422e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75423f;

    public C8299h20(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.f75418a = str;
        this.f75419b = i10;
        this.f75420c = i11;
        this.f75421d = i12;
        this.f75422e = z10;
        this.f75423f = i13;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        H60.f(bundle, "carrier", this.f75418a, !TextUtils.isEmpty(this.f75418a));
        int i10 = this.f75419b;
        H60.e(bundle, "cnt", i10, i10 != -2);
        bundle.putInt("gnt", this.f75420c);
        bundle.putInt("pt", this.f75421d);
        Bundle bundleA = H60.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = H60.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f75423f);
        bundleA2.putBoolean("active_network_metered", this.f75422e);
    }
}
