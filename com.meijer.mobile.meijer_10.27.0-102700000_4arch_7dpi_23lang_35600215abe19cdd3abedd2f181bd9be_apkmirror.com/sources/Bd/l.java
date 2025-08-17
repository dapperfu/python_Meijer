package Bd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class l extends C2951a implements n {
    @Override // Bd.n
    public final void zzh() throws RemoteException {
        b2(2, a2());
    }

    @Override // Bd.n
    public final void zzi() throws RemoteException {
        b2(1, a2());
    }

    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // Bd.n
    public final int zzf() throws RemoteException {
        Parcel parcelA1 = A1(9, a2());
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    @Override // Bd.n
    public final void J(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(10, parcelA2);
    }

    @Override // Bd.n
    public final boolean f1(n nVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, nVar);
        Parcel parcelA1 = A1(8, parcelA2);
        boolean zF = s.f(parcelA1);
        parcelA1.recycle();
        return zF;
    }

    @Override // Bd.n
    public final void m6(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(12, parcelA2);
    }

    @Override // Bd.n
    public final void s0(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(6, parcelA2);
    }

    @Override // Bd.n
    public final void v5(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(4, parcelA2);
    }
}
