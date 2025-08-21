package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Jo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6997Jo extends C8883mb implements IInterface {
    C6997Jo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void Z3(InterfaceC6963Io interfaceC6963Io, String str, String str2) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC6963Io);
        parcelK1.writeString(str);
        parcelK1.writeString(str2);
        c2(2, parcelK1);
    }
}
