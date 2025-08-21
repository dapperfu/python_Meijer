package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.no, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9016no extends BinderC8990nb implements InterfaceC9123oo {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C9097ob.a(parcel, ParcelFileDescriptor.CREATOR);
            C9097ob.c(parcel);
            D7(parcelFileDescriptor);
        } else if (i10 == 2) {
            Rc.C c10 = (Rc.C) C9097ob.a(parcel, Rc.C.CREATOR);
            C9097ob.c(parcel);
            E4(c10);
        } else {
            if (i10 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) C9097ob.a(parcel, ParcelFileDescriptor.CREATOR);
            C9978wo c9978wo = (C9978wo) C9097ob.a(parcel, C9978wo.CREATOR);
            C9097ob.c(parcel);
            R4(parcelFileDescriptor2, c9978wo);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC9016no() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }
}
