package Dd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes6.dex */
public final class w extends C3100a implements y {
    @Override // Dd.y
    public final void zzn() throws RemoteException {
        c2(1, a2());
    }

    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // Dd.y
    public final int zzi() throws RemoteException {
        Parcel parcelK1 = K1(18, a2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    @Override // Dd.y
    public final void C0(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        c2(11, parcelA2);
    }

    @Override // Dd.y
    public final void F(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(13, parcelA2);
    }

    @Override // Dd.y
    public final void H4(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(15, parcelA2);
    }

    @Override // Dd.y
    public final void T7(double d10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeDouble(d10);
        c2(5, parcelA2);
    }

    @Override // Dd.y
    public final void b3(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(7, parcelA2);
    }

    @Override // Dd.y
    public final void c0(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        c2(21, parcelA2);
    }

    @Override // Dd.y
    public final boolean e2(y yVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, yVar);
        Parcel parcelK1 = K1(17, parcelA2);
        boolean zF = s.f(parcelK1);
        parcelK1.recycle();
        return zF;
    }

    @Override // Dd.y
    public final void q6(LatLng latLng) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, latLng);
        c2(3, parcelA2);
    }

    @Override // Dd.y
    public final void u0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        c2(23, parcelA2);
    }

    @Override // Dd.y
    public final void w(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(19, parcelA2);
    }

    @Override // Dd.y
    public final void zzs(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        c2(9, parcelA2);
    }
}
