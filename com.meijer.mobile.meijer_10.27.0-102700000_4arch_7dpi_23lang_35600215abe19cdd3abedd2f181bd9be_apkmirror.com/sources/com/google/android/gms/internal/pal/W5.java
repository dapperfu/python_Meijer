package com.google.android.gms.internal.pal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes6.dex */
public abstract class W5 extends P4 implements X5 {
    public W5() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.pal.P4
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                b.a.a2(parcel.readStrongBinder());
                parcel.readString();
                Q4.b(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                Q4.b(parcel);
                break;
            case 5:
                parcel.createByteArray();
                Q4.b(parcel);
                break;
            case 6:
                parcel.readInt();
                Q4.b(parcel);
                break;
            case 7:
                parcel.readInt();
                Q4.b(parcel);
                break;
            case 8:
                b.a.a2(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                Q4.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
