package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ck, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7709ck extends C8758mb implements InterfaceC7922ek {
    C7709ck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7922ek
    public final void b(Mc.W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(3, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7922ek
    public final void y1(InterfaceC7371Yj interfaceC7371Yj) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC7371Yj);
        b2(1, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7922ek
    public final void zze(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(2, parcelA1);
    }
}
