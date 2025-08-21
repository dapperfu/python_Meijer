package Nd;

import Dd.AbstractBinderC3103d;
import Dd.C3100a;
import Od.C4460h;
import Od.C4463k;
import Od.C4465m;
import Od.C4467o;
import Od.C4471t;
import Od.C4473v;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public final class q0 extends C3100a implements InterfaceC4174b {
    @Override // Nd.InterfaceC4174b
    public final CameraPosition h2() throws RemoteException {
        Parcel parcelK1 = K1(1, a2());
        CameraPosition cameraPosition = (CameraPosition) Dd.s.a(parcelK1, CameraPosition.CREATOR);
        parcelK1.recycle();
        return cameraPosition;
    }

    q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // Nd.InterfaceC4174b
    public final void I4() throws RemoteException {
        c2(8, a2());
    }

    @Override // Nd.InterfaceC4174b
    public final InterfaceC4189j U7() throws RemoteException {
        InterfaceC4189j k0Var;
        Parcel parcelK1 = K1(25, a2());
        IBinder strongBinder = parcelK1.readStrongBinder();
        if (strongBinder == null) {
            k0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            k0Var = iInterfaceQueryLocalInterface instanceof InterfaceC4189j ? (InterfaceC4189j) iInterfaceQueryLocalInterface : new k0(strongBinder);
        }
        parcelK1.recycle();
        return k0Var;
    }

    @Override // Nd.InterfaceC4174b
    public final void clear() throws RemoteException {
        c2(14, a2());
    }

    @Override // Nd.InterfaceC4174b
    public final InterfaceC4182f h0() throws RemoteException {
        InterfaceC4182f c4179d0;
        Parcel parcelK1 = K1(26, a2());
        IBinder strongBinder = parcelK1.readStrongBinder();
        if (strongBinder == null) {
            c4179d0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            c4179d0 = iInterfaceQueryLocalInterface instanceof InterfaceC4182f ? (InterfaceC4182f) iInterfaceQueryLocalInterface : new C4179d0(strongBinder);
        }
        parcelK1.recycle();
        return c4179d0;
    }

    @Override // Nd.InterfaceC4174b
    public final void A3(H0 h02) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, h02);
        c2(83, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void A4(InterfaceC4176c interfaceC4176c) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, interfaceC4176c);
        c2(24, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void B1(LatLngBounds latLngBounds) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, latLngBounds);
        c2(95, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final boolean D1(C4465m c4465m) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, c4465m);
        Parcel parcelK1 = K1(91, parcelA2);
        boolean zF = Dd.s.f(parcelK1);
        parcelK1.recycle();
        return zF;
    }

    @Override // Nd.InterfaceC4174b
    public final void D2(A a10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, a10);
        c2(29, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void D8(InterfaceC4203y interfaceC4203y) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, interfaceC4203y);
        c2(42, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void H3(B0 b02) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, b02);
        c2(97, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void H5(com.google.android.gms.dynamic.b bVar, int i10, n0 n0Var) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        parcelA2.writeInt(i10);
        Dd.s.e(parcelA2, n0Var);
        c2(7, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void H8(InterfaceC4196q interfaceC4196q) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, interfaceC4196q);
        c2(86, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final boolean M5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        Parcel parcelK1 = K1(20, parcelA2);
        boolean zF = Dd.s.f(parcelK1);
        parcelK1.recycle();
        return zF;
    }

    @Override // Nd.InterfaceC4174b
    public final void N4(InterfaceC4194o interfaceC4194o) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, interfaceC4194o);
        c2(32, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void R2(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(93, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void S2(P p10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, p10);
        c2(85, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void S3(x0 x0Var) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, x0Var);
        c2(99, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void S8(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(22, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final Dd.h T0(C4471t c4471t) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, c4471t);
        Parcel parcelK1 = K1(10, parcelA2);
        Dd.h hVarA2 = Dd.g.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return hVarA2;
    }

    @Override // Nd.InterfaceC4174b
    public final Dd.e T8(C4467o c4467o) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, c4467o);
        Parcel parcelK1 = K1(11, parcelA2);
        Dd.e eVarA2 = AbstractBinderC3103d.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return eVarA2;
    }

    @Override // Nd.InterfaceC4174b
    public final Dd.B V0(C4463k c4463k) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, c4463k);
        Parcel parcelK1 = K1(12, parcelA2);
        Dd.B bA2 = Dd.A.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bA2;
    }

    @Override // Nd.InterfaceC4174b
    public final void Y8(F0 f02) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, f02);
        c2(89, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void Z8(s0 s0Var) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, s0Var);
        c2(33, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void a3(G g10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, g10);
        c2(31, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void b2(D0 d02) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, d02);
        c2(96, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void b5(InterfaceC4197s interfaceC4197s) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, interfaceC4197s);
        c2(84, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void b6(InterfaceC4201w interfaceC4201w) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, interfaceC4201w);
        c2(28, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final Dd.y b8(C4460h c4460h) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, c4460h);
        Parcel parcelK1 = K1(35, parcelA2);
        Dd.y yVarA2 = Dd.x.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return yVarA2;
    }

    @Override // Nd.InterfaceC4174b
    public final void d7(I i10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, i10);
        c2(37, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void f9(z0 z0Var) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, z0Var);
        c2(98, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void g7(com.google.android.gms.dynamic.b bVar, n0 n0Var) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        Dd.s.e(parcelA2, n0Var);
        c2(6, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void j4(InterfaceC4192m interfaceC4192m) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, interfaceC4192m);
        c2(45, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void k9(L l10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, l10);
        c2(107, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void l3(E e10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, e10);
        c2(30, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void l4(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        c2(113, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void m5(String str) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        c2(61, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void n3(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        c2(16, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void n6(int i10, int i11, int i12, int i13) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        parcelA2.writeInt(i11);
        parcelA2.writeInt(i12);
        parcelA2.writeInt(i13);
        c2(39, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void t5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(41, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void t7(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Dd.s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(18, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final Dd.k w3(C4473v c4473v) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, c4473v);
        Parcel parcelK1 = K1(9, parcelA2);
        Dd.k kVarA2 = Dd.j.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return kVarA2;
    }

    @Override // Nd.InterfaceC4174b
    public final void w5(N n10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, n10);
        c2(80, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void w7(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(92, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void y1(S s10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, s10);
        c2(87, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void y3(InterfaceC4183f0 interfaceC4183f0, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, interfaceC4183f0);
        Dd.s.e(parcelA2, bVar);
        c2(38, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final void y6(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        c2(4, parcelA2);
    }

    @Override // Nd.InterfaceC4174b
    public final Dd.n z4(Od.G g10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, g10);
        Parcel parcelK1 = K1(13, parcelA2);
        Dd.n nVarA2 = Dd.m.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return nVarA2;
    }
}
