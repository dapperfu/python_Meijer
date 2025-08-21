package Dd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public final class z extends C3100a implements B {
    @Override // Dd.B
    public final void zzn() throws RemoteException {
        c2(1, a2());
    }

    z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // Dd.B
    public final int zzi() throws RemoteException {
        Parcel parcelK1 = K1(20, a2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    @Override // Dd.B
    public final void C3(LatLng latLng) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, latLng);
        c2(3, parcelA2);
    }

    @Override // Dd.B
    public final void D(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        c2(21, parcelA2);
    }

    @Override // Dd.B
    public final boolean F5(B b10) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, b10);
        Parcel parcelK1 = K1(19, parcelA2);
        boolean zF = s.f(parcelK1);
        parcelK1.recycle();
        return zF;
    }

    @Override // Dd.B
    public final void I(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(15, parcelA2);
    }

    @Override // Dd.B
    public final void M(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(5, parcelA2);
    }

    @Override // Dd.B
    public final void V7(float f10, float f11) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        parcelA2.writeFloat(f11);
        c2(6, parcelA2);
    }

    @Override // Dd.B
    public final void Y(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(17, parcelA2);
    }

    @Override // Dd.B
    public final void e1(LatLngBounds latLngBounds) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, latLngBounds);
        c2(9, parcelA2);
    }

    @Override // Dd.B
    public final void f5(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(13, parcelA2);
    }

    @Override // Dd.B
    public final void u0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        c2(24, parcelA2);
    }

    @Override // Dd.B
    public final void u8(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(11, parcelA2);
    }

    @Override // Dd.B
    public final void w(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(22, parcelA2);
    }
}
