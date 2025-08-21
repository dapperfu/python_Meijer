package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.rc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9419rc extends BinderC8990nb implements InterfaceC9526sc {
    public AbstractBinderC9419rc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC10275zc c10061xc;
        switch (i10) {
            case 2:
                Oc.V vZze = zze();
                parcel2.writeNoException();
                C9097ob.f(parcel2, vZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC9954wc) {
                    }
                }
                C9097ob.c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    c10061xc = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (iInterfaceQueryLocalInterface2 instanceof InterfaceC10275zc) {
                        c10061xc = (InterfaceC10275zc) iInterfaceQueryLocalInterface2;
                    } else {
                        c10061xc = new C10061xc(strongBinder2);
                    }
                }
                C9097ob.c(parcel);
                j5(bVarA2, c10061xc);
                parcel2.writeNoException();
                return true;
            case 5:
                Oc.U0 u0Zzf = zzf();
                parcel2.writeNoException();
                C9097ob.f(parcel2, u0Zzf);
                return true;
            case 6:
                boolean zG = C9097ob.g(parcel);
                C9097ob.c(parcel);
                s0(zG);
                parcel2.writeNoException();
                return true;
            case 7:
                Oc.N0 n0B9 = Oc.M0.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                Q8(n0B9);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
