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
public final class C7004Nl extends C8758mb implements IInterface {
    public final List B9() throws RemoteException {
        Parcel parcelA2 = a2(3, A1());
        ArrayList arrayListB = C8972ob.b(parcelA2);
        parcelA2.recycle();
        return arrayListB;
    }

    public final InterfaceC7334Xg f6() throws RemoteException {
        Parcel parcelA2 = a2(5, A1());
        InterfaceC7334Xg interfaceC7334XgB9 = AbstractBinderC7301Wg.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7334XgB9;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelA2 = a2(7, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    public final String zzm() throws RemoteException {
        Parcel parcelA2 = a2(4, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    public final String zzn() throws RemoteException {
        Parcel parcelA2 = a2(6, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    public final String zzo() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    C7004Nl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final com.google.android.gms.dynamic.b A9() throws RemoteException {
        Parcel parcelA2 = a2(21, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    public final boolean F9() throws RemoteException {
        Parcel parcelA2 = a2(11, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    public final Mc.Y0 N3() throws RemoteException {
        Parcel parcelA2 = a2(16, A1());
        Mc.Y0 y0B9 = Mc.X0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return y0B9;
    }

    public final InterfaceC7099Qg W5() throws RemoteException {
        Parcel parcelA2 = a2(19, A1());
        InterfaceC7099Qg interfaceC7099QgB9 = AbstractBinderC7065Pg.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7099QgB9;
    }

    public final com.google.android.gms.dynamic.b d7() throws RemoteException {
        Parcel parcelA2 = a2(20, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    public final Bundle zze() throws RemoteException {
        Parcel parcelA2 = a2(13, A1());
        Bundle bundle = (Bundle) C8972ob.a(parcelA2, Bundle.CREATOR);
        parcelA2.recycle();
        return bundle;
    }

    public final com.google.android.gms.dynamic.b zzi() throws RemoteException {
        Parcel parcelA2 = a2(15, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    public final void zzr() throws RemoteException {
        b2(8, A1());
    }

    public final boolean zzv() throws RemoteException {
        Parcel parcelA2 = a2(12, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    public final void C9(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(9, parcelA1);
    }

    public final void D(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(10, parcelA1);
    }

    public final void D9(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, bVar2);
        C8972ob.f(parcelA1, bVar3);
        b2(22, parcelA1);
    }

    public final void E9(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(14, parcelA1);
    }
}
