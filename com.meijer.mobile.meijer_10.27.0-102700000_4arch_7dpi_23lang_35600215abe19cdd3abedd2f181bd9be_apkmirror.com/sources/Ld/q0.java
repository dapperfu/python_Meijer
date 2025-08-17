package Ld;

import Bd.AbstractBinderC2954d;
import Bd.C2951a;
import Md.C4182h;
import Md.C4185k;
import Md.C4187m;
import Md.C4189o;
import Md.C4193t;
import Md.C4195v;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public final class q0 extends C2951a implements InterfaceC4042b {
    @Override // Ld.InterfaceC4042b
    public final CameraPosition f2() throws RemoteException {
        Parcel parcelA1 = A1(1, a2());
        CameraPosition cameraPosition = (CameraPosition) Bd.s.a(parcelA1, CameraPosition.CREATOR);
        parcelA1.recycle();
        return cameraPosition;
    }

    q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // Ld.InterfaceC4042b
    public final InterfaceC4057j X7() throws RemoteException {
        InterfaceC4057j k0Var;
        Parcel parcelA1 = A1(25, a2());
        IBinder strongBinder = parcelA1.readStrongBinder();
        if (strongBinder == null) {
            k0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            k0Var = iInterfaceQueryLocalInterface instanceof InterfaceC4057j ? (InterfaceC4057j) iInterfaceQueryLocalInterface : new k0(strongBinder);
        }
        parcelA1.recycle();
        return k0Var;
    }

    @Override // Ld.InterfaceC4042b
    public final void clear() throws RemoteException {
        b2(14, a2());
    }

    @Override // Ld.InterfaceC4042b
    public final InterfaceC4050f f0() throws RemoteException {
        InterfaceC4050f c4047d0;
        Parcel parcelA1 = A1(26, a2());
        IBinder strongBinder = parcelA1.readStrongBinder();
        if (strongBinder == null) {
            c4047d0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            c4047d0 = iInterfaceQueryLocalInterface instanceof InterfaceC4050f ? (InterfaceC4050f) iInterfaceQueryLocalInterface : new C4047d0(strongBinder);
        }
        parcelA1.recycle();
        return c4047d0;
    }

    @Override // Ld.InterfaceC4042b
    public final void v4() throws RemoteException {
        b2(8, a2());
    }

    @Override // Ld.InterfaceC4042b
    public final void A2(H0 h02) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, h02);
        b2(83, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final Bd.k A3(C4195v c4195v) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, c4195v);
        Parcel parcelA1 = A1(9, parcelA2);
        Bd.k kVarA2 = Bd.j.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return kVarA2;
    }

    @Override // Ld.InterfaceC4042b
    public final void A8(B0 b02) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, b02);
        b2(97, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void B6(N n10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, n10);
        b2(80, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void C4(InterfaceC4065s interfaceC4065s) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4065s);
        b2(84, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final boolean C5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        Parcel parcelA1 = A1(20, parcelA2);
        boolean zF = Bd.s.f(parcelA1);
        parcelA1.recycle();
        return zF;
    }

    @Override // Ld.InterfaceC4042b
    public final void F1(A a10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, a10);
        b2(29, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void F4(D0 d02) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, d02);
        b2(96, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final Bd.B H3(C4185k c4185k) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, c4185k);
        Parcel parcelA1 = A1(12, parcelA2);
        Bd.B bA2 = Bd.A.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bA2;
    }

    @Override // Ld.InterfaceC4042b
    public final void J5(F0 f02) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, f02);
        b2(89, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void J8(S s10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, s10);
        b2(87, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void M2(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(93, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final Bd.n P4(Md.G g10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, g10);
        Parcel parcelA1 = A1(13, parcelA2);
        Bd.n nVarA2 = Bd.m.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return nVarA2;
    }

    @Override // Ld.InterfaceC4042b
    public final void R8(x0 x0Var) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, x0Var);
        b2(99, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void U8(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(22, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void V2(InterfaceC4060m interfaceC4060m) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4060m);
        b2(45, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void W1(P p10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, p10);
        b2(85, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void W3(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        b2(113, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void X5(int i10, int i11, int i12, int i13) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        parcelA2.writeInt(i11);
        parcelA2.writeInt(i12);
        parcelA2.writeInt(i13);
        b2(39, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final Bd.h Z5(C4193t c4193t) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, c4193t);
        Parcel parcelA1 = A1(10, parcelA2);
        Bd.h hVarA2 = Bd.g.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return hVarA2;
    }

    @Override // Ld.InterfaceC4042b
    public final void a5(String str) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        b2(61, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void b4(s0 s0Var) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, s0Var);
        b2(33, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void c4(E e10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, e10);
        b2(30, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void e7(InterfaceC4069w interfaceC4069w) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4069w);
        b2(28, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void e9(InterfaceC4064q interfaceC4064q) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4064q);
        b2(86, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void g3(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        b2(16, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void g4(G g10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, g10);
        b2(31, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final Bd.y j9(C4182h c4182h) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, c4182h);
        Parcel parcelA1 = A1(35, parcelA2);
        Bd.y yVarA2 = Bd.x.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return yVarA2;
    }

    @Override // Ld.InterfaceC4042b
    public final void k6(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        b2(4, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final Bd.e l2(C4189o c4189o) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, c4189o);
        Parcel parcelA1 = A1(11, parcelA2);
        Bd.e eVarA2 = AbstractBinderC2954d.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return eVarA2;
    }

    @Override // Ld.InterfaceC4042b
    public final void m7(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(18, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void n5(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Bd.s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(41, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void q7(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(92, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void r2(InterfaceC4044c interfaceC4044c) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4044c);
        b2(24, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void s1(LatLngBounds latLngBounds) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, latLngBounds);
        b2(95, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final boolean s5(C4187m c4187m) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, c4187m);
        Parcel parcelA1 = A1(91, parcelA2);
        boolean zF = Bd.s.f(parcelA1);
        parcelA1.recycle();
        return zF;
    }

    @Override // Ld.InterfaceC4042b
    public final void t4(I i10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, i10);
        b2(37, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void u8(com.google.android.gms.dynamic.b bVar, n0 n0Var) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        Bd.s.e(parcelA2, n0Var);
        b2(6, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void w2(InterfaceC4062o interfaceC4062o) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4062o);
        b2(32, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void w8(L l10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, l10);
        b2(107, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void x8(InterfaceC4051f0 interfaceC4051f0, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4051f0);
        Bd.s.e(parcelA2, bVar);
        b2(38, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void z3(z0 z0Var) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, z0Var);
        b2(98, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void z8(com.google.android.gms.dynamic.b bVar, int i10, n0 n0Var) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        parcelA2.writeInt(i10);
        Bd.s.e(parcelA2, n0Var);
        b2(7, parcelA2);
    }

    @Override // Ld.InterfaceC4042b
    public final void z9(InterfaceC4071y interfaceC4071y) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4071y);
        b2(42, parcelA2);
    }
}
