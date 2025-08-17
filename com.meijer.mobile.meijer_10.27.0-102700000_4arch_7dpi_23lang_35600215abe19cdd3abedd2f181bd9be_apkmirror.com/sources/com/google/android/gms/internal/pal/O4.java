package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public class O4 implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f82805a;

    /* renamed from: b, reason: collision with root package name */
    private final String f82806b;

    protected O4(IBinder iBinder, String str) {
        this.f82805a = iBinder;
        this.f82806b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f82805a;
    }

    protected final void F2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f82805a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f82806b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f82805a.transact(i10, parcel, parcelObtain, 0);
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

    protected final void b2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f82805a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
