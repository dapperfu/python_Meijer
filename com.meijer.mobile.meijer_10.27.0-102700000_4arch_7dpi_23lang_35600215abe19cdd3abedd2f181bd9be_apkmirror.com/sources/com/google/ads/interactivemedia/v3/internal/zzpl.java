package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes4.dex */
public abstract class zzpl extends zzlh implements zzpm {
    public zzpl() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlh
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                b.a.a2(parcel.readStrongBinder());
                parcel.readString();
                zzli.zzb(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzli.zzb(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzli.zzb(parcel);
                break;
            case 6:
                parcel.readInt();
                zzli.zzb(parcel);
                break;
            case 7:
                parcel.readInt();
                zzli.zzb(parcel);
                break;
            case 8:
                b.a.a2(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzli.zzb(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
