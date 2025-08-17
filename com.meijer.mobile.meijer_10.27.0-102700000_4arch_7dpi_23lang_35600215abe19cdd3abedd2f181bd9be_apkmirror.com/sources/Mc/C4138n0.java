package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* renamed from: Mc.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4138n0 extends C8758mb implements InterfaceC4144p0 {
    @Override // Mc.InterfaceC4144p0
    public final void zzb() throws RemoteException {
        b2(5, A1());
    }

    @Override // Mc.InterfaceC4144p0
    public final void zzc() throws RemoteException {
        b2(3, A1());
    }

    @Override // Mc.InterfaceC4144p0
    public final void zze() throws RemoteException {
        b2(4, A1());
    }

    @Override // Mc.InterfaceC4144p0
    public final void zzf() throws RemoteException {
        b2(2, A1());
    }

    C4138n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // Mc.InterfaceC4144p0
    public final void H0(W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(1, parcelA1);
    }
}
