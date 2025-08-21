package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Zg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7525Zg extends C8883mb implements InterfaceC7828ch {
    C7525Zg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final void F4(String str, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, bVar);
        c2(1, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final void J5(InterfaceC7360Ug interfaceC7360Ug) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC7360Ug);
        c2(8, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final void c3(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(3, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final com.google.android.gms.dynamic.b d(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        Parcel parcelA2 = a2(2, parcelK1);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final void f2(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        parcelK1.writeInt(i10);
        c2(5, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final void f8(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(6, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final void l0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(7, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final void t2(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(9, parcelK1);
    }
}
