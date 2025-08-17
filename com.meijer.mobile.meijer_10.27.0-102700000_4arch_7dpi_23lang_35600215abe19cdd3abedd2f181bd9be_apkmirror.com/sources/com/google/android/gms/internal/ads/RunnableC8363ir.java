package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ir, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8363ir implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f75012a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f75013b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzcaw f75014c;

    RunnableC8363ir(zzcaw zzcawVar, int i10, int i11) {
        this.f75012a = i10;
        this.f75013b = i11;
        this.f75014c = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f75014c;
        if (zzcawVar.f80596p != null) {
            zzcawVar.f80596p.c(this.f75012a, this.f75013b);
        }
    }
}
