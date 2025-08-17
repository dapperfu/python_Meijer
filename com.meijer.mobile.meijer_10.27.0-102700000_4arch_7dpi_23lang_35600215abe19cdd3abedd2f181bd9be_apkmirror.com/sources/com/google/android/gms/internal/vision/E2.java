package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class E2 extends C11007a implements L1 {
    E2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    @Override // com.google.android.gms.internal.vision.L1
    public final Vd.a[] K5(com.google.android.gms.dynamic.b bVar, G2 g22) throws RemoteException {
        Parcel parcelA1 = A1();
        C11011b.a(parcelA1, bVar);
        C11011b.b(parcelA1, g22);
        Parcel parcelA2 = a2(1, parcelA1);
        Vd.a[] aVarArr = (Vd.a[]) parcelA2.createTypedArray(Vd.a.CREATOR);
        parcelA2.recycle();
        return aVarArr;
    }

    @Override // com.google.android.gms.internal.vision.L1
    public final Vd.a[] d6(com.google.android.gms.dynamic.b bVar, G2 g22) throws RemoteException {
        Parcel parcelA1 = A1();
        C11011b.a(parcelA1, bVar);
        C11011b.b(parcelA1, g22);
        Parcel parcelA2 = a2(2, parcelA1);
        Vd.a[] aVarArr = (Vd.a[]) parcelA2.createTypedArray(Vd.a.CREATOR);
        parcelA2.recycle();
        return aVarArr;
    }

    @Override // com.google.android.gms.internal.vision.L1
    public final void zza() throws RemoteException {
        b2(3, A1());
    }
}
