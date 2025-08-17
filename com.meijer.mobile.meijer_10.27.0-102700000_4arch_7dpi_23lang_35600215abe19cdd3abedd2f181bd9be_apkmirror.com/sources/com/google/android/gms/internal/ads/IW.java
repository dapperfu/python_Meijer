package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class IW implements InterfaceC9608uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JW f67633a;

    IW(JW jw2) {
        this.f67633a = jw2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final void zza() {
        synchronized (this.f67633a) {
            this.f67633a.f67930i = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AbstractC8804my abstractC8804my = (AbstractC8804my) obj;
        synchronized (this.f67633a) {
            try {
                JW jw2 = this.f67633a;
                if (jw2.f67930i != null) {
                    jw2.f67930i.a();
                }
                this.f67633a.f67930i = abstractC8804my;
                this.f67633a.f67930i.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
