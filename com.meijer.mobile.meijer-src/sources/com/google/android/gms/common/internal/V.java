package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import id.C14711B;
import id.C14713D;

/* loaded from: classes4.dex */
public final class V extends Ad.a implements X {
    @Override // com.google.android.gms.common.internal.X
    public final boolean zzi() throws RemoteException {
        Parcel parcelK1 = K1(7, c2());
        boolean zE = Ad.d.e(parcelK1);
        parcelK1.recycle();
        return zE;
    }

    V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.X
    public final C14711B L4(id.z zVar) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.c(parcelC2, zVar);
        Parcel parcelK1 = K1(6, parcelC2);
        C14711B c14711b = (C14711B) Ad.d.a(parcelK1, C14711B.CREATOR);
        parcelK1.recycle();
        return c14711b;
    }

    @Override // com.google.android.gms.common.internal.X
    public final C14711B s4(id.z zVar) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.c(parcelC2, zVar);
        Parcel parcelK1 = K1(8, parcelC2);
        C14711B c14711b = (C14711B) Ad.d.a(parcelK1, C14711B.CREATOR);
        parcelK1.recycle();
        return c14711b;
    }

    @Override // com.google.android.gms.common.internal.X
    public final boolean x3(C14713D c14713d, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.c(parcelC2, c14713d);
        Ad.d.d(parcelC2, bVar);
        Parcel parcelK1 = K1(5, parcelC2);
        boolean zE = Ad.d.e(parcelK1);
        parcelK1.recycle();
        return zE;
    }
}
