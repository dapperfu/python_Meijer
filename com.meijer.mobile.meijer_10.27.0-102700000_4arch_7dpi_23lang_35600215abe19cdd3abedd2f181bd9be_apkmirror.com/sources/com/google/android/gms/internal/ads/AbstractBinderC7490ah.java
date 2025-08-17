package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.ah, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7490ah extends BinderC8865nb implements InterfaceC7703ch {
    public AbstractBinderC7490ah() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static InterfaceC7703ch B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7703ch ? (InterfaceC7703ch) iInterfaceQueryLocalInterface : new C7400Zg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC7235Ug c7167Sg;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                s4(string, bVarA2);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                C8972ob.c(parcel);
                com.google.android.gms.dynamic.b bVarD = d(string2);
                parcel2.writeNoException();
                C8972ob.f(parcel2, bVarD);
                return true;
            case 3:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                X2(bVarA22);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                b.a.a2(parcel.readStrongBinder());
                parcel.readInt();
                C8972ob.c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                i8(bVarA23);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                i0(bVarA24);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c7167Sg = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC7235Ug) {
                        c7167Sg = (InterfaceC7235Ug) iInterfaceQueryLocalInterface;
                    } else {
                        c7167Sg = new C7167Sg(strongBinder);
                    }
                }
                C8972ob.c(parcel);
                B5(c7167Sg);
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                q2(bVarA25);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
