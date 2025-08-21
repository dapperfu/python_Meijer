package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ir, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8488ir implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f75852a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f75853b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzcaw f75854c;

    RunnableC8488ir(zzcaw zzcawVar, int i10, int i11) {
        this.f75852a = i10;
        this.f75853b = i11;
        this.f75854c = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f75854c;
        if (zzcawVar.f81436p != null) {
            zzcawVar.f81436p.c(this.f75852a, this.f75853b);
        }
    }
}
