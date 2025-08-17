package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.no, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8891no extends BinderC8865nb implements InterfaceC8998oo {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C8972ob.a(parcel, ParcelFileDescriptor.CREATOR);
            C8972ob.c(parcel);
            z7(parcelFileDescriptor);
        } else if (i10 == 2) {
            Pc.C c10 = (Pc.C) C8972ob.a(parcel, Pc.C.CREATOR);
            C8972ob.c(parcel);
            k4(c10);
        } else {
            if (i10 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) C8972ob.a(parcel, ParcelFileDescriptor.CREATOR);
            C9853wo c9853wo = (C9853wo) C8972ob.a(parcel, C9853wo.CREATOR);
            C8972ob.c(parcel);
            G4(parcelFileDescriptor2, c9853wo);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC8891no() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }
}
