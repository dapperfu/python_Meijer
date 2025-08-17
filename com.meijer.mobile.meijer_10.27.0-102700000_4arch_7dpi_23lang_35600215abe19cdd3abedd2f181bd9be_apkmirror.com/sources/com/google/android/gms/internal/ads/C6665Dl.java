package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Dl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6665Dl extends C8758mb implements InterfaceC6733Fl {
    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void g() throws RemoteException {
        b2(4, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void zzo() throws RemoteException {
        b2(5, A1());
    }

    C6665Dl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void A() throws RemoteException {
        b2(8, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final C6970Ml c() throws RemoteException {
        C6970Ml c6970Ml;
        Parcel parcelA2 = a2(15, A1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c6970Ml = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c6970Ml = iInterfaceQueryLocalInterface instanceof C6970Ml ? (C6970Ml) iInterfaceQueryLocalInterface : new C6970Ml(strongBinder);
        }
        parcelA2.recycle();
        return c6970Ml;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void l() throws RemoteException {
        b2(12, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final boolean m() throws RemoteException {
        Parcel parcelA2 = a2(22, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final C7004Nl t() throws RemoteException {
        C7004Nl c7004Nl;
        Parcel parcelA2 = a2(16, A1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c7004Nl = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c7004Nl = iInterfaceQueryLocalInterface instanceof C7004Nl ? (C7004Nl) iInterfaceQueryLocalInterface : new C7004Nl(strongBinder);
        }
        parcelA2.recycle();
        return c7004Nl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void zzF() throws RemoteException {
        b2(9, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final boolean zzN() throws RemoteException {
        Parcel parcelA2 = a2(13, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final Mc.Y0 zzh() throws RemoteException {
        Parcel parcelA2 = a2(26, A1());
        Mc.Y0 y0B9 = Mc.X0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return y0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final InterfaceC6937Ll zzj() throws RemoteException {
        InterfaceC6937Ll c6869Jl;
        Parcel parcelA2 = a2(36, A1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c6869Jl = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c6869Jl = iInterfaceQueryLocalInterface instanceof InterfaceC6937Ll ? (InterfaceC6937Ll) iInterfaceQueryLocalInterface : new C6869Jl(strongBinder);
        }
        parcelA2.recycle();
        return c6869Jl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final InterfaceC7106Ql zzk() throws RemoteException {
        InterfaceC7106Ql c7038Ol;
        Parcel parcelA2 = a2(27, A1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c7038Ol = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c7038Ol = iInterfaceQueryLocalInterface instanceof InterfaceC7106Ql ? (InterfaceC7106Ql) iInterfaceQueryLocalInterface : new C7038Ol(strongBinder);
        }
        parcelA2.recycle();
        return c7038Ol;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final C7005Nm zzl() throws RemoteException {
        Parcel parcelA2 = a2(33, A1());
        C7005Nm c7005Nm = (C7005Nm) C8972ob.a(parcelA2, C7005Nm.CREATOR);
        parcelA2.recycle();
        return c7005Nm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final C7005Nm zzm() throws RemoteException {
        Parcel parcelA2 = a2(34, A1());
        C7005Nm c7005Nm = (C7005Nm) C8972ob.a(parcelA2, C7005Nm.CREATOR);
        parcelA2.recycle();
        return c7005Nm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void A6(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, String str2, InterfaceC6835Il interfaceC6835Il, C6963Mg c6963Mg, List list) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, y12);
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.f(parcelA1, interfaceC6835Il);
        C8972ob.d(parcelA1, c6963Mg);
        parcelA1.writeStringList(list);
        b2(14, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void G8(com.google.android.gms.dynamic.b bVar, Mc.d2 d2Var, Mc.Y1 y12, String str, String str2, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, d2Var);
        C8972ob.d(parcelA1, y12);
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(6, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void I3(com.google.android.gms.dynamic.b bVar, InterfaceC7244Uo interfaceC7244Uo, List list) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC7244Uo);
        parcelA1.writeStringList(list);
        b2(23, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void K7(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(39, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void L8(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(30, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void Z1(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, y12);
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(38, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void c5(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, y12);
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(32, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void d0(boolean z10) throws RemoteException {
        Parcel parcelA1 = A1();
        int i10 = C8972ob.f77401b;
        parcelA1.writeInt(z10 ? 1 : 0);
        b2(25, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void d9(com.google.android.gms.dynamic.b bVar, Mc.d2 d2Var, Mc.Y1 y12, String str, String str2, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, d2Var);
        C8972ob.d(parcelA1, y12);
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(35, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void g9(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, String str2, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, y12);
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(7, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void m5(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(21, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void o4(Mc.Y1 y12, String str) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, y12);
        parcelA1.writeString(str);
        b2(11, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void t1(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, y12);
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(28, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void u9(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(37, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void v6(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, InterfaceC7244Uo interfaceC7244Uo, String str2) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, y12);
        parcelA1.writeString(null);
        C8972ob.f(parcelA1, interfaceC7244Uo);
        parcelA1.writeString(str2);
        b2(10, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void y6(com.google.android.gms.dynamic.b bVar, InterfaceC6968Mj interfaceC6968Mj, List list) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC6968Mj);
        parcelA1.writeTypedList(list);
        b2(31, parcelA1);
    }
}
