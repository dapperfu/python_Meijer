package Dd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Dd.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3189k extends C3069a implements IInterface {
    public final void zzd() throws RemoteException {
        b2(3, A1());
    }

    C3189k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final C3366z8[] F2(com.google.android.gms.dynamic.b bVar, C3237o c3237o) throws RemoteException {
        Parcel parcelA1 = A1();
        P.b(parcelA1, bVar);
        P.a(parcelA1, c3237o);
        Parcel parcelA2 = a2(1, parcelA1);
        C3366z8[] c3366z8Arr = (C3366z8[]) parcelA2.createTypedArray(C3366z8.CREATOR);
        parcelA2.recycle();
        return c3366z8Arr;
    }

    public final C3366z8[] N3(com.google.android.gms.dynamic.b bVar, C3237o c3237o) throws RemoteException {
        Parcel parcelA1 = A1();
        P.b(parcelA1, bVar);
        P.a(parcelA1, c3237o);
        Parcel parcelA2 = a2(2, parcelA1);
        C3366z8[] c3366z8Arr = (C3366z8[]) parcelA2.createTypedArray(C3366z8.CREATOR);
        parcelA2.recycle();
        return c3366z8Arr;
    }
}
