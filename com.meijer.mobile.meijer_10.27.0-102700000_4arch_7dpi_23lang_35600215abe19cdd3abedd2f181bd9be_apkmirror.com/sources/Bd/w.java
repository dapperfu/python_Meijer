package Bd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes6.dex */
public final class w extends C2951a implements y {
    @Override // Bd.y
    public final void zzn() throws RemoteException {
        b2(1, a2());
    }

    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // Bd.y
    public final int zzi() throws RemoteException {
        Parcel parcelA1 = A1(18, a2());
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    @Override // Bd.y
    public final void F(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(13, parcelA2);
    }

    @Override // Bd.y
    public final boolean T7(y yVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, yVar);
        Parcel parcelA1 = A1(17, parcelA2);
        boolean zF = s.f(parcelA1);
        parcelA1.recycle();
        return zF;
    }

    @Override // Bd.y
    public final void W2(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(7, parcelA2);
    }

    @Override // Bd.y
    public final void W7(double d10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeDouble(d10);
        b2(5, parcelA2);
    }

    @Override // Bd.y
    public final void a0(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        b2(21, parcelA2);
    }

    @Override // Bd.y
    public final void a6(LatLng latLng) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, latLng);
        b2(3, parcelA2);
    }

    @Override // Bd.y
    public final void t0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        b2(23, parcelA2);
    }

    @Override // Bd.y
    public final void u4(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(15, parcelA2);
    }

    @Override // Bd.y
    public final void w(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(19, parcelA2);
    }

    @Override // Bd.y
    public final void z0(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        b2(11, parcelA2);
    }

    @Override // Bd.y
    public final void zzs(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        b2(9, parcelA2);
    }
}
