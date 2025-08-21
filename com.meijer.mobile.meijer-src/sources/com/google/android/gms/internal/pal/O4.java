package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public class O4 implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f83645a;

    /* renamed from: b, reason: collision with root package name */
    private final String f83646b;

    protected O4(IBinder iBinder, String str) {
        this.f83645a = iBinder;
        this.f83646b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f83645a;
    }

    protected final void I2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f83645a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel K1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f83646b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f83645a.transact(i10, parcel, parcelObtain, 0);
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

    protected final void c2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f83645a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
