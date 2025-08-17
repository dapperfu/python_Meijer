package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8988oj extends C8758mb implements InterfaceC9202qj {
    C8988oj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9202qj
    public final void d(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        b2(1, parcelA1);
    }
}
