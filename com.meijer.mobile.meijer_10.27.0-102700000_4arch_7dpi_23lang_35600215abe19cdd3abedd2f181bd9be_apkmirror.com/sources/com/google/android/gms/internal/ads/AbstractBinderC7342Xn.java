package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Xn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7342Xn extends BinderC8865nb implements InterfaceC7375Yn {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC7342Xn() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }
}
