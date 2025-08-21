package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public class O implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f82771a;

    /* renamed from: b, reason: collision with root package name */
    private final String f82772b;

    protected O(IBinder iBinder, String str) {
        this.f82771a = iBinder;
        this.f82772b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f82771a;
    }

    protected final void I2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f82771a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel K1(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f82771a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel a2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f82772b);
        return parcelObtain;
    }

    protected final void c2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f82771a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
