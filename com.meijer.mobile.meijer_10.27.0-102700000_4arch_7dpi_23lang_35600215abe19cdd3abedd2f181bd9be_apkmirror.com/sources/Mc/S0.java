package Mc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class S0 extends C8758mb implements U0 {
    @Override // Mc.U0
    public final Bundle zze() throws RemoteException {
        Parcel parcelA2 = a2(5, A1());
        Bundle bundle = (Bundle) C8972ob.a(parcelA2, Bundle.CREATOR);
        parcelA2.recycle();
        return bundle;
    }

    @Override // Mc.U0
    public final h2 zzf() throws RemoteException {
        Parcel parcelA2 = a2(4, A1());
        h2 h2Var = (h2) C8972ob.a(parcelA2, h2.CREATOR);
        parcelA2.recycle();
        return h2Var;
    }

    @Override // Mc.U0
    public final String zzg() throws RemoteException {
        Parcel parcelA2 = a2(1, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // Mc.U0
    public final String zzh() throws RemoteException {
        Parcel parcelA2 = a2(6, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // Mc.U0
    public final String zzi() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // Mc.U0
    public final List zzj() throws RemoteException {
        Parcel parcelA2 = a2(3, A1());
        ArrayList arrayListCreateTypedArrayList = parcelA2.createTypedArrayList(h2.CREATOR);
        parcelA2.recycle();
        return arrayListCreateTypedArrayList;
    }

    S0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }
}
