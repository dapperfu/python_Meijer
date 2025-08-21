package Dd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class l extends C3100a implements n {
    @Override // Dd.n
    public final void zzh() throws RemoteException {
        c2(2, a2());
    }

    @Override // Dd.n
    public final void zzi() throws RemoteException {
        c2(1, a2());
    }

    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // Dd.n
    public final int zzf() throws RemoteException {
        Parcel parcelK1 = K1(9, a2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    @Override // Dd.n
    public final void C5(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(4, parcelA2);
    }

    @Override // Dd.n
    public final void C6(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(12, parcelA2);
    }

    @Override // Dd.n
    public final void J(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(10, parcelA2);
    }

    @Override // Dd.n
    public final boolean X8(n nVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, nVar);
        Parcel parcelK1 = K1(8, parcelA2);
        boolean zF = s.f(parcelK1);
        parcelK1.recycle();
        return zF;
    }

    @Override // Dd.n
    public final void t0(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(6, parcelA2);
    }
}
