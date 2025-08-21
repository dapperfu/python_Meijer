package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public final class O0 extends C8883mb implements Q0 {
    O0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // Oc.Q0
    public final void a4(String str, com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, bVar2);
        c2(1, parcelK1);
    }
}
