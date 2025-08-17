package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9956xm extends C8758mb implements InterfaceC10170zm {
    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final Mc.Y0 zze() throws RemoteException {
        Parcel parcelA2 = a2(5, A1());
        Mc.Y0 y0B9 = Mc.X0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return y0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final C7005Nm zzf() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        C7005Nm c7005Nm = (C7005Nm) C8972ob.a(parcelA2, C7005Nm.CREATOR);
        parcelA2.recycle();
        return c7005Nm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final C7005Nm zzg() throws RemoteException {
        Parcel parcelA2 = a2(3, A1());
        C7005Nm c7005Nm = (C7005Nm) C8972ob.a(parcelA2, C7005Nm.CREATOR);
        parcelA2.recycle();
        return c7005Nm;
    }

    C9956xm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final boolean D(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        Parcel parcelA2 = a2(15, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final boolean E(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        Parcel parcelA2 = a2(24, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void I7(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9849wm interfaceC9849wm, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC9849wm);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(16, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void O1(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC8780mm interfaceC8780mm, InterfaceC6835Il interfaceC6835Il, Mc.d2 d2Var) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC8780mm);
        C8972ob.f(parcelA1, interfaceC6835Il);
        C8972ob.d(parcelA1, d2Var);
        b2(21, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void Z2(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC8459jm interfaceC8459jm, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC8459jm);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(23, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void b1(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9101pm interfaceC9101pm, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC9101pm);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(14, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void b9(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9849wm interfaceC9849wm, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC9849wm);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(20, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void h8(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9421sm interfaceC9421sm, InterfaceC6835Il interfaceC6835Il, C6963Mg c6963Mg) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC9421sm);
        C8972ob.f(parcelA1, interfaceC6835Il);
        C8972ob.d(parcelA1, c6963Mg);
        b2(22, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final boolean n0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        Parcel parcelA2 = a2(17, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void n2(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC8780mm interfaceC8780mm, InterfaceC6835Il interfaceC6835Il, Mc.d2 d2Var) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC8780mm);
        C8972ob.f(parcelA1, interfaceC6835Il);
        C8972ob.d(parcelA1, d2Var);
        b2(13, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void p0(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        b2(19, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void r5(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9421sm interfaceC9421sm, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC9421sm);
        C8972ob.f(parcelA1, interfaceC6835Il);
        b2(18, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void u2(com.google.android.gms.dynamic.b bVar, String str, Bundle bundle, Bundle bundle2, Mc.d2 d2Var, InterfaceC6632Cm interfaceC6632Cm) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        parcelA1.writeString(str);
        C8972ob.d(parcelA1, bundle);
        C8972ob.d(parcelA1, bundle2);
        C8972ob.d(parcelA1, d2Var);
        C8972ob.f(parcelA1, interfaceC6632Cm);
        b2(1, parcelA1);
    }
}
