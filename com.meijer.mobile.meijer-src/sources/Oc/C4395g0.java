package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;

/* renamed from: Oc.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4395g0 extends C8883mb implements InterfaceC4401i0 {
    C4395g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // Oc.InterfaceC4401i0
    public final void M0(String str, String str2) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        parcelK1.writeString(str2);
        c2(1, parcelK1);
    }
}
