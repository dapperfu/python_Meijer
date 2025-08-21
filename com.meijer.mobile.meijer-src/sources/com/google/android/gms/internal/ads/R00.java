package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class R00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final Y50 f70549a;

    public R00(Y50 y50) {
        this.f70549a = y50;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        if (this.f70549a != null) {
            if (((Boolean) Oc.A.c().a(C8784lf.f76934Ob)).booleanValue()) {
                return;
            }
            ab2.f65928a.putBoolean("render_in_browser", this.f70549a.d());
            ab2.f65928a.putBoolean("disable_ml", this.f70549a.c());
        }
    }
}
