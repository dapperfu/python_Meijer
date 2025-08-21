package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ph, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9216ph extends BinderC8990nb implements InterfaceC9323qh {
    public AbstractBinderC9216ph() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static InterfaceC9323qh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9323qh ? (InterfaceC9323qh) iInterfaceQueryLocalInterface : new C9109oh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                String string = parcel.readString();
                C9097ob.c(parcel);
                String strS = S(string);
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 2:
                String string2 = parcel.readString();
                C9097ob.c(parcel);
                InterfaceC7459Xg interfaceC7459XgS = s(string2);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7459XgS);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 5:
                String string3 = parcel.readString();
                C9097ob.c(parcel);
                z(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                Oc.Y0 y0Zze = zze();
                parcel2.writeNoException();
                C9097ob.f(parcel2, y0Zze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.dynamic.b bVarZzh = zzh();
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarZzh);
                return true;
            case 10:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                boolean zD = D(bVarA2);
                parcel2.writeNoException();
                parcel2.writeInt(zD ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                C9097ob.f(parcel2, null);
                return true;
            case 12:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i12 = C9097ob.f78241b;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                int i13 = C9097ob.f78241b;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                zzp(bVarA22);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                InterfaceC7360Ug interfaceC7360UgZzf = zzf();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7360UgZzf);
                return true;
            case 17:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                boolean zE = E(bVarA23);
                parcel2.writeNoException();
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
