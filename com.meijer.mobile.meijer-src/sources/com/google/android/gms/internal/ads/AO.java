package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* loaded from: classes6.dex */
final class AO implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EO f65963a;

    AO(EO eo2) {
        this.f65963a = eo2;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        synchronized (this) {
            this.f65963a.f67279c = true;
            this.f65963a.v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (Nc.v.c().c() - this.f65963a.f67280d));
            this.f65963a.f67281e.c(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.f65963a.f67279c = true;
            this.f65963a.v("com.google.android.gms.ads.MobileAds", true, "", (int) (Nc.v.c().c() - this.f65963a.f67280d));
            this.f65963a.f67285i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zO
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    EO.j(this.f81256a.f65963a, str);
                }
            });
        }
    }
}
