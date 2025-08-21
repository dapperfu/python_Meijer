package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C6958Ij;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC7195Pj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Oc.t0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4433t0 extends C8883mb implements InterfaceC4439v0 {
    @Override // Oc.InterfaceC4439v0
    public final void zzk() throws RemoteException {
        c2(1, K1());
    }

    C4433t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // Oc.InterfaceC4439v0
    public final List zzg() throws RemoteException {
        Parcel parcelA2 = a2(13, K1());
        ArrayList arrayListCreateTypedArrayList = parcelA2.createTypedArrayList(C6958Ij.CREATOR);
        parcelA2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // Oc.InterfaceC4439v0
    public final void N3(L1 l12) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, l12);
        c2(14, parcelK1);
    }

    @Override // Oc.InterfaceC4439v0
    public final void c1(InterfaceC6756Cl interfaceC6756Cl) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC6756Cl);
        c2(11, parcelK1);
    }

    @Override // Oc.InterfaceC4439v0
    public final void t3(String str, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(null);
        C9097ob.f(parcelK1, bVar);
        c2(6, parcelK1);
    }

    @Override // Oc.InterfaceC4439v0
    public final void v2(InterfaceC7195Pj interfaceC7195Pj) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC7195Pj);
        c2(12, parcelK1);
    }

    @Override // Oc.InterfaceC4439v0
    public final void x5(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        c2(18, parcelK1);
    }
}
