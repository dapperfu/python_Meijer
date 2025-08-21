package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
final class U implements InterfaceC6657n {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f65665a;

    U(IBinder iBinder) {
        this.f65665a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f65665a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC6657n
    public final void f6(InterfaceC6656m interfaceC6656m, C6650g c6650g) throws RemoteException {
        IBinder iBinderAsBinder;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (interfaceC6656m != null) {
                iBinderAsBinder = interfaceC6656m.asBinder();
            } else {
                iBinderAsBinder = null;
            }
            parcelObtain.writeStrongBinder(iBinderAsBinder);
            if (c6650g != null) {
                parcelObtain.writeInt(1);
                k0.a(c6650g, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f65665a.transact(46, parcelObtain, parcelObtain2, 0);
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
