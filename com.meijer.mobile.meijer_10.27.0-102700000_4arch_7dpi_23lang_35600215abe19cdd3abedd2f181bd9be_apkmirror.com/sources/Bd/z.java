package Bd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public final class z extends C2951a implements B {
    @Override // Bd.B
    public final void zzn() throws RemoteException {
        b2(1, a2());
    }

    z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // Bd.B
    public final int zzi() throws RemoteException {
        Parcel parcelA1 = A1(20, a2());
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    @Override // Bd.B
    public final void B8(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(11, parcelA2);
    }

    @Override // Bd.B
    public final void D(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        b2(21, parcelA2);
    }

    @Override // Bd.B
    public final void I(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(15, parcelA2);
    }

    @Override // Bd.B
    public final void M(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(5, parcelA2);
    }

    @Override // Bd.B
    public final void Q4(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(13, parcelA2);
    }

    @Override // Bd.B
    public final void X(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(17, parcelA2);
    }

    @Override // Bd.B
    public final void a1(LatLngBounds latLngBounds) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, latLngBounds);
        b2(9, parcelA2);
    }

    @Override // Bd.B
    public final void a8(float f10, float f11) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        parcelA2.writeFloat(f11);
        b2(6, parcelA2);
    }

    @Override // Bd.B
    public final boolean h6(B b10) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, b10);
        Parcel parcelA1 = A1(19, parcelA2);
        boolean zF = s.f(parcelA1);
        parcelA1.recycle();
        return zF;
    }

    @Override // Bd.B
    public final void s3(LatLng latLng) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, latLng);
        b2(3, parcelA2);
    }

    @Override // Bd.B
    public final void t0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        b2(24, parcelA2);
    }

    @Override // Bd.B
    public final void w(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(22, parcelA2);
    }
}
