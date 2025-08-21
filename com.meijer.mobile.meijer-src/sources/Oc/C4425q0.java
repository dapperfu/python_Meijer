package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC6722Bl;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* renamed from: Oc.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4425q0 extends C8883mb implements InterfaceC4430s0 {
    @Override // Oc.InterfaceC4430s0
    public final InterfaceC6756Cl getAdapterCreator() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        InterfaceC6756Cl interfaceC6756ClB9 = AbstractBinderC6722Bl.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC6756ClB9;
    }

    @Override // Oc.InterfaceC4430s0
    public final C4434t1 getLiteSdkVersion() throws RemoteException {
        Parcel parcelA2 = a2(1, K1());
        C4434t1 c4434t1 = (C4434t1) C9097ob.a(parcelA2, C4434t1.CREATOR);
        parcelA2.recycle();
        return c4434t1;
    }

    C4425q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }
}
