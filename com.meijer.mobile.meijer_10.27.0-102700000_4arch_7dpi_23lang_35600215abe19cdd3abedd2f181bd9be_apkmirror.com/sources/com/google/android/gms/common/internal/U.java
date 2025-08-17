package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
final class U implements InterfaceC6532n {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f64825a;

    U(IBinder iBinder) {
        this.f64825a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f64825a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC6532n
    public final void T5(InterfaceC6531m interfaceC6531m, C6525g c6525g) throws RemoteException {
        IBinder iBinderAsBinder;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (interfaceC6531m != null) {
                iBinderAsBinder = interfaceC6531m.asBinder();
            } else {
                iBinderAsBinder = null;
            }
            parcelObtain.writeStrongBinder(iBinderAsBinder);
            if (c6525g != null) {
                parcelObtain.writeInt(1);
                k0.a(c6525g, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f64825a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }
}
