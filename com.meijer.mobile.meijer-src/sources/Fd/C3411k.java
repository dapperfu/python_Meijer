package Fd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Fd.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3411k extends C3291a implements IInterface {
    public final void zzd() throws RemoteException {
        c2(3, K1());
    }

    C3411k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final C3588z8[] I2(com.google.android.gms.dynamic.b bVar, C3459o c3459o) throws RemoteException {
        Parcel parcelK1 = K1();
        P.b(parcelK1, bVar);
        P.a(parcelK1, c3459o);
        Parcel parcelA2 = a2(1, parcelK1);
        C3588z8[] c3588z8Arr = (C3588z8[]) parcelA2.createTypedArray(C3588z8.CREATOR);
        parcelA2.recycle();
        return c3588z8Arr;
    }

    public final C3588z8[] Z3(com.google.android.gms.dynamic.b bVar, C3459o c3459o) throws RemoteException {
        Parcel parcelK1 = K1();
        P.b(parcelK1, bVar);
        P.a(parcelK1, c3459o);
        Parcel parcelA2 = a2(2, parcelK1);
        C3588z8[] c3588z8Arr = (C3588z8[]) parcelA2.createTypedArray(C3588z8.CREATOR);
        parcelA2.recycle();
        return c3588z8Arr;
    }
}
