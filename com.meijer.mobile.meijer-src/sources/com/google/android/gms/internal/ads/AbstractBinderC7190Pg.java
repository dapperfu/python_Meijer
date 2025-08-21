package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Pg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7190Pg extends BinderC8990nb implements InterfaceC7224Qg {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            String strZzg = zzg();
            parcel2.writeNoException();
            parcel2.writeString(strZzg);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        List listZzh = zzh();
        parcel2.writeNoException();
        parcel2.writeList(listZzh);
        return true;
    }

    public AbstractBinderC7190Pg() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static InterfaceC7224Qg B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7224Qg ? (InterfaceC7224Qg) iInterfaceQueryLocalInterface : new C7156Og(iBinder);
    }
}
