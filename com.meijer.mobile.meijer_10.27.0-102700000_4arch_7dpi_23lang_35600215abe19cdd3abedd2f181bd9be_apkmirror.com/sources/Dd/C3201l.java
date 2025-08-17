package Dd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Dd.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3201l extends C3069a implements InterfaceC3225n {
    C3201l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // Dd.InterfaceC3225n
    public final C3189k E4(com.google.android.gms.dynamic.b bVar, C3165i c3165i) throws RemoteException {
        C3189k c3189k;
        Parcel parcelA1 = A1();
        P.b(parcelA1, bVar);
        P.a(parcelA1, c3165i);
        Parcel parcelA2 = a2(1, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c3189k = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (iInterfaceQueryLocalInterface instanceof C3189k) {
                c3189k = (C3189k) iInterfaceQueryLocalInterface;
            } else {
                c3189k = new C3189k(strongBinder);
            }
        }
        parcelA2.recycle();
        return c3189k;
    }
}
