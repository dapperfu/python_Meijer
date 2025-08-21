package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.gh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8255gh extends BinderC8990nb implements InterfaceC8362hh {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
            C9097ob.c(parcel);
            p0(bVarA2);
        } else if (i10 == 2) {
            zzd();
        } else {
            if (i10 != 3) {
                return false;
            }
            com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
            C9097ob.c(parcel);
            s3(bVarA22);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC8255gh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }
}
