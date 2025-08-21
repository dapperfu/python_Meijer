package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8275gr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f75250a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f75251b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzcaw f75252c;

    RunnableC8275gr(zzcaw zzcawVar, String str, String str2) {
        this.f75250a = str;
        this.f75251b = str2;
        this.f75252c = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f75252c;
        if (zzcawVar.f81436p != null) {
            zzcawVar.f81436p.a(this.f75250a, this.f75251b);
        }
    }
}
