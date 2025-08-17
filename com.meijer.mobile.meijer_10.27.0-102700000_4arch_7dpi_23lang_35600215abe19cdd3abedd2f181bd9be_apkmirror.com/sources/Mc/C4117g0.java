package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;

/* renamed from: Mc.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4117g0 extends C8758mb implements InterfaceC4123i0 {
    C4117g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // Mc.InterfaceC4123i0
    public final void K0(String str, String str2) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        b2(1, parcelA1);
    }
}
