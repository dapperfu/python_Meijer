package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Dl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6790Dl extends C8883mb implements InterfaceC6858Fl {
    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void h() throws RemoteException {
        c2(4, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void zzo() throws RemoteException {
        c2(5, K1());
    }

    C6790Dl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void A() throws RemoteException {
        c2(8, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final C7095Ml c() throws RemoteException {
        C7095Ml c7095Ml;
        Parcel parcelA2 = a2(15, K1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c7095Ml = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c7095Ml = iInterfaceQueryLocalInterface instanceof C7095Ml ? (C7095Ml) iInterfaceQueryLocalInterface : new C7095Ml(strongBinder);
        }
        parcelA2.recycle();
        return c7095Ml;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void l() throws RemoteException {
        c2(12, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final boolean m() throws RemoteException {
        Parcel parcelA2 = a2(22, K1());
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final C7129Nl t() throws RemoteException {
        C7129Nl c7129Nl;
        Parcel parcelA2 = a2(16, K1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c7129Nl = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c7129Nl = iInterfaceQueryLocalInterface instanceof C7129Nl ? (C7129Nl) iInterfaceQueryLocalInterface : new C7129Nl(strongBinder);
        }
        parcelA2.recycle();
        return c7129Nl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void zzF() throws RemoteException {
        c2(9, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final boolean zzN() throws RemoteException {
        Parcel parcelA2 = a2(13, K1());
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final Oc.Y0 zzh() throws RemoteException {
        Parcel parcelA2 = a2(26, K1());
        Oc.Y0 y0B9 = Oc.X0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return y0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final InterfaceC7062Ll zzj() throws RemoteException {
        InterfaceC7062Ll c6994Jl;
        Parcel parcelA2 = a2(36, K1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c6994Jl = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c6994Jl = iInterfaceQueryLocalInterface instanceof InterfaceC7062Ll ? (InterfaceC7062Ll) iInterfaceQueryLocalInterface : new C6994Jl(strongBinder);
        }
        parcelA2.recycle();
        return c6994Jl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final InterfaceC7231Ql zzk() throws RemoteException {
        InterfaceC7231Ql c7163Ol;
        Parcel parcelA2 = a2(27, K1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c7163Ol = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c7163Ol = iInterfaceQueryLocalInterface instanceof InterfaceC7231Ql ? (InterfaceC7231Ql) iInterfaceQueryLocalInterface : new C7163Ol(strongBinder);
        }
        parcelA2.recycle();
        return c7163Ol;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final C7130Nm zzl() throws RemoteException {
        Parcel parcelA2 = a2(33, K1());
        C7130Nm c7130Nm = (C7130Nm) C9097ob.a(parcelA2, C7130Nm.CREATOR);
        parcelA2.recycle();
        return c7130Nm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final C7130Nm zzm() throws RemoteException {
        Parcel parcelA2 = a2(34, K1());
        C7130Nm c7130Nm = (C7130Nm) C9097ob.a(parcelA2, C7130Nm.CREATOR);
        parcelA2.recycle();
        return c7130Nm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void F8(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(30, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void I3(Oc.Y1 y12, String str) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, y12);
        parcelK1.writeString(str);
        c2(11, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void J3(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, InterfaceC7369Uo interfaceC7369Uo, String str2) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, y12);
        parcelK1.writeString(null);
        C9097ob.f(parcelK1, interfaceC7369Uo);
        parcelK1.writeString(str2);
        c2(10, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void L7(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(39, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void M6(com.google.android.gms.dynamic.b bVar, InterfaceC7093Mj interfaceC7093Mj, List list) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, interfaceC7093Mj);
        parcelK1.writeTypedList(list);
        c2(31, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void U3(com.google.android.gms.dynamic.b bVar, InterfaceC7369Uo interfaceC7369Uo, List list) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, interfaceC7369Uo);
        parcelK1.writeStringList(list);
        c2(23, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void X4(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, y12);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6960Il);
        c2(38, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void X5(com.google.android.gms.dynamic.b bVar, Oc.d2 d2Var, Oc.Y1 y12, String str, String str2, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, d2Var);
        C9097ob.d(parcelK1, y12);
        parcelK1.writeString(str);
        parcelK1.writeString(str2);
        C9097ob.f(parcelK1, interfaceC6960Il);
        c2(35, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void d3(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, String str2, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, y12);
        parcelK1.writeString(str);
        parcelK1.writeString(str2);
        C9097ob.f(parcelK1, interfaceC6960Il);
        c2(7, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void f0(boolean z10) throws RemoteException {
        Parcel parcelK1 = K1();
        int i10 = C9097ob.f78241b;
        parcelK1.writeInt(z10 ? 1 : 0);
        c2(25, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void g1(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, y12);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6960Il);
        c2(28, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void r5(com.google.android.gms.dynamic.b bVar, Oc.d2 d2Var, Oc.Y1 y12, String str, String str2, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, d2Var);
        C9097ob.d(parcelK1, y12);
        parcelK1.writeString(str);
        parcelK1.writeString(str2);
        C9097ob.f(parcelK1, interfaceC6960Il);
        c2(6, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void s2(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, y12);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6960Il);
        c2(32, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void s5(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(21, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void t4(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, String str2, InterfaceC6960Il interfaceC6960Il, C7088Mg c7088Mg, List list) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, y12);
        parcelK1.writeString(str);
        parcelK1.writeString(str2);
        C9097ob.f(parcelK1, interfaceC6960Il);
        C9097ob.d(parcelK1, c7088Mg);
        parcelK1.writeStringList(list);
        c2(14, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void u9(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(37, parcelK1);
    }
}
