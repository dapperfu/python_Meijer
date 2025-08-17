package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import gd.C14235B;
import gd.C14237D;
import yd.C18206a;

/* loaded from: classes4.dex */
public final class V extends C18206a implements X {
    @Override // com.google.android.gms.common.internal.X
    public final boolean zzi() throws RemoteException {
        Parcel parcelA1 = A1(7, b2());
        boolean zE = yd.d.e(parcelA1);
        parcelA1.recycle();
        return zE;
    }

    V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.X
    public final C14235B Z8(gd.z zVar) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.c(parcelB2, zVar);
        Parcel parcelA1 = A1(8, parcelB2);
        C14235B c14235b = (C14235B) yd.d.a(parcelA1, C14235B.CREATOR);
        parcelA1.recycle();
        return c14235b;
    }

    @Override // com.google.android.gms.common.internal.X
    public final C14235B l5(gd.z zVar) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.c(parcelB2, zVar);
        Parcel parcelA1 = A1(6, parcelB2);
        C14235B c14235b = (C14235B) yd.d.a(parcelA1, C14235B.CREATOR);
        parcelA1.recycle();
        return c14235b;
    }

    @Override // com.google.android.gms.common.internal.X
    public final boolean x2(C14237D c14237d, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.c(parcelB2, c14237d);
        yd.d.d(parcelB2, bVar);
        Parcel parcelA1 = A1(5, parcelB2);
        boolean zE = yd.d.e(parcelA1);
        parcelA1.recycle();
        return zE;
    }
}
