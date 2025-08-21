package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Nl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7129Nl extends C8883mb implements IInterface {
    public final List B9() throws RemoteException {
        Parcel parcelA2 = a2(3, K1());
        ArrayList arrayListB = C9097ob.b(parcelA2);
        parcelA2.recycle();
        return arrayListB;
    }

    public final InterfaceC7459Xg t6() throws RemoteException {
        Parcel parcelA2 = a2(5, K1());
        InterfaceC7459Xg interfaceC7459XgB9 = AbstractBinderC7426Wg.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7459XgB9;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelA2 = a2(7, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    public final String zzm() throws RemoteException {
        Parcel parcelA2 = a2(4, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    public final String zzn() throws RemoteException {
        Parcel parcelA2 = a2(6, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    public final String zzo() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    C7129Nl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final com.google.android.gms.dynamic.b A9() throws RemoteException {
        Parcel parcelA2 = a2(21, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    public final boolean F9() throws RemoteException {
        Parcel parcelA2 = a2(11, K1());
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    public final Oc.Y0 Z3() throws RemoteException {
        Parcel parcelA2 = a2(16, K1());
        Oc.Y0 y0B9 = Oc.X0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return y0B9;
    }

    public final InterfaceC7224Qg m6() throws RemoteException {
        Parcel parcelA2 = a2(19, K1());
        InterfaceC7224Qg interfaceC7224QgB9 = AbstractBinderC7190Pg.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7224QgB9;
    }

    public final com.google.android.gms.dynamic.b o7() throws RemoteException {
        Parcel parcelA2 = a2(20, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    public final Bundle zze() throws RemoteException {
        Parcel parcelA2 = a2(13, K1());
        Bundle bundle = (Bundle) C9097ob.a(parcelA2, Bundle.CREATOR);
        parcelA2.recycle();
        return bundle;
    }

    public final com.google.android.gms.dynamic.b zzi() throws RemoteException {
        Parcel parcelA2 = a2(15, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    public final void zzr() throws RemoteException {
        c2(8, K1());
    }

    public final boolean zzv() throws RemoteException {
        Parcel parcelA2 = a2(12, K1());
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    public final void C9(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(9, parcelK1);
    }

    public final void D(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(10, parcelK1);
    }

    public final void D9(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, bVar2);
        C9097ob.f(parcelK1, bVar3);
        c2(22, parcelK1);
    }

    public final void E9(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(14, parcelK1);
    }
}
