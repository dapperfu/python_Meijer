package Bd;

import Md.C4180f;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes6.dex */
public final class i extends C2951a implements k {
    @Override // Bd.k
    public final void zzp() throws RemoteException {
        b2(1, a2());
    }

    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // Bd.k
    public final int zzh() throws RemoteException {
        Parcel parcelA1 = A1(16, a2());
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    @Override // Bd.k
    public final void B0(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(17, parcelA2);
    }

    @Override // Bd.k
    public final void E0(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        b2(7, parcelA2);
    }

    @Override // Bd.k
    public final void K(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        b2(27, parcelA2);
    }

    @Override // Bd.k
    public final void N2(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(11, parcelA2);
    }

    @Override // Bd.k
    public final void Q2(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(13, parcelA2);
    }

    @Override // Bd.k
    public final boolean Q7(k kVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, kVar);
        Parcel parcelA1 = A1(15, parcelA2);
        boolean zF = s.f(parcelA1);
        parcelA1.recycle();
        return zF;
    }

    @Override // Bd.k
    public final void R0(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(5, parcelA2);
    }

    @Override // Bd.k
    public final void U(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(9, parcelA2);
    }

    @Override // Bd.k
    public final void n3(C4180f c4180f) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, c4180f);
        b2(21, parcelA2);
    }

    @Override // Bd.k
    public final void o9(C4180f c4180f) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, c4180f);
        b2(19, parcelA2);
    }

    @Override // Bd.k
    public final void zzu(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        b2(23, parcelA2);
    }

    @Override // Bd.k
    public final void zzv(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        b2(25, parcelA2);
    }

    @Override // Bd.k
    public final void zzw(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        b2(3, parcelA2);
    }

    @Override // Bd.k
    public final void zzx(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        b2(29, parcelA2);
    }
}
