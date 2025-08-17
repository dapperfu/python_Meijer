package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Gn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6769Gn extends C8758mb implements InterfaceC6837In {
    C6769Gn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6837In
    public final void K1(List list) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeTypedList(list);
        b2(1, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6837In
    public final void a(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        b2(2, parcelA1);
    }
}
