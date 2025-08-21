package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Nj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7127Nj extends C8883mb implements InterfaceC7195Pj {
    C7127Nj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7195Pj
    public final void v4(List list) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeTypedList(list);
        c2(1, parcelK1);
    }
}
