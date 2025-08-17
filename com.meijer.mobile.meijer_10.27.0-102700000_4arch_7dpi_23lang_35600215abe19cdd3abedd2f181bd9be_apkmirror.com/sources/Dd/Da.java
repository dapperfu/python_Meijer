package Dd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class Da extends C3069a implements Fa {
    Da(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // Dd.Fa
    public final Ca n8(com.google.android.gms.dynamic.b bVar, ua uaVar) throws RemoteException {
        Ca ca2;
        Parcel parcelA1 = A1();
        P.b(parcelA1, bVar);
        P.a(parcelA1, uaVar);
        Parcel parcelA2 = a2(1, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            ca2 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            if (iInterfaceQueryLocalInterface instanceof Ca) {
                ca2 = (Ca) iInterfaceQueryLocalInterface;
            } else {
                ca2 = new Ca(strongBinder);
            }
        }
        parcelA2.recycle();
        return ca2;
    }
}
