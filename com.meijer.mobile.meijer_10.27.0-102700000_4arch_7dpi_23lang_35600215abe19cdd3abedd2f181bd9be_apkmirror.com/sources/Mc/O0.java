package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public final class O0 extends C8758mb implements Q0 {
    O0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // Mc.Q0
    public final void O3(String str, com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, bVar2);
        b2(1, parcelA1);
    }
}
