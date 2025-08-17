package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC6597Bl;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* renamed from: Mc.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4147q0 extends C8758mb implements InterfaceC4152s0 {
    @Override // Mc.InterfaceC4152s0
    public final InterfaceC6631Cl getAdapterCreator() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        InterfaceC6631Cl interfaceC6631ClB9 = AbstractBinderC6597Bl.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC6631ClB9;
    }

    @Override // Mc.InterfaceC4152s0
    public final C4156t1 getLiteSdkVersion() throws RemoteException {
        Parcel parcelA2 = a2(1, A1());
        C4156t1 c4156t1 = (C4156t1) C8972ob.a(parcelA2, C4156t1.CREATOR);
        parcelA2.recycle();
        return c4156t1;
    }

    C4147q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }
}
