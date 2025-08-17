package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Zg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7400Zg extends C8758mb implements InterfaceC7703ch {
    C7400Zg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final void B5(InterfaceC7235Ug interfaceC7235Ug) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC7235Ug);
        b2(8, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final void X2(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(3, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final com.google.android.gms.dynamic.b d(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        Parcel parcelA2 = a2(2, parcelA1);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final void d2(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        parcelA1.writeInt(i10);
        b2(5, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final void i0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(7, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final void i8(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(6, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final void q2(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(9, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final void s4(String str, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, bVar);
        b2(1, parcelA1);
    }
}
