package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* loaded from: classes4.dex */
public final class S extends C8883mb implements IInterface {
    S(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder Z3(com.google.android.gms.dynamic.b bVar, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(1, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        parcelA2.recycle();
        return strongBinder;
    }
}
