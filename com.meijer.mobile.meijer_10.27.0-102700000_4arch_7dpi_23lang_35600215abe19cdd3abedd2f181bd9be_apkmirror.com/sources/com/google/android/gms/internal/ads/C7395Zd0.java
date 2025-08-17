package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Zd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7395Zd0 extends C8758mb implements InterfaceC7592be0 {
    C7395Zd0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7592be0
    public final void D6(Bundle bundle, InterfaceC7805de0 interfaceC7805de0) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, bundle);
        C8972ob.f(parcelA1, interfaceC7805de0);
        F2(3, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7592be0
    public final void I8(String str, Bundle bundle, InterfaceC7805de0 interfaceC7805de0) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        C8972ob.d(parcelA1, bundle);
        C8972ob.f(parcelA1, interfaceC7805de0);
        F2(1, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7592be0
    public final void N7(Bundle bundle, InterfaceC7805de0 interfaceC7805de0) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, bundle);
        C8972ob.f(parcelA1, interfaceC7805de0);
        F2(2, parcelA1);
    }
}
