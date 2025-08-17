package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.rj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9308rj extends BinderC8865nb implements InterfaceC9415sj {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            C8972ob.c(parcel);
            i(string);
        } else {
            if (i10 != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC9308rj() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }
}
