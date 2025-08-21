package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ak, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7621ak extends BinderC8990nb implements InterfaceC7728bk {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel.readInt();
            C9097ob.c(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC7621ak() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }
}
