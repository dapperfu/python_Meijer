package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class R00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final Y50 f69709a;

    public R00(Y50 y50) {
        this.f69709a = y50;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        if (this.f69709a != null) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76094Ob)).booleanValue()) {
                return;
            }
            ab2.f65088a.putBoolean("render_in_browser", this.f69709a.d());
            ab2.f65088a.putBoolean("disable_ml", this.f69709a.c());
        }
    }
}
