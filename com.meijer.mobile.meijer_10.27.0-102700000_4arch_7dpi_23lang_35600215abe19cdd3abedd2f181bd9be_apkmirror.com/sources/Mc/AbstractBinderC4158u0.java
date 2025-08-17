package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.AbstractBinderC6597Bl;
import com.google.android.gms.internal.ads.AbstractBinderC7036Oj;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC7070Pj;
import java.util.List;

/* renamed from: Mc.u0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4158u0 extends BinderC8865nb implements InterfaceC4161v0 {
    public AbstractBinderC4158u0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        H0 f02;
        switch (i10) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                C8972ob.c(parcel);
                M(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                C8972ob.c(parcel);
                j0(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zG = C8972ob.g(parcel);
                C8972ob.c(parcel);
                w(zG);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                String string2 = parcel.readString();
                C8972ob.c(parcel);
                d8(bVarA2, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                l3(string3, bVarA22);
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
                int i12 = C8972ob.f77401b;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                C8972ob.c(parcel);
                N(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC6631Cl interfaceC6631ClB9 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                Z0(interfaceC6631ClB9);
                parcel2.writeNoException();
                return true;
            case 12:
                InterfaceC7070Pj interfaceC7070PjB9 = AbstractBinderC7036Oj.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                s2(interfaceC7070PjB9);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                L1 l12 = (L1) C8972ob.a(parcel, L1.CREATOR);
                C8972ob.c(parcel);
                u1(l12);
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
                C8972ob.c(parcel);
                L7(f02);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zG2 = C8972ob.g(parcel);
                C8972ob.c(parcel);
                J(zG2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                C8972ob.c(parcel);
                p5(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
