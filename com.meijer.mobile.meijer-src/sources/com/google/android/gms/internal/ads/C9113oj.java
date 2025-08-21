package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9113oj extends C8883mb implements InterfaceC9327qj {
    C9113oj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9327qj
    public final void d(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        c2(1, parcelK1);
    }
}
