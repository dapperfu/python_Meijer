package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* loaded from: classes4.dex */
public final class W extends C8883mb implements IInterface {
    W(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder Z3(com.google.android.gms.dynamic.b bVar, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl, int i10, int i11) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, d2Var);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        parcelK1.writeInt(i11);
        Parcel parcelA2 = a2(2, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        parcelA2.recycle();
        return strongBinder;
    }
}
