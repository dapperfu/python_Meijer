package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8961oR implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9853wo f77367a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC8998oo f77368b;

    C8961oR(BinderC9388sR binderC9388sR, C9853wo c9853wo, InterfaceC8998oo interfaceC8998oo) {
        this.f77367a = c9853wo;
        this.f77368b = interfaceC8998oo;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        try {
            this.f77368b.k4(Pc.C.T(th2));
        } catch (RemoteException e10) {
            Pc.p0.l("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue()) {
                this.f77368b.z7(parcelFileDescriptor);
                return;
            }
            if (((Boolean) Mc.A.c().a(C8659lf.f76406l2)).booleanValue() && (bundle = this.f77367a.f79538m) != null) {
                bundle.putLong(EnumC7889eN.BINDER_CALL_START.a(), Lc.v.c().a());
            }
            this.f77368b.G4(parcelFileDescriptor, this.f77367a);
        } catch (RemoteException e10) {
            Pc.p0.l("Service can't call client", e10);
        }
    }
}
