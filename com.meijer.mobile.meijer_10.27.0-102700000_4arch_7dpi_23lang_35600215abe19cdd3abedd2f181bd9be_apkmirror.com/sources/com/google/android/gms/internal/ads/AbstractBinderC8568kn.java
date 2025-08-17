package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.kn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8568kn extends BinderC8865nb implements InterfaceC8675ln {
    public AbstractBinderC8568kn() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static InterfaceC8675ln B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8675ln ? (InterfaceC8675ln) iInterfaceQueryLocalInterface : new C8461jn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                Intent intent = (Intent) C8972ob.a(parcel, Intent.CREATOR);
                C8972ob.c(parcel);
                O0(intent);
                break;
            case 2:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                C8972ob.c(parcel);
                a7(bVarA2, string, string2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                y0(bVarA22);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                j2(strArrCreateStringArray, iArrCreateIntArray, bVarA23);
                break;
            case 6:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                Nc.a aVar = (Nc.a) C8972ob.a(parcel, Nc.a.CREATOR);
                C8972ob.c(parcel);
                P0(bVarA24, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
