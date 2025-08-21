package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Gn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6894Gn extends C8883mb implements InterfaceC6962In {
    C6894Gn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6962In
    public final void R1(List list) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeTypedList(list);
        c2(1, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6962In
    public final void a(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        c2(2, parcelK1);
    }
}
