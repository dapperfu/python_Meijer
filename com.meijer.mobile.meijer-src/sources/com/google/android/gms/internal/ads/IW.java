package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class IW implements InterfaceC9733uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JW f68473a;

    IW(JW jw2) {
        this.f68473a = jw2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final void zza() {
        synchronized (this.f68473a) {
            this.f68473a.f68770i = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AbstractC8929my abstractC8929my = (AbstractC8929my) obj;
        synchronized (this.f68473a) {
            try {
                JW jw2 = this.f68473a;
                if (jw2.f68770i != null) {
                    jw2.f68770i.a();
                }
                this.f68473a.f68770i = abstractC8929my;
                this.f68473a.f68770i.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
