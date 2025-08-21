package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class PY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final int f70188a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f70189b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70190c;

    /* renamed from: d, reason: collision with root package name */
    public final int f70191d;

    /* renamed from: e, reason: collision with root package name */
    public final int f70192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f70193f;

    /* renamed from: g, reason: collision with root package name */
    public final int f70194g;

    /* renamed from: h, reason: collision with root package name */
    public final int f70195h;

    /* renamed from: i, reason: collision with root package name */
    public final float f70196i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f70197j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f70198k;

    public PY(int i10, boolean z10, boolean z11, int i11, int i12, int i13, int i14, int i15, float f10, boolean z12, boolean z13) {
        this.f70188a = i10;
        this.f70189b = z10;
        this.f70190c = z11;
        this.f70191d = i11;
        this.f70192e = i12;
        this.f70193f = i13;
        this.f70194g = i14;
        this.f70195h = i15;
        this.f70196i = f10;
        this.f70197j = z12;
        this.f70198k = z13;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        if (((Boolean) Oc.A.c().a(C8784lf.f76975Ra)).booleanValue()) {
            bundle.putInt("muv_min", this.f70192e);
            bundle.putInt("muv_max", this.f70193f);
        }
        bundle.putFloat("android_app_volume", this.f70196i);
        bundle.putBoolean("android_app_muted", this.f70197j);
        if (this.f70198k) {
            return;
        }
        bundle.putInt("am", this.f70188a);
        bundle.putBoolean("ma", this.f70189b);
        bundle.putBoolean("sp", this.f70190c);
        bundle.putInt("muv", this.f70191d);
        bundle.putInt("rm", this.f70194g);
        bundle.putInt("riv", this.f70195h);
    }
}
