package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ml, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6970Ml extends C8758mb implements IInterface {
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

    public final double zze() throws RemoteException {
        Parcel parcelA2 = a2(7, A1());
        double d10 = parcelA2.readDouble();
        parcelA2.recycle();
        return d10;
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

    C6970Ml(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final com.google.android.gms.dynamic.b A9() throws RemoteException {
        Parcel parcelA2 = a2(20, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    public final boolean E9() throws RemoteException {
        Parcel parcelA2 = a2(14, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    public final boolean F9() throws RemoteException {
        Parcel parcelA2 = a2(13, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    public final Mc.Y0 N3() throws RemoteException {
        Parcel parcelA2 = a2(17, A1());
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
        Parcel parcelA2 = a2(18, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel parcelA2 = a2(15, A1());
        Bundle bundle = (Bundle) C8972ob.a(parcelA2, Bundle.CREATOR);
        parcelA2.recycle();
        return bundle;
    }

    public final com.google.android.gms.dynamic.b zzl() throws RemoteException {
        Parcel parcelA2 = a2(21, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    public final String zzp() throws RemoteException {
        Parcel parcelA2 = a2(9, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    public final String zzq() throws RemoteException {
        Parcel parcelA2 = a2(8, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    public final void zzt() throws RemoteException {
        b2(10, A1());
    }

    public final void C9(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(12, parcelA1);
    }

    public final void D(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(11, parcelA1);
    }

    public final void D9(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, bVar2);
        C8972ob.f(parcelA1, bVar3);
        b2(22, parcelA1);
    }

    public final void x5(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(16, parcelA1);
    }
}
