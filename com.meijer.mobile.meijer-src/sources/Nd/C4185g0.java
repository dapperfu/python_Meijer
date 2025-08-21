package Nd;

import Dd.C3100a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* renamed from: Nd.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4185g0 extends C3100a implements InterfaceC4184g {
    C4185g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    @Override // Nd.InterfaceC4184g
    public final Od.A d2() throws RemoteException {
        Parcel parcelK1 = K1(14, a2());
        Od.A a10 = (Od.A) Dd.s.a(parcelK1, Od.A.CREATOR);
        parcelK1.recycle();
        return a10;
    }

    @Override // Nd.InterfaceC4184g
    public final void F6(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(1, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void H1(LatLng latLng) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, latLng);
        c2(12, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void H7(StreetViewPanoramaCamera streetViewPanoramaCamera, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, streetViewPanoramaCamera);
        parcelA2.writeLong(j10);
        c2(9, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void L1(String str) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        c2(11, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void N2(LatLng latLng, int i10, Od.B b10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, latLng);
        parcelA2.writeInt(i10);
        Dd.s.c(parcelA2, b10);
        c2(22, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void Q7(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(4, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void V5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(2, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void Y3(LatLng latLng, int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, latLng);
        parcelA2.writeInt(i10);
        c2(13, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void Z0(U u10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, u10);
        c2(16, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void f4(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(3, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void h4(W w10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, w10);
        c2(15, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void j7(InterfaceC4173a0 interfaceC4173a0) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, interfaceC4173a0);
        c2(20, parcelA2);
    }

    @Override // Nd.InterfaceC4184g
    public final void l7(Y y10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, y10);
        c2(17, parcelA2);
    }
}
