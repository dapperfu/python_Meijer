package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.kn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8693kn extends BinderC8990nb implements InterfaceC8800ln {
    public AbstractBinderC8693kn() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static InterfaceC8800ln B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8800ln ? (InterfaceC8800ln) iInterfaceQueryLocalInterface : new C8586jn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                Intent intent = (Intent) C9097ob.a(parcel, Intent.CREATOR);
                C9097ob.c(parcel);
                O0(intent);
                break;
            case 2:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                C9097ob.c(parcel);
                m7(bVarA2, string, string2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                B0(bVarA22);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                l2(strArrCreateStringArray, iArrCreateIntArray, bVarA23);
                break;
            case 6:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                Pc.a aVar = (Pc.a) C9097ob.a(parcel, Pc.a.CREATOR);
                C9097ob.c(parcel);
                G8(bVarA24, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
