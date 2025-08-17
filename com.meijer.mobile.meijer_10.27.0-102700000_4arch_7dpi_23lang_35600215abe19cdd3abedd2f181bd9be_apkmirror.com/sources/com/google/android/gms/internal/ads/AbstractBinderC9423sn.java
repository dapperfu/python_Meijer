package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.sn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9423sn extends BinderC8865nb implements InterfaceC9530tn {
    public AbstractBinderC9423sn() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static InterfaceC9530tn B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9530tn ? (InterfaceC9530tn) iInterfaceQueryLocalInterface : new C9316rn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                v3(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzt();
                parcel2.writeNoException();
                return true;
            case 4:
                zzr();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                F0(bundle2);
                parcel2.writeNoException();
                C8972ob.e(parcel2, bundle2);
                return true;
            case 7:
                zzu();
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                zzx();
                parcel2.writeNoException();
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zF = f();
                parcel2.writeNoException();
                int i12 = C8972ob.f77401b;
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 12:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                Intent intent = (Intent) C8972ob.a(parcel, Intent.CREATOR);
                C8972ob.c(parcel);
                j6(i13, i14, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                O(bVarA2);
                parcel2.writeNoException();
                return true;
            case 14:
                zzv();
                parcel2.writeNoException();
                return true;
            case 15:
                int i15 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                C8972ob.c(parcel);
                C2(i15, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
