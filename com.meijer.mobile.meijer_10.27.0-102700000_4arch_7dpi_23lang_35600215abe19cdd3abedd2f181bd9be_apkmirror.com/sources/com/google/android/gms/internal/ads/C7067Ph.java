package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ph, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7067Ph extends C8758mb implements InterfaceC7101Qh {
    @Override // com.google.android.gms.internal.ads.InterfaceC7101Qh
    public final void zze() throws RemoteException {
        b2(2, A1());
    }

    C7067Ph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7101Qh
    public final void i(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        b2(1, parcelA1);
    }
}
