package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC10289zj extends BinderC8990nb implements InterfaceC6686Aj {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C9097ob.a(parcel, ParcelFileDescriptor.CREATOR);
        C9097ob.c(parcel);
        y5(parcelFileDescriptor);
        return true;
    }

    public AbstractBinderC10289zj() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }
}
