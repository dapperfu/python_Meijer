package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC10164zj extends BinderC8865nb implements InterfaceC6561Aj {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C8972ob.a(parcel, ParcelFileDescriptor.CREATOR);
        C8972ob.c(parcel);
        q5(parcelFileDescriptor);
        return true;
    }

    public AbstractBinderC10164zj() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }
}
