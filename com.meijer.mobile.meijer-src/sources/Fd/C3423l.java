package Fd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Fd.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3423l extends C3291a implements InterfaceC3447n {
    C3423l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // Fd.InterfaceC3447n
    public final C3411k r3(com.google.android.gms.dynamic.b bVar, C3387i c3387i) throws RemoteException {
        C3411k c3411k;
        Parcel parcelK1 = K1();
        P.b(parcelK1, bVar);
        P.a(parcelK1, c3387i);
        Parcel parcelA2 = a2(1, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c3411k = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (iInterfaceQueryLocalInterface instanceof C3411k) {
                c3411k = (C3411k) iInterfaceQueryLocalInterface;
            } else {
                c3411k = new C3411k(strongBinder);
            }
        }
        parcelA2.recycle();
        return c3411k;
    }
}
