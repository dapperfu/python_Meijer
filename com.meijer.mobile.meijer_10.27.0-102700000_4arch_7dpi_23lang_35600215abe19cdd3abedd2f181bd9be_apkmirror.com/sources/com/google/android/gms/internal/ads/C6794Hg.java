package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Hg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6794Hg extends C8758mb implements IInterface {
    C6794Hg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void N3(InterfaceC7375Yn interfaceC7375Yn) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC7375Yn);
        b2(1, parcelA1);
    }
}
