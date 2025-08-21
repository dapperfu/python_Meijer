package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;

/* loaded from: classes4.dex */
public final class B0 extends C8883mb implements D0 {
    @Override // Oc.D0
    public final String zze() throws RemoteException {
        Parcel parcelA2 = a2(1, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // Oc.D0
    public final String zzf() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }
}
