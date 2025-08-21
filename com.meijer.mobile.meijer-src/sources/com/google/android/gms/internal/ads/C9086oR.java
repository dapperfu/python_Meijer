package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9086oR implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9978wo f78207a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC9123oo f78208b;

    C9086oR(BinderC9513sR binderC9513sR, C9978wo c9978wo, InterfaceC9123oo interfaceC9123oo) {
        this.f78207a = c9978wo;
        this.f78208b = interfaceC9123oo;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        try {
            this.f78208b.E4(Rc.C.T(th2));
        } catch (RemoteException e10) {
            Rc.p0.l("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue()) {
                this.f78208b.D7(parcelFileDescriptor);
                return;
            }
            if (((Boolean) Oc.A.c().a(C8784lf.f77246l2)).booleanValue() && (bundle = this.f78207a.f80378m) != null) {
                bundle.putLong(EnumC8014eN.BINDER_CALL_START.a(), Nc.v.c().a());
            }
            this.f78208b.R4(parcelFileDescriptor, this.f78207a);
        } catch (RemoteException e10) {
            Rc.p0.l("Service can't call client", e10);
        }
    }
}
