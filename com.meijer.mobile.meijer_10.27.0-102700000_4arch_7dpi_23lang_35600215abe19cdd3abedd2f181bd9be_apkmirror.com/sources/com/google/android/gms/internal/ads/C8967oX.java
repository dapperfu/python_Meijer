package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8967oX implements InterfaceC9608uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9074pX f77385a;

    C8967oX(C9074pX c9074pX) {
        this.f77385a = c9074pX;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final void zza() {
        synchronized (this.f77385a) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C6577Az c6577Az = (C6577Az) obj;
        synchronized (this.f77385a) {
            this.f77385a.f77598c = c6577Az.c();
            c6577Az.b();
        }
    }
}
