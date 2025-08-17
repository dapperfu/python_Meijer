package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8683lr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcaw f76665a;

    RunnableC8683lr(zzcaw zzcawVar) {
        this.f76665a = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f76665a;
        if (zzcawVar.f80596p != null) {
            zzcawVar.f80596p.zzd();
        }
    }
}
