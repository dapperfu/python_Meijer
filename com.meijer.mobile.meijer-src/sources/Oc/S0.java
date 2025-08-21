package Oc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class S0 extends C8883mb implements U0 {
    @Override // Oc.U0
    public final Bundle zze() throws RemoteException {
        Parcel parcelA2 = a2(5, K1());
        Bundle bundle = (Bundle) C9097ob.a(parcelA2, Bundle.CREATOR);
        parcelA2.recycle();
        return bundle;
    }

    @Override // Oc.U0
    public final h2 zzf() throws RemoteException {
        Parcel parcelA2 = a2(4, K1());
        h2 h2Var = (h2) C9097ob.a(parcelA2, h2.CREATOR);
        parcelA2.recycle();
        return h2Var;
    }

    @Override // Oc.U0
    public final String zzg() throws RemoteException {
        Parcel parcelA2 = a2(1, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // Oc.U0
    public final String zzh() throws RemoteException {
        Parcel parcelA2 = a2(6, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // Oc.U0
    public final String zzi() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // Oc.U0
    public final List zzj() throws RemoteException {
        Parcel parcelA2 = a2(3, K1());
        ArrayList arrayListCreateTypedArrayList = parcelA2.createTypedArrayList(h2.CREATOR);
        parcelA2.recycle();
        return arrayListCreateTypedArrayList;
    }

    S0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }
}
