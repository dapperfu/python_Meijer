package Rc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public final class Q extends C8883mb implements T {
    Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // Rc.T
    public final void zze(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(2, parcelK1);
    }

    @Override // Rc.T
    public final boolean zzf(com.google.android.gms.dynamic.b bVar, String str, String str2) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        parcelK1.writeString(str);
        parcelK1.writeString(str2);
        Parcel parcelA2 = a2(1, parcelK1);
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // Rc.T
    public final boolean zzg(com.google.android.gms.dynamic.b bVar, Pc.a aVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, aVar);
        Parcel parcelA2 = a2(3, parcelK1);
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }
}
