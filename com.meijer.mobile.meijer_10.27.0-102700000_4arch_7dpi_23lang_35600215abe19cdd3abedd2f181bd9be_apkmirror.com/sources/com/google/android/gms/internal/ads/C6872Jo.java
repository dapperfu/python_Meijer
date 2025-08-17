package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Jo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6872Jo extends C8758mb implements IInterface {
    C6872Jo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void N3(InterfaceC6838Io interfaceC6838Io, String str, String str2) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC6838Io);
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        b2(2, parcelA1);
    }
}
