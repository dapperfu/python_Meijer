package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8771lX implements InterfaceC9733uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC8878mX f76691a;

    C8771lX(BinderC8878mX binderC8878mX) {
        this.f76691a = binderC8878mX;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final void zza() {
        synchronized (this.f76691a) {
            this.f76691a.f77657j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        FG fg2 = (FG) obj;
        synchronized (this.f76691a) {
            this.f76691a.f77657j = fg2;
            this.f76691a.f77657j.b();
        }
    }
}
