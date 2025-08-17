package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;

/* loaded from: classes4.dex */
public final class B0 extends C8758mb implements D0 {
    @Override // Mc.D0
    public final String zze() throws RemoteException {
        Parcel parcelA2 = a2(1, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // Mc.D0
    public final String zzf() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }
}
