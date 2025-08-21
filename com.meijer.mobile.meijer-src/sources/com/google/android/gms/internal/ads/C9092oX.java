package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9092oX implements InterfaceC9733uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9199pX f78225a;

    C9092oX(C9199pX c9199pX) {
        this.f78225a = c9199pX;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final void zza() {
        synchronized (this.f78225a) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C6702Az c6702Az = (C6702Az) obj;
        synchronized (this.f78225a) {
            this.f78225a.f78438c = c6702Az.c();
            c6702Az.b();
        }
    }
}
