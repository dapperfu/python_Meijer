package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class PY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final int f69348a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69349b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f69350c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69351d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69352e;

    /* renamed from: f, reason: collision with root package name */
    public final int f69353f;

    /* renamed from: g, reason: collision with root package name */
    public final int f69354g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69355h;

    /* renamed from: i, reason: collision with root package name */
    public final float f69356i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f69357j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f69358k;

    public PY(int i10, boolean z10, boolean z11, int i11, int i12, int i13, int i14, int i15, float f10, boolean z12, boolean z13) {
        this.f69348a = i10;
        this.f69349b = z10;
        this.f69350c = z11;
        this.f69351d = i11;
        this.f69352e = i12;
        this.f69353f = i13;
        this.f69354g = i14;
        this.f69355h = i15;
        this.f69356i = f10;
        this.f69357j = z12;
        this.f69358k = z13;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        if (((Boolean) Mc.A.c().a(C8659lf.f76135Ra)).booleanValue()) {
            bundle.putInt("muv_min", this.f69352e);
            bundle.putInt("muv_max", this.f69353f);
        }
        bundle.putFloat("android_app_volume", this.f69356i);
        bundle.putBoolean("android_app_muted", this.f69357j);
        if (this.f69358k) {
            return;
        }
        bundle.putInt("am", this.f69348a);
        bundle.putBoolean("ma", this.f69349b);
        bundle.putBoolean("sp", this.f69350c);
        bundle.putInt("muv", this.f69351d);
        bundle.putInt("rm", this.f69354g);
        bundle.putInt("riv", this.f69355h);
    }
}
