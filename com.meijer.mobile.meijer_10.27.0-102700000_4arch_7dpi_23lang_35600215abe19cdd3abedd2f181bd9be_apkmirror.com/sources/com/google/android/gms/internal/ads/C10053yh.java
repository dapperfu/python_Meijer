package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10053yh extends C8758mb implements InterfaceC6592Bh {
    C10053yh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6592Bh
    public final void t7(InterfaceC9198qh interfaceC9198qh, String str) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC9198qh);
        parcelA1.writeString(str);
        b2(1, parcelA1);
    }
}
