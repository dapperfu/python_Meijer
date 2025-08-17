package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7827dq extends C8758mb implements InterfaceC8041fq {
    C7827dq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8041fq
    public final void P1(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.d(parcelA1, bundle);
        b2(3, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8041fq
    public final void d(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        b2(2, parcelA1);
    }
}
