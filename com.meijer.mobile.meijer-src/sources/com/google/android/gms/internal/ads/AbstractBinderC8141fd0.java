package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.fd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8141fd0 extends BinderC8990nb implements InterfaceC8248gd0 {
    public AbstractBinderC8141fd0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                b.a.a2(parcel.readStrongBinder());
                parcel.readString();
                C9097ob.c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                C9097ob.c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                C9097ob.c(parcel);
                break;
            case 6:
                parcel.readInt();
                C9097ob.c(parcel);
                break;
            case 7:
                parcel.readInt();
                C9097ob.c(parcel);
                break;
            case 8:
                b.a.a2(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                C9097ob.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
