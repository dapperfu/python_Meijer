package Bd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes6.dex */
public final class f extends C2951a implements h {
    @Override // Bd.h
    public final void zzo() throws RemoteException {
        b2(1, a2());
    }

    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // Bd.h
    public final int zzi() throws RemoteException {
        Parcel parcelA1 = A1(20, a2());
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    @Override // Bd.h
    public final void F(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(7, parcelA2);
    }

    @Override // Bd.h
    public final void G0(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(17, parcelA2);
    }

    @Override // Bd.h
    public final void G2(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(13, parcelA2);
    }

    @Override // Bd.h
    public final boolean S1(h hVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, hVar);
        Parcel parcelA1 = A1(19, parcelA2);
        boolean zF = s.f(parcelA1);
        parcelA1.recycle();
        return zF;
    }

    @Override // Bd.h
    public final void a0(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        b2(3, parcelA2);
    }

    @Override // Bd.h
    public final void b0(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(15, parcelA2);
    }

    @Override // Bd.h
    public final void h0(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeList(list);
        b2(5, parcelA2);
    }

    @Override // Bd.h
    public final void j1(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        b2(23, parcelA2);
    }

    @Override // Bd.h
    public final void p6(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        b2(27, parcelA2);
    }

    @Override // Bd.h
    public final void w(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(21, parcelA2);
    }

    @Override // Bd.h
    public final void z0(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        b2(11, parcelA2);
    }

    @Override // Bd.h
    public final void zzu(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        b2(9, parcelA2);
    }

    @Override // Bd.h
    public final void zzw(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        b2(25, parcelA2);
    }
}
