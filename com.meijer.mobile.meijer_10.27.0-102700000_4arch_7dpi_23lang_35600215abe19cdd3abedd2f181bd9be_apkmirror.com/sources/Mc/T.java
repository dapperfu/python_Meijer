package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC9722vc;

/* loaded from: classes4.dex */
public final class T extends C8758mb implements V {
    @Override // Mc.V
    public final void j() throws RemoteException {
        b2(5, A1());
    }

    @Override // Mc.V
    public final void r() throws RemoteException {
        b2(6, A1());
    }

    @Override // Mc.V
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        Parcel parcelA2 = a2(1, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // Mc.V
    public final void zzx() throws RemoteException {
        b2(2, A1());
    }

    T(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // Mc.V
    public final boolean q0() throws RemoteException {
        Parcel parcelA2 = a2(23, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // Mc.V
    public final d2 zzg() throws RemoteException {
        Parcel parcelA2 = a2(12, A1());
        d2 d2Var = (d2) C8972ob.a(parcelA2, d2.CREATOR);
        parcelA2.recycle();
        return d2Var;
    }

    @Override // Mc.V
    public final U0 zzk() throws RemoteException {
        U0 s02;
        Parcel parcelA2 = a2(41, A1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            s02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            s02 = iInterfaceQueryLocalInterface instanceof U0 ? (U0) iInterfaceQueryLocalInterface : new S0(strongBinder);
        }
        parcelA2.recycle();
        return s02;
    }

    @Override // Mc.V
    public final Y0 zzl() throws RemoteException {
        Y0 v02;
        Parcel parcelA2 = a2(26, A1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            v02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            v02 = iInterfaceQueryLocalInterface instanceof Y0 ? (Y0) iInterfaceQueryLocalInterface : new V0(strongBinder);
        }
        parcelA2.recycle();
        return v02;
    }

    @Override // Mc.V
    public final String zzr() throws RemoteException {
        Parcel parcelA2 = a2(31, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // Mc.V
    public final void B4(N0 n02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, n02);
        b2(42, parcelA1);
    }

    @Override // Mc.V
    public final void E8(boolean z10) throws RemoteException {
        Parcel parcelA1 = A1();
        int i10 = C8972ob.f77401b;
        parcelA1.writeInt(z10 ? 1 : 0);
        b2(34, parcelA1);
    }

    @Override // Mc.V
    public final void G7(InterfaceC4123i0 interfaceC4123i0) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC4123i0);
        b2(8, parcelA1);
    }

    @Override // Mc.V
    public final boolean H4(Y1 y12) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, y12);
        Parcel parcelA2 = a2(4, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // Mc.V
    public final void K4(InterfaceC9722vc interfaceC9722vc) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC9722vc);
        b2(40, parcelA1);
    }

    @Override // Mc.V
    public final void L6(R1 r12) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, r12);
        b2(29, parcelA1);
    }

    @Override // Mc.V
    public final void N1(E e10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, e10);
        b2(20, parcelA1);
    }

    @Override // Mc.V
    public final void O7(d2 d2Var) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, d2Var);
        b2(13, parcelA1);
    }

    @Override // Mc.V
    public final void R4(InterfaceC4144p0 interfaceC4144p0) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC4144p0);
        b2(45, parcelA1);
    }

    @Override // Mc.V
    public final void R6(j2 j2Var) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, j2Var);
        b2(39, parcelA1);
    }

    @Override // Mc.V
    public final void Y8(Y1 y12, K k10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, k10);
        b2(43, parcelA1);
    }

    @Override // Mc.V
    public final void s8(H h10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, h10);
        b2(7, parcelA1);
    }

    @Override // Mc.V
    public final void u6(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(44, parcelA1);
    }

    @Override // Mc.V
    public final void w9(boolean z10) throws RemoteException {
        Parcel parcelA1 = A1();
        int i10 = C8972ob.f77401b;
        parcelA1.writeInt(z10 ? 1 : 0);
        b2(22, parcelA1);
    }
}
