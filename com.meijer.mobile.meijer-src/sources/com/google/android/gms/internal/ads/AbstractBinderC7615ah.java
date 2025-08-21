package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.ah, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7615ah extends BinderC8990nb implements InterfaceC7828ch {
    public AbstractBinderC7615ah() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static InterfaceC7828ch B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7828ch ? (InterfaceC7828ch) iInterfaceQueryLocalInterface : new C7525Zg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC7360Ug c7292Sg;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                F4(string, bVarA2);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                C9097ob.c(parcel);
                com.google.android.gms.dynamic.b bVarD = d(string2);
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarD);
                return true;
            case 3:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                c3(bVarA22);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                b.a.a2(parcel.readStrongBinder());
                parcel.readInt();
                C9097ob.c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                f8(bVarA23);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                l0(bVarA24);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c7292Sg = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC7360Ug) {
                        c7292Sg = (InterfaceC7360Ug) iInterfaceQueryLocalInterface;
                    } else {
                        c7292Sg = new C7292Sg(strongBinder);
                    }
                }
                C9097ob.c(parcel);
                J5(c7292Sg);
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                t2(bVarA25);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
