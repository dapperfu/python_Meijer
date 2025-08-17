package com.google.android.gms.measurement.internal;

import Od.C4463a;
import Od.InterfaceC4466d;
import Od.InterfaceC4469g;
import Od.InterfaceC4472j;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11128e2 extends com.google.android.gms.internal.measurement.O implements InterfaceC4466d {
    C11128e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // Od.InterfaceC4466d
    public final void B7(B6 b62, C11141g c11141g) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, c11141g);
        b2(30, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final void C3(v6 v6Var, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, v6Var);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(2, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final String I4(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        Parcel parcelA1 = A1(11, parcelA2);
        String string = parcelA1.readString();
        parcelA1.recycle();
        return string;
    }

    @Override // Od.InterfaceC4466d
    public final void K8(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(27, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final void R2(B6 b62, Bundle bundle, InterfaceC4469g interfaceC4469g) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, bundle);
        com.google.android.gms.internal.measurement.Q.d(parcelA2, interfaceC4469g);
        b2(31, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final void S5(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeLong(j10);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        parcelA2.writeString(str3);
        b2(10, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final List S8(String str, String str2, boolean z10, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        int i10 = com.google.android.gms.internal.measurement.Q.f81962b;
        parcelA2.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        Parcel parcelA1 = A1(14, parcelA2);
        ArrayList arrayListCreateTypedArrayList = parcelA1.createTypedArrayList(v6.CREATOR);
        parcelA1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // Od.InterfaceC4466d
    public final List U0(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(null);
        parcelA2.writeString(str2);
        parcelA2.writeString(str3);
        int i10 = com.google.android.gms.internal.measurement.Q.f81962b;
        parcelA2.writeInt(z10 ? 1 : 0);
        Parcel parcelA1 = A1(15, parcelA2);
        ArrayList arrayListCreateTypedArrayList = parcelA1.createTypedArrayList(v6.CREATOR);
        parcelA1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // Od.InterfaceC4466d
    public final void U5(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(18, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final C4463a V7(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        Parcel parcelA1 = A1(21, parcelA2);
        C4463a c4463a = (C4463a) com.google.android.gms.internal.measurement.Q.b(parcelA1, C4463a.CREATOR);
        parcelA1.recycle();
        return c4463a;
    }

    @Override // Od.InterfaceC4466d
    public final void Y0(C11157i c11157i, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, c11157i);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(12, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final void a3(G g10, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, g10);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(1, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final List a9(String str, String str2, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        Parcel parcelA1 = A1(16, parcelA2);
        ArrayList arrayListCreateTypedArrayList = parcelA1.createTypedArrayList(C11157i.CREATOR);
        parcelA1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // Od.InterfaceC4466d
    public final void b3(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(6, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final void b8(Bundle bundle, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, bundle);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(19, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final void d3(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(26, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final List e2(String str, String str2, String str3) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(null);
        parcelA2.writeString(str2);
        parcelA2.writeString(str3);
        Parcel parcelA1 = A1(17, parcelA2);
        ArrayList arrayListCreateTypedArrayList = parcelA1.createTypedArrayList(C11157i.CREATOR);
        parcelA1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // Od.InterfaceC4466d
    public final byte[] o3(G g10, String str) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, g10);
        parcelA2.writeString(str);
        Parcel parcelA1 = A1(9, parcelA2);
        byte[] bArrCreateByteArray = parcelA1.createByteArray();
        parcelA1.recycle();
        return bArrCreateByteArray;
    }

    @Override // Od.InterfaceC4466d
    public final void r8(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(4, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final void s9(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(20, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final void x4(B6 b62, Od.J j10, InterfaceC4472j interfaceC4472j) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, j10);
        com.google.android.gms.internal.measurement.Q.d(parcelA2, interfaceC4472j);
        b2(29, parcelA2);
    }

    @Override // Od.InterfaceC4466d
    public final void y2(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        b2(25, parcelA2);
    }
}
