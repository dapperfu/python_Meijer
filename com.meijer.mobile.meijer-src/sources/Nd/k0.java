package Nd;

import Dd.C3100a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class k0 extends C3100a implements InterfaceC4189j {
    k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // Nd.InterfaceC4189j
    public final void Q5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(2, parcelA2);
    }

    @Override // Nd.InterfaceC4189j
    public final void R5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(20, parcelA2);
    }

    @Override // Nd.InterfaceC4189j
    public final void T3(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(18, parcelA2);
    }

    @Override // Nd.InterfaceC4189j
    public final void U6(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(6, parcelA2);
    }

    @Override // Nd.InterfaceC4189j
    public final void W6(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(5, parcelA2);
    }

    @Override // Nd.InterfaceC4189j
    public final void o8(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(4, parcelA2);
    }

    @Override // Nd.InterfaceC4189j
    public final void p5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(16, parcelA2);
    }

    @Override // Nd.InterfaceC4189j
    public final void r1(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(3, parcelA2);
    }

    @Override // Nd.InterfaceC4189j
    public final void r7(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(1, parcelA2);
    }

    @Override // Nd.InterfaceC4189j
    public final void x7(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(7, parcelA2);
    }
}
