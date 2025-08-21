package Fd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class Ca extends C3291a implements IInterface {
    public final void zze() throws RemoteException {
        c2(1, K1());
    }

    public final void zzf() throws RemoteException {
        c2(2, K1());
    }

    Ca(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final List I2(com.google.android.gms.dynamic.b bVar, La la2) throws RemoteException {
        Parcel parcelK1 = K1();
        P.b(parcelK1, bVar);
        P.a(parcelK1, la2);
        Parcel parcelA2 = a2(3, parcelK1);
        ArrayList arrayListCreateTypedArrayList = parcelA2.createTypedArrayList(sa.CREATOR);
        parcelA2.recycle();
        return arrayListCreateTypedArrayList;
    }
}
