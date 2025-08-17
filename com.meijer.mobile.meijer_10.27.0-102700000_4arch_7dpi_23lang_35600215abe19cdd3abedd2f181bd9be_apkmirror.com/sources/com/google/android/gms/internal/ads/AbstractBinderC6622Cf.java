package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Cf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6622Cf extends BinderC8865nb implements InterfaceC6656Df {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String strZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
        } else if (i10 == 2) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else if (i10 == 3) {
            com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
            C8972ob.c(parcel);
            i0(bVarA2);
            parcel2.writeNoException();
        } else if (i10 == 4) {
            zze();
            parcel2.writeNoException();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }

    public AbstractBinderC6622Cf() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }
}
