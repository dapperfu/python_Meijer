package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8594jr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcaw f76366a;

    RunnableC8594jr(zzcaw zzcawVar) {
        this.f76366a = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f76366a;
        if (zzcawVar.f81436p != null) {
            zzcawVar.f81436p.zzd();
            this.f76366a.f81436p.zzi();
        }
    }
}
