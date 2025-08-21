package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Xj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7463Xj extends BinderC8990nb implements InterfaceC7496Yj {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC7728bk c7529Zj;
        if (i10 == 3) {
            Oc.Y0 y0Zzb = zzb();
            parcel2.writeNoException();
            C9097ob.f(parcel2, y0Zzb);
            return true;
        }
        if (i10 == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 5) {
            com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c7529Zj = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                c7529Zj = iInterfaceQueryLocalInterface instanceof InterfaceC7728bk ? (InterfaceC7728bk) iInterfaceQueryLocalInterface : new C7529Zj(strongBinder);
            }
            C9097ob.c(parcel);
            p8(bVarA2, c7529Zj);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 6) {
            com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
            C9097ob.c(parcel);
            zze(bVarA22);
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 7) {
            return false;
        }
        InterfaceC7360Ug interfaceC7360UgZzc = zzc();
        parcel2.writeNoException();
        C9097ob.f(parcel2, interfaceC7360UgZzc);
        return true;
    }

    public AbstractBinderC7463Xj() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }
}
