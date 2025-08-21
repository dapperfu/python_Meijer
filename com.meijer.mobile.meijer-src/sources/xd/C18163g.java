package xd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import dd.C13656d;

/* renamed from: xd.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18163g extends C18157a implements IInterface {
    C18163g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void c2(C13656d c13656d, InterfaceC18162f interfaceC18162f) throws RemoteException {
        Parcel parcelK1 = K1();
        C18159c.b(parcelK1, c13656d);
        C18159c.c(parcelK1, interfaceC18162f);
        a2(1, parcelK1);
    }
}
