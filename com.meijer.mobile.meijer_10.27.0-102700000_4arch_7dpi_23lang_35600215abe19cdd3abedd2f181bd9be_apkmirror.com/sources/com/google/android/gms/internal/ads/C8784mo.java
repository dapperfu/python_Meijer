package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8784mo extends C8758mb implements InterfaceC8998oo {
    C8784mo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8998oo
    public final void G4(ParcelFileDescriptor parcelFileDescriptor, C9853wo c9853wo) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, parcelFileDescriptor);
        C8972ob.d(parcelA1, c9853wo);
        b2(3, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8998oo
    public final void k4(Pc.C c10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c10);
        b2(2, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8998oo
    public final void z7(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, parcelFileDescriptor);
        b2(1, parcelA1);
    }
}
