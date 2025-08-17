package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8646lX implements InterfaceC9608uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC8753mX f75851a;

    C8646lX(BinderC8753mX binderC8753mX) {
        this.f75851a = binderC8753mX;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final void zza() {
        synchronized (this.f75851a) {
            this.f75851a.f76817j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        FG fg2 = (FG) obj;
        synchronized (this.f75851a) {
            this.f75851a.f76817j = fg2;
            this.f75851a.f76817j.b();
        }
    }
}
