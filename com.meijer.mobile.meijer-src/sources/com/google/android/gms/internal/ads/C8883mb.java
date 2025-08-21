package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8883mb implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f77669a;

    /* renamed from: b, reason: collision with root package name */
    private final String f77670b;

    protected C8883mb(IBinder iBinder, String str) {
        this.f77669a = iBinder;
        this.f77670b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f77669a;
    }

    protected final void I2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f77669a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel K1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f77670b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f77669a.transact(i10, parcel, parcelObtain, 0);
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
            this.f77669a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
