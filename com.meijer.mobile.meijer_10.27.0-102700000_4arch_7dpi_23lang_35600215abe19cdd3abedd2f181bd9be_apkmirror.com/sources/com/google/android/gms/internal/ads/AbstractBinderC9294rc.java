package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.rc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9294rc extends BinderC8865nb implements InterfaceC9401sc {
    public AbstractBinderC9294rc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC10150zc c9936xc;
        switch (i10) {
            case 2:
                Mc.V vZze = zze();
                parcel2.writeNoException();
                C8972ob.f(parcel2, vZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC9829wc) {
                    }
                }
                C8972ob.c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    c9936xc = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (iInterfaceQueryLocalInterface2 instanceof InterfaceC10150zc) {
                        c9936xc = (InterfaceC10150zc) iInterfaceQueryLocalInterface2;
                    } else {
                        c9936xc = new C9936xc(strongBinder2);
                    }
                }
                C8972ob.c(parcel);
                W4(bVarA2, c9936xc);
                parcel2.writeNoException();
                return true;
            case 5:
                Mc.U0 u0Zzf = zzf();
                parcel2.writeNoException();
                C8972ob.f(parcel2, u0Zzf);
                return true;
            case 6:
                boolean zG = C8972ob.g(parcel);
                C8972ob.c(parcel);
                r0(zG);
                parcel2.writeNoException();
                return true;
            case 7:
                Mc.N0 n0B9 = Mc.M0.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                n9(n0B9);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
