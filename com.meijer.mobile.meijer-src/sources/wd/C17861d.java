package wd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: wd.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17861d extends C17858a implements InterfaceC17863f {
    @Override // wd.InterfaceC17863f
    public final String zzc() throws RemoteException {
        Parcel parcelA2 = a2(1, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // wd.InterfaceC17863f
    public final boolean zzd() throws RemoteException {
        Parcel parcelA2 = a2(6, K1());
        boolean zB = C17860c.b(parcelA2);
        parcelA2.recycle();
        return zB;
    }

    C17861d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // wd.InterfaceC17863f
    public final boolean N1(boolean z10) throws RemoteException {
        Parcel parcelK1 = K1();
        C17860c.a(parcelK1, true);
        Parcel parcelA2 = a2(2, parcelK1);
        boolean zB = C17860c.b(parcelA2);
        parcelA2.recycle();
        return zB;
    }
}
