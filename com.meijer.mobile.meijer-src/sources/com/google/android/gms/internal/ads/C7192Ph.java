package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ph, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7192Ph extends C8883mb implements InterfaceC7226Qh {
    @Override // com.google.android.gms.internal.ads.InterfaceC7226Qh
    public final void zze() throws RemoteException {
        c2(2, K1());
    }

    C7192Ph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7226Qh
    public final void i(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        c2(1, parcelK1);
    }
}
