package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public abstract class X0 extends BinderC8990nb implements Y0 {
    public X0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static Y0 B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof Y0 ? (Y0) iInterfaceQueryLocalInterface : new V0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC4381b1 z02;
        switch (i10) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zG = C9097ob.g(parcel);
                C9097ob.c(parcel);
                J(zG);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i12 = C9097ob.f78241b;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 5:
                int iZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeInt(iZzh);
                return true;
            case 6:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 7:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    z02 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC4381b1) {
                        z02 = (InterfaceC4381b1) iInterfaceQueryLocalInterface;
                    } else {
                        z02 = new Z0(strongBinder);
                    }
                }
                C9097ob.c(parcel);
                v5(z02);
                parcel2.writeNoException();
                return true;
            case 9:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 10:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i13 = C9097ob.f78241b;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 11:
                InterfaceC4381b1 interfaceC4381b1Zzi = zzi();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC4381b1Zzi);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i14 = C9097ob.f78241b;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
