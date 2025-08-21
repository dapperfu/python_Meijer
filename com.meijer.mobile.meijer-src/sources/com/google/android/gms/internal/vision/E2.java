package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class E2 extends C11132a implements L1 {
    E2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    @Override // com.google.android.gms.internal.vision.L1
    public final Xd.a[] T5(com.google.android.gms.dynamic.b bVar, G2 g22) throws RemoteException {
        Parcel parcelK1 = K1();
        C11136b.a(parcelK1, bVar);
        C11136b.b(parcelK1, g22);
        Parcel parcelA2 = a2(1, parcelK1);
        Xd.a[] aVarArr = (Xd.a[]) parcelA2.createTypedArray(Xd.a.CREATOR);
        parcelA2.recycle();
        return aVarArr;
    }

    @Override // com.google.android.gms.internal.vision.L1
    public final Xd.a[] s6(com.google.android.gms.dynamic.b bVar, G2 g22) throws RemoteException {
        Parcel parcelK1 = K1();
        C11136b.a(parcelK1, bVar);
        C11136b.b(parcelK1, g22);
        Parcel parcelA2 = a2(2, parcelK1);
        Xd.a[] aVarArr = (Xd.a[]) parcelA2.createTypedArray(Xd.a.CREATOR);
        parcelA2.recycle();
        return aVarArr;
    }

    @Override // com.google.android.gms.internal.vision.L1
    public final void zza() throws RemoteException {
        c2(3, K1());
    }
}
