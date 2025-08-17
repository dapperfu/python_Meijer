package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Wg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7301Wg extends BinderC8865nb implements InterfaceC7334Xg {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.dynamic.b bVarZzf = zzf();
            parcel2.writeNoException();
            C8972ob.f(parcel2, bVarZzf);
        } else if (i10 == 2) {
            Uri uriZze = zze();
            parcel2.writeNoException();
            C8972ob.e(parcel2, uriZze);
        } else if (i10 == 3) {
            double dZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(dZzb);
        } else if (i10 == 4) {
            int iZzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(iZzd);
        } else {
            if (i10 != 5) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }

    public AbstractBinderC7301Wg() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static InterfaceC7334Xg B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7334Xg ? (InterfaceC7334Xg) iInterfaceQueryLocalInterface : new C7268Vg(iBinder);
    }
}
