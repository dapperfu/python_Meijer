package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7952dq extends C8883mb implements InterfaceC8166fq {
    C7952dq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8166fq
    public final void U1(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        parcelK1.writeString(str2);
        C9097ob.d(parcelK1, bundle);
        c2(3, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8166fq
    public final void d(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        c2(2, parcelK1);
    }
}
