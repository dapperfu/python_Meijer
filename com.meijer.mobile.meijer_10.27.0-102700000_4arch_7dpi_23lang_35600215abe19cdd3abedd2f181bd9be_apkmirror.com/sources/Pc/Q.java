package Pc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public final class Q extends C8758mb implements T {
    Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // Pc.T
    public final void zze(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(2, parcelA1);
    }

    @Override // Pc.T
    public final boolean zzf(com.google.android.gms.dynamic.b bVar, String str, String str2) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        Parcel parcelA2 = a2(1, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // Pc.T
    public final boolean zzg(com.google.android.gms.dynamic.b bVar, Nc.a aVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, aVar);
        Parcel parcelA2 = a2(3, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }
}
