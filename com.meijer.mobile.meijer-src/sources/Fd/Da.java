package Fd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class Da extends C3291a implements Fa {
    Da(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // Fd.Fa
    public final Ca J8(com.google.android.gms.dynamic.b bVar, ua uaVar) throws RemoteException {
        Ca ca2;
        Parcel parcelK1 = K1();
        P.b(parcelK1, bVar);
        P.a(parcelK1, uaVar);
        Parcel parcelA2 = a2(1, parcelK1);
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
