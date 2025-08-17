package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8150gr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f74410a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f74411b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzcaw f74412c;

    RunnableC8150gr(zzcaw zzcawVar, String str, String str2) {
        this.f74410a = str;
        this.f74411b = str2;
        this.f74412c = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f74412c;
        if (zzcawVar.f80596p != null) {
            zzcawVar.f80596p.a(this.f74410a, this.f74411b);
        }
    }
}
