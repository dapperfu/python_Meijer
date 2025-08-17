package Ld;

import Bd.C2951a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* renamed from: Ld.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4053g0 extends C2951a implements InterfaceC4052g {
    C4053g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    @Override // Ld.InterfaceC4052g
    public final Md.A c2() throws RemoteException {
        Parcel parcelA1 = A1(14, a2());
        Md.A a10 = (Md.A) Bd.s.a(parcelA1, Md.A.CREATOR);
        parcelA1.recycle();
        return a10;
    }

    @Override // Ld.InterfaceC4052g
    public final void B1(String str) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        b2(11, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void B2(InterfaceC4041a0 interfaceC4041a0) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4041a0);
        b2(20, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void D7(StreetViewPanoramaCamera streetViewPanoramaCamera, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, streetViewPanoramaCamera);
        parcelA2.writeLong(j10);
        b2(9, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void M3(LatLng latLng, int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, latLng);
        parcelA2.writeInt(i10);
        b2(13, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void M5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(2, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void R3(LatLng latLng, int i10, Md.B b10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, latLng);
        parcelA2.writeInt(i10);
        Bd.s.c(parcelA2, b10);
        b2(22, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void T3(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(3, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void U7(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(4, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void f3(U u10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, u10);
        b2(16, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void k5(Y y10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, y10);
        b2(17, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void m4(W w10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, w10);
        b2(15, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void q6(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(1, parcelA2);
    }

    @Override // Ld.InterfaceC4052g
    public final void x1(LatLng latLng) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, latLng);
        b2(12, parcelA2);
    }
}
