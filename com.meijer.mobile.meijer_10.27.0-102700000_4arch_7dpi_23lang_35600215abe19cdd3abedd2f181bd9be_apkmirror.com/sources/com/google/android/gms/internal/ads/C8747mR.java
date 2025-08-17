package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8747mR implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8037fo f76787a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9105po f76788b;

    C8747mR(BinderC9388sR binderC9388sR, C9105po c9105po, C8037fo c8037fo) {
        this.f76788b = c9105po;
        this.f76787a = c8037fo;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        try {
            this.f76788b.k4(Pc.C.T(th2));
        } catch (RemoteException e10) {
            Pc.p0.l("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f76788b.N3((String) obj, this.f76787a);
        } catch (RemoteException e10) {
            Pc.p0.l("Service can't call client", e10);
        }
    }
}
