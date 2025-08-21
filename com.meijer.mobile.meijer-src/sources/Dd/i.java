package Dd;

import Od.C4458f;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes6.dex */
public final class i extends C3100a implements k {
    @Override // Dd.k
    public final void zzp() throws RemoteException {
        c2(1, a2());
    }

    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // Dd.k
    public final int zzh() throws RemoteException {
        Parcel parcelK1 = K1(16, a2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    @Override // Dd.k
    public final void E0(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(17, parcelA2);
    }

    @Override // Dd.k
    public final void H0(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        c2(7, parcelA2);
    }

    @Override // Dd.k
    public final void K(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        c2(27, parcelA2);
    }

    @Override // Dd.k
    public final boolean L2(k kVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, kVar);
        Parcel parcelK1 = K1(15, parcelA2);
        boolean zF = s.f(parcelK1);
        parcelK1.recycle();
        return zF;
    }

    @Override // Dd.k
    public final void Q0(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(5, parcelA2);
    }

    @Override // Dd.k
    public final void U(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(9, parcelA2);
    }

    @Override // Dd.k
    public final void U2(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(11, parcelA2);
    }

    @Override // Dd.k
    public final void X2(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(13, parcelA2);
    }

    @Override // Dd.k
    public final void o2(C4458f c4458f) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, c4458f);
        c2(21, parcelA2);
    }

    @Override // Dd.k
    public final void o3(C4458f c4458f) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, c4458f);
        c2(19, parcelA2);
    }

    @Override // Dd.k
    public final void zzu(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        c2(23, parcelA2);
    }

    @Override // Dd.k
    public final void zzv(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        c2(25, parcelA2);
    }

    @Override // Dd.k
    public final void zzw(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        c2(3, parcelA2);
    }

    @Override // Dd.k
    public final void zzx(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        c2(29, parcelA2);
    }
}
