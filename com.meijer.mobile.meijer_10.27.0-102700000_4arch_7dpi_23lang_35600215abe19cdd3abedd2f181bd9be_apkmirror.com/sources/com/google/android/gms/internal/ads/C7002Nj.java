package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Nj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7002Nj extends C8758mb implements InterfaceC7070Pj {
    C7002Nj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7070Pj
    public final void f4(List list) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeTypedList(list);
        b2(1, parcelA1);
    }
}
