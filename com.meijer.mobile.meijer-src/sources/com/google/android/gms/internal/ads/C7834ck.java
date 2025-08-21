package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ck, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7834ck extends C8883mb implements InterfaceC8047ek {
    C7834ck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8047ek
    public final void I1(InterfaceC7496Yj interfaceC7496Yj) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC7496Yj);
        c2(1, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8047ek
    public final void b(Oc.W0 w02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, w02);
        c2(3, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8047ek
    public final void zze(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        c2(2, parcelK1);
    }
}
