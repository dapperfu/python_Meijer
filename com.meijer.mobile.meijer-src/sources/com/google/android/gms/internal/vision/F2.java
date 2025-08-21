package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class F2 extends C11132a implements D2 {
    F2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // com.google.android.gms.internal.vision.D2
    public final L1 m2(com.google.android.gms.dynamic.b bVar, C11176l1 c11176l1) throws RemoteException {
        L1 e22;
        Parcel parcelK1 = K1();
        C11136b.a(parcelK1, bVar);
        C11136b.b(parcelK1, c11176l1);
        Parcel parcelA2 = a2(1, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            e22 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (iInterfaceQueryLocalInterface instanceof L1) {
                e22 = (L1) iInterfaceQueryLocalInterface;
            } else {
                e22 = new E2(strongBinder);
            }
        }
        parcelA2.recycle();
        return e22;
    }
}
