package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* loaded from: classes4.dex */
public final class W extends C8758mb implements IInterface {
    W(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder N3(com.google.android.gms.dynamic.b bVar, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl, int i10, int i11) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, d2Var);
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        parcelA1.writeInt(i11);
        Parcel parcelA2 = a2(2, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        parcelA2.recycle();
        return strongBinder;
    }
}
