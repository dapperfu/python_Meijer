package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC9847vc;

/* loaded from: classes4.dex */
public final class T extends C8883mb implements V {
    @Override // Oc.V
    public final void j() throws RemoteException {
        c2(5, K1());
    }

    @Override // Oc.V
    public final void r() throws RemoteException {
        c2(6, K1());
    }

    @Override // Oc.V
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        Parcel parcelA2 = a2(1, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // Oc.V
    public final void zzx() throws RemoteException {
        c2(2, K1());
    }

    T(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // Oc.V
    public final boolean r0() throws RemoteException {
        Parcel parcelA2 = a2(23, K1());
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // Oc.V
    public final d2 zzg() throws RemoteException {
        Parcel parcelA2 = a2(12, K1());
        d2 d2Var = (d2) C9097ob.a(parcelA2, d2.CREATOR);
        parcelA2.recycle();
        return d2Var;
    }

    @Override // Oc.V
    public final U0 zzk() throws RemoteException {
        U0 s02;
        Parcel parcelA2 = a2(41, K1());
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

    @Override // Oc.V
    public final Y0 zzl() throws RemoteException {
        Y0 v02;
        Parcel parcelA2 = a2(26, K1());
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

    @Override // Oc.V
    public final String zzr() throws RemoteException {
        Parcel parcelA2 = a2(31, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // Oc.V
    public final void A6(Y1 y12, K k10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, y12);
        C9097ob.f(parcelK1, k10);
        c2(43, parcelK1);
    }

    @Override // Oc.V
    public final void B5(R1 r12) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, r12);
        c2(29, parcelK1);
    }

    @Override // Oc.V
    public final void D3(N0 n02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, n02);
        c2(42, parcelK1);
    }

    @Override // Oc.V
    public final void G5(j2 j2Var) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, j2Var);
        c2(39, parcelK1);
    }

    @Override // Oc.V
    public final void J2(E e10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, e10);
        c2(20, parcelK1);
    }

    @Override // Oc.V
    public final void J6(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(44, parcelK1);
    }

    @Override // Oc.V
    public final void V4(InterfaceC9847vc interfaceC9847vc) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC9847vc);
        c2(40, parcelK1);
    }

    @Override // Oc.V
    public final boolean W7(Y1 y12) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, y12);
        Parcel parcelA2 = a2(4, parcelK1);
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // Oc.V
    public final void d4(InterfaceC4422p0 interfaceC4422p0) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC4422p0);
        c2(45, parcelK1);
    }

    @Override // Oc.V
    public final void n9(H h10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, h10);
        c2(7, parcelK1);
    }

    @Override // Oc.V
    public final void o9(InterfaceC4401i0 interfaceC4401i0) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC4401i0);
        c2(8, parcelK1);
    }

    @Override // Oc.V
    public final void u1(d2 d2Var) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, d2Var);
        c2(13, parcelK1);
    }

    @Override // Oc.V
    public final void v9(boolean z10) throws RemoteException {
        Parcel parcelK1 = K1();
        int i10 = C9097ob.f78241b;
        parcelK1.writeInt(z10 ? 1 : 0);
        c2(22, parcelK1);
    }

    @Override // Oc.V
    public final void y8(boolean z10) throws RemoteException {
        Parcel parcelK1 = K1();
        int i10 = C9097ob.f78241b;
        parcelK1.writeInt(z10 ? 1 : 0);
        c2(34, parcelK1);
    }
}
