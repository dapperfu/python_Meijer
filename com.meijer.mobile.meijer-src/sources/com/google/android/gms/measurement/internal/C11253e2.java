package com.google.android.gms.measurement.internal;

import Qd.C4669a;
import Qd.InterfaceC4672d;
import Qd.InterfaceC4675g;
import Qd.InterfaceC4678j;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11253e2 extends com.google.android.gms.internal.measurement.O implements InterfaceC4672d {
    C11253e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // Qd.InterfaceC4672d
    public final void E8(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(27, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final void F7(B6 b62, C11266g c11266g) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, c11266g);
        c2(30, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final List M8(String str, String str2, boolean z10, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        int i10 = com.google.android.gms.internal.measurement.Q.f82802b;
        parcelA2.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        Parcel parcelK1 = K1(14, parcelA2);
        ArrayList arrayListCreateTypedArrayList = parcelK1.createTypedArrayList(v6.CREATOR);
        parcelK1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // Qd.InterfaceC4672d
    public final void O3(v6 v6Var, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, v6Var);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(2, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final C4669a R7(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        Parcel parcelK1 = K1(21, parcelA2);
        C4669a c4669a = (C4669a) com.google.android.gms.internal.measurement.Q.b(parcelK1, C4669a.CREATOR);
        parcelK1.recycle();
        return c4669a;
    }

    @Override // Qd.InterfaceC4672d
    public final String S4(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        Parcel parcelK1 = K1(11, parcelA2);
        String string = parcelK1.readString();
        parcelK1.recycle();
        return string;
    }

    @Override // Qd.InterfaceC4672d
    public final List W0(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(null);
        parcelA2.writeString(str2);
        parcelA2.writeString(str3);
        int i10 = com.google.android.gms.internal.measurement.Q.f82802b;
        parcelA2.writeInt(z10 ? 1 : 0);
        Parcel parcelK1 = K1(15, parcelA2);
        ArrayList arrayListCreateTypedArrayList = parcelK1.createTypedArrayList(v6.CREATOR);
        parcelK1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // Qd.InterfaceC4672d
    public final void X7(Bundle bundle, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, bundle);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(19, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final void Y2(B6 b62, Qd.J j10, InterfaceC4678j interfaceC4678j) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, j10);
        com.google.android.gms.internal.measurement.Q.d(parcelA2, interfaceC4678j);
        c2(29, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final void b1(C11282i c11282i, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, c11282i);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(12, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final List c9(String str, String str2, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        Parcel parcelK1 = K1(16, parcelA2);
        ArrayList arrayListCreateTypedArrayList = parcelK1.createTypedArrayList(C11282i.CREATOR);
        parcelK1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // Qd.InterfaceC4672d
    public final void e6(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeLong(j10);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        parcelA2.writeString(str3);
        c2(10, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final void f3(G g10, B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, g10);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(1, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final List g2(String str, String str2, String str3) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(null);
        parcelA2.writeString(str2);
        parcelA2.writeString(str3);
        Parcel parcelK1 = K1(17, parcelA2);
        ArrayList arrayListCreateTypedArrayList = parcelK1.createTypedArrayList(C11282i.CREATOR);
        parcelK1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // Qd.InterfaceC4672d
    public final void g6(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(18, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final void h3(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(6, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final void j3(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(26, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final void p6(B6 b62, Bundle bundle, InterfaceC4675g interfaceC4675g) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        com.google.android.gms.internal.measurement.Q.c(parcelA2, bundle);
        com.google.android.gms.internal.measurement.Q.d(parcelA2, interfaceC4675g);
        c2(31, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final void q8(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(4, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final void s9(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(20, parcelA2);
    }

    @Override // Qd.InterfaceC4672d
    public final byte[] v3(G g10, String str) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, g10);
        parcelA2.writeString(str);
        Parcel parcelK1 = K1(9, parcelA2);
        byte[] bArrCreateByteArray = parcelK1.createByteArray();
        parcelK1.recycle();
        return bArrCreateByteArray;
    }

    @Override // Qd.InterfaceC4672d
    public final void y2(B6 b62) throws RemoteException {
        Parcel parcelA2 = a2();
        com.google.android.gms.internal.measurement.Q.c(parcelA2, b62);
        c2(25, parcelA2);
    }
}
