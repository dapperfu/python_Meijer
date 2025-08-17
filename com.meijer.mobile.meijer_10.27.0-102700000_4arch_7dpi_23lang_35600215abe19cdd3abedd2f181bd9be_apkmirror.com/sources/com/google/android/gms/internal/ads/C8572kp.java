package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.kp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8572kp extends C8758mb implements IInterface {
    C8572kp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void N3(InterfaceC7409Zo interfaceC7409Zo, String str, String str2) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC7409Zo);
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        b2(2, parcelA1);
    }
}
