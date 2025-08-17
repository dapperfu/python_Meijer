package ud;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ud.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17244d extends C17241a implements InterfaceC17246f {
    @Override // ud.InterfaceC17246f
    public final String zzc() throws RemoteException {
        Parcel parcelA2 = a2(1, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // ud.InterfaceC17246f
    public final boolean zzd() throws RemoteException {
        Parcel parcelA2 = a2(6, A1());
        boolean zB = C17243c.b(parcelA2);
        parcelA2.recycle();
        return zB;
    }

    C17244d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // ud.InterfaceC17246f
    public final boolean E1(boolean z10) throws RemoteException {
        Parcel parcelA1 = A1();
        C17243c.a(parcelA1, true);
        Parcel parcelA2 = a2(2, parcelA1);
        boolean zB = C17243c.b(parcelA2);
        parcelA2.recycle();
        return zB;
    }
}
