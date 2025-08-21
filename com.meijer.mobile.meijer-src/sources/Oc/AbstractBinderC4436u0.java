package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.AbstractBinderC6722Bl;
import com.google.android.gms.internal.ads.AbstractBinderC7161Oj;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC7195Pj;
import java.util.List;

/* renamed from: Oc.u0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4436u0 extends BinderC8990nb implements InterfaceC4439v0 {
    public AbstractBinderC4436u0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        H0 f02;
        switch (i10) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                C9097ob.c(parcel);
                M(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                C9097ob.c(parcel);
                m0(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zG = C9097ob.g(parcel);
                C9097ob.c(parcel);
                w(zG);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                String string2 = parcel.readString();
                C9097ob.c(parcel);
                a8(bVarA2, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                t3(string3, bVarA22);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                int i12 = C9097ob.f78241b;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                C9097ob.c(parcel);
                N(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC6756Cl interfaceC6756ClB9 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                c1(interfaceC6756ClB9);
                parcel2.writeNoException();
                return true;
            case 12:
                InterfaceC7195Pj interfaceC7195PjB9 = AbstractBinderC7161Oj.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                v2(interfaceC7195PjB9);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                L1 l12 = (L1) C9097ob.a(parcel, L1.CREATOR);
                C9097ob.c(parcel);
                N3(l12);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    f02 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    if (iInterfaceQueryLocalInterface instanceof H0) {
                        f02 = (H0) iInterfaceQueryLocalInterface;
                    } else {
                        f02 = new F0(strongBinder);
                    }
                }
                C9097ob.c(parcel);
                w9(f02);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zG2 = C9097ob.g(parcel);
                C9097ob.c(parcel);
                J(zG2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                C9097ob.c(parcel);
                x5(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
