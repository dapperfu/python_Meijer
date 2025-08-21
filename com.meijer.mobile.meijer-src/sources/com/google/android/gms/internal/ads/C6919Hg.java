package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Hg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6919Hg extends C8883mb implements IInterface {
    C6919Hg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void Z3(InterfaceC7500Yn interfaceC7500Yn) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC7500Yn);
        c2(1, parcelK1);
    }
}
