package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class F2 extends C11007a implements D2 {
    F2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // com.google.android.gms.internal.vision.D2
    public final L1 m2(com.google.android.gms.dynamic.b bVar, C11051l1 c11051l1) throws RemoteException {
        L1 e22;
        Parcel parcelA1 = A1();
        C11011b.a(parcelA1, bVar);
        C11011b.b(parcelA1, c11051l1);
        Parcel parcelA2 = a2(1, parcelA1);
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
