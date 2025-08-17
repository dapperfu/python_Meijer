package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Xj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7338Xj extends BinderC8865nb implements InterfaceC7371Yj {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC7603bk c7404Zj;
        if (i10 == 3) {
            Mc.Y0 y0Zzb = zzb();
            parcel2.writeNoException();
            C8972ob.f(parcel2, y0Zzb);
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
                c7404Zj = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                c7404Zj = iInterfaceQueryLocalInterface instanceof InterfaceC7603bk ? (InterfaceC7603bk) iInterfaceQueryLocalInterface : new C7404Zj(strongBinder);
            }
            C8972ob.c(parcel);
            q8(bVarA2, c7404Zj);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 6) {
            com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
            C8972ob.c(parcel);
            zze(bVarA22);
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 7) {
            return false;
        }
        InterfaceC7235Ug interfaceC7235UgZzc = zzc();
        parcel2.writeNoException();
        C8972ob.f(parcel2, interfaceC7235UgZzc);
        return true;
    }

    public AbstractBinderC7338Xj() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }
}
