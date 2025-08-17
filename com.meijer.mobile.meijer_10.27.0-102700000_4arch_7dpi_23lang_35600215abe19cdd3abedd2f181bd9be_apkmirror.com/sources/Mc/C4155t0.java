package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C6833Ij;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC7070Pj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Mc.t0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4155t0 extends C8758mb implements InterfaceC4161v0 {
    @Override // Mc.InterfaceC4161v0
    public final void zzk() throws RemoteException {
        b2(1, A1());
    }

    C4155t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // Mc.InterfaceC4161v0
    public final List zzg() throws RemoteException {
        Parcel parcelA2 = a2(13, A1());
        ArrayList arrayListCreateTypedArrayList = parcelA2.createTypedArrayList(C6833Ij.CREATOR);
        parcelA2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // Mc.InterfaceC4161v0
    public final void Z0(InterfaceC6631Cl interfaceC6631Cl) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC6631Cl);
        b2(11, parcelA1);
    }

    @Override // Mc.InterfaceC4161v0
    public final void l3(String str, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(null);
        C8972ob.f(parcelA1, bVar);
        b2(6, parcelA1);
    }

    @Override // Mc.InterfaceC4161v0
    public final void p5(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        b2(18, parcelA1);
    }

    @Override // Mc.InterfaceC4161v0
    public final void s2(InterfaceC7070Pj interfaceC7070Pj) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC7070Pj);
        b2(12, parcelA1);
    }

    @Override // Mc.InterfaceC4161v0
    public final void u1(L1 l12) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, l12);
        b2(14, parcelA1);
    }
}
