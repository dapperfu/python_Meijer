package Ld;

import Bd.C2951a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class k0 extends C2951a implements InterfaceC4057j {
    k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // Ld.InterfaceC4057j
    public final void G3(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(18, parcelA2);
    }

    @Override // Ld.InterfaceC4057j
    public final void G5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(2, parcelA2);
    }

    @Override // Ld.InterfaceC4057j
    public final void H5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(20, parcelA2);
    }

    @Override // Ld.InterfaceC4057j
    public final void H6(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(6, parcelA2);
    }

    @Override // Ld.InterfaceC4057j
    public final void J6(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(5, parcelA2);
    }

    @Override // Ld.InterfaceC4057j
    public final void g5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(16, parcelA2);
    }

    @Override // Ld.InterfaceC4057j
    public final void k7(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(1, parcelA2);
    }

    @Override // Ld.InterfaceC4057j
    public final void l1(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(3, parcelA2);
    }

    @Override // Ld.InterfaceC4057j
    public final void o8(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(4, parcelA2);
    }

    @Override // Ld.InterfaceC4057j
    public final void r7(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(7, parcelA2);
    }
}
