package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Zd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7520Zd0 extends C8883mb implements InterfaceC7717be0 {
    C7520Zd0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7717be0
    public final void C8(String str, Bundle bundle, InterfaceC7930de0 interfaceC7930de0) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        C9097ob.d(parcelK1, bundle);
        C9097ob.f(parcelK1, interfaceC7930de0);
        I2(1, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7717be0
    public final void N7(Bundle bundle, InterfaceC7930de0 interfaceC7930de0) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, bundle);
        C9097ob.f(parcelK1, interfaceC7930de0);
        I2(2, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7717be0
    public final void O6(Bundle bundle, InterfaceC7930de0 interfaceC7930de0) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, bundle);
        C9097ob.f(parcelK1, interfaceC7930de0);
        I2(3, parcelK1);
    }
}
