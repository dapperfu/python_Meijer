package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ju, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8600ju extends BinderC8990nb implements InterfaceC8707ku {
    public AbstractBinderC8600ju() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
                C9097ob.c(parcel);
                T(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
                C9097ob.c(parcel);
                Bundle bundleC7 = c7(bundle2);
                parcel2.writeNoException();
                C9097ob.e(parcel2, bundleC7);
                return true;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle3 = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
                C9097ob.c(parcel);
                k8(string, string2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                a1(string3, string4, bVarA2);
                parcel2.writeNoException();
                return true;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean zG = C9097ob.g(parcel);
                C9097ob.c(parcel);
                Map mapO8 = O8(string5, string6, zG);
                parcel2.writeNoException();
                parcel2.writeMap(mapO8);
                return true;
            case 6:
                String string7 = parcel.readString();
                C9097ob.c(parcel);
                int iD = d(string7);
                parcel2.writeNoException();
                parcel2.writeInt(iD);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
                C9097ob.c(parcel);
                u(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Bundle bundle5 = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
                C9097ob.c(parcel);
                j9(string8, string9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                C9097ob.c(parcel);
                List listQ3 = Q3(string10, string11);
                parcel2.writeNoException();
                parcel2.writeList(listQ3);
                return true;
            case 10:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 11:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 12:
                long jZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(jZzc);
                return true;
            case 13:
                String string12 = parcel.readString();
                C9097ob.c(parcel);
                x(string12);
                parcel2.writeNoException();
                return true;
            case 14:
                String string13 = parcel.readString();
                C9097ob.c(parcel);
                z(string13);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                C9097ob.c(parcel);
                R3(bVarA22, string14, string15);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 17:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 18:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
                C9097ob.c(parcel);
                L0(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
