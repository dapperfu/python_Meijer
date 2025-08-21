package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8909mo extends C8883mb implements InterfaceC9123oo {
    C8909mo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9123oo
    public final void D7(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, parcelFileDescriptor);
        c2(1, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9123oo
    public final void E4(Rc.C c10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c10);
        c2(2, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9123oo
    public final void R4(ParcelFileDescriptor parcelFileDescriptor, C9978wo c9978wo) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, parcelFileDescriptor);
        C9097ob.d(parcelK1, c9978wo);
        c2(3, parcelK1);
    }
}
